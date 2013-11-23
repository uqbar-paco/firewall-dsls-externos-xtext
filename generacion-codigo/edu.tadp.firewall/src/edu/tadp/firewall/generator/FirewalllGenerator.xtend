/*
 * generated by Xtext
 */
package edu.tadp.firewall.generator

import edu.tadp.firewall.firewalll.CondicionIP
import edu.tadp.firewall.firewalll.CondicionPuerto
import edu.tadp.firewall.firewalll.IP
import edu.tadp.firewall.firewalll.Regla
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import edu.tadp.firewall.firewalll.AceptarAccion
import edu.tadp.firewall.firewalll.BloquearAccion
import edu.tadp.firewall.firewalll.ForwardearAccion
import edu.tadp.firewall.firewalll.ReglaEtiquetada

class FirewalllGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		var fileParts = resource.fileParts
	    var className = fileParts.className
	    var packageName = fileParts.packageName

		fsa.generateFile(fileParts.join("/"), '''
			package «packageName»;
			
			import ar.edu.tadp.firewall.*;
			import ar.edu.tadp.firewall.implementations.BasicHandler;
			import ar.edu.tadp.firewall.conditions.*;
			import ar.edu.tadp.firewall.rules.*;
			import ar.edu.tadp.rules.*;
						
			public class «className» extends Firewall {
				
				public «className»(String lan) {
					BasicHandler basicHandler = new BasicHandler();
					
					ExclusiveRuleChain<Request> chain = new ExclusiveRuleChain<Request>();
					«FOR r:resource.allContents.toIterable.filter(typeof(ReglaEtiquetada))»
					«r.compile»
      				«ENDFOR»							
					this.addRule(chain);
				
				}
			}
			
		''');
	}
	
	def fileParts(Resource resource) {
		var segments = new ArrayList(resource.URI.segmentsList.toList)
		var last = segments.remove(segments.size - 1)
		segments.add(last.replace(".firewall", ".java"))
		return segments.drop(3);
	}
	
	def className(Iterable<String> fileParts) {
		 fileParts.last.replace(".java", "")
	}
	
	def packageName(Iterable<String> fileParts) {
		fileParts.take(fileParts.size - 1).join(".")
	}
	
	
	def dispatch compile(ReglaEtiquetada rule) {
		if(rule.lan != null) {
			'''
			if(lan.equals("«rule.lan»")) {
				chain.add(«rule.regla.compile»);
			}
			
			'''
		}
		else {
			'''
			chain.add(«rule.regla.compile»);
			'''
		}
		
	}
		
	def dispatch compile(Regla rule)
		'''new BasicRule<Request>(«rule.condicion.compile»,«rule.accion.compile»)'''
	
	
	def dispatch compile(AceptarAccion accion) '''new AceptarAction(basicHandler)'''

	def dispatch compile(BloquearAccion accion) '''new BloquearAction(basicHandler)'''

	def dispatch compile(ForwardearAccion accion) '''new ForwardAction(new Address("«accion.ip.format»", «accion.puerto»), basicHandler)'''
	
//	def  dispatch compile(String accion) {
//		switch accion {
//			case "aceptar": "new AceptarAction(basicHandler)"
//			case "bloquear": "new BloquearAction(basicHandler)"
//		}
//	}
	
	def dispatch compile(CondicionIP condicion) '''new IPCondition("«condicion.ip.format»", AddressType.SOURCE)'''
	
	def dispatch compile(CondicionPuerto condicion) '''new PortCondition(«condicion.puerto», AddressType.DESTINATION)'''
	
	def format(IP ip) '''«ip.primero».«ip.segundo».«ip.tercero».«ip.cuarto»'''
	
}









