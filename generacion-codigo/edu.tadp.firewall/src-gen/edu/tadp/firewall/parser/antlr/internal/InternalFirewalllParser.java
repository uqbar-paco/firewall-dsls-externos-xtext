package edu.tadp.firewall.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.tadp.firewall.services.FirewalllGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFirewalllParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Si '", "' hay que '", "'!'", "'forwardear a '", "'aceptar'", "'bloquear'", "'el puerto es'", "'la ip es'", "'.'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalFirewalllParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFirewalllParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFirewalllParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g"; }



     	private FirewalllGrammarAccess grammarAccess;
     	
        public InternalFirewalllParser(TokenStream input, FirewalllGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Firewall";	
       	}
       	
       	@Override
       	protected FirewalllGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFirewall"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:67:1: entryRuleFirewall returns [EObject current=null] : iv_ruleFirewall= ruleFirewall EOF ;
    public final EObject entryRuleFirewall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirewall = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:68:2: (iv_ruleFirewall= ruleFirewall EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:69:2: iv_ruleFirewall= ruleFirewall EOF
            {
             newCompositeNode(grammarAccess.getFirewallRule()); 
            pushFollow(FOLLOW_ruleFirewall_in_entryRuleFirewall75);
            iv_ruleFirewall=ruleFirewall();

            state._fsp--;

             current =iv_ruleFirewall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirewall85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirewall"


    // $ANTLR start "ruleFirewall"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:76:1: ruleFirewall returns [EObject current=null] : ( (lv_reglas_0_0= ruleReglaEtiquetada ) )* ;
    public final EObject ruleFirewall() throws RecognitionException {
        EObject current = null;

        EObject lv_reglas_0_0 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:79:28: ( ( (lv_reglas_0_0= ruleReglaEtiquetada ) )* )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:80:1: ( (lv_reglas_0_0= ruleReglaEtiquetada ) )*
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:80:1: ( (lv_reglas_0_0= ruleReglaEtiquetada ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:81:1: (lv_reglas_0_0= ruleReglaEtiquetada )
            	    {
            	    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:81:1: (lv_reglas_0_0= ruleReglaEtiquetada )
            	    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:82:3: lv_reglas_0_0= ruleReglaEtiquetada
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFirewallAccess().getReglasReglaEtiquetadaParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReglaEtiquetada_in_ruleFirewall130);
            	    lv_reglas_0_0=ruleReglaEtiquetada();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFirewallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reglas",
            	            		lv_reglas_0_0, 
            	            		"ReglaEtiquetada");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirewall"


    // $ANTLR start "entryRuleReglaEtiquetada"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:106:1: entryRuleReglaEtiquetada returns [EObject current=null] : iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF ;
    public final EObject entryRuleReglaEtiquetada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReglaEtiquetada = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:107:2: (iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:108:2: iv_ruleReglaEtiquetada= ruleReglaEtiquetada EOF
            {
             newCompositeNode(grammarAccess.getReglaEtiquetadaRule()); 
            pushFollow(FOLLOW_ruleReglaEtiquetada_in_entryRuleReglaEtiquetada166);
            iv_ruleReglaEtiquetada=ruleReglaEtiquetada();

            state._fsp--;

             current =iv_ruleReglaEtiquetada; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReglaEtiquetada176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReglaEtiquetada"


    // $ANTLR start "ruleReglaEtiquetada"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:115:1: ruleReglaEtiquetada returns [EObject current=null] : ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) ) ;
    public final EObject ruleReglaEtiquetada() throws RecognitionException {
        EObject current = null;

        Token lv_lan_0_0=null;
        Token otherlv_1=null;
        EObject lv_regla_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:118:28: ( ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:1: ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:1: ( ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:2: ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )? ( (lv_regla_2_0= ruleRegla ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:2: ( ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:3: ( (lv_lan_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:119:3: ( (lv_lan_0_0= RULE_ID ) )
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:120:1: (lv_lan_0_0= RULE_ID )
                    {
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:120:1: (lv_lan_0_0= RULE_ID )
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:121:3: lv_lan_0_0= RULE_ID
                    {
                    lv_lan_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReglaEtiquetada219); 

                    			newLeafNode(lv_lan_0_0, grammarAccess.getReglaEtiquetadaAccess().getLanIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReglaEtiquetadaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lan",
                            		lv_lan_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleReglaEtiquetada236); 

                        	newLeafNode(otherlv_1, grammarAccess.getReglaEtiquetadaAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:141:3: ( (lv_regla_2_0= ruleRegla ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:142:1: (lv_regla_2_0= ruleRegla )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:142:1: (lv_regla_2_0= ruleRegla )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:143:3: lv_regla_2_0= ruleRegla
            {
             
            	        newCompositeNode(grammarAccess.getReglaEtiquetadaAccess().getReglaReglaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRegla_in_ruleReglaEtiquetada259);
            lv_regla_2_0=ruleRegla();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReglaEtiquetadaRule());
            	        }
                   		set(
                   			current, 
                   			"regla",
                    		lv_regla_2_0, 
                    		"Regla");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReglaEtiquetada"


    // $ANTLR start "entryRuleRegla"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:167:1: entryRuleRegla returns [EObject current=null] : iv_ruleRegla= ruleRegla EOF ;
    public final EObject entryRuleRegla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegla = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:168:2: (iv_ruleRegla= ruleRegla EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:169:2: iv_ruleRegla= ruleRegla EOF
            {
             newCompositeNode(grammarAccess.getReglaRule()); 
            pushFollow(FOLLOW_ruleRegla_in_entryRuleRegla295);
            iv_ruleRegla=ruleRegla();

            state._fsp--;

             current =iv_ruleRegla; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegla305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegla"


    // $ANTLR start "ruleRegla"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:176:1: ruleRegla returns [EObject current=null] : (otherlv_0= 'Si ' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ' hay que ' ( (lv_accion_3_0= ruleAccion ) ) otherlv_4= '!' ) ;
    public final EObject ruleRegla() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condicion_1_0 = null;

        EObject lv_accion_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:179:28: ( (otherlv_0= 'Si ' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ' hay que ' ( (lv_accion_3_0= ruleAccion ) ) otherlv_4= '!' ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:180:1: (otherlv_0= 'Si ' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ' hay que ' ( (lv_accion_3_0= ruleAccion ) ) otherlv_4= '!' )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:180:1: (otherlv_0= 'Si ' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ' hay que ' ( (lv_accion_3_0= ruleAccion ) ) otherlv_4= '!' )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:180:3: otherlv_0= 'Si ' ( (lv_condicion_1_0= ruleCondicion ) ) otherlv_2= ' hay que ' ( (lv_accion_3_0= ruleAccion ) ) otherlv_4= '!'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRegla342); 

                	newLeafNode(otherlv_0, grammarAccess.getReglaAccess().getSiKeyword_0());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:184:1: ( (lv_condicion_1_0= ruleCondicion ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:185:1: (lv_condicion_1_0= ruleCondicion )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:185:1: (lv_condicion_1_0= ruleCondicion )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:186:3: lv_condicion_1_0= ruleCondicion
            {
             
            	        newCompositeNode(grammarAccess.getReglaAccess().getCondicionCondicionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondicion_in_ruleRegla363);
            lv_condicion_1_0=ruleCondicion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReglaRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_1_0, 
                    		"Condicion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRegla375); 

                	newLeafNode(otherlv_2, grammarAccess.getReglaAccess().getHayQueKeyword_2());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:206:1: ( (lv_accion_3_0= ruleAccion ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:207:1: (lv_accion_3_0= ruleAccion )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:207:1: (lv_accion_3_0= ruleAccion )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:208:3: lv_accion_3_0= ruleAccion
            {
             
            	        newCompositeNode(grammarAccess.getReglaAccess().getAccionAccionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAccion_in_ruleRegla396);
            lv_accion_3_0=ruleAccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReglaRule());
            	        }
                   		set(
                   			current, 
                   			"accion",
                    		lv_accion_3_0, 
                    		"Accion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRegla408); 

                	newLeafNode(otherlv_4, grammarAccess.getReglaAccess().getExclamationMarkKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegla"


    // $ANTLR start "entryRuleAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:236:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:237:2: (iv_ruleAccion= ruleAccion EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:238:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_ruleAccion_in_entryRuleAccion444);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccion454); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:245:1: ruleAccion returns [EObject current=null] : (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_AceptarAccion_0 = null;

        EObject this_BloquearAccion_1 = null;

        EObject this_ForwardearAccion_2 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:248:28: ( (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:249:1: (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:249:1: (this_AceptarAccion_0= ruleAceptarAccion | this_BloquearAccion_1= ruleBloquearAccion | this_ForwardearAccion_2= ruleForwardearAccion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:250:5: this_AceptarAccion_0= ruleAceptarAccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAceptarAccionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAceptarAccion_in_ruleAccion501);
                    this_AceptarAccion_0=ruleAceptarAccion();

                    state._fsp--;

                     
                            current = this_AceptarAccion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:260:5: this_BloquearAccion_1= ruleBloquearAccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getBloquearAccionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBloquearAccion_in_ruleAccion528);
                    this_BloquearAccion_1=ruleBloquearAccion();

                    state._fsp--;

                     
                            current = this_BloquearAccion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:270:5: this_ForwardearAccion_2= ruleForwardearAccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getForwardearAccionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleForwardearAccion_in_ruleAccion555);
                    this_ForwardearAccion_2=ruleForwardearAccion();

                    state._fsp--;

                     
                            current = this_ForwardearAccion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleForwardearAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:286:1: entryRuleForwardearAccion returns [EObject current=null] : iv_ruleForwardearAccion= ruleForwardearAccion EOF ;
    public final EObject entryRuleForwardearAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardearAccion = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:287:2: (iv_ruleForwardearAccion= ruleForwardearAccion EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:288:2: iv_ruleForwardearAccion= ruleForwardearAccion EOF
            {
             newCompositeNode(grammarAccess.getForwardearAccionRule()); 
            pushFollow(FOLLOW_ruleForwardearAccion_in_entryRuleForwardearAccion590);
            iv_ruleForwardearAccion=ruleForwardearAccion();

            state._fsp--;

             current =iv_ruleForwardearAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardearAccion600); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForwardearAccion"


    // $ANTLR start "ruleForwardearAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:295:1: ruleForwardearAccion returns [EObject current=null] : ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) ) ;
    public final EObject ruleForwardearAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_puerto_4_0=null;
        EObject lv_ip_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:298:28: ( ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:299:1: ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:299:1: ( () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:299:2: () otherlv_1= 'forwardear a ' ( (lv_ip_2_0= ruleIP ) ) otherlv_3= ':' ( (lv_puerto_4_0= RULE_INT ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:299:2: ()
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:300:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getForwardearAccionAccess().getForwardearAccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleForwardearAccion646); 

                	newLeafNode(otherlv_1, grammarAccess.getForwardearAccionAccess().getForwardearAKeyword_1());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:309:1: ( (lv_ip_2_0= ruleIP ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:310:1: (lv_ip_2_0= ruleIP )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:310:1: (lv_ip_2_0= ruleIP )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:311:3: lv_ip_2_0= ruleIP
            {
             
            	        newCompositeNode(grammarAccess.getForwardearAccionAccess().getIpIPParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIP_in_ruleForwardearAccion667);
            lv_ip_2_0=ruleIP();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForwardearAccionRule());
            	        }
                   		set(
                   			current, 
                   			"ip",
                    		lv_ip_2_0, 
                    		"IP");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleForwardearAccion679); 

                	newLeafNode(otherlv_3, grammarAccess.getForwardearAccionAccess().getColonKeyword_3());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:331:1: ( (lv_puerto_4_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:332:1: (lv_puerto_4_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:332:1: (lv_puerto_4_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:333:3: lv_puerto_4_0= RULE_INT
            {
            lv_puerto_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleForwardearAccion696); 

            			newLeafNode(lv_puerto_4_0, grammarAccess.getForwardearAccionAccess().getPuertoINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForwardearAccionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"puerto",
                    		lv_puerto_4_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardearAccion"


    // $ANTLR start "entryRuleAceptarAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:357:1: entryRuleAceptarAccion returns [EObject current=null] : iv_ruleAceptarAccion= ruleAceptarAccion EOF ;
    public final EObject entryRuleAceptarAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAceptarAccion = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:358:2: (iv_ruleAceptarAccion= ruleAceptarAccion EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:359:2: iv_ruleAceptarAccion= ruleAceptarAccion EOF
            {
             newCompositeNode(grammarAccess.getAceptarAccionRule()); 
            pushFollow(FOLLOW_ruleAceptarAccion_in_entryRuleAceptarAccion737);
            iv_ruleAceptarAccion=ruleAceptarAccion();

            state._fsp--;

             current =iv_ruleAceptarAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAceptarAccion747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAceptarAccion"


    // $ANTLR start "ruleAceptarAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:366:1: ruleAceptarAccion returns [EObject current=null] : ( () otherlv_1= 'aceptar' ) ;
    public final EObject ruleAceptarAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:369:28: ( ( () otherlv_1= 'aceptar' ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:370:1: ( () otherlv_1= 'aceptar' )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:370:1: ( () otherlv_1= 'aceptar' )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:370:2: () otherlv_1= 'aceptar'
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:370:2: ()
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:371:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAceptarAccionAccess().getAceptarAccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAceptarAccion793); 

                	newLeafNode(otherlv_1, grammarAccess.getAceptarAccionAccess().getAceptarKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAceptarAccion"


    // $ANTLR start "entryRuleBloquearAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:388:1: entryRuleBloquearAccion returns [EObject current=null] : iv_ruleBloquearAccion= ruleBloquearAccion EOF ;
    public final EObject entryRuleBloquearAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloquearAccion = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:389:2: (iv_ruleBloquearAccion= ruleBloquearAccion EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:390:2: iv_ruleBloquearAccion= ruleBloquearAccion EOF
            {
             newCompositeNode(grammarAccess.getBloquearAccionRule()); 
            pushFollow(FOLLOW_ruleBloquearAccion_in_entryRuleBloquearAccion829);
            iv_ruleBloquearAccion=ruleBloquearAccion();

            state._fsp--;

             current =iv_ruleBloquearAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBloquearAccion839); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBloquearAccion"


    // $ANTLR start "ruleBloquearAccion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:397:1: ruleBloquearAccion returns [EObject current=null] : ( () otherlv_1= 'bloquear' ) ;
    public final EObject ruleBloquearAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:400:28: ( ( () otherlv_1= 'bloquear' ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:401:1: ( () otherlv_1= 'bloquear' )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:401:1: ( () otherlv_1= 'bloquear' )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:401:2: () otherlv_1= 'bloquear'
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:401:2: ()
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:402:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBloquearAccionAccess().getBloquearAccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBloquearAccion885); 

                	newLeafNode(otherlv_1, grammarAccess.getBloquearAccionAccess().getBloquearKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBloquearAccion"


    // $ANTLR start "entryRuleCondicion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:419:1: entryRuleCondicion returns [EObject current=null] : iv_ruleCondicion= ruleCondicion EOF ;
    public final EObject entryRuleCondicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicion = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:420:2: (iv_ruleCondicion= ruleCondicion EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:421:2: iv_ruleCondicion= ruleCondicion EOF
            {
             newCompositeNode(grammarAccess.getCondicionRule()); 
            pushFollow(FOLLOW_ruleCondicion_in_entryRuleCondicion921);
            iv_ruleCondicion=ruleCondicion();

            state._fsp--;

             current =iv_ruleCondicion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicion931); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicion"


    // $ANTLR start "ruleCondicion"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:428:1: ruleCondicion returns [EObject current=null] : (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP ) ;
    public final EObject ruleCondicion() throws RecognitionException {
        EObject current = null;

        EObject this_CondicionPuerto_0 = null;

        EObject this_CondicionIP_1 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:431:28: ( (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:432:1: (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:432:1: (this_CondicionPuerto_0= ruleCondicionPuerto | this_CondicionIP_1= ruleCondicionIP )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:433:5: this_CondicionPuerto_0= ruleCondicionPuerto
                    {
                     
                            newCompositeNode(grammarAccess.getCondicionAccess().getCondicionPuertoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondicionPuerto_in_ruleCondicion978);
                    this_CondicionPuerto_0=ruleCondicionPuerto();

                    state._fsp--;

                     
                            current = this_CondicionPuerto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:443:5: this_CondicionIP_1= ruleCondicionIP
                    {
                     
                            newCompositeNode(grammarAccess.getCondicionAccess().getCondicionIPParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCondicionIP_in_ruleCondicion1005);
                    this_CondicionIP_1=ruleCondicionIP();

                    state._fsp--;

                     
                            current = this_CondicionIP_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicion"


    // $ANTLR start "entryRuleCondicionPuerto"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:459:1: entryRuleCondicionPuerto returns [EObject current=null] : iv_ruleCondicionPuerto= ruleCondicionPuerto EOF ;
    public final EObject entryRuleCondicionPuerto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicionPuerto = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:460:2: (iv_ruleCondicionPuerto= ruleCondicionPuerto EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:461:2: iv_ruleCondicionPuerto= ruleCondicionPuerto EOF
            {
             newCompositeNode(grammarAccess.getCondicionPuertoRule()); 
            pushFollow(FOLLOW_ruleCondicionPuerto_in_entryRuleCondicionPuerto1040);
            iv_ruleCondicionPuerto=ruleCondicionPuerto();

            state._fsp--;

             current =iv_ruleCondicionPuerto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicionPuerto1050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicionPuerto"


    // $ANTLR start "ruleCondicionPuerto"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:468:1: ruleCondicionPuerto returns [EObject current=null] : (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondicionPuerto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_puerto_1_0=null;

         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:471:28: ( (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:472:1: (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:472:1: (otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:472:3: otherlv_0= 'el puerto es' ( (lv_puerto_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCondicionPuerto1087); 

                	newLeafNode(otherlv_0, grammarAccess.getCondicionPuertoAccess().getElPuertoEsKeyword_0());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:476:1: ( (lv_puerto_1_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:477:1: (lv_puerto_1_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:477:1: (lv_puerto_1_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:478:3: lv_puerto_1_0= RULE_INT
            {
            lv_puerto_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCondicionPuerto1104); 

            			newLeafNode(lv_puerto_1_0, grammarAccess.getCondicionPuertoAccess().getPuertoINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCondicionPuertoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"puerto",
                    		lv_puerto_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicionPuerto"


    // $ANTLR start "entryRuleCondicionIP"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:502:1: entryRuleCondicionIP returns [EObject current=null] : iv_ruleCondicionIP= ruleCondicionIP EOF ;
    public final EObject entryRuleCondicionIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicionIP = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:503:2: (iv_ruleCondicionIP= ruleCondicionIP EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:504:2: iv_ruleCondicionIP= ruleCondicionIP EOF
            {
             newCompositeNode(grammarAccess.getCondicionIPRule()); 
            pushFollow(FOLLOW_ruleCondicionIP_in_entryRuleCondicionIP1145);
            iv_ruleCondicionIP=ruleCondicionIP();

            state._fsp--;

             current =iv_ruleCondicionIP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicionIP1155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicionIP"


    // $ANTLR start "ruleCondicionIP"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:511:1: ruleCondicionIP returns [EObject current=null] : (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) ) ;
    public final EObject ruleCondicionIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ip_1_0 = null;


         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:514:28: ( (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:515:1: (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:515:1: (otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:515:3: otherlv_0= 'la ip es' ( (lv_ip_1_0= ruleIP ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCondicionIP1192); 

                	newLeafNode(otherlv_0, grammarAccess.getCondicionIPAccess().getLaIpEsKeyword_0());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:519:1: ( (lv_ip_1_0= ruleIP ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:520:1: (lv_ip_1_0= ruleIP )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:520:1: (lv_ip_1_0= ruleIP )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:521:3: lv_ip_1_0= ruleIP
            {
             
            	        newCompositeNode(grammarAccess.getCondicionIPAccess().getIpIPParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIP_in_ruleCondicionIP1213);
            lv_ip_1_0=ruleIP();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCondicionIPRule());
            	        }
                   		set(
                   			current, 
                   			"ip",
                    		lv_ip_1_0, 
                    		"IP");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicionIP"


    // $ANTLR start "entryRuleIP"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:545:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:546:2: (iv_ruleIP= ruleIP EOF )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:547:2: iv_ruleIP= ruleIP EOF
            {
             newCompositeNode(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_ruleIP_in_entryRuleIP1249);
            iv_ruleIP=ruleIP();

            state._fsp--;

             current =iv_ruleIP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIP1259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:554:1: ruleIP returns [EObject current=null] : ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token lv_primero_0_0=null;
        Token otherlv_1=null;
        Token lv_segundo_2_0=null;
        Token otherlv_3=null;
        Token lv_tercero_4_0=null;
        Token otherlv_5=null;
        Token lv_cuarto_6_0=null;

         enterRule(); 
            
        try {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:557:28: ( ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:558:1: ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:558:1: ( ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:558:2: ( (lv_primero_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_segundo_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_tercero_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_cuarto_6_0= RULE_INT ) )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:558:2: ( (lv_primero_0_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:559:1: (lv_primero_0_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:559:1: (lv_primero_0_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:560:3: lv_primero_0_0= RULE_INT
            {
            lv_primero_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIP1301); 

            			newLeafNode(lv_primero_0_0, grammarAccess.getIPAccess().getPrimeroINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"primero",
                    		lv_primero_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleIP1318); 

                	newLeafNode(otherlv_1, grammarAccess.getIPAccess().getFullStopKeyword_1());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:580:1: ( (lv_segundo_2_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:581:1: (lv_segundo_2_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:581:1: (lv_segundo_2_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:582:3: lv_segundo_2_0= RULE_INT
            {
            lv_segundo_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIP1335); 

            			newLeafNode(lv_segundo_2_0, grammarAccess.getIPAccess().getSegundoINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"segundo",
                    		lv_segundo_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleIP1352); 

                	newLeafNode(otherlv_3, grammarAccess.getIPAccess().getFullStopKeyword_3());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:602:1: ( (lv_tercero_4_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:603:1: (lv_tercero_4_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:603:1: (lv_tercero_4_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:604:3: lv_tercero_4_0= RULE_INT
            {
            lv_tercero_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIP1369); 

            			newLeafNode(lv_tercero_4_0, grammarAccess.getIPAccess().getTerceroINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"tercero",
                    		lv_tercero_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleIP1386); 

                	newLeafNode(otherlv_5, grammarAccess.getIPAccess().getFullStopKeyword_5());
                
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:624:1: ( (lv_cuarto_6_0= RULE_INT ) )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:625:1: (lv_cuarto_6_0= RULE_INT )
            {
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:625:1: (lv_cuarto_6_0= RULE_INT )
            // ../edu.tadp.firewall/src-gen/edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.g:626:3: lv_cuarto_6_0= RULE_INT
            {
            lv_cuarto_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIP1403); 

            			newLeafNode(lv_cuarto_6_0, grammarAccess.getIPAccess().getCuartoINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIPRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cuarto",
                    		lv_cuarto_6_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIP"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFirewall_in_entryRuleFirewall75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirewall85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReglaEtiquetada_in_ruleFirewall130 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleReglaEtiquetada_in_entryRuleReglaEtiquetada166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReglaEtiquetada176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReglaEtiquetada219 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleReglaEtiquetada236 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleRegla_in_ruleReglaEtiquetada259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegla_in_entryRuleRegla295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegla305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRegla342 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleCondicion_in_ruleRegla363 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRegla375 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_ruleAccion_in_ruleRegla396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRegla408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccion454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAceptarAccion_in_ruleAccion501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloquearAccion_in_ruleAccion528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardearAccion_in_ruleAccion555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardearAccion_in_entryRuleForwardearAccion590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardearAccion600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleForwardearAccion646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIP_in_ruleForwardearAccion667 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleForwardearAccion679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleForwardearAccion696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAceptarAccion_in_entryRuleAceptarAccion737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAceptarAccion747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAceptarAccion793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloquearAccion_in_entryRuleBloquearAccion829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBloquearAccion839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBloquearAccion885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicion_in_entryRuleCondicion921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicion931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionPuerto_in_ruleCondicion978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionIP_in_ruleCondicion1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionPuerto_in_entryRuleCondicionPuerto1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicionPuerto1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCondicionPuerto1087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCondicionPuerto1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionIP_in_entryRuleCondicionIP1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicionIP1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCondicionIP1192 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIP_in_ruleCondicionIP1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIP_in_entryRuleIP1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIP1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIP1301 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIP1318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIP1335 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIP1352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIP1369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIP1386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIP1403 = new BitSet(new long[]{0x0000000000000002L});

}