/*
* generated by Xtext
*/
package edu.tadp.firewall.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class FirewalllGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class FirewallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Firewall");
		private final Assignment cReglasAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cReglasReglaParserRuleCall_0 = (RuleCall)cReglasAssignment.eContents().get(0);
		
		//Firewall:
		//	reglas+=Regla*;
		public ParserRule getRule() { return rule; }

		//reglas+=Regla*
		public Assignment getReglasAssignment() { return cReglasAssignment; }

		//Regla
		public RuleCall getReglasReglaParserRuleCall_0() { return cReglasReglaParserRuleCall_0; }
	}

	public class ReglaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Regla");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCondicionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCondicionCondicionParserRuleCall_1_0 = (RuleCall)cCondicionAssignment_1.eContents().get(0);
		private final Keyword cHayQueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAccionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAccionAccionParserRuleCall_3_0 = (RuleCall)cAccionAssignment_3.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Regla:
		//	"Si" condicion=Condicion "hay que" accion=Accion "!";
		public ParserRule getRule() { return rule; }

		//"Si" condicion=Condicion "hay que" accion=Accion "!"
		public Group getGroup() { return cGroup; }

		//"Si"
		public Keyword getSiKeyword_0() { return cSiKeyword_0; }

		//condicion=Condicion
		public Assignment getCondicionAssignment_1() { return cCondicionAssignment_1; }

		//Condicion
		public RuleCall getCondicionCondicionParserRuleCall_1_0() { return cCondicionCondicionParserRuleCall_1_0; }

		//"hay que"
		public Keyword getHayQueKeyword_2() { return cHayQueKeyword_2; }

		//accion=Accion
		public Assignment getAccionAssignment_3() { return cAccionAssignment_3; }

		//Accion
		public RuleCall getAccionAccionParserRuleCall_3_0() { return cAccionAccionParserRuleCall_3_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_4() { return cExclamationMarkKeyword_4; }
	}

	public class AccionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Accion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cBloquearKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cAceptarKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Accion:
		//	"bloquear" | "aceptar";
		public ParserRule getRule() { return rule; }

		//"bloquear" | "aceptar"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"bloquear"
		public Keyword getBloquearKeyword_0() { return cBloquearKeyword_0; }

		//"aceptar"
		public Keyword getAceptarKeyword_1() { return cAceptarKeyword_1; }
	}

	public class CondicionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Condicion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCondicionPuertoParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCondicionIPParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Condicion:
		//	CondicionPuerto | CondicionIP;
		public ParserRule getRule() { return rule; }

		//CondicionPuerto | CondicionIP
		public Alternatives getAlternatives() { return cAlternatives; }

		//CondicionPuerto
		public RuleCall getCondicionPuertoParserRuleCall_0() { return cCondicionPuertoParserRuleCall_0; }

		//CondicionIP
		public RuleCall getCondicionIPParserRuleCall_1() { return cCondicionIPParserRuleCall_1; }
	}

	public class CondicionPuertoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CondicionPuerto");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElPuertoEsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameINTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//CondicionPuerto:
		//	"el puerto es" name=INT;
		public ParserRule getRule() { return rule; }

		//"el puerto es" name=INT
		public Group getGroup() { return cGroup; }

		//"el puerto es"
		public Keyword getElPuertoEsKeyword_0() { return cElPuertoEsKeyword_0; }

		//name=INT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//INT
		public RuleCall getNameINTTerminalRuleCall_1_0() { return cNameINTTerminalRuleCall_1_0; }
	}

	public class CondicionIPElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CondicionIP");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLaIpEsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIpIPParserRuleCall_1_0 = (RuleCall)cIpAssignment_1.eContents().get(0);
		
		//CondicionIP:
		//	"la ip es" ip=IP;
		public ParserRule getRule() { return rule; }

		//"la ip es" ip=IP
		public Group getGroup() { return cGroup; }

		//"la ip es"
		public Keyword getLaIpEsKeyword_0() { return cLaIpEsKeyword_0; }

		//ip=IP
		public Assignment getIpAssignment_1() { return cIpAssignment_1; }

		//IP
		public RuleCall getIpIPParserRuleCall_1_0() { return cIpIPParserRuleCall_1_0; }
	}

	public class IPElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IP");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrimeroAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPrimeroINTTerminalRuleCall_0_0 = (RuleCall)cPrimeroAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSegundoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSegundoINTTerminalRuleCall_2_0 = (RuleCall)cSegundoAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTerceroAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTerceroINTTerminalRuleCall_4_0 = (RuleCall)cTerceroAssignment_4.eContents().get(0);
		private final Keyword cFullStopKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCuartoAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCuartoINTTerminalRuleCall_6_0 = (RuleCall)cCuartoAssignment_6.eContents().get(0);
		
		//IP:
		//	primero=INT "." segundo=INT "." tercero=INT "." cuarto=INT;
		public ParserRule getRule() { return rule; }

		//primero=INT "." segundo=INT "." tercero=INT "." cuarto=INT
		public Group getGroup() { return cGroup; }

		//primero=INT
		public Assignment getPrimeroAssignment_0() { return cPrimeroAssignment_0; }

		//INT
		public RuleCall getPrimeroINTTerminalRuleCall_0_0() { return cPrimeroINTTerminalRuleCall_0_0; }

		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }

		//segundo=INT
		public Assignment getSegundoAssignment_2() { return cSegundoAssignment_2; }

		//INT
		public RuleCall getSegundoINTTerminalRuleCall_2_0() { return cSegundoINTTerminalRuleCall_2_0; }

		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//tercero=INT
		public Assignment getTerceroAssignment_4() { return cTerceroAssignment_4; }

		//INT
		public RuleCall getTerceroINTTerminalRuleCall_4_0() { return cTerceroINTTerminalRuleCall_4_0; }

		//"."
		public Keyword getFullStopKeyword_5() { return cFullStopKeyword_5; }

		//cuarto=INT
		public Assignment getCuartoAssignment_6() { return cCuartoAssignment_6; }

		//INT
		public RuleCall getCuartoINTTerminalRuleCall_6_0() { return cCuartoINTTerminalRuleCall_6_0; }
	}
	
	
	private FirewallElements pFirewall;
	private ReglaElements pRegla;
	private AccionElements pAccion;
	private CondicionElements pCondicion;
	private CondicionPuertoElements pCondicionPuerto;
	private CondicionIPElements pCondicionIP;
	private IPElements pIP;
	
	private final Grammar grammar;

	private XbaseGrammarAccess gaXbase;

	@Inject
	public FirewalllGrammarAccess(GrammarProvider grammarProvider,
		XbaseGrammarAccess gaXbase) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbase = gaXbase;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.tadp.firewall.Firewalll".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public XbaseGrammarAccess getXbaseGrammarAccess() {
		return gaXbase;
	}

	
	//Firewall:
	//	reglas+=Regla*;
	public FirewallElements getFirewallAccess() {
		return (pFirewall != null) ? pFirewall : (pFirewall = new FirewallElements());
	}
	
	public ParserRule getFirewallRule() {
		return getFirewallAccess().getRule();
	}

	//Regla:
	//	"Si" condicion=Condicion "hay que" accion=Accion "!";
	public ReglaElements getReglaAccess() {
		return (pRegla != null) ? pRegla : (pRegla = new ReglaElements());
	}
	
	public ParserRule getReglaRule() {
		return getReglaAccess().getRule();
	}

	//Accion:
	//	"bloquear" | "aceptar";
	public AccionElements getAccionAccess() {
		return (pAccion != null) ? pAccion : (pAccion = new AccionElements());
	}
	
	public ParserRule getAccionRule() {
		return getAccionAccess().getRule();
	}

	//Condicion:
	//	CondicionPuerto | CondicionIP;
	public CondicionElements getCondicionAccess() {
		return (pCondicion != null) ? pCondicion : (pCondicion = new CondicionElements());
	}
	
	public ParserRule getCondicionRule() {
		return getCondicionAccess().getRule();
	}

	//CondicionPuerto:
	//	"el puerto es" name=INT;
	public CondicionPuertoElements getCondicionPuertoAccess() {
		return (pCondicionPuerto != null) ? pCondicionPuerto : (pCondicionPuerto = new CondicionPuertoElements());
	}
	
	public ParserRule getCondicionPuertoRule() {
		return getCondicionPuertoAccess().getRule();
	}

	//CondicionIP:
	//	"la ip es" ip=IP;
	public CondicionIPElements getCondicionIPAccess() {
		return (pCondicionIP != null) ? pCondicionIP : (pCondicionIP = new CondicionIPElements());
	}
	
	public ParserRule getCondicionIPRule() {
		return getCondicionIPAccess().getRule();
	}

	//IP:
	//	primero=INT "." segundo=INT "." tercero=INT "." cuarto=INT;
	public IPElements getIPAccess() {
		return (pIP != null) ? pIP : (pIP = new IPElements());
	}
	
	public ParserRule getIPRule() {
		return getIPAccess().getRule();
	}

	//XExpression:
	//	XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}

	//XAssignment returns XExpression:
	//	{XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment | XOrExpression
	//	(=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign])
	//	rightOperand=XAssignment)?;
	public XbaseGrammarAccess.XAssignmentElements getXAssignmentAccess() {
		return gaXbase.getXAssignmentAccess();
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}

	//OpSingleAssign:
	//	"=";
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}

	//OpMultiAssign:
	//	"+=" | "-=";
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}

	//XOrExpression returns XExpression:
	//	XAndExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr])
	//	rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}

	//OpOr:
	//	"||";
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}

	//XAndExpression returns XExpression:
	//	XEqualityExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd])
	//	rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}

	//OpAnd:
	//	"&&";
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}

	//XEqualityExpression returns XExpression:
	//	XRelationalExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//	rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}

	//OpEquality:
	//	"==" | "!=" | "===" | "!==";
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}

	//XRelationalExpression returns XExpression:
	//	XOtherOperatorExpression (=> ({XInstanceOfExpression.expression=current} "instanceof") type=JvmTypeReference | =>
	//	({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare])
	//	rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}

	//OpCompare:
	//	">=" | "<=" | ">" | "<";
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}

	//XOtherOperatorExpression returns XExpression:
	//	XAdditiveExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//	rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}

	//OpOther:
	//	"->" | "..<" | ">" ".." | ".." | "=>" | ">" (=> (">" ">") | ">") | "<" (=> ("<" "<") | "<") | "<>" | "?:" | "<=>";
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}

	//XAdditiveExpression returns XExpression:
	//	XMultiplicativeExpression (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//	rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}

	//OpAdd:
	//	"+" | "-";
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}

	//XMultiplicativeExpression returns XExpression:
	//	XUnaryOperation (=> ({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti])
	//	rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}

	//OpMulti:
	//	"*" | "**" | "/" | "%";
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}

	//XUnaryOperation returns XExpression:
	//	{XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XUnaryOperation | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}

	//OpUnary:
	//	"!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}

	//XCastedExpression returns XExpression:
	//	XMemberFeatureCall (=> ({XCastedExpression.target=current} "as") type=JvmTypeReference)*;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}

	//XMemberFeatureCall returns XExpression:
	//	XPrimaryExpression (=> ({XAssignment.assignable=current} ("." | explicitStatic?="::")
	//	feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign) value=XAssignment | =>
	//	({XMemberFeatureCall.memberCallTarget=current} ("." | nullSafe?="?." | explicitStatic?="::")) ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|FeatureCallID] (=> explicitOperationCall?="("
	//	(memberCallArguments+=XShortClosure | memberCallArguments+=XExpression ("," memberCallArguments+=XExpression)*)? ")")?
	//	memberCallArguments+=XClosure?)*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}

	//XPrimaryExpression returns XExpression:
	//	XConstructorCall | XBlockExpression | XSwitchExpression | XFeatureCall | XLiteral | XIfExpression | XForLoopExpression
	//	| XWhileExpression | XDoWhileExpression | XThrowExpression | XReturnExpression | XTryCatchFinallyExpression |
	//	XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbase.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}

	//XLiteral returns XExpression:
	//	XCollectionLiteral | XClosure | XBooleanLiteral | XNumberLiteral | XNullLiteral | XStringLiteral | XTypeLiteral;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbase.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}

	//XCollectionLiteral:
	//	XSetLiteral | XListLiteral;
	public XbaseGrammarAccess.XCollectionLiteralElements getXCollectionLiteralAccess() {
		return gaXbase.getXCollectionLiteralAccess();
	}
	
	public ParserRule getXCollectionLiteralRule() {
		return getXCollectionLiteralAccess().getRule();
	}

	//XSetLiteral:
	//	{XSetLiteral} "#" "{" (elements+=XExpression ("," elements+=XExpression)*)? "}";
	public XbaseGrammarAccess.XSetLiteralElements getXSetLiteralAccess() {
		return gaXbase.getXSetLiteralAccess();
	}
	
	public ParserRule getXSetLiteralRule() {
		return getXSetLiteralAccess().getRule();
	}

	//XListLiteral:
	//	{XListLiteral} "#" "[" (elements+=XExpression ("," elements+=XExpression)*)? "]";
	public XbaseGrammarAccess.XListLiteralElements getXListLiteralAccess() {
		return gaXbase.getXListLiteralAccess();
	}
	
	public ParserRule getXListLiteralRule() {
		return getXListLiteralAccess().getRule();
	}

	//XClosure returns XExpression:
	//	=> ({XClosure} "[") => ((declaredFormalParameters+=JvmFormalParameter (","
	//	declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?="|")? expression=XExpressionInClosure "]";
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}

	//XExpressionInClosure returns XExpression:
	//	{XBlockExpression} (expressions+=XExpressionInsideBlock ";"?)*;
	public XbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaXbase.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}

	//XShortClosure returns XExpression:
	//	=> ({XClosure} (declaredFormalParameters+=JvmFormalParameter ("," declaredFormalParameters+=JvmFormalParameter)*)?
	//	explicitSyntax?="|") expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}

	//XParenthesizedExpression returns XExpression:
	//	"(" XExpression ")";
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}

	//XIfExpression returns XExpression:
	//	{XIfExpression} "if" "(" if=XExpression ")" then=XExpression ("else" else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}

	//XSwitchExpression returns XExpression:
	//	{XSwitchExpression} "switch" (=> (localVarName=ValidID ":")? switch=XExpression | => ("(" localVarName=ValidID ":")
	//	switch=XExpression ")") "{" cases+=XCasePart+ ("default" ":" default=XExpression)? "}";
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}

	//XCasePart:
	//	typeGuard=JvmTypeReference? ("case" case=XExpression)? ":" then=XExpression;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}

	//XForLoopExpression returns XExpression:
	//	{XForLoopExpression} "for" "(" declaredParam=JvmFormalParameter ":" forExpression=XExpression ")"
	//	eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}

	//XWhileExpression returns XExpression:
	//	{XWhileExpression} "while" "(" predicate=XExpression ")" body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}

	//XDoWhileExpression returns XExpression:
	//	{XDoWhileExpression} "do" body=XExpression "while" "(" predicate=XExpression ")";
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}

	//XBlockExpression returns XExpression:
	//	{XBlockExpression} "{" (expressions+=XExpressionInsideBlock ";"?)* "}";
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}

	//XExpressionInsideBlock returns XExpression:
	//	XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionInsideBlockElements getXExpressionInsideBlockAccess() {
		return gaXbase.getXExpressionInsideBlockAccess();
	}
	
	public ParserRule getXExpressionInsideBlockRule() {
		return getXExpressionInsideBlockAccess().getRule();
	}

	//XVariableDeclaration returns XExpression:
	//	{XVariableDeclaration} (writeable?="var" | "val") (=> (type=JvmTypeReference name=ValidID) | name=ValidID) ("="
	//	right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}

	//JvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}

	//FullJvmFormalParameter returns types::JvmFormalParameter:
	//	parameterType=JvmTypeReference name=ValidID;
	public XbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaXbase.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}

	//XFeatureCall returns XExpression:
	//	{XFeatureCall} ("<" typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")?
	//	feature=[types::JvmIdentifiableElement|IdOrSuper] (=> explicitOperationCall?="(" (featureCallArguments+=XShortClosure
	//	| featureCallArguments+=XExpression ("," featureCallArguments+=XExpression)*)? ")")? featureCallArguments+=XClosure?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}

	//FeatureCallID:
	//	ValidID | "extends" | "static" | "import" | "extension";
	public XbaseGrammarAccess.FeatureCallIDElements getFeatureCallIDAccess() {
		return gaXbase.getFeatureCallIDAccess();
	}
	
	public ParserRule getFeatureCallIDRule() {
		return getFeatureCallIDAccess().getRule();
	}

	//IdOrSuper:
	//	FeatureCallID | "super";
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbase.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}

	//XConstructorCall returns XExpression:
	//	{XConstructorCall} "new" constructor=[types::JvmConstructor|QualifiedName] ("<"
	//	typeArguments+=JvmArgumentTypeReference ("," typeArguments+=JvmArgumentTypeReference)* ">")? ("("
	//	(arguments+=XShortClosure | arguments+=XExpression ("," arguments+=XExpression)*)? ")")? arguments+=XClosure?;
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}

	//XBooleanLiteral returns XExpression:
	//	{XBooleanLiteral} ("false" | isTrue?="true");
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}

	//XNullLiteral returns XExpression:
	//	{XNullLiteral} "null";
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}

	//XNumberLiteral returns XExpression:
	//	{XNumberLiteral} value=Number;
	public XbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaXbase.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}

	//XStringLiteral returns XExpression:
	//	{XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}

	//XTypeLiteral returns XExpression:
	//	{XTypeLiteral} "typeof" "(" type=[types::JvmType|QualifiedName] arrayDimensions+=ArrayBrackets* ")";
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}

	//XThrowExpression returns XExpression:
	//	{XThrowExpression} "throw" expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}

	//XReturnExpression returns XExpression:
	//	{XReturnExpression} "return" => expression=XExpression?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}

	//XTryCatchFinallyExpression returns XExpression:
	//	{XTryCatchFinallyExpression} "try" expression=XExpression (catchClauses+=XCatchClause+ ("finally"
	//	finallyExpression=XExpression)? | "finally" finallyExpression=XExpression);
	public XbaseGrammarAccess.XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return gaXbase.getXTryCatchFinallyExpressionAccess();
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}

	//XCatchClause:
	//	"catch" "(" declaredParam=FullJvmFormalParameter ")" expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Number hidden():
	//	HEX | (INT | DECIMAL) ("." (INT | DECIMAL))?;
	public XbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaXbase.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}

	/// **
	// * Dummy rule, for "better" downwards compatibility, since GrammarAccess generates non-static inner classes, 
	// * which makes downstream grammars break on classloading, when a rule is removed.
	// * / StaticQualifier:
	//	(ValidID "::")+;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbase.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}

	//terminal HEX:
	//	("0x" | "0X") ("0".."9" | "a".."f" | "A".."F" | "_")+ ("#" (("b" | "B") ("i" | "I") | ("l" | "L")))?;
	public TerminalRule getHEXRule() {
		return gaXbase.getHEXRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9" ("0".."9" | "_")*;
	public TerminalRule getINTRule() {
		return gaXbase.getINTRule();
	} 

	//terminal DECIMAL:
	//	INT (("e" | "E") ("+" | "-")? INT)? (("b" | "B") ("i" | "I" | "d" | "D") | ("l" | "L" | "d" | "D" | "f" | "F"))?;
	public TerminalRule getDECIMALRule() {
		return gaXbase.getDECIMALRule();
	} 

	//JvmTypeReference:
	//	JvmParameterizedTypeReference => ({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)* |
	//	XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXbase.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}

	//ArrayBrackets:
	//	"[" "]";
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXbase.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}

	//XFunctionTypeRef:
	//	("(" (paramTypes+=JvmTypeReference ("," paramTypes+=JvmTypeReference)*)? ")")? "=>" returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXbase.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}

	//JvmParameterizedTypeReference:
	//	type=[JvmType|QualifiedName] ("<" arguments+=JvmArgumentTypeReference ("," arguments+=JvmArgumentTypeReference)*
	//	">")?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXbase.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}

	//JvmArgumentTypeReference returns JvmTypeReference:
	//	JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXbase.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}

	//JvmWildcardTypeReference:
	//	{JvmWildcardTypeReference} "?" (constraints+=JvmUpperBound | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXbase.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}

	//JvmUpperBound:
	//	"extends" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXbase.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}

	//JvmUpperBoundAnded returns JvmUpperBound:
	//	"&" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXbase.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}

	//JvmLowerBound:
	//	"super" typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXbase.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}

	//JvmTypeParameter:
	//	name=ValidID (constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded* | constraints+=JvmLowerBound)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXbase.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName "." "*";
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXbase.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//ValidID:
	//	ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXbase.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//XImportSection:
	//	importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXbase.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}

	//XImportDeclaration:
	//	"import" (static?="static" extension?="extension"? importedType=[JvmDeclaredType|QualifiedName] "." "*" |
	//	importedType=[JvmDeclaredType|QualifiedName] | importedNamespace=QualifiedNameWithWildcard) ";"?;
	public XtypeGrammarAccess.XImportDeclarationElements getXImportDeclarationAccess() {
		return gaXbase.getXImportDeclarationAccess();
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "$" | "_") ("a".."z" | "A".."Z" | "$" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaXbase.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaXbase.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaXbase.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXbase.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaXbase.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaXbase.getANY_OTHERRule();
	} 
}
