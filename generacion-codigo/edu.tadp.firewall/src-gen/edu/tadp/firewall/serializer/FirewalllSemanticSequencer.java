package edu.tadp.firewall.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.tadp.firewall.firewalll.AceptarAccion;
import edu.tadp.firewall.firewalll.BloquearAccion;
import edu.tadp.firewall.firewalll.CondicionIP;
import edu.tadp.firewall.firewalll.CondicionPuerto;
import edu.tadp.firewall.firewalll.Firewall;
import edu.tadp.firewall.firewalll.FirewalllPackage;
import edu.tadp.firewall.firewalll.ForwardearAccion;
import edu.tadp.firewall.firewalll.IP;
import edu.tadp.firewall.firewalll.Regla;
import edu.tadp.firewall.firewalll.ReglaEtiquetada;
import edu.tadp.firewall.services.FirewalllGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FirewalllSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FirewalllGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FirewalllPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FirewalllPackage.ACEPTAR_ACCION:
				if(context == grammarAccess.getAccionRule() ||
				   context == grammarAccess.getAceptarAccionRule()) {
					sequence_AceptarAccion(context, (AceptarAccion) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.BLOQUEAR_ACCION:
				if(context == grammarAccess.getAccionRule() ||
				   context == grammarAccess.getBloquearAccionRule()) {
					sequence_BloquearAccion(context, (BloquearAccion) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.CONDICION_IP:
				if(context == grammarAccess.getCondicionRule() ||
				   context == grammarAccess.getCondicionIPRule()) {
					sequence_CondicionIP(context, (CondicionIP) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.CONDICION_PUERTO:
				if(context == grammarAccess.getCondicionRule() ||
				   context == grammarAccess.getCondicionPuertoRule()) {
					sequence_CondicionPuerto(context, (CondicionPuerto) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.FIREWALL:
				if(context == grammarAccess.getFirewallRule()) {
					sequence_Firewall(context, (Firewall) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.FORWARDEAR_ACCION:
				if(context == grammarAccess.getAccionRule() ||
				   context == grammarAccess.getForwardearAccionRule()) {
					sequence_ForwardearAccion(context, (ForwardearAccion) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.IP:
				if(context == grammarAccess.getIPRule()) {
					sequence_IP(context, (IP) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.REGLA:
				if(context == grammarAccess.getReglaRule()) {
					sequence_Regla(context, (Regla) semanticObject); 
					return; 
				}
				else break;
			case FirewalllPackage.REGLA_ETIQUETADA:
				if(context == grammarAccess.getReglaEtiquetadaRule()) {
					sequence_ReglaEtiquetada(context, (ReglaEtiquetada) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {AceptarAccion}
	 */
	protected void sequence_AceptarAccion(EObject context, AceptarAccion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BloquearAccion}
	 */
	protected void sequence_BloquearAccion(EObject context, BloquearAccion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ip=IP
	 */
	protected void sequence_CondicionIP(EObject context, CondicionIP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.CONDICION_IP__IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.CONDICION_IP__IP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCondicionIPAccess().getIpIPParserRuleCall_1_0(), semanticObject.getIp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     puerto=INT
	 */
	protected void sequence_CondicionPuerto(EObject context, CondicionPuerto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.CONDICION_PUERTO__PUERTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.CONDICION_PUERTO__PUERTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCondicionPuertoAccess().getPuertoINTTerminalRuleCall_1_0(), semanticObject.getPuerto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reglas+=ReglaEtiquetada*
	 */
	protected void sequence_Firewall(EObject context, Firewall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ip=IP puerto=INT)
	 */
	protected void sequence_ForwardearAccion(EObject context, ForwardearAccion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.FORWARDEAR_ACCION__IP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.FORWARDEAR_ACCION__IP));
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.FORWARDEAR_ACCION__PUERTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.FORWARDEAR_ACCION__PUERTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForwardearAccionAccess().getIpIPParserRuleCall_2_0(), semanticObject.getIp());
		feeder.accept(grammarAccess.getForwardearAccionAccess().getPuertoINTTerminalRuleCall_4_0(), semanticObject.getPuerto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (primero=INT segundo=INT tercero=INT cuarto=INT)
	 */
	protected void sequence_IP(EObject context, IP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.IP__PRIMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.IP__PRIMERO));
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.IP__SEGUNDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.IP__SEGUNDO));
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.IP__TERCERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.IP__TERCERO));
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.IP__CUARTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.IP__CUARTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIPAccess().getPrimeroINTTerminalRuleCall_0_0(), semanticObject.getPrimero());
		feeder.accept(grammarAccess.getIPAccess().getSegundoINTTerminalRuleCall_2_0(), semanticObject.getSegundo());
		feeder.accept(grammarAccess.getIPAccess().getTerceroINTTerminalRuleCall_4_0(), semanticObject.getTercero());
		feeder.accept(grammarAccess.getIPAccess().getCuartoINTTerminalRuleCall_6_0(), semanticObject.getCuarto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lan=ID? regla=Regla)
	 */
	protected void sequence_ReglaEtiquetada(EObject context, ReglaEtiquetada semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condicion=Condicion accion=Accion)
	 */
	protected void sequence_Regla(EObject context, Regla semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.REGLA__CONDICION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.REGLA__CONDICION));
			if(transientValues.isValueTransient(semanticObject, FirewalllPackage.Literals.REGLA__ACCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FirewalllPackage.Literals.REGLA__ACCION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReglaAccess().getCondicionCondicionParserRuleCall_1_0(), semanticObject.getCondicion());
		feeder.accept(grammarAccess.getReglaAccess().getAccionAccionParserRuleCall_3_0(), semanticObject.getAccion());
		feeder.finish();
	}
}
