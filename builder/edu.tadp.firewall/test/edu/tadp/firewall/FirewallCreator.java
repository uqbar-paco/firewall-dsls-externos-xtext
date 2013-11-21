package edu.tadp.firewall;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ar.edu.tadp.firewall.AcceptListener;
import ar.edu.tadp.firewall.BloqueoListener;
import ar.edu.tadp.firewall.Firewall;
import ar.edu.tadp.firewall.Request;
import ar.edu.tadp.firewall.conditions.AddressType;
import ar.edu.tadp.firewall.conditions.IPCondition;
import ar.edu.tadp.firewall.conditions.PortCondition;
import ar.edu.tadp.firewall.rules.AceptarAction;
import ar.edu.tadp.firewall.rules.BloquearAction;
import ar.edu.tadp.rules.Action;
import ar.edu.tadp.rules.BasicRule;
import ar.edu.tadp.rules.Condition;
import ar.edu.tadp.rules.ExclusiveRuleChain;
import edu.tadp.firewall.firewalll.Condicion;
import edu.tadp.firewall.firewalll.CondicionIP;
import edu.tadp.firewall.firewalll.CondicionPuerto;
import edu.tadp.firewall.firewalll.IP;
import edu.tadp.firewall.firewalll.Regla;

public class FirewallCreator {
	private static boolean inited;

	public static Firewall createFirewall(String modelFile, AcceptListener acceptListener, BloqueoListener bloqueoListener) {
		if(!inited){
			init();
		}
		
		Resource r = new ResourceSetImpl().getResource(
				URI.createFileURI(modelFile), true);

		edu.tadp.firewall.firewalll.Firewall e = (edu.tadp.firewall.firewalll.Firewall) r
				.getContents().get(0);

		Firewall firewall = new Firewall();
		ExclusiveRuleChain<Request> chain = new ExclusiveRuleChain<Request>();
		firewall.addRule(chain);

		for (Regla rule : e.getReglas()) {
			chain.add(createRule(rule, acceptListener, bloqueoListener));
		}

		return firewall;
	}

	private static void init() {
		new FirewalllStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		inited = true;
	}

	private static ar.edu.tadp.rules.Rule<Request> createRule(Regla rule, AcceptListener acceptListener, BloqueoListener bloqueoListener) {
		Condition<Request> c = createCondition(rule.getCondicion());
		Action<Request> a = createAction(rule.getAccion(), acceptListener, bloqueoListener);
		return new BasicRule<Request>(c, a);
	}

	private static Action<Request> createAction(String accion, AcceptListener acceptListener, BloqueoListener bloqueoListener) {
		if (accion.equals("aceptar")) {
			return new AceptarAction(acceptListener);
		} else {
			return new BloquearAction(bloqueoListener);
		}
	}

	private static Condition<Request> createCondition(Condicion condicion) {
		if (condicion instanceof CondicionPuerto) {
			CondicionPuerto c = (CondicionPuerto) condicion;
			return new PortCondition(c.getName(), AddressType.SOURCE);
		} else {
			CondicionIP c = (CondicionIP) condicion;
			IP ip = c.getIp();

			return new IPCondition(String.format("%d.%d.%d.%d",
					ip.getPrimero(), ip.getSegundo(), ip.getTercero(),
					ip.getCuarto()), AddressType.SOURCE);
		}
	}
}
