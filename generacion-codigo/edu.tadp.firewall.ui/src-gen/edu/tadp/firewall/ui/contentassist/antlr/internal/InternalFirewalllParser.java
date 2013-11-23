package edu.tadp.firewall.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import edu.tadp.firewall.services.FirewalllGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFirewalllParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g"; }


     
     	private FirewalllGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FirewalllGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFirewall"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:60:1: entryRuleFirewall : ruleFirewall EOF ;
    public final void entryRuleFirewall() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:61:1: ( ruleFirewall EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:62:1: ruleFirewall EOF
            {
             before(grammarAccess.getFirewallRule()); 
            pushFollow(FOLLOW_ruleFirewall_in_entryRuleFirewall61);
            ruleFirewall();

            state._fsp--;

             after(grammarAccess.getFirewallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirewall68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFirewall"


    // $ANTLR start "ruleFirewall"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:69:1: ruleFirewall : ( ( rule__Firewall__ReglasAssignment )* ) ;
    public final void ruleFirewall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:73:2: ( ( ( rule__Firewall__ReglasAssignment )* ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:74:1: ( ( rule__Firewall__ReglasAssignment )* )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:74:1: ( ( rule__Firewall__ReglasAssignment )* )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:75:1: ( rule__Firewall__ReglasAssignment )*
            {
             before(grammarAccess.getFirewallAccess().getReglasAssignment()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:76:1: ( rule__Firewall__ReglasAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:76:2: rule__Firewall__ReglasAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Firewall__ReglasAssignment_in_ruleFirewall94);
            	    rule__Firewall__ReglasAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFirewallAccess().getReglasAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFirewall"


    // $ANTLR start "entryRuleReglaEtiquetada"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:88:1: entryRuleReglaEtiquetada : ruleReglaEtiquetada EOF ;
    public final void entryRuleReglaEtiquetada() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:89:1: ( ruleReglaEtiquetada EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:90:1: ruleReglaEtiquetada EOF
            {
             before(grammarAccess.getReglaEtiquetadaRule()); 
            pushFollow(FOLLOW_ruleReglaEtiquetada_in_entryRuleReglaEtiquetada122);
            ruleReglaEtiquetada();

            state._fsp--;

             after(grammarAccess.getReglaEtiquetadaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReglaEtiquetada129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReglaEtiquetada"


    // $ANTLR start "ruleReglaEtiquetada"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:97:1: ruleReglaEtiquetada : ( ( rule__ReglaEtiquetada__Group__0 ) ) ;
    public final void ruleReglaEtiquetada() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:101:2: ( ( ( rule__ReglaEtiquetada__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:102:1: ( ( rule__ReglaEtiquetada__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:102:1: ( ( rule__ReglaEtiquetada__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:103:1: ( rule__ReglaEtiquetada__Group__0 )
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:104:1: ( rule__ReglaEtiquetada__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:104:2: rule__ReglaEtiquetada__Group__0
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group__0_in_ruleReglaEtiquetada155);
            rule__ReglaEtiquetada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReglaEtiquetadaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReglaEtiquetada"


    // $ANTLR start "entryRuleRegla"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:116:1: entryRuleRegla : ruleRegla EOF ;
    public final void entryRuleRegla() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:117:1: ( ruleRegla EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:118:1: ruleRegla EOF
            {
             before(grammarAccess.getReglaRule()); 
            pushFollow(FOLLOW_ruleRegla_in_entryRuleRegla182);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getReglaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegla189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegla"


    // $ANTLR start "ruleRegla"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:125:1: ruleRegla : ( ( rule__Regla__Group__0 ) ) ;
    public final void ruleRegla() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:129:2: ( ( ( rule__Regla__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:130:1: ( ( rule__Regla__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:130:1: ( ( rule__Regla__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:131:1: ( rule__Regla__Group__0 )
            {
             before(grammarAccess.getReglaAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:132:1: ( rule__Regla__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:132:2: rule__Regla__Group__0
            {
            pushFollow(FOLLOW_rule__Regla__Group__0_in_ruleRegla215);
            rule__Regla__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegla"


    // $ANTLR start "entryRuleAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:144:1: entryRuleAccion : ruleAccion EOF ;
    public final void entryRuleAccion() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:145:1: ( ruleAccion EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:146:1: ruleAccion EOF
            {
             before(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_ruleAccion_in_entryRuleAccion242);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccion249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:153:1: ruleAccion : ( ( rule__Accion__Alternatives ) ) ;
    public final void ruleAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:157:2: ( ( ( rule__Accion__Alternatives ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:158:1: ( ( rule__Accion__Alternatives ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:158:1: ( ( rule__Accion__Alternatives ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:159:1: ( rule__Accion__Alternatives )
            {
             before(grammarAccess.getAccionAccess().getAlternatives()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:160:1: ( rule__Accion__Alternatives )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:160:2: rule__Accion__Alternatives
            {
            pushFollow(FOLLOW_rule__Accion__Alternatives_in_ruleAccion275);
            rule__Accion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleForwardearAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:172:1: entryRuleForwardearAccion : ruleForwardearAccion EOF ;
    public final void entryRuleForwardearAccion() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:173:1: ( ruleForwardearAccion EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:174:1: ruleForwardearAccion EOF
            {
             before(grammarAccess.getForwardearAccionRule()); 
            pushFollow(FOLLOW_ruleForwardearAccion_in_entryRuleForwardearAccion302);
            ruleForwardearAccion();

            state._fsp--;

             after(grammarAccess.getForwardearAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardearAccion309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForwardearAccion"


    // $ANTLR start "ruleForwardearAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:181:1: ruleForwardearAccion : ( ( rule__ForwardearAccion__Group__0 ) ) ;
    public final void ruleForwardearAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:185:2: ( ( ( rule__ForwardearAccion__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:186:1: ( ( rule__ForwardearAccion__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:186:1: ( ( rule__ForwardearAccion__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:187:1: ( rule__ForwardearAccion__Group__0 )
            {
             before(grammarAccess.getForwardearAccionAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:188:1: ( rule__ForwardearAccion__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:188:2: rule__ForwardearAccion__Group__0
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__0_in_ruleForwardearAccion335);
            rule__ForwardearAccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardearAccionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForwardearAccion"


    // $ANTLR start "entryRuleAceptarAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:200:1: entryRuleAceptarAccion : ruleAceptarAccion EOF ;
    public final void entryRuleAceptarAccion() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:201:1: ( ruleAceptarAccion EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:202:1: ruleAceptarAccion EOF
            {
             before(grammarAccess.getAceptarAccionRule()); 
            pushFollow(FOLLOW_ruleAceptarAccion_in_entryRuleAceptarAccion362);
            ruleAceptarAccion();

            state._fsp--;

             after(grammarAccess.getAceptarAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAceptarAccion369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAceptarAccion"


    // $ANTLR start "ruleAceptarAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:209:1: ruleAceptarAccion : ( ( rule__AceptarAccion__Group__0 ) ) ;
    public final void ruleAceptarAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:213:2: ( ( ( rule__AceptarAccion__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:214:1: ( ( rule__AceptarAccion__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:214:1: ( ( rule__AceptarAccion__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:215:1: ( rule__AceptarAccion__Group__0 )
            {
             before(grammarAccess.getAceptarAccionAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:216:1: ( rule__AceptarAccion__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:216:2: rule__AceptarAccion__Group__0
            {
            pushFollow(FOLLOW_rule__AceptarAccion__Group__0_in_ruleAceptarAccion395);
            rule__AceptarAccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAceptarAccionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAceptarAccion"


    // $ANTLR start "entryRuleBloquearAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:228:1: entryRuleBloquearAccion : ruleBloquearAccion EOF ;
    public final void entryRuleBloquearAccion() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:229:1: ( ruleBloquearAccion EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:230:1: ruleBloquearAccion EOF
            {
             before(grammarAccess.getBloquearAccionRule()); 
            pushFollow(FOLLOW_ruleBloquearAccion_in_entryRuleBloquearAccion422);
            ruleBloquearAccion();

            state._fsp--;

             after(grammarAccess.getBloquearAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBloquearAccion429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBloquearAccion"


    // $ANTLR start "ruleBloquearAccion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:237:1: ruleBloquearAccion : ( ( rule__BloquearAccion__Group__0 ) ) ;
    public final void ruleBloquearAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:241:2: ( ( ( rule__BloquearAccion__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:242:1: ( ( rule__BloquearAccion__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:242:1: ( ( rule__BloquearAccion__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:243:1: ( rule__BloquearAccion__Group__0 )
            {
             before(grammarAccess.getBloquearAccionAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:244:1: ( rule__BloquearAccion__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:244:2: rule__BloquearAccion__Group__0
            {
            pushFollow(FOLLOW_rule__BloquearAccion__Group__0_in_ruleBloquearAccion455);
            rule__BloquearAccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBloquearAccionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBloquearAccion"


    // $ANTLR start "entryRuleCondicion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:256:1: entryRuleCondicion : ruleCondicion EOF ;
    public final void entryRuleCondicion() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:257:1: ( ruleCondicion EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:258:1: ruleCondicion EOF
            {
             before(grammarAccess.getCondicionRule()); 
            pushFollow(FOLLOW_ruleCondicion_in_entryRuleCondicion482);
            ruleCondicion();

            state._fsp--;

             after(grammarAccess.getCondicionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicion489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicion"


    // $ANTLR start "ruleCondicion"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:265:1: ruleCondicion : ( ( rule__Condicion__Alternatives ) ) ;
    public final void ruleCondicion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:269:2: ( ( ( rule__Condicion__Alternatives ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:270:1: ( ( rule__Condicion__Alternatives ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:270:1: ( ( rule__Condicion__Alternatives ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:271:1: ( rule__Condicion__Alternatives )
            {
             before(grammarAccess.getCondicionAccess().getAlternatives()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:272:1: ( rule__Condicion__Alternatives )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:272:2: rule__Condicion__Alternatives
            {
            pushFollow(FOLLOW_rule__Condicion__Alternatives_in_ruleCondicion515);
            rule__Condicion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCondicionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicion"


    // $ANTLR start "entryRuleCondicionPuerto"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:284:1: entryRuleCondicionPuerto : ruleCondicionPuerto EOF ;
    public final void entryRuleCondicionPuerto() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:285:1: ( ruleCondicionPuerto EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:286:1: ruleCondicionPuerto EOF
            {
             before(grammarAccess.getCondicionPuertoRule()); 
            pushFollow(FOLLOW_ruleCondicionPuerto_in_entryRuleCondicionPuerto542);
            ruleCondicionPuerto();

            state._fsp--;

             after(grammarAccess.getCondicionPuertoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicionPuerto549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicionPuerto"


    // $ANTLR start "ruleCondicionPuerto"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:293:1: ruleCondicionPuerto : ( ( rule__CondicionPuerto__Group__0 ) ) ;
    public final void ruleCondicionPuerto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:297:2: ( ( ( rule__CondicionPuerto__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:298:1: ( ( rule__CondicionPuerto__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:298:1: ( ( rule__CondicionPuerto__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:299:1: ( rule__CondicionPuerto__Group__0 )
            {
             before(grammarAccess.getCondicionPuertoAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:300:1: ( rule__CondicionPuerto__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:300:2: rule__CondicionPuerto__Group__0
            {
            pushFollow(FOLLOW_rule__CondicionPuerto__Group__0_in_ruleCondicionPuerto575);
            rule__CondicionPuerto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicionPuertoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicionPuerto"


    // $ANTLR start "entryRuleCondicionIP"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:312:1: entryRuleCondicionIP : ruleCondicionIP EOF ;
    public final void entryRuleCondicionIP() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:313:1: ( ruleCondicionIP EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:314:1: ruleCondicionIP EOF
            {
             before(grammarAccess.getCondicionIPRule()); 
            pushFollow(FOLLOW_ruleCondicionIP_in_entryRuleCondicionIP602);
            ruleCondicionIP();

            state._fsp--;

             after(grammarAccess.getCondicionIPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondicionIP609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondicionIP"


    // $ANTLR start "ruleCondicionIP"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:321:1: ruleCondicionIP : ( ( rule__CondicionIP__Group__0 ) ) ;
    public final void ruleCondicionIP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:325:2: ( ( ( rule__CondicionIP__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:326:1: ( ( rule__CondicionIP__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:326:1: ( ( rule__CondicionIP__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:327:1: ( rule__CondicionIP__Group__0 )
            {
             before(grammarAccess.getCondicionIPAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:328:1: ( rule__CondicionIP__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:328:2: rule__CondicionIP__Group__0
            {
            pushFollow(FOLLOW_rule__CondicionIP__Group__0_in_ruleCondicionIP635);
            rule__CondicionIP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCondicionIPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondicionIP"


    // $ANTLR start "entryRuleIP"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:340:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:341:1: ( ruleIP EOF )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:342:1: ruleIP EOF
            {
             before(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_ruleIP_in_entryRuleIP662);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getIPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIP669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:349:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:353:2: ( ( ( rule__IP__Group__0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:354:1: ( ( rule__IP__Group__0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:354:1: ( ( rule__IP__Group__0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:355:1: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:356:1: ( rule__IP__Group__0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:356:2: rule__IP__Group__0
            {
            pushFollow(FOLLOW_rule__IP__Group__0_in_ruleIP695);
            rule__IP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "rule__Accion__Alternatives"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:368:1: rule__Accion__Alternatives : ( ( ruleAceptarAccion ) | ( ruleBloquearAccion ) | ( ruleForwardearAccion ) );
    public final void rule__Accion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:372:1: ( ( ruleAceptarAccion ) | ( ruleBloquearAccion ) | ( ruleForwardearAccion ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:373:1: ( ruleAceptarAccion )
                    {
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:373:1: ( ruleAceptarAccion )
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:374:1: ruleAceptarAccion
                    {
                     before(grammarAccess.getAccionAccess().getAceptarAccionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAceptarAccion_in_rule__Accion__Alternatives731);
                    ruleAceptarAccion();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getAceptarAccionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:379:6: ( ruleBloquearAccion )
                    {
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:379:6: ( ruleBloquearAccion )
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:380:1: ruleBloquearAccion
                    {
                     before(grammarAccess.getAccionAccess().getBloquearAccionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBloquearAccion_in_rule__Accion__Alternatives748);
                    ruleBloquearAccion();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getBloquearAccionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:385:6: ( ruleForwardearAccion )
                    {
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:385:6: ( ruleForwardearAccion )
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:386:1: ruleForwardearAccion
                    {
                     before(grammarAccess.getAccionAccess().getForwardearAccionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleForwardearAccion_in_rule__Accion__Alternatives765);
                    ruleForwardearAccion();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getForwardearAccionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accion__Alternatives"


    // $ANTLR start "rule__Condicion__Alternatives"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:396:1: rule__Condicion__Alternatives : ( ( ruleCondicionPuerto ) | ( ruleCondicionIP ) );
    public final void rule__Condicion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:400:1: ( ( ruleCondicionPuerto ) | ( ruleCondicionIP ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:401:1: ( ruleCondicionPuerto )
                    {
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:401:1: ( ruleCondicionPuerto )
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:402:1: ruleCondicionPuerto
                    {
                     before(grammarAccess.getCondicionAccess().getCondicionPuertoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCondicionPuerto_in_rule__Condicion__Alternatives797);
                    ruleCondicionPuerto();

                    state._fsp--;

                     after(grammarAccess.getCondicionAccess().getCondicionPuertoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:407:6: ( ruleCondicionIP )
                    {
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:407:6: ( ruleCondicionIP )
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:408:1: ruleCondicionIP
                    {
                     before(grammarAccess.getCondicionAccess().getCondicionIPParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCondicionIP_in_rule__Condicion__Alternatives814);
                    ruleCondicionIP();

                    state._fsp--;

                     after(grammarAccess.getCondicionAccess().getCondicionIPParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condicion__Alternatives"


    // $ANTLR start "rule__ReglaEtiquetada__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:420:1: rule__ReglaEtiquetada__Group__0 : rule__ReglaEtiquetada__Group__0__Impl rule__ReglaEtiquetada__Group__1 ;
    public final void rule__ReglaEtiquetada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:424:1: ( rule__ReglaEtiquetada__Group__0__Impl rule__ReglaEtiquetada__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:425:2: rule__ReglaEtiquetada__Group__0__Impl rule__ReglaEtiquetada__Group__1
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group__0__Impl_in_rule__ReglaEtiquetada__Group__0844);
            rule__ReglaEtiquetada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group__1_in_rule__ReglaEtiquetada__Group__0847);
            rule__ReglaEtiquetada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group__0"


    // $ANTLR start "rule__ReglaEtiquetada__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:432:1: rule__ReglaEtiquetada__Group__0__Impl : ( ( rule__ReglaEtiquetada__Group_0__0 )? ) ;
    public final void rule__ReglaEtiquetada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:436:1: ( ( ( rule__ReglaEtiquetada__Group_0__0 )? ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:437:1: ( ( rule__ReglaEtiquetada__Group_0__0 )? )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:437:1: ( ( rule__ReglaEtiquetada__Group_0__0 )? )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:438:1: ( rule__ReglaEtiquetada__Group_0__0 )?
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getGroup_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:439:1: ( rule__ReglaEtiquetada__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:439:2: rule__ReglaEtiquetada__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ReglaEtiquetada__Group_0__0_in_rule__ReglaEtiquetada__Group__0__Impl874);
                    rule__ReglaEtiquetada__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReglaEtiquetadaAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group__0__Impl"


    // $ANTLR start "rule__ReglaEtiquetada__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:449:1: rule__ReglaEtiquetada__Group__1 : rule__ReglaEtiquetada__Group__1__Impl ;
    public final void rule__ReglaEtiquetada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:453:1: ( rule__ReglaEtiquetada__Group__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:454:2: rule__ReglaEtiquetada__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group__1__Impl_in_rule__ReglaEtiquetada__Group__1905);
            rule__ReglaEtiquetada__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group__1"


    // $ANTLR start "rule__ReglaEtiquetada__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:460:1: rule__ReglaEtiquetada__Group__1__Impl : ( ( rule__ReglaEtiquetada__ReglaAssignment_1 ) ) ;
    public final void rule__ReglaEtiquetada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:464:1: ( ( ( rule__ReglaEtiquetada__ReglaAssignment_1 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:465:1: ( ( rule__ReglaEtiquetada__ReglaAssignment_1 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:465:1: ( ( rule__ReglaEtiquetada__ReglaAssignment_1 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:466:1: ( rule__ReglaEtiquetada__ReglaAssignment_1 )
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getReglaAssignment_1()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:467:1: ( rule__ReglaEtiquetada__ReglaAssignment_1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:467:2: rule__ReglaEtiquetada__ReglaAssignment_1
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__ReglaAssignment_1_in_rule__ReglaEtiquetada__Group__1__Impl932);
            rule__ReglaEtiquetada__ReglaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaEtiquetadaAccess().getReglaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group__1__Impl"


    // $ANTLR start "rule__ReglaEtiquetada__Group_0__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:481:1: rule__ReglaEtiquetada__Group_0__0 : rule__ReglaEtiquetada__Group_0__0__Impl rule__ReglaEtiquetada__Group_0__1 ;
    public final void rule__ReglaEtiquetada__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:485:1: ( rule__ReglaEtiquetada__Group_0__0__Impl rule__ReglaEtiquetada__Group_0__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:486:2: rule__ReglaEtiquetada__Group_0__0__Impl rule__ReglaEtiquetada__Group_0__1
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group_0__0__Impl_in_rule__ReglaEtiquetada__Group_0__0966);
            rule__ReglaEtiquetada__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group_0__1_in_rule__ReglaEtiquetada__Group_0__0969);
            rule__ReglaEtiquetada__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group_0__0"


    // $ANTLR start "rule__ReglaEtiquetada__Group_0__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:493:1: rule__ReglaEtiquetada__Group_0__0__Impl : ( ( rule__ReglaEtiquetada__LanAssignment_0_0 ) ) ;
    public final void rule__ReglaEtiquetada__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:497:1: ( ( ( rule__ReglaEtiquetada__LanAssignment_0_0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:498:1: ( ( rule__ReglaEtiquetada__LanAssignment_0_0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:498:1: ( ( rule__ReglaEtiquetada__LanAssignment_0_0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:499:1: ( rule__ReglaEtiquetada__LanAssignment_0_0 )
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getLanAssignment_0_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:500:1: ( rule__ReglaEtiquetada__LanAssignment_0_0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:500:2: rule__ReglaEtiquetada__LanAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__LanAssignment_0_0_in_rule__ReglaEtiquetada__Group_0__0__Impl996);
            rule__ReglaEtiquetada__LanAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getReglaEtiquetadaAccess().getLanAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group_0__0__Impl"


    // $ANTLR start "rule__ReglaEtiquetada__Group_0__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:510:1: rule__ReglaEtiquetada__Group_0__1 : rule__ReglaEtiquetada__Group_0__1__Impl ;
    public final void rule__ReglaEtiquetada__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:514:1: ( rule__ReglaEtiquetada__Group_0__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:515:2: rule__ReglaEtiquetada__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ReglaEtiquetada__Group_0__1__Impl_in_rule__ReglaEtiquetada__Group_0__11026);
            rule__ReglaEtiquetada__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group_0__1"


    // $ANTLR start "rule__ReglaEtiquetada__Group_0__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:521:1: rule__ReglaEtiquetada__Group_0__1__Impl : ( ':' ) ;
    public final void rule__ReglaEtiquetada__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:525:1: ( ( ':' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:526:1: ( ':' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:526:1: ( ':' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:527:1: ':'
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getColonKeyword_0_1()); 
            match(input,11,FOLLOW_11_in_rule__ReglaEtiquetada__Group_0__1__Impl1054); 
             after(grammarAccess.getReglaEtiquetadaAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__Group_0__1__Impl"


    // $ANTLR start "rule__Regla__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:544:1: rule__Regla__Group__0 : rule__Regla__Group__0__Impl rule__Regla__Group__1 ;
    public final void rule__Regla__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:548:1: ( rule__Regla__Group__0__Impl rule__Regla__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:549:2: rule__Regla__Group__0__Impl rule__Regla__Group__1
            {
            pushFollow(FOLLOW_rule__Regla__Group__0__Impl_in_rule__Regla__Group__01089);
            rule__Regla__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regla__Group__1_in_rule__Regla__Group__01092);
            rule__Regla__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__0"


    // $ANTLR start "rule__Regla__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:556:1: rule__Regla__Group__0__Impl : ( 'Si ' ) ;
    public final void rule__Regla__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:560:1: ( ( 'Si ' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:561:1: ( 'Si ' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:561:1: ( 'Si ' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:562:1: 'Si '
            {
             before(grammarAccess.getReglaAccess().getSiKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Regla__Group__0__Impl1120); 
             after(grammarAccess.getReglaAccess().getSiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__0__Impl"


    // $ANTLR start "rule__Regla__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:575:1: rule__Regla__Group__1 : rule__Regla__Group__1__Impl rule__Regla__Group__2 ;
    public final void rule__Regla__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:579:1: ( rule__Regla__Group__1__Impl rule__Regla__Group__2 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:580:2: rule__Regla__Group__1__Impl rule__Regla__Group__2
            {
            pushFollow(FOLLOW_rule__Regla__Group__1__Impl_in_rule__Regla__Group__11151);
            rule__Regla__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regla__Group__2_in_rule__Regla__Group__11154);
            rule__Regla__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__1"


    // $ANTLR start "rule__Regla__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:587:1: rule__Regla__Group__1__Impl : ( ( rule__Regla__CondicionAssignment_1 ) ) ;
    public final void rule__Regla__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:591:1: ( ( ( rule__Regla__CondicionAssignment_1 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:592:1: ( ( rule__Regla__CondicionAssignment_1 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:592:1: ( ( rule__Regla__CondicionAssignment_1 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:593:1: ( rule__Regla__CondicionAssignment_1 )
            {
             before(grammarAccess.getReglaAccess().getCondicionAssignment_1()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:594:1: ( rule__Regla__CondicionAssignment_1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:594:2: rule__Regla__CondicionAssignment_1
            {
            pushFollow(FOLLOW_rule__Regla__CondicionAssignment_1_in_rule__Regla__Group__1__Impl1181);
            rule__Regla__CondicionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getCondicionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__1__Impl"


    // $ANTLR start "rule__Regla__Group__2"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:604:1: rule__Regla__Group__2 : rule__Regla__Group__2__Impl rule__Regla__Group__3 ;
    public final void rule__Regla__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:608:1: ( rule__Regla__Group__2__Impl rule__Regla__Group__3 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:609:2: rule__Regla__Group__2__Impl rule__Regla__Group__3
            {
            pushFollow(FOLLOW_rule__Regla__Group__2__Impl_in_rule__Regla__Group__21211);
            rule__Regla__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regla__Group__3_in_rule__Regla__Group__21214);
            rule__Regla__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__2"


    // $ANTLR start "rule__Regla__Group__2__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:616:1: rule__Regla__Group__2__Impl : ( ' hay que ' ) ;
    public final void rule__Regla__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:620:1: ( ( ' hay que ' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:621:1: ( ' hay que ' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:621:1: ( ' hay que ' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:622:1: ' hay que '
            {
             before(grammarAccess.getReglaAccess().getHayQueKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Regla__Group__2__Impl1242); 
             after(grammarAccess.getReglaAccess().getHayQueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__2__Impl"


    // $ANTLR start "rule__Regla__Group__3"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:635:1: rule__Regla__Group__3 : rule__Regla__Group__3__Impl rule__Regla__Group__4 ;
    public final void rule__Regla__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:639:1: ( rule__Regla__Group__3__Impl rule__Regla__Group__4 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:640:2: rule__Regla__Group__3__Impl rule__Regla__Group__4
            {
            pushFollow(FOLLOW_rule__Regla__Group__3__Impl_in_rule__Regla__Group__31273);
            rule__Regla__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regla__Group__4_in_rule__Regla__Group__31276);
            rule__Regla__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__3"


    // $ANTLR start "rule__Regla__Group__3__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:647:1: rule__Regla__Group__3__Impl : ( ( rule__Regla__AccionAssignment_3 ) ) ;
    public final void rule__Regla__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:651:1: ( ( ( rule__Regla__AccionAssignment_3 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:652:1: ( ( rule__Regla__AccionAssignment_3 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:652:1: ( ( rule__Regla__AccionAssignment_3 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:653:1: ( rule__Regla__AccionAssignment_3 )
            {
             before(grammarAccess.getReglaAccess().getAccionAssignment_3()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:654:1: ( rule__Regla__AccionAssignment_3 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:654:2: rule__Regla__AccionAssignment_3
            {
            pushFollow(FOLLOW_rule__Regla__AccionAssignment_3_in_rule__Regla__Group__3__Impl1303);
            rule__Regla__AccionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReglaAccess().getAccionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__3__Impl"


    // $ANTLR start "rule__Regla__Group__4"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:664:1: rule__Regla__Group__4 : rule__Regla__Group__4__Impl ;
    public final void rule__Regla__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:668:1: ( rule__Regla__Group__4__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:669:2: rule__Regla__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Regla__Group__4__Impl_in_rule__Regla__Group__41333);
            rule__Regla__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__4"


    // $ANTLR start "rule__Regla__Group__4__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:675:1: rule__Regla__Group__4__Impl : ( '!' ) ;
    public final void rule__Regla__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:679:1: ( ( '!' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:680:1: ( '!' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:680:1: ( '!' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:681:1: '!'
            {
             before(grammarAccess.getReglaAccess().getExclamationMarkKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Regla__Group__4__Impl1361); 
             after(grammarAccess.getReglaAccess().getExclamationMarkKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__Group__4__Impl"


    // $ANTLR start "rule__ForwardearAccion__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:704:1: rule__ForwardearAccion__Group__0 : rule__ForwardearAccion__Group__0__Impl rule__ForwardearAccion__Group__1 ;
    public final void rule__ForwardearAccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:708:1: ( rule__ForwardearAccion__Group__0__Impl rule__ForwardearAccion__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:709:2: rule__ForwardearAccion__Group__0__Impl rule__ForwardearAccion__Group__1
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__0__Impl_in_rule__ForwardearAccion__Group__01402);
            rule__ForwardearAccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForwardearAccion__Group__1_in_rule__ForwardearAccion__Group__01405);
            rule__ForwardearAccion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__0"


    // $ANTLR start "rule__ForwardearAccion__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:716:1: rule__ForwardearAccion__Group__0__Impl : ( () ) ;
    public final void rule__ForwardearAccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:720:1: ( ( () ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:721:1: ( () )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:721:1: ( () )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:722:1: ()
            {
             before(grammarAccess.getForwardearAccionAccess().getForwardearAccionAction_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:723:1: ()
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:725:1: 
            {
            }

             after(grammarAccess.getForwardearAccionAccess().getForwardearAccionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__0__Impl"


    // $ANTLR start "rule__ForwardearAccion__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:735:1: rule__ForwardearAccion__Group__1 : rule__ForwardearAccion__Group__1__Impl rule__ForwardearAccion__Group__2 ;
    public final void rule__ForwardearAccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:739:1: ( rule__ForwardearAccion__Group__1__Impl rule__ForwardearAccion__Group__2 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:740:2: rule__ForwardearAccion__Group__1__Impl rule__ForwardearAccion__Group__2
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__1__Impl_in_rule__ForwardearAccion__Group__11463);
            rule__ForwardearAccion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForwardearAccion__Group__2_in_rule__ForwardearAccion__Group__11466);
            rule__ForwardearAccion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__1"


    // $ANTLR start "rule__ForwardearAccion__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:747:1: rule__ForwardearAccion__Group__1__Impl : ( 'forwardear a ' ) ;
    public final void rule__ForwardearAccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:751:1: ( ( 'forwardear a ' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:752:1: ( 'forwardear a ' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:752:1: ( 'forwardear a ' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:753:1: 'forwardear a '
            {
             before(grammarAccess.getForwardearAccionAccess().getForwardearAKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__ForwardearAccion__Group__1__Impl1494); 
             after(grammarAccess.getForwardearAccionAccess().getForwardearAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__1__Impl"


    // $ANTLR start "rule__ForwardearAccion__Group__2"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:766:1: rule__ForwardearAccion__Group__2 : rule__ForwardearAccion__Group__2__Impl rule__ForwardearAccion__Group__3 ;
    public final void rule__ForwardearAccion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:770:1: ( rule__ForwardearAccion__Group__2__Impl rule__ForwardearAccion__Group__3 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:771:2: rule__ForwardearAccion__Group__2__Impl rule__ForwardearAccion__Group__3
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__2__Impl_in_rule__ForwardearAccion__Group__21525);
            rule__ForwardearAccion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForwardearAccion__Group__3_in_rule__ForwardearAccion__Group__21528);
            rule__ForwardearAccion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__2"


    // $ANTLR start "rule__ForwardearAccion__Group__2__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:778:1: rule__ForwardearAccion__Group__2__Impl : ( ( rule__ForwardearAccion__IpAssignment_2 ) ) ;
    public final void rule__ForwardearAccion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:782:1: ( ( ( rule__ForwardearAccion__IpAssignment_2 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:783:1: ( ( rule__ForwardearAccion__IpAssignment_2 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:783:1: ( ( rule__ForwardearAccion__IpAssignment_2 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:784:1: ( rule__ForwardearAccion__IpAssignment_2 )
            {
             before(grammarAccess.getForwardearAccionAccess().getIpAssignment_2()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:785:1: ( rule__ForwardearAccion__IpAssignment_2 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:785:2: rule__ForwardearAccion__IpAssignment_2
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__IpAssignment_2_in_rule__ForwardearAccion__Group__2__Impl1555);
            rule__ForwardearAccion__IpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardearAccionAccess().getIpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__2__Impl"


    // $ANTLR start "rule__ForwardearAccion__Group__3"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:795:1: rule__ForwardearAccion__Group__3 : rule__ForwardearAccion__Group__3__Impl rule__ForwardearAccion__Group__4 ;
    public final void rule__ForwardearAccion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:799:1: ( rule__ForwardearAccion__Group__3__Impl rule__ForwardearAccion__Group__4 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:800:2: rule__ForwardearAccion__Group__3__Impl rule__ForwardearAccion__Group__4
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__3__Impl_in_rule__ForwardearAccion__Group__31585);
            rule__ForwardearAccion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForwardearAccion__Group__4_in_rule__ForwardearAccion__Group__31588);
            rule__ForwardearAccion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__3"


    // $ANTLR start "rule__ForwardearAccion__Group__3__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:807:1: rule__ForwardearAccion__Group__3__Impl : ( ':' ) ;
    public final void rule__ForwardearAccion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:811:1: ( ( ':' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:812:1: ( ':' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:812:1: ( ':' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:813:1: ':'
            {
             before(grammarAccess.getForwardearAccionAccess().getColonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__ForwardearAccion__Group__3__Impl1616); 
             after(grammarAccess.getForwardearAccionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__3__Impl"


    // $ANTLR start "rule__ForwardearAccion__Group__4"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:826:1: rule__ForwardearAccion__Group__4 : rule__ForwardearAccion__Group__4__Impl ;
    public final void rule__ForwardearAccion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:830:1: ( rule__ForwardearAccion__Group__4__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:831:2: rule__ForwardearAccion__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__Group__4__Impl_in_rule__ForwardearAccion__Group__41647);
            rule__ForwardearAccion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__4"


    // $ANTLR start "rule__ForwardearAccion__Group__4__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:837:1: rule__ForwardearAccion__Group__4__Impl : ( ( rule__ForwardearAccion__PuertoAssignment_4 ) ) ;
    public final void rule__ForwardearAccion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:841:1: ( ( ( rule__ForwardearAccion__PuertoAssignment_4 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:842:1: ( ( rule__ForwardearAccion__PuertoAssignment_4 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:842:1: ( ( rule__ForwardearAccion__PuertoAssignment_4 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:843:1: ( rule__ForwardearAccion__PuertoAssignment_4 )
            {
             before(grammarAccess.getForwardearAccionAccess().getPuertoAssignment_4()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:844:1: ( rule__ForwardearAccion__PuertoAssignment_4 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:844:2: rule__ForwardearAccion__PuertoAssignment_4
            {
            pushFollow(FOLLOW_rule__ForwardearAccion__PuertoAssignment_4_in_rule__ForwardearAccion__Group__4__Impl1674);
            rule__ForwardearAccion__PuertoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForwardearAccionAccess().getPuertoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__Group__4__Impl"


    // $ANTLR start "rule__AceptarAccion__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:864:1: rule__AceptarAccion__Group__0 : rule__AceptarAccion__Group__0__Impl rule__AceptarAccion__Group__1 ;
    public final void rule__AceptarAccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:868:1: ( rule__AceptarAccion__Group__0__Impl rule__AceptarAccion__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:869:2: rule__AceptarAccion__Group__0__Impl rule__AceptarAccion__Group__1
            {
            pushFollow(FOLLOW_rule__AceptarAccion__Group__0__Impl_in_rule__AceptarAccion__Group__01714);
            rule__AceptarAccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AceptarAccion__Group__1_in_rule__AceptarAccion__Group__01717);
            rule__AceptarAccion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AceptarAccion__Group__0"


    // $ANTLR start "rule__AceptarAccion__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:876:1: rule__AceptarAccion__Group__0__Impl : ( () ) ;
    public final void rule__AceptarAccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:880:1: ( ( () ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:881:1: ( () )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:881:1: ( () )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:882:1: ()
            {
             before(grammarAccess.getAceptarAccionAccess().getAceptarAccionAction_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:883:1: ()
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:885:1: 
            {
            }

             after(grammarAccess.getAceptarAccionAccess().getAceptarAccionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AceptarAccion__Group__0__Impl"


    // $ANTLR start "rule__AceptarAccion__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:895:1: rule__AceptarAccion__Group__1 : rule__AceptarAccion__Group__1__Impl ;
    public final void rule__AceptarAccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:899:1: ( rule__AceptarAccion__Group__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:900:2: rule__AceptarAccion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AceptarAccion__Group__1__Impl_in_rule__AceptarAccion__Group__11775);
            rule__AceptarAccion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AceptarAccion__Group__1"


    // $ANTLR start "rule__AceptarAccion__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:906:1: rule__AceptarAccion__Group__1__Impl : ( 'aceptar' ) ;
    public final void rule__AceptarAccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:910:1: ( ( 'aceptar' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:911:1: ( 'aceptar' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:911:1: ( 'aceptar' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:912:1: 'aceptar'
            {
             before(grammarAccess.getAceptarAccionAccess().getAceptarKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__AceptarAccion__Group__1__Impl1803); 
             after(grammarAccess.getAceptarAccionAccess().getAceptarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AceptarAccion__Group__1__Impl"


    // $ANTLR start "rule__BloquearAccion__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:929:1: rule__BloquearAccion__Group__0 : rule__BloquearAccion__Group__0__Impl rule__BloquearAccion__Group__1 ;
    public final void rule__BloquearAccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:933:1: ( rule__BloquearAccion__Group__0__Impl rule__BloquearAccion__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:934:2: rule__BloquearAccion__Group__0__Impl rule__BloquearAccion__Group__1
            {
            pushFollow(FOLLOW_rule__BloquearAccion__Group__0__Impl_in_rule__BloquearAccion__Group__01838);
            rule__BloquearAccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BloquearAccion__Group__1_in_rule__BloquearAccion__Group__01841);
            rule__BloquearAccion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BloquearAccion__Group__0"


    // $ANTLR start "rule__BloquearAccion__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:941:1: rule__BloquearAccion__Group__0__Impl : ( () ) ;
    public final void rule__BloquearAccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:945:1: ( ( () ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:946:1: ( () )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:946:1: ( () )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:947:1: ()
            {
             before(grammarAccess.getBloquearAccionAccess().getBloquearAccionAction_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:948:1: ()
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:950:1: 
            {
            }

             after(grammarAccess.getBloquearAccionAccess().getBloquearAccionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BloquearAccion__Group__0__Impl"


    // $ANTLR start "rule__BloquearAccion__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:960:1: rule__BloquearAccion__Group__1 : rule__BloquearAccion__Group__1__Impl ;
    public final void rule__BloquearAccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:964:1: ( rule__BloquearAccion__Group__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:965:2: rule__BloquearAccion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BloquearAccion__Group__1__Impl_in_rule__BloquearAccion__Group__11899);
            rule__BloquearAccion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BloquearAccion__Group__1"


    // $ANTLR start "rule__BloquearAccion__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:971:1: rule__BloquearAccion__Group__1__Impl : ( 'bloquear' ) ;
    public final void rule__BloquearAccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:975:1: ( ( 'bloquear' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:976:1: ( 'bloquear' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:976:1: ( 'bloquear' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:977:1: 'bloquear'
            {
             before(grammarAccess.getBloquearAccionAccess().getBloquearKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__BloquearAccion__Group__1__Impl1927); 
             after(grammarAccess.getBloquearAccionAccess().getBloquearKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BloquearAccion__Group__1__Impl"


    // $ANTLR start "rule__CondicionPuerto__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:994:1: rule__CondicionPuerto__Group__0 : rule__CondicionPuerto__Group__0__Impl rule__CondicionPuerto__Group__1 ;
    public final void rule__CondicionPuerto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:998:1: ( rule__CondicionPuerto__Group__0__Impl rule__CondicionPuerto__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:999:2: rule__CondicionPuerto__Group__0__Impl rule__CondicionPuerto__Group__1
            {
            pushFollow(FOLLOW_rule__CondicionPuerto__Group__0__Impl_in_rule__CondicionPuerto__Group__01962);
            rule__CondicionPuerto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondicionPuerto__Group__1_in_rule__CondicionPuerto__Group__01965);
            rule__CondicionPuerto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionPuerto__Group__0"


    // $ANTLR start "rule__CondicionPuerto__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1006:1: rule__CondicionPuerto__Group__0__Impl : ( 'el puerto es' ) ;
    public final void rule__CondicionPuerto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1010:1: ( ( 'el puerto es' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1011:1: ( 'el puerto es' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1011:1: ( 'el puerto es' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1012:1: 'el puerto es'
            {
             before(grammarAccess.getCondicionPuertoAccess().getElPuertoEsKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__CondicionPuerto__Group__0__Impl1993); 
             after(grammarAccess.getCondicionPuertoAccess().getElPuertoEsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionPuerto__Group__0__Impl"


    // $ANTLR start "rule__CondicionPuerto__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1025:1: rule__CondicionPuerto__Group__1 : rule__CondicionPuerto__Group__1__Impl ;
    public final void rule__CondicionPuerto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1029:1: ( rule__CondicionPuerto__Group__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1030:2: rule__CondicionPuerto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CondicionPuerto__Group__1__Impl_in_rule__CondicionPuerto__Group__12024);
            rule__CondicionPuerto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionPuerto__Group__1"


    // $ANTLR start "rule__CondicionPuerto__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1036:1: rule__CondicionPuerto__Group__1__Impl : ( ( rule__CondicionPuerto__PuertoAssignment_1 ) ) ;
    public final void rule__CondicionPuerto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1040:1: ( ( ( rule__CondicionPuerto__PuertoAssignment_1 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1041:1: ( ( rule__CondicionPuerto__PuertoAssignment_1 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1041:1: ( ( rule__CondicionPuerto__PuertoAssignment_1 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1042:1: ( rule__CondicionPuerto__PuertoAssignment_1 )
            {
             before(grammarAccess.getCondicionPuertoAccess().getPuertoAssignment_1()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1043:1: ( rule__CondicionPuerto__PuertoAssignment_1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1043:2: rule__CondicionPuerto__PuertoAssignment_1
            {
            pushFollow(FOLLOW_rule__CondicionPuerto__PuertoAssignment_1_in_rule__CondicionPuerto__Group__1__Impl2051);
            rule__CondicionPuerto__PuertoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCondicionPuertoAccess().getPuertoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionPuerto__Group__1__Impl"


    // $ANTLR start "rule__CondicionIP__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1057:1: rule__CondicionIP__Group__0 : rule__CondicionIP__Group__0__Impl rule__CondicionIP__Group__1 ;
    public final void rule__CondicionIP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1061:1: ( rule__CondicionIP__Group__0__Impl rule__CondicionIP__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1062:2: rule__CondicionIP__Group__0__Impl rule__CondicionIP__Group__1
            {
            pushFollow(FOLLOW_rule__CondicionIP__Group__0__Impl_in_rule__CondicionIP__Group__02085);
            rule__CondicionIP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CondicionIP__Group__1_in_rule__CondicionIP__Group__02088);
            rule__CondicionIP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionIP__Group__0"


    // $ANTLR start "rule__CondicionIP__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1069:1: rule__CondicionIP__Group__0__Impl : ( 'la ip es' ) ;
    public final void rule__CondicionIP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1073:1: ( ( 'la ip es' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1074:1: ( 'la ip es' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1074:1: ( 'la ip es' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1075:1: 'la ip es'
            {
             before(grammarAccess.getCondicionIPAccess().getLaIpEsKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__CondicionIP__Group__0__Impl2116); 
             after(grammarAccess.getCondicionIPAccess().getLaIpEsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionIP__Group__0__Impl"


    // $ANTLR start "rule__CondicionIP__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1088:1: rule__CondicionIP__Group__1 : rule__CondicionIP__Group__1__Impl ;
    public final void rule__CondicionIP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1092:1: ( rule__CondicionIP__Group__1__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1093:2: rule__CondicionIP__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CondicionIP__Group__1__Impl_in_rule__CondicionIP__Group__12147);
            rule__CondicionIP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionIP__Group__1"


    // $ANTLR start "rule__CondicionIP__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1099:1: rule__CondicionIP__Group__1__Impl : ( ( rule__CondicionIP__IpAssignment_1 ) ) ;
    public final void rule__CondicionIP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1103:1: ( ( ( rule__CondicionIP__IpAssignment_1 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1104:1: ( ( rule__CondicionIP__IpAssignment_1 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1104:1: ( ( rule__CondicionIP__IpAssignment_1 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1105:1: ( rule__CondicionIP__IpAssignment_1 )
            {
             before(grammarAccess.getCondicionIPAccess().getIpAssignment_1()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1106:1: ( rule__CondicionIP__IpAssignment_1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1106:2: rule__CondicionIP__IpAssignment_1
            {
            pushFollow(FOLLOW_rule__CondicionIP__IpAssignment_1_in_rule__CondicionIP__Group__1__Impl2174);
            rule__CondicionIP__IpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCondicionIPAccess().getIpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionIP__Group__1__Impl"


    // $ANTLR start "rule__IP__Group__0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1120:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1124:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1125:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_rule__IP__Group__0__Impl_in_rule__IP__Group__02208);
            rule__IP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__1_in_rule__IP__Group__02211);
            rule__IP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0"


    // $ANTLR start "rule__IP__Group__0__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1132:1: rule__IP__Group__0__Impl : ( ( rule__IP__PrimeroAssignment_0 ) ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1136:1: ( ( ( rule__IP__PrimeroAssignment_0 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1137:1: ( ( rule__IP__PrimeroAssignment_0 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1137:1: ( ( rule__IP__PrimeroAssignment_0 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1138:1: ( rule__IP__PrimeroAssignment_0 )
            {
             before(grammarAccess.getIPAccess().getPrimeroAssignment_0()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1139:1: ( rule__IP__PrimeroAssignment_0 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1139:2: rule__IP__PrimeroAssignment_0
            {
            pushFollow(FOLLOW_rule__IP__PrimeroAssignment_0_in_rule__IP__Group__0__Impl2238);
            rule__IP__PrimeroAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getPrimeroAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0__Impl"


    // $ANTLR start "rule__IP__Group__1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1149:1: rule__IP__Group__1 : rule__IP__Group__1__Impl rule__IP__Group__2 ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1153:1: ( rule__IP__Group__1__Impl rule__IP__Group__2 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1154:2: rule__IP__Group__1__Impl rule__IP__Group__2
            {
            pushFollow(FOLLOW_rule__IP__Group__1__Impl_in_rule__IP__Group__12268);
            rule__IP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__2_in_rule__IP__Group__12271);
            rule__IP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1"


    // $ANTLR start "rule__IP__Group__1__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1161:1: rule__IP__Group__1__Impl : ( '.' ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1165:1: ( ( '.' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1166:1: ( '.' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1166:1: ( '.' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1167:1: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__IP__Group__1__Impl2299); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1__Impl"


    // $ANTLR start "rule__IP__Group__2"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1180:1: rule__IP__Group__2 : rule__IP__Group__2__Impl rule__IP__Group__3 ;
    public final void rule__IP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1184:1: ( rule__IP__Group__2__Impl rule__IP__Group__3 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1185:2: rule__IP__Group__2__Impl rule__IP__Group__3
            {
            pushFollow(FOLLOW_rule__IP__Group__2__Impl_in_rule__IP__Group__22330);
            rule__IP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__3_in_rule__IP__Group__22333);
            rule__IP__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__2"


    // $ANTLR start "rule__IP__Group__2__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1192:1: rule__IP__Group__2__Impl : ( ( rule__IP__SegundoAssignment_2 ) ) ;
    public final void rule__IP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1196:1: ( ( ( rule__IP__SegundoAssignment_2 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1197:1: ( ( rule__IP__SegundoAssignment_2 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1197:1: ( ( rule__IP__SegundoAssignment_2 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1198:1: ( rule__IP__SegundoAssignment_2 )
            {
             before(grammarAccess.getIPAccess().getSegundoAssignment_2()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1199:1: ( rule__IP__SegundoAssignment_2 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1199:2: rule__IP__SegundoAssignment_2
            {
            pushFollow(FOLLOW_rule__IP__SegundoAssignment_2_in_rule__IP__Group__2__Impl2360);
            rule__IP__SegundoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getSegundoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__2__Impl"


    // $ANTLR start "rule__IP__Group__3"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1209:1: rule__IP__Group__3 : rule__IP__Group__3__Impl rule__IP__Group__4 ;
    public final void rule__IP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1213:1: ( rule__IP__Group__3__Impl rule__IP__Group__4 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1214:2: rule__IP__Group__3__Impl rule__IP__Group__4
            {
            pushFollow(FOLLOW_rule__IP__Group__3__Impl_in_rule__IP__Group__32390);
            rule__IP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__4_in_rule__IP__Group__32393);
            rule__IP__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__3"


    // $ANTLR start "rule__IP__Group__3__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1221:1: rule__IP__Group__3__Impl : ( '.' ) ;
    public final void rule__IP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1225:1: ( ( '.' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1226:1: ( '.' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1226:1: ( '.' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1227:1: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__IP__Group__3__Impl2421); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__3__Impl"


    // $ANTLR start "rule__IP__Group__4"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1240:1: rule__IP__Group__4 : rule__IP__Group__4__Impl rule__IP__Group__5 ;
    public final void rule__IP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1244:1: ( rule__IP__Group__4__Impl rule__IP__Group__5 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1245:2: rule__IP__Group__4__Impl rule__IP__Group__5
            {
            pushFollow(FOLLOW_rule__IP__Group__4__Impl_in_rule__IP__Group__42452);
            rule__IP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__5_in_rule__IP__Group__42455);
            rule__IP__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__4"


    // $ANTLR start "rule__IP__Group__4__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1252:1: rule__IP__Group__4__Impl : ( ( rule__IP__TerceroAssignment_4 ) ) ;
    public final void rule__IP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1256:1: ( ( ( rule__IP__TerceroAssignment_4 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1257:1: ( ( rule__IP__TerceroAssignment_4 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1257:1: ( ( rule__IP__TerceroAssignment_4 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1258:1: ( rule__IP__TerceroAssignment_4 )
            {
             before(grammarAccess.getIPAccess().getTerceroAssignment_4()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1259:1: ( rule__IP__TerceroAssignment_4 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1259:2: rule__IP__TerceroAssignment_4
            {
            pushFollow(FOLLOW_rule__IP__TerceroAssignment_4_in_rule__IP__Group__4__Impl2482);
            rule__IP__TerceroAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getTerceroAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__4__Impl"


    // $ANTLR start "rule__IP__Group__5"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1269:1: rule__IP__Group__5 : rule__IP__Group__5__Impl rule__IP__Group__6 ;
    public final void rule__IP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1273:1: ( rule__IP__Group__5__Impl rule__IP__Group__6 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1274:2: rule__IP__Group__5__Impl rule__IP__Group__6
            {
            pushFollow(FOLLOW_rule__IP__Group__5__Impl_in_rule__IP__Group__52512);
            rule__IP__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IP__Group__6_in_rule__IP__Group__52515);
            rule__IP__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__5"


    // $ANTLR start "rule__IP__Group__5__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1281:1: rule__IP__Group__5__Impl : ( '.' ) ;
    public final void rule__IP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1285:1: ( ( '.' ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1286:1: ( '.' )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1286:1: ( '.' )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1287:1: '.'
            {
             before(grammarAccess.getIPAccess().getFullStopKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__IP__Group__5__Impl2543); 
             after(grammarAccess.getIPAccess().getFullStopKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__5__Impl"


    // $ANTLR start "rule__IP__Group__6"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1300:1: rule__IP__Group__6 : rule__IP__Group__6__Impl ;
    public final void rule__IP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1304:1: ( rule__IP__Group__6__Impl )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1305:2: rule__IP__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IP__Group__6__Impl_in_rule__IP__Group__62574);
            rule__IP__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__6"


    // $ANTLR start "rule__IP__Group__6__Impl"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1311:1: rule__IP__Group__6__Impl : ( ( rule__IP__CuartoAssignment_6 ) ) ;
    public final void rule__IP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1315:1: ( ( ( rule__IP__CuartoAssignment_6 ) ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1316:1: ( ( rule__IP__CuartoAssignment_6 ) )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1316:1: ( ( rule__IP__CuartoAssignment_6 ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1317:1: ( rule__IP__CuartoAssignment_6 )
            {
             before(grammarAccess.getIPAccess().getCuartoAssignment_6()); 
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1318:1: ( rule__IP__CuartoAssignment_6 )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1318:2: rule__IP__CuartoAssignment_6
            {
            pushFollow(FOLLOW_rule__IP__CuartoAssignment_6_in_rule__IP__Group__6__Impl2601);
            rule__IP__CuartoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getCuartoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__6__Impl"


    // $ANTLR start "rule__Firewall__ReglasAssignment"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1343:1: rule__Firewall__ReglasAssignment : ( ruleReglaEtiquetada ) ;
    public final void rule__Firewall__ReglasAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1347:1: ( ( ruleReglaEtiquetada ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1348:1: ( ruleReglaEtiquetada )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1348:1: ( ruleReglaEtiquetada )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1349:1: ruleReglaEtiquetada
            {
             before(grammarAccess.getFirewallAccess().getReglasReglaEtiquetadaParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleReglaEtiquetada_in_rule__Firewall__ReglasAssignment2650);
            ruleReglaEtiquetada();

            state._fsp--;

             after(grammarAccess.getFirewallAccess().getReglasReglaEtiquetadaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Firewall__ReglasAssignment"


    // $ANTLR start "rule__ReglaEtiquetada__LanAssignment_0_0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1358:1: rule__ReglaEtiquetada__LanAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ReglaEtiquetada__LanAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1362:1: ( ( RULE_ID ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1363:1: ( RULE_ID )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1363:1: ( RULE_ID )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1364:1: RULE_ID
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getLanIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReglaEtiquetada__LanAssignment_0_02681); 
             after(grammarAccess.getReglaEtiquetadaAccess().getLanIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__LanAssignment_0_0"


    // $ANTLR start "rule__ReglaEtiquetada__ReglaAssignment_1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1373:1: rule__ReglaEtiquetada__ReglaAssignment_1 : ( ruleRegla ) ;
    public final void rule__ReglaEtiquetada__ReglaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1377:1: ( ( ruleRegla ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1378:1: ( ruleRegla )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1378:1: ( ruleRegla )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1379:1: ruleRegla
            {
             before(grammarAccess.getReglaEtiquetadaAccess().getReglaReglaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRegla_in_rule__ReglaEtiquetada__ReglaAssignment_12712);
            ruleRegla();

            state._fsp--;

             after(grammarAccess.getReglaEtiquetadaAccess().getReglaReglaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReglaEtiquetada__ReglaAssignment_1"


    // $ANTLR start "rule__Regla__CondicionAssignment_1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1388:1: rule__Regla__CondicionAssignment_1 : ( ruleCondicion ) ;
    public final void rule__Regla__CondicionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1392:1: ( ( ruleCondicion ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1393:1: ( ruleCondicion )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1393:1: ( ruleCondicion )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1394:1: ruleCondicion
            {
             before(grammarAccess.getReglaAccess().getCondicionCondicionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondicion_in_rule__Regla__CondicionAssignment_12743);
            ruleCondicion();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getCondicionCondicionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__CondicionAssignment_1"


    // $ANTLR start "rule__Regla__AccionAssignment_3"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1403:1: rule__Regla__AccionAssignment_3 : ( ruleAccion ) ;
    public final void rule__Regla__AccionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1407:1: ( ( ruleAccion ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1408:1: ( ruleAccion )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1408:1: ( ruleAccion )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1409:1: ruleAccion
            {
             before(grammarAccess.getReglaAccess().getAccionAccionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAccion_in_rule__Regla__AccionAssignment_32774);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getReglaAccess().getAccionAccionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regla__AccionAssignment_3"


    // $ANTLR start "rule__ForwardearAccion__IpAssignment_2"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1418:1: rule__ForwardearAccion__IpAssignment_2 : ( ruleIP ) ;
    public final void rule__ForwardearAccion__IpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1422:1: ( ( ruleIP ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1423:1: ( ruleIP )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1423:1: ( ruleIP )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1424:1: ruleIP
            {
             before(grammarAccess.getForwardearAccionAccess().getIpIPParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIP_in_rule__ForwardearAccion__IpAssignment_22805);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getForwardearAccionAccess().getIpIPParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__IpAssignment_2"


    // $ANTLR start "rule__ForwardearAccion__PuertoAssignment_4"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1433:1: rule__ForwardearAccion__PuertoAssignment_4 : ( RULE_INT ) ;
    public final void rule__ForwardearAccion__PuertoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1437:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1438:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1438:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1439:1: RULE_INT
            {
             before(grammarAccess.getForwardearAccionAccess().getPuertoINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ForwardearAccion__PuertoAssignment_42836); 
             after(grammarAccess.getForwardearAccionAccess().getPuertoINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardearAccion__PuertoAssignment_4"


    // $ANTLR start "rule__CondicionPuerto__PuertoAssignment_1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1448:1: rule__CondicionPuerto__PuertoAssignment_1 : ( RULE_INT ) ;
    public final void rule__CondicionPuerto__PuertoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1452:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1453:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1453:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1454:1: RULE_INT
            {
             before(grammarAccess.getCondicionPuertoAccess().getPuertoINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CondicionPuerto__PuertoAssignment_12867); 
             after(grammarAccess.getCondicionPuertoAccess().getPuertoINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionPuerto__PuertoAssignment_1"


    // $ANTLR start "rule__CondicionIP__IpAssignment_1"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1463:1: rule__CondicionIP__IpAssignment_1 : ( ruleIP ) ;
    public final void rule__CondicionIP__IpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1467:1: ( ( ruleIP ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1468:1: ( ruleIP )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1468:1: ( ruleIP )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1469:1: ruleIP
            {
             before(grammarAccess.getCondicionIPAccess().getIpIPParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIP_in_rule__CondicionIP__IpAssignment_12898);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getCondicionIPAccess().getIpIPParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CondicionIP__IpAssignment_1"


    // $ANTLR start "rule__IP__PrimeroAssignment_0"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1478:1: rule__IP__PrimeroAssignment_0 : ( RULE_INT ) ;
    public final void rule__IP__PrimeroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1482:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1483:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1483:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1484:1: RULE_INT
            {
             before(grammarAccess.getIPAccess().getPrimeroINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IP__PrimeroAssignment_02929); 
             after(grammarAccess.getIPAccess().getPrimeroINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__PrimeroAssignment_0"


    // $ANTLR start "rule__IP__SegundoAssignment_2"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1493:1: rule__IP__SegundoAssignment_2 : ( RULE_INT ) ;
    public final void rule__IP__SegundoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1497:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1498:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1498:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1499:1: RULE_INT
            {
             before(grammarAccess.getIPAccess().getSegundoINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IP__SegundoAssignment_22960); 
             after(grammarAccess.getIPAccess().getSegundoINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__SegundoAssignment_2"


    // $ANTLR start "rule__IP__TerceroAssignment_4"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1508:1: rule__IP__TerceroAssignment_4 : ( RULE_INT ) ;
    public final void rule__IP__TerceroAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1512:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1513:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1513:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1514:1: RULE_INT
            {
             before(grammarAccess.getIPAccess().getTerceroINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IP__TerceroAssignment_42991); 
             after(grammarAccess.getIPAccess().getTerceroINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__TerceroAssignment_4"


    // $ANTLR start "rule__IP__CuartoAssignment_6"
    // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1523:1: rule__IP__CuartoAssignment_6 : ( RULE_INT ) ;
    public final void rule__IP__CuartoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1527:1: ( ( RULE_INT ) )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1528:1: ( RULE_INT )
            {
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1528:1: ( RULE_INT )
            // ../edu.tadp.firewall.ui/src-gen/edu/tadp/firewall/ui/contentassist/antlr/internal/InternalFirewalll.g:1529:1: RULE_INT
            {
             before(grammarAccess.getIPAccess().getCuartoINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IP__CuartoAssignment_63022); 
             after(grammarAccess.getIPAccess().getCuartoINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__CuartoAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFirewall_in_entryRuleFirewall61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirewall68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Firewall__ReglasAssignment_in_ruleFirewall94 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleReglaEtiquetada_in_entryRuleReglaEtiquetada122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReglaEtiquetada129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group__0_in_ruleReglaEtiquetada155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegla_in_entryRuleRegla182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegla189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__0_in_ruleRegla215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccion249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Accion__Alternatives_in_ruleAccion275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardearAccion_in_entryRuleForwardearAccion302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardearAccion309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__0_in_ruleForwardearAccion335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAceptarAccion_in_entryRuleAceptarAccion362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAceptarAccion369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AceptarAccion__Group__0_in_ruleAceptarAccion395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloquearAccion_in_entryRuleBloquearAccion422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBloquearAccion429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BloquearAccion__Group__0_in_ruleBloquearAccion455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicion_in_entryRuleCondicion482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicion489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condicion__Alternatives_in_ruleCondicion515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionPuerto_in_entryRuleCondicionPuerto542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicionPuerto549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionPuerto__Group__0_in_ruleCondicionPuerto575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionIP_in_entryRuleCondicionIP602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondicionIP609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionIP__Group__0_in_ruleCondicionIP635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIP_in_entryRuleIP662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIP669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__0_in_ruleIP695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAceptarAccion_in_rule__Accion__Alternatives731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloquearAccion_in_rule__Accion__Alternatives748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardearAccion_in_rule__Accion__Alternatives765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionPuerto_in_rule__Condicion__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicionIP_in_rule__Condicion__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group__0__Impl_in_rule__ReglaEtiquetada__Group__0844 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group__1_in_rule__ReglaEtiquetada__Group__0847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group_0__0_in_rule__ReglaEtiquetada__Group__0__Impl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group__1__Impl_in_rule__ReglaEtiquetada__Group__1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__ReglaAssignment_1_in_rule__ReglaEtiquetada__Group__1__Impl932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group_0__0__Impl_in_rule__ReglaEtiquetada__Group_0__0966 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group_0__1_in_rule__ReglaEtiquetada__Group_0__0969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__LanAssignment_0_0_in_rule__ReglaEtiquetada__Group_0__0__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReglaEtiquetada__Group_0__1__Impl_in_rule__ReglaEtiquetada__Group_0__11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ReglaEtiquetada__Group_0__1__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__0__Impl_in_rule__Regla__Group__01089 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Regla__Group__1_in_rule__Regla__Group__01092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Regla__Group__0__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__1__Impl_in_rule__Regla__Group__11151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Regla__Group__2_in_rule__Regla__Group__11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__CondicionAssignment_1_in_rule__Regla__Group__1__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__2__Impl_in_rule__Regla__Group__21211 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Regla__Group__3_in_rule__Regla__Group__21214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Regla__Group__2__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__3__Impl_in_rule__Regla__Group__31273 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Regla__Group__4_in_rule__Regla__Group__31276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__AccionAssignment_3_in_rule__Regla__Group__3__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regla__Group__4__Impl_in_rule__Regla__Group__41333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Regla__Group__4__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__0__Impl_in_rule__ForwardearAccion__Group__01402 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__1_in_rule__ForwardearAccion__Group__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__1__Impl_in_rule__ForwardearAccion__Group__11463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__2_in_rule__ForwardearAccion__Group__11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ForwardearAccion__Group__1__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__2__Impl_in_rule__ForwardearAccion__Group__21525 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__3_in_rule__ForwardearAccion__Group__21528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__IpAssignment_2_in_rule__ForwardearAccion__Group__2__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__3__Impl_in_rule__ForwardearAccion__Group__31585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__4_in_rule__ForwardearAccion__Group__31588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ForwardearAccion__Group__3__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__Group__4__Impl_in_rule__ForwardearAccion__Group__41647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForwardearAccion__PuertoAssignment_4_in_rule__ForwardearAccion__Group__4__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AceptarAccion__Group__0__Impl_in_rule__AceptarAccion__Group__01714 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AceptarAccion__Group__1_in_rule__AceptarAccion__Group__01717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AceptarAccion__Group__1__Impl_in_rule__AceptarAccion__Group__11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AceptarAccion__Group__1__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BloquearAccion__Group__0__Impl_in_rule__BloquearAccion__Group__01838 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BloquearAccion__Group__1_in_rule__BloquearAccion__Group__01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BloquearAccion__Group__1__Impl_in_rule__BloquearAccion__Group__11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BloquearAccion__Group__1__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionPuerto__Group__0__Impl_in_rule__CondicionPuerto__Group__01962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CondicionPuerto__Group__1_in_rule__CondicionPuerto__Group__01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CondicionPuerto__Group__0__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionPuerto__Group__1__Impl_in_rule__CondicionPuerto__Group__12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionPuerto__PuertoAssignment_1_in_rule__CondicionPuerto__Group__1__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionIP__Group__0__Impl_in_rule__CondicionIP__Group__02085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CondicionIP__Group__1_in_rule__CondicionIP__Group__02088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CondicionIP__Group__0__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionIP__Group__1__Impl_in_rule__CondicionIP__Group__12147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CondicionIP__IpAssignment_1_in_rule__CondicionIP__Group__1__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__0__Impl_in_rule__IP__Group__02208 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IP__Group__1_in_rule__IP__Group__02211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__PrimeroAssignment_0_in_rule__IP__Group__0__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__1__Impl_in_rule__IP__Group__12268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IP__Group__2_in_rule__IP__Group__12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IP__Group__1__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__2__Impl_in_rule__IP__Group__22330 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IP__Group__3_in_rule__IP__Group__22333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__SegundoAssignment_2_in_rule__IP__Group__2__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__3__Impl_in_rule__IP__Group__32390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IP__Group__4_in_rule__IP__Group__32393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IP__Group__3__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__4__Impl_in_rule__IP__Group__42452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IP__Group__5_in_rule__IP__Group__42455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__TerceroAssignment_4_in_rule__IP__Group__4__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__5__Impl_in_rule__IP__Group__52512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IP__Group__6_in_rule__IP__Group__52515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IP__Group__5__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__Group__6__Impl_in_rule__IP__Group__62574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IP__CuartoAssignment_6_in_rule__IP__Group__6__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReglaEtiquetada_in_rule__Firewall__ReglasAssignment2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReglaEtiquetada__LanAssignment_0_02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegla_in_rule__ReglaEtiquetada__ReglaAssignment_12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondicion_in_rule__Regla__CondicionAssignment_12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_rule__Regla__AccionAssignment_32774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIP_in_rule__ForwardearAccion__IpAssignment_22805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ForwardearAccion__PuertoAssignment_42836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CondicionPuerto__PuertoAssignment_12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIP_in_rule__CondicionIP__IpAssignment_12898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IP__PrimeroAssignment_02929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IP__SegundoAssignment_22960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IP__TerceroAssignment_42991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IP__CuartoAssignment_63022 = new BitSet(new long[]{0x0000000000000002L});

}