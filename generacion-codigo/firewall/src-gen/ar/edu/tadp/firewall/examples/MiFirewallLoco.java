package ar.edu.tadp.firewall.examples;

import ar.edu.tadp.firewall.*;
import ar.edu.tadp.firewall.implementations.BasicHandler;
import ar.edu.tadp.firewall.conditions.*;
import ar.edu.tadp.firewall.rules.*;
import ar.edu.tadp.rules.*;

public class MiFirewallLoco extends Firewall {

	public MiFirewallLoco() {
		BasicHandler basicHandler = new BasicHandler();

		ExclusiveRuleChain<Request> chain = new ExclusiveRuleChain<Request>();
		
		IPCondition condicionAceptar = new IPCondition("192.168.1.130",
				AddressType.SOURCE);
		AceptarAction accionAceptar = new AceptarAction(basicHandler);
		chain.add(new BasicRule<Request>(condicionAceptar, accionAceptar));

		PortCondition bloquearCondicion = new PortCondition(8080,
				AddressType.DESTINATION);
		BloquearAction bloquearAccion = new BloquearAction(basicHandler);
		chain.add(new BasicRule<Request>(bloquearCondicion, bloquearAccion));
		
		this.addRule(chain);

	}
}









