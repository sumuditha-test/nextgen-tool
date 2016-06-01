package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IntegrationFlow'", "'InboundEndpoint'", "'OutboundEndpoint'", "'Pipeline'", "'log'", "'call'", "'respond'", "'filter'", "'transform'", "'enrich'", "'external'", "'('", "')'", "'->'", "':'", "'par'", "'end'", "'else'", "'alt'", "'condition'", "'source'", "','", "'pattern'", "'loop'", "'group'", "'ref'", "'participant'", "'protocol'", "'host'", "'port'", "'context'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__UnorderedGroup ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__UnorderedGroup ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__UnorderedGroup ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__UnorderedGroup ) )
            // InternalMyDsl.g:68:3: ( rule__Model__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }
            // InternalMyDsl.g:69:3: ( rule__Model__UnorderedGroup )
            // InternalMyDsl.g:69:4: rule__Model__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Model__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStatement EOF )
            // InternalMyDsl.g:80:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:94:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleMediatorStatement"
    // InternalMyDsl.g:103:1: entryRuleMediatorStatement : ruleMediatorStatement EOF ;
    public final void entryRuleMediatorStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMediatorStatement EOF )
            // InternalMyDsl.g:105:1: ruleMediatorStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMediatorStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMediatorStatement"


    // $ANTLR start "ruleMediatorStatement"
    // InternalMyDsl.g:112:1: ruleMediatorStatement : ( ( rule__MediatorStatement__Group__0 ) ) ;
    public final void ruleMediatorStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__MediatorStatement__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__MediatorStatement__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__MediatorStatement__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__MediatorStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:119:3: ( rule__MediatorStatement__Group__0 )
            // InternalMyDsl.g:119:4: rule__MediatorStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMediatorStatement"


    // $ANTLR start "entryRuleRoutingStatement"
    // InternalMyDsl.g:128:1: entryRuleRoutingStatement : ruleRoutingStatement EOF ;
    public final void entryRuleRoutingStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRoutingStatement EOF )
            // InternalMyDsl.g:130:1: ruleRoutingStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRoutingStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRoutingStatement"


    // $ANTLR start "ruleRoutingStatement"
    // InternalMyDsl.g:137:1: ruleRoutingStatement : ( ( rule__RoutingStatement__Group__0 ) ) ;
    public final void ruleRoutingStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__RoutingStatement__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__RoutingStatement__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__RoutingStatement__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__RoutingStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:144:3: ( rule__RoutingStatement__Group__0 )
            // InternalMyDsl.g:144:4: rule__RoutingStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRoutingStatement"


    // $ANTLR start "entryRuleParallelStatement"
    // InternalMyDsl.g:153:1: entryRuleParallelStatement : ruleParallelStatement EOF ;
    public final void entryRuleParallelStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleParallelStatement EOF )
            // InternalMyDsl.g:155:1: ruleParallelStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParallelStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParallelStatement"


    // $ANTLR start "ruleParallelStatement"
    // InternalMyDsl.g:162:1: ruleParallelStatement : ( ( rule__ParallelStatement__Group__0 ) ) ;
    public final void ruleParallelStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ParallelStatement__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ParallelStatement__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ParallelStatement__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__ParallelStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:169:3: ( rule__ParallelStatement__Group__0 )
            // InternalMyDsl.g:169:4: rule__ParallelStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParallelStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:178:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleIfStatement EOF )
            // InternalMyDsl.g:180:1: ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMyDsl.g:187:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__IfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:194:3: ( rule__IfStatement__Group__0 )
            // InternalMyDsl.g:194:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalMyDsl.g:203:1: entryRuleLoopStatement : ruleLoopStatement EOF ;
    public final void entryRuleLoopStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleLoopStatement EOF )
            // InternalMyDsl.g:205:1: ruleLoopStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLoopStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalMyDsl.g:212:1: ruleLoopStatement : ( ( rule__LoopStatement__Group__0 ) ) ;
    public final void ruleLoopStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__LoopStatement__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__LoopStatement__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__LoopStatement__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__LoopStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:219:3: ( rule__LoopStatement__Group__0 )
            // InternalMyDsl.g:219:4: rule__LoopStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleGroupStatement"
    // InternalMyDsl.g:228:1: entryRuleGroupStatement : ruleGroupStatement EOF ;
    public final void entryRuleGroupStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleGroupStatement EOF )
            // InternalMyDsl.g:230:1: ruleGroupStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroupStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGroupStatement"


    // $ANTLR start "ruleGroupStatement"
    // InternalMyDsl.g:237:1: ruleGroupStatement : ( ( rule__GroupStatement__Group__0 ) ) ;
    public final void ruleGroupStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__GroupStatement__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__GroupStatement__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__GroupStatement__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__GroupStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:244:3: ( rule__GroupStatement__Group__0 )
            // InternalMyDsl.g:244:4: rule__GroupStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleGroupStatement"


    // $ANTLR start "entryRuleRefStatement"
    // InternalMyDsl.g:253:1: entryRuleRefStatement : ruleRefStatement EOF ;
    public final void entryRuleRefStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleRefStatement EOF )
            // InternalMyDsl.g:255:1: ruleRefStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRefStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRefStatement"


    // $ANTLR start "ruleRefStatement"
    // InternalMyDsl.g:262:1: ruleRefStatement : ( ( rule__RefStatement__Group__0 ) ) ;
    public final void ruleRefStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__RefStatement__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__RefStatement__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__RefStatement__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__RefStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefStatementAccess().getGroup()); 
            }
            // InternalMyDsl.g:269:3: ( rule__RefStatement__Group__0 )
            // InternalMyDsl.g:269:4: rule__RefStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefStatementAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRefStatement"


    // $ANTLR start "entryRuleParticipantStatement"
    // InternalMyDsl.g:278:1: entryRuleParticipantStatement : ruleParticipantStatement EOF ;
    public final void entryRuleParticipantStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleParticipantStatement EOF )
            // InternalMyDsl.g:280:1: ruleParticipantStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParticipantStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParticipantStatement"


    // $ANTLR start "ruleParticipantStatement"
    // InternalMyDsl.g:287:1: ruleParticipantStatement : ( ( rule__ParticipantStatement__Alternatives ) ) ;
    public final void ruleParticipantStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ParticipantStatement__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ParticipantStatement__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ParticipantStatement__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__ParticipantStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:294:3: ( rule__ParticipantStatement__Alternatives )
            // InternalMyDsl.g:294:4: rule__ParticipantStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleParticipantStatement"


    // $ANTLR start "entryRuleOutboundEndpointDef"
    // InternalMyDsl.g:303:1: entryRuleOutboundEndpointDef : ruleOutboundEndpointDef EOF ;
    public final void entryRuleOutboundEndpointDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleOutboundEndpointDef EOF )
            // InternalMyDsl.g:305:1: ruleOutboundEndpointDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOutboundEndpointDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOutboundEndpointDef"


    // $ANTLR start "ruleOutboundEndpointDef"
    // InternalMyDsl.g:312:1: ruleOutboundEndpointDef : ( ( rule__OutboundEndpointDef__Group__0 ) ) ;
    public final void ruleOutboundEndpointDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__OutboundEndpointDef__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__OutboundEndpointDef__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__OutboundEndpointDef__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__OutboundEndpointDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getGroup()); 
            }
            // InternalMyDsl.g:319:3: ( rule__OutboundEndpointDef__Group__0 )
            // InternalMyDsl.g:319:4: rule__OutboundEndpointDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOutboundEndpointDef"


    // $ANTLR start "entryRuleInboundEndpointDef"
    // InternalMyDsl.g:328:1: entryRuleInboundEndpointDef : ruleInboundEndpointDef EOF ;
    public final void entryRuleInboundEndpointDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleInboundEndpointDef EOF )
            // InternalMyDsl.g:330:1: ruleInboundEndpointDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInboundEndpointDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInboundEndpointDef"


    // $ANTLR start "ruleInboundEndpointDef"
    // InternalMyDsl.g:337:1: ruleInboundEndpointDef : ( ( rule__InboundEndpointDef__Group__0 ) ) ;
    public final void ruleInboundEndpointDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__InboundEndpointDef__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__InboundEndpointDef__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__InboundEndpointDef__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__InboundEndpointDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getGroup()); 
            }
            // InternalMyDsl.g:344:3: ( rule__InboundEndpointDef__Group__0 )
            // InternalMyDsl.g:344:4: rule__InboundEndpointDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleInboundEndpointDef"


    // $ANTLR start "ruleParticipantType"
    // InternalMyDsl.g:353:1: ruleParticipantType : ( ( rule__ParticipantType__Alternatives ) ) ;
    public final void ruleParticipantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__ParticipantType__Alternatives ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__ParticipantType__Alternatives ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__ParticipantType__Alternatives ) )
            // InternalMyDsl.g:359:3: ( rule__ParticipantType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantTypeAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:360:3: ( rule__ParticipantType__Alternatives )
            // InternalMyDsl.g:360:4: rule__ParticipantType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleParticipantType"


    // $ANTLR start "ruleMediatorType"
    // InternalMyDsl.g:369:1: ruleMediatorType : ( ( rule__MediatorType__Alternatives ) ) ;
    public final void ruleMediatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__MediatorType__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__MediatorType__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__MediatorType__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__MediatorType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorTypeAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:376:3: ( rule__MediatorType__Alternatives )
            // InternalMyDsl.g:376:4: rule__MediatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MediatorType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleMediatorType"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:384:1: rule__Statement__Alternatives : ( ( ruleMediatorStatement ) | ( ruleRoutingStatement ) | ( ruleParallelStatement ) | ( ruleIfStatement ) | ( ruleLoopStatement ) | ( ruleGroupStatement ) | ( ruleRefStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:388:1: ( ( ruleMediatorStatement ) | ( ruleRoutingStatement ) | ( ruleParallelStatement ) | ( ruleIfStatement ) | ( ruleLoopStatement ) | ( ruleGroupStatement ) | ( ruleRefStatement ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 35:
                {
                alt1=6;
                }
                break;
            case 36:
                {
                alt1=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:389:2: ( ruleMediatorStatement )
                    {
                    // InternalMyDsl.g:389:2: ( ruleMediatorStatement )
                    // InternalMyDsl.g:390:3: ruleMediatorStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getMediatorStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMediatorStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getMediatorStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:395:2: ( ruleRoutingStatement )
                    {
                    // InternalMyDsl.g:395:2: ( ruleRoutingStatement )
                    // InternalMyDsl.g:396:3: ruleRoutingStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRoutingStatementParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRoutingStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRoutingStatementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:401:2: ( ruleParallelStatement )
                    {
                    // InternalMyDsl.g:401:2: ( ruleParallelStatement )
                    // InternalMyDsl.g:402:3: ruleParallelStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParallelStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:407:2: ( ruleIfStatement )
                    {
                    // InternalMyDsl.g:407:2: ( ruleIfStatement )
                    // InternalMyDsl.g:408:3: ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:413:2: ( ruleLoopStatement )
                    {
                    // InternalMyDsl.g:413:2: ( ruleLoopStatement )
                    // InternalMyDsl.g:414:3: ruleLoopStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLoopStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:419:2: ( ruleGroupStatement )
                    {
                    // InternalMyDsl.g:419:2: ( ruleGroupStatement )
                    // InternalMyDsl.g:420:3: ruleGroupStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroupStatementParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroupStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroupStatementParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:425:2: ( ruleRefStatement )
                    {
                    // InternalMyDsl.g:425:2: ( ruleRefStatement )
                    // InternalMyDsl.g:426:3: ruleRefStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getRefStatementParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRefStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getRefStatementParserRuleCall_6()); 
                    }

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__ParticipantStatement__Alternatives"
    // InternalMyDsl.g:435:1: rule__ParticipantStatement__Alternatives : ( ( ( rule__ParticipantStatement__Group_0__0 ) ) | ( ( rule__ParticipantStatement__Group_1__0 ) ) | ( ( rule__ParticipantStatement__Group_2__0 ) ) );
    public final void rule__ParticipantStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( rule__ParticipantStatement__Group_0__0 ) ) | ( ( rule__ParticipantStatement__Group_1__0 ) ) | ( ( rule__ParticipantStatement__Group_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:440:2: ( ( rule__ParticipantStatement__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:440:2: ( ( rule__ParticipantStatement__Group_0__0 ) )
                    // InternalMyDsl.g:441:3: ( rule__ParticipantStatement__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantStatementAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:442:3: ( rule__ParticipantStatement__Group_0__0 )
                    // InternalMyDsl.g:442:4: rule__ParticipantStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParticipantStatement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:446:2: ( ( rule__ParticipantStatement__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:446:2: ( ( rule__ParticipantStatement__Group_1__0 ) )
                    // InternalMyDsl.g:447:3: ( rule__ParticipantStatement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantStatementAccess().getGroup_1()); 
                    }
                    // InternalMyDsl.g:448:3: ( rule__ParticipantStatement__Group_1__0 )
                    // InternalMyDsl.g:448:4: rule__ParticipantStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParticipantStatement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:452:2: ( ( rule__ParticipantStatement__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:452:2: ( ( rule__ParticipantStatement__Group_2__0 ) )
                    // InternalMyDsl.g:453:3: ( rule__ParticipantStatement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantStatementAccess().getGroup_2()); 
                    }
                    // InternalMyDsl.g:454:3: ( rule__ParticipantStatement__Group_2__0 )
                    // InternalMyDsl.g:454:4: rule__ParticipantStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParticipantStatement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantStatementAccess().getGroup_2()); 
                    }

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
    // $ANTLR end "rule__ParticipantStatement__Alternatives"


    // $ANTLR start "rule__ParticipantType__Alternatives"
    // InternalMyDsl.g:462:1: rule__ParticipantType__Alternatives : ( ( ( 'IntegrationFlow' ) ) | ( ( 'InboundEndpoint' ) ) | ( ( 'OutboundEndpoint' ) ) | ( ( 'Pipeline' ) ) );
    public final void rule__ParticipantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( ( ( 'IntegrationFlow' ) ) | ( ( 'InboundEndpoint' ) ) | ( ( 'OutboundEndpoint' ) ) | ( ( 'Pipeline' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:467:2: ( ( 'IntegrationFlow' ) )
                    {
                    // InternalMyDsl.g:467:2: ( ( 'IntegrationFlow' ) )
                    // InternalMyDsl.g:468:3: ( 'IntegrationFlow' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDsl.g:469:3: ( 'IntegrationFlow' )
                    // InternalMyDsl.g:469:4: 'IntegrationFlow'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:473:2: ( ( 'InboundEndpoint' ) )
                    {
                    // InternalMyDsl.g:473:2: ( ( 'InboundEndpoint' ) )
                    // InternalMyDsl.g:474:3: ( 'InboundEndpoint' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDsl.g:475:3: ( 'InboundEndpoint' )
                    // InternalMyDsl.g:475:4: 'InboundEndpoint'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:479:2: ( ( 'OutboundEndpoint' ) )
                    {
                    // InternalMyDsl.g:479:2: ( ( 'OutboundEndpoint' ) )
                    // InternalMyDsl.g:480:3: ( 'OutboundEndpoint' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2()); 
                    }
                    // InternalMyDsl.g:481:3: ( 'OutboundEndpoint' )
                    // InternalMyDsl.g:481:4: 'OutboundEndpoint'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:485:2: ( ( 'Pipeline' ) )
                    {
                    // InternalMyDsl.g:485:2: ( ( 'Pipeline' ) )
                    // InternalMyDsl.g:486:3: ( 'Pipeline' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3()); 
                    }
                    // InternalMyDsl.g:487:3: ( 'Pipeline' )
                    // InternalMyDsl.g:487:4: 'Pipeline'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__ParticipantType__Alternatives"


    // $ANTLR start "rule__MediatorType__Alternatives"
    // InternalMyDsl.g:495:1: rule__MediatorType__Alternatives : ( ( ( 'log' ) ) | ( ( 'call' ) ) | ( ( 'respond' ) ) | ( ( 'filter' ) ) | ( ( 'transform' ) ) | ( ( 'enrich' ) ) | ( ( 'external' ) ) );
    public final void rule__MediatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( ( ( 'log' ) ) | ( ( 'call' ) ) | ( ( 'respond' ) ) | ( ( 'filter' ) ) | ( ( 'transform' ) ) | ( ( 'enrich' ) ) | ( ( 'external' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            case 20:
                {
                alt4=6;
                }
                break;
            case 21:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:500:2: ( ( 'log' ) )
                    {
                    // InternalMyDsl.g:500:2: ( ( 'log' ) )
                    // InternalMyDsl.g:501:3: ( 'log' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0()); 
                    }
                    // InternalMyDsl.g:502:3: ( 'log' )
                    // InternalMyDsl.g:502:4: 'log'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:506:2: ( ( 'call' ) )
                    {
                    // InternalMyDsl.g:506:2: ( ( 'call' ) )
                    // InternalMyDsl.g:507:3: ( 'call' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1()); 
                    }
                    // InternalMyDsl.g:508:3: ( 'call' )
                    // InternalMyDsl.g:508:4: 'call'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:512:2: ( ( 'respond' ) )
                    {
                    // InternalMyDsl.g:512:2: ( ( 'respond' ) )
                    // InternalMyDsl.g:513:3: ( 'respond' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2()); 
                    }
                    // InternalMyDsl.g:514:3: ( 'respond' )
                    // InternalMyDsl.g:514:4: 'respond'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:518:2: ( ( 'filter' ) )
                    {
                    // InternalMyDsl.g:518:2: ( ( 'filter' ) )
                    // InternalMyDsl.g:519:3: ( 'filter' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3()); 
                    }
                    // InternalMyDsl.g:520:3: ( 'filter' )
                    // InternalMyDsl.g:520:4: 'filter'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:524:2: ( ( 'transform' ) )
                    {
                    // InternalMyDsl.g:524:2: ( ( 'transform' ) )
                    // InternalMyDsl.g:525:3: ( 'transform' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4()); 
                    }
                    // InternalMyDsl.g:526:3: ( 'transform' )
                    // InternalMyDsl.g:526:4: 'transform'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:530:2: ( ( 'enrich' ) )
                    {
                    // InternalMyDsl.g:530:2: ( ( 'enrich' ) )
                    // InternalMyDsl.g:531:3: ( 'enrich' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5()); 
                    }
                    // InternalMyDsl.g:532:3: ( 'enrich' )
                    // InternalMyDsl.g:532:4: 'enrich'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:536:2: ( ( 'external' ) )
                    {
                    // InternalMyDsl.g:536:2: ( ( 'external' ) )
                    // InternalMyDsl.g:537:3: ( 'external' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6()); 
                    }
                    // InternalMyDsl.g:538:3: ( 'external' )
                    // InternalMyDsl.g:538:4: 'external'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6()); 
                    }

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
    // $ANTLR end "rule__MediatorType__Alternatives"


    // $ANTLR start "rule__MediatorStatement__Group__0"
    // InternalMyDsl.g:546:1: rule__MediatorStatement__Group__0 : rule__MediatorStatement__Group__0__Impl rule__MediatorStatement__Group__1 ;
    public final void rule__MediatorStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( rule__MediatorStatement__Group__0__Impl rule__MediatorStatement__Group__1 )
            // InternalMyDsl.g:551:2: rule__MediatorStatement__Group__0__Impl rule__MediatorStatement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MediatorStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MediatorStatement__Group__0"


    // $ANTLR start "rule__MediatorStatement__Group__0__Impl"
    // InternalMyDsl.g:558:1: rule__MediatorStatement__Group__0__Impl : ( ( rule__MediatorStatement__MediatorStatementAssignment_0 ) ) ;
    public final void rule__MediatorStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( ( rule__MediatorStatement__MediatorStatementAssignment_0 ) ) )
            // InternalMyDsl.g:563:1: ( ( rule__MediatorStatement__MediatorStatementAssignment_0 ) )
            {
            // InternalMyDsl.g:563:1: ( ( rule__MediatorStatement__MediatorStatementAssignment_0 ) )
            // InternalMyDsl.g:564:2: ( rule__MediatorStatement__MediatorStatementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getMediatorStatementAssignment_0()); 
            }
            // InternalMyDsl.g:565:2: ( rule__MediatorStatement__MediatorStatementAssignment_0 )
            // InternalMyDsl.g:565:3: rule__MediatorStatement__MediatorStatementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__MediatorStatementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getMediatorStatementAssignment_0()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__Group__0__Impl"


    // $ANTLR start "rule__MediatorStatement__Group__1"
    // InternalMyDsl.g:573:1: rule__MediatorStatement__Group__1 : rule__MediatorStatement__Group__1__Impl rule__MediatorStatement__Group__2 ;
    public final void rule__MediatorStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__MediatorStatement__Group__1__Impl rule__MediatorStatement__Group__2 )
            // InternalMyDsl.g:578:2: rule__MediatorStatement__Group__1__Impl rule__MediatorStatement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MediatorStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MediatorStatement__Group__1"


    // $ANTLR start "rule__MediatorStatement__Group__1__Impl"
    // InternalMyDsl.g:585:1: rule__MediatorStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MediatorStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( '(' ) )
            // InternalMyDsl.g:590:1: ( '(' )
            {
            // InternalMyDsl.g:590:1: ( '(' )
            // InternalMyDsl.g:591:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__Group__1__Impl"


    // $ANTLR start "rule__MediatorStatement__Group__2"
    // InternalMyDsl.g:600:1: rule__MediatorStatement__Group__2 : rule__MediatorStatement__Group__2__Impl rule__MediatorStatement__Group__3 ;
    public final void rule__MediatorStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__MediatorStatement__Group__2__Impl rule__MediatorStatement__Group__3 )
            // InternalMyDsl.g:605:2: rule__MediatorStatement__Group__2__Impl rule__MediatorStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MediatorStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MediatorStatement__Group__2"


    // $ANTLR start "rule__MediatorStatement__Group__2__Impl"
    // InternalMyDsl.g:612:1: rule__MediatorStatement__Group__2__Impl : ( ( rule__MediatorStatement__ConfigAssignment_2 ) ) ;
    public final void rule__MediatorStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ( rule__MediatorStatement__ConfigAssignment_2 ) ) )
            // InternalMyDsl.g:617:1: ( ( rule__MediatorStatement__ConfigAssignment_2 ) )
            {
            // InternalMyDsl.g:617:1: ( ( rule__MediatorStatement__ConfigAssignment_2 ) )
            // InternalMyDsl.g:618:2: ( rule__MediatorStatement__ConfigAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getConfigAssignment_2()); 
            }
            // InternalMyDsl.g:619:2: ( rule__MediatorStatement__ConfigAssignment_2 )
            // InternalMyDsl.g:619:3: rule__MediatorStatement__ConfigAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__ConfigAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getConfigAssignment_2()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__Group__2__Impl"


    // $ANTLR start "rule__MediatorStatement__Group__3"
    // InternalMyDsl.g:627:1: rule__MediatorStatement__Group__3 : rule__MediatorStatement__Group__3__Impl ;
    public final void rule__MediatorStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__MediatorStatement__Group__3__Impl )
            // InternalMyDsl.g:632:2: rule__MediatorStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MediatorStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MediatorStatement__Group__3"


    // $ANTLR start "rule__MediatorStatement__Group__3__Impl"
    // InternalMyDsl.g:638:1: rule__MediatorStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MediatorStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( ')' ) )
            // InternalMyDsl.g:643:1: ( ')' )
            {
            // InternalMyDsl.g:643:1: ( ')' )
            // InternalMyDsl.g:644:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__Group__3__Impl"


    // $ANTLR start "rule__RoutingStatement__Group__0"
    // InternalMyDsl.g:654:1: rule__RoutingStatement__Group__0 : rule__RoutingStatement__Group__0__Impl rule__RoutingStatement__Group__1 ;
    public final void rule__RoutingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__RoutingStatement__Group__0__Impl rule__RoutingStatement__Group__1 )
            // InternalMyDsl.g:659:2: rule__RoutingStatement__Group__0__Impl rule__RoutingStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__RoutingStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RoutingStatement__Group__0"


    // $ANTLR start "rule__RoutingStatement__Group__0__Impl"
    // InternalMyDsl.g:666:1: rule__RoutingStatement__Group__0__Impl : ( ( rule__RoutingStatement__SourceAssignment_0 ) ) ;
    public final void rule__RoutingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( ( rule__RoutingStatement__SourceAssignment_0 ) ) )
            // InternalMyDsl.g:671:1: ( ( rule__RoutingStatement__SourceAssignment_0 ) )
            {
            // InternalMyDsl.g:671:1: ( ( rule__RoutingStatement__SourceAssignment_0 ) )
            // InternalMyDsl.g:672:2: ( rule__RoutingStatement__SourceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getSourceAssignment_0()); 
            }
            // InternalMyDsl.g:673:2: ( rule__RoutingStatement__SourceAssignment_0 )
            // InternalMyDsl.g:673:3: rule__RoutingStatement__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__SourceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getSourceAssignment_0()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__Group__0__Impl"


    // $ANTLR start "rule__RoutingStatement__Group__1"
    // InternalMyDsl.g:681:1: rule__RoutingStatement__Group__1 : rule__RoutingStatement__Group__1__Impl rule__RoutingStatement__Group__2 ;
    public final void rule__RoutingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__RoutingStatement__Group__1__Impl rule__RoutingStatement__Group__2 )
            // InternalMyDsl.g:686:2: rule__RoutingStatement__Group__1__Impl rule__RoutingStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RoutingStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RoutingStatement__Group__1"


    // $ANTLR start "rule__RoutingStatement__Group__1__Impl"
    // InternalMyDsl.g:693:1: rule__RoutingStatement__Group__1__Impl : ( '->' ) ;
    public final void rule__RoutingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( '->' ) )
            // InternalMyDsl.g:698:1: ( '->' )
            {
            // InternalMyDsl.g:698:1: ( '->' )
            // InternalMyDsl.g:699:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__Group__1__Impl"


    // $ANTLR start "rule__RoutingStatement__Group__2"
    // InternalMyDsl.g:708:1: rule__RoutingStatement__Group__2 : rule__RoutingStatement__Group__2__Impl rule__RoutingStatement__Group__3 ;
    public final void rule__RoutingStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__RoutingStatement__Group__2__Impl rule__RoutingStatement__Group__3 )
            // InternalMyDsl.g:713:2: rule__RoutingStatement__Group__2__Impl rule__RoutingStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RoutingStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RoutingStatement__Group__2"


    // $ANTLR start "rule__RoutingStatement__Group__2__Impl"
    // InternalMyDsl.g:720:1: rule__RoutingStatement__Group__2__Impl : ( ( rule__RoutingStatement__TargetAssignment_2 ) ) ;
    public final void rule__RoutingStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( rule__RoutingStatement__TargetAssignment_2 ) ) )
            // InternalMyDsl.g:725:1: ( ( rule__RoutingStatement__TargetAssignment_2 ) )
            {
            // InternalMyDsl.g:725:1: ( ( rule__RoutingStatement__TargetAssignment_2 ) )
            // InternalMyDsl.g:726:2: ( rule__RoutingStatement__TargetAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getTargetAssignment_2()); 
            }
            // InternalMyDsl.g:727:2: ( rule__RoutingStatement__TargetAssignment_2 )
            // InternalMyDsl.g:727:3: rule__RoutingStatement__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__TargetAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getTargetAssignment_2()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__Group__2__Impl"


    // $ANTLR start "rule__RoutingStatement__Group__3"
    // InternalMyDsl.g:735:1: rule__RoutingStatement__Group__3 : rule__RoutingStatement__Group__3__Impl rule__RoutingStatement__Group__4 ;
    public final void rule__RoutingStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__RoutingStatement__Group__3__Impl rule__RoutingStatement__Group__4 )
            // InternalMyDsl.g:740:2: rule__RoutingStatement__Group__3__Impl rule__RoutingStatement__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RoutingStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RoutingStatement__Group__3"


    // $ANTLR start "rule__RoutingStatement__Group__3__Impl"
    // InternalMyDsl.g:747:1: rule__RoutingStatement__Group__3__Impl : ( ':' ) ;
    public final void rule__RoutingStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( ':' ) )
            // InternalMyDsl.g:752:1: ( ':' )
            {
            // InternalMyDsl.g:752:1: ( ':' )
            // InternalMyDsl.g:753:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getColonKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getColonKeyword_3()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__Group__3__Impl"


    // $ANTLR start "rule__RoutingStatement__Group__4"
    // InternalMyDsl.g:762:1: rule__RoutingStatement__Group__4 : rule__RoutingStatement__Group__4__Impl ;
    public final void rule__RoutingStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__RoutingStatement__Group__4__Impl )
            // InternalMyDsl.g:767:2: rule__RoutingStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RoutingStatement__Group__4"


    // $ANTLR start "rule__RoutingStatement__Group__4__Impl"
    // InternalMyDsl.g:773:1: rule__RoutingStatement__Group__4__Impl : ( ( rule__RoutingStatement__ActionAssignment_4 ) ) ;
    public final void rule__RoutingStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( ( rule__RoutingStatement__ActionAssignment_4 ) ) )
            // InternalMyDsl.g:778:1: ( ( rule__RoutingStatement__ActionAssignment_4 ) )
            {
            // InternalMyDsl.g:778:1: ( ( rule__RoutingStatement__ActionAssignment_4 ) )
            // InternalMyDsl.g:779:2: ( rule__RoutingStatement__ActionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getActionAssignment_4()); 
            }
            // InternalMyDsl.g:780:2: ( rule__RoutingStatement__ActionAssignment_4 )
            // InternalMyDsl.g:780:3: rule__RoutingStatement__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RoutingStatement__ActionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getActionAssignment_4()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__Group__4__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__0"
    // InternalMyDsl.g:789:1: rule__ParallelStatement__Group__0 : rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 ;
    public final void rule__ParallelStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1 )
            // InternalMyDsl.g:794:2: rule__ParallelStatement__Group__0__Impl rule__ParallelStatement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ParallelStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group__0"


    // $ANTLR start "rule__ParallelStatement__Group__0__Impl"
    // InternalMyDsl.g:801:1: rule__ParallelStatement__Group__0__Impl : ( 'par' ) ;
    public final void rule__ParallelStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( 'par' ) )
            // InternalMyDsl.g:806:1: ( 'par' )
            {
            // InternalMyDsl.g:806:1: ( 'par' )
            // InternalMyDsl.g:807:2: 'par'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getParKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getParKeyword_0()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group__0__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__1"
    // InternalMyDsl.g:816:1: rule__ParallelStatement__Group__1 : rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2 ;
    public final void rule__ParallelStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2 )
            // InternalMyDsl.g:821:2: rule__ParallelStatement__Group__1__Impl rule__ParallelStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ParallelStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group__1"


    // $ANTLR start "rule__ParallelStatement__Group__1__Impl"
    // InternalMyDsl.g:828:1: rule__ParallelStatement__Group__1__Impl : ( ( rule__ParallelStatement__ParstatementsAssignment_1 )* ) ;
    public final void rule__ParallelStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( ( rule__ParallelStatement__ParstatementsAssignment_1 )* ) )
            // InternalMyDsl.g:833:1: ( ( rule__ParallelStatement__ParstatementsAssignment_1 )* )
            {
            // InternalMyDsl.g:833:1: ( ( rule__ParallelStatement__ParstatementsAssignment_1 )* )
            // InternalMyDsl.g:834:2: ( rule__ParallelStatement__ParstatementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getParstatementsAssignment_1()); 
            }
            // InternalMyDsl.g:835:2: ( rule__ParallelStatement__ParstatementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=15 && LA5_0<=21)||LA5_0==26||LA5_0==29||(LA5_0>=34 && LA5_0<=36)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:835:3: rule__ParallelStatement__ParstatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParallelStatement__ParstatementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getParstatementsAssignment_1()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group__1__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__2"
    // InternalMyDsl.g:843:1: rule__ParallelStatement__Group__2 : rule__ParallelStatement__Group__2__Impl rule__ParallelStatement__Group__3 ;
    public final void rule__ParallelStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__ParallelStatement__Group__2__Impl rule__ParallelStatement__Group__3 )
            // InternalMyDsl.g:848:2: rule__ParallelStatement__Group__2__Impl rule__ParallelStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ParallelStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group__2"


    // $ANTLR start "rule__ParallelStatement__Group__2__Impl"
    // InternalMyDsl.g:855:1: rule__ParallelStatement__Group__2__Impl : ( ( rule__ParallelStatement__Group_2__0 )* ) ;
    public final void rule__ParallelStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( ( rule__ParallelStatement__Group_2__0 )* ) )
            // InternalMyDsl.g:860:1: ( ( rule__ParallelStatement__Group_2__0 )* )
            {
            // InternalMyDsl.g:860:1: ( ( rule__ParallelStatement__Group_2__0 )* )
            // InternalMyDsl.g:861:2: ( rule__ParallelStatement__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getGroup_2()); 
            }
            // InternalMyDsl.g:862:2: ( rule__ParallelStatement__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:862:3: rule__ParallelStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ParallelStatement__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group__2__Impl"


    // $ANTLR start "rule__ParallelStatement__Group__3"
    // InternalMyDsl.g:870:1: rule__ParallelStatement__Group__3 : rule__ParallelStatement__Group__3__Impl ;
    public final void rule__ParallelStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__ParallelStatement__Group__3__Impl )
            // InternalMyDsl.g:875:2: rule__ParallelStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group__3"


    // $ANTLR start "rule__ParallelStatement__Group__3__Impl"
    // InternalMyDsl.g:881:1: rule__ParallelStatement__Group__3__Impl : ( 'end' ) ;
    public final void rule__ParallelStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( 'end' ) )
            // InternalMyDsl.g:886:1: ( 'end' )
            {
            // InternalMyDsl.g:886:1: ( 'end' )
            // InternalMyDsl.g:887:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getEndKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getEndKeyword_3()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group__3__Impl"


    // $ANTLR start "rule__ParallelStatement__Group_2__0"
    // InternalMyDsl.g:897:1: rule__ParallelStatement__Group_2__0 : rule__ParallelStatement__Group_2__0__Impl rule__ParallelStatement__Group_2__1 ;
    public final void rule__ParallelStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__ParallelStatement__Group_2__0__Impl rule__ParallelStatement__Group_2__1 )
            // InternalMyDsl.g:902:2: rule__ParallelStatement__Group_2__0__Impl rule__ParallelStatement__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ParallelStatement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group_2__0"


    // $ANTLR start "rule__ParallelStatement__Group_2__0__Impl"
    // InternalMyDsl.g:909:1: rule__ParallelStatement__Group_2__0__Impl : ( 'else' ) ;
    public final void rule__ParallelStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( 'else' ) )
            // InternalMyDsl.g:914:1: ( 'else' )
            {
            // InternalMyDsl.g:914:1: ( 'else' )
            // InternalMyDsl.g:915:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getElseKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getElseKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group_2__0__Impl"


    // $ANTLR start "rule__ParallelStatement__Group_2__1"
    // InternalMyDsl.g:924:1: rule__ParallelStatement__Group_2__1 : rule__ParallelStatement__Group_2__1__Impl ;
    public final void rule__ParallelStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__ParallelStatement__Group_2__1__Impl )
            // InternalMyDsl.g:929:2: rule__ParallelStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParallelStatement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelStatement__Group_2__1"


    // $ANTLR start "rule__ParallelStatement__Group_2__1__Impl"
    // InternalMyDsl.g:935:1: rule__ParallelStatement__Group_2__1__Impl : ( ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )* ) ;
    public final void rule__ParallelStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )* ) )
            // InternalMyDsl.g:940:1: ( ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )* )
            {
            // InternalMyDsl.g:940:1: ( ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )* )
            // InternalMyDsl.g:941:2: ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getElsestatementsAssignment_2_1()); 
            }
            // InternalMyDsl.g:942:2: ( rule__ParallelStatement__ElsestatementsAssignment_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=15 && LA7_0<=21)||LA7_0==26||LA7_0==29||(LA7_0>=34 && LA7_0<=36)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:942:3: rule__ParallelStatement__ElsestatementsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParallelStatement__ElsestatementsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getElsestatementsAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__Group_2__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalMyDsl.g:951:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalMyDsl.g:956:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalMyDsl.g:963:1: rule__IfStatement__Group__0__Impl : ( 'alt' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( 'alt' ) )
            // InternalMyDsl.g:968:1: ( 'alt' )
            {
            // InternalMyDsl.g:968:1: ( 'alt' )
            // InternalMyDsl.g:969:2: 'alt'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getAltKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getAltKeyword_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalMyDsl.g:978:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalMyDsl.g:983:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalMyDsl.g:990:1: rule__IfStatement__Group__1__Impl : ( 'condition' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( 'condition' ) )
            // InternalMyDsl.g:995:1: ( 'condition' )
            {
            // InternalMyDsl.g:995:1: ( 'condition' )
            // InternalMyDsl.g:996:2: 'condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getConditionKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getConditionKeyword_1()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalMyDsl.g:1005:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalMyDsl.g:1010:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalMyDsl.g:1017:1: rule__IfStatement__Group__2__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( ( '(' ) )
            // InternalMyDsl.g:1022:1: ( '(' )
            {
            // InternalMyDsl.g:1022:1: ( '(' )
            // InternalMyDsl.g:1023:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalMyDsl.g:1032:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalMyDsl.g:1037:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalMyDsl.g:1044:1: rule__IfStatement__Group__3__Impl : ( 'source' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( 'source' ) )
            // InternalMyDsl.g:1049:1: ( 'source' )
            {
            // InternalMyDsl.g:1049:1: ( 'source' )
            // InternalMyDsl.g:1050:2: 'source'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getSourceKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getSourceKeyword_3()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalMyDsl.g:1059:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalMyDsl.g:1064:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalMyDsl.g:1071:1: rule__IfStatement__Group__4__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( ( '(' ) )
            // InternalMyDsl.g:1076:1: ( '(' )
            {
            // InternalMyDsl.g:1076:1: ( '(' )
            // InternalMyDsl.g:1077:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_4()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalMyDsl.g:1086:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalMyDsl.g:1091:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalMyDsl.g:1098:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__RouteIdAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( rule__IfStatement__RouteIdAssignment_5 ) ) )
            // InternalMyDsl.g:1103:1: ( ( rule__IfStatement__RouteIdAssignment_5 ) )
            {
            // InternalMyDsl.g:1103:1: ( ( rule__IfStatement__RouteIdAssignment_5 ) )
            // InternalMyDsl.g:1104:2: ( rule__IfStatement__RouteIdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRouteIdAssignment_5()); 
            }
            // InternalMyDsl.g:1105:2: ( rule__IfStatement__RouteIdAssignment_5 )
            // InternalMyDsl.g:1105:3: rule__IfStatement__RouteIdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__RouteIdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRouteIdAssignment_5()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalMyDsl.g:1113:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7 )
            // InternalMyDsl.g:1118:2: rule__IfStatement__Group__6__Impl rule__IfStatement__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalMyDsl.g:1125:1: rule__IfStatement__Group__6__Impl : ( ',' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( ',' ) )
            // InternalMyDsl.g:1130:1: ( ',' )
            {
            // InternalMyDsl.g:1130:1: ( ',' )
            // InternalMyDsl.g:1131:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommaKeyword_6()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommaKeyword_6()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group__7"
    // InternalMyDsl.g:1140:1: rule__IfStatement__Group__7 : rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8 ;
    public final void rule__IfStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8 )
            // InternalMyDsl.g:1145:2: rule__IfStatement__Group__7__Impl rule__IfStatement__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__IfStatement__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__7"


    // $ANTLR start "rule__IfStatement__Group__7__Impl"
    // InternalMyDsl.g:1152:1: rule__IfStatement__Group__7__Impl : ( ( rule__IfStatement__TransportAssignment_7 ) ) ;
    public final void rule__IfStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( ( rule__IfStatement__TransportAssignment_7 ) ) )
            // InternalMyDsl.g:1157:1: ( ( rule__IfStatement__TransportAssignment_7 ) )
            {
            // InternalMyDsl.g:1157:1: ( ( rule__IfStatement__TransportAssignment_7 ) )
            // InternalMyDsl.g:1158:2: ( rule__IfStatement__TransportAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getTransportAssignment_7()); 
            }
            // InternalMyDsl.g:1159:2: ( rule__IfStatement__TransportAssignment_7 )
            // InternalMyDsl.g:1159:3: rule__IfStatement__TransportAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__TransportAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getTransportAssignment_7()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__7__Impl"


    // $ANTLR start "rule__IfStatement__Group__8"
    // InternalMyDsl.g:1167:1: rule__IfStatement__Group__8 : rule__IfStatement__Group__8__Impl rule__IfStatement__Group__9 ;
    public final void rule__IfStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( rule__IfStatement__Group__8__Impl rule__IfStatement__Group__9 )
            // InternalMyDsl.g:1172:2: rule__IfStatement__Group__8__Impl rule__IfStatement__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__IfStatement__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__8"


    // $ANTLR start "rule__IfStatement__Group__8__Impl"
    // InternalMyDsl.g:1179:1: rule__IfStatement__Group__8__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( ')' ) )
            // InternalMyDsl.g:1184:1: ( ')' )
            {
            // InternalMyDsl.g:1184:1: ( ')' )
            // InternalMyDsl.g:1185:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_8()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__8__Impl"


    // $ANTLR start "rule__IfStatement__Group__9"
    // InternalMyDsl.g:1194:1: rule__IfStatement__Group__9 : rule__IfStatement__Group__9__Impl rule__IfStatement__Group__10 ;
    public final void rule__IfStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( rule__IfStatement__Group__9__Impl rule__IfStatement__Group__10 )
            // InternalMyDsl.g:1199:2: rule__IfStatement__Group__9__Impl rule__IfStatement__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__IfStatement__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__9"


    // $ANTLR start "rule__IfStatement__Group__9__Impl"
    // InternalMyDsl.g:1206:1: rule__IfStatement__Group__9__Impl : ( ',' ) ;
    public final void rule__IfStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( ( ',' ) )
            // InternalMyDsl.g:1211:1: ( ',' )
            {
            // InternalMyDsl.g:1211:1: ( ',' )
            // InternalMyDsl.g:1212:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getCommaKeyword_9()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getCommaKeyword_9()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__9__Impl"


    // $ANTLR start "rule__IfStatement__Group__10"
    // InternalMyDsl.g:1221:1: rule__IfStatement__Group__10 : rule__IfStatement__Group__10__Impl rule__IfStatement__Group__11 ;
    public final void rule__IfStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( rule__IfStatement__Group__10__Impl rule__IfStatement__Group__11 )
            // InternalMyDsl.g:1226:2: rule__IfStatement__Group__10__Impl rule__IfStatement__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__IfStatement__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__10"


    // $ANTLR start "rule__IfStatement__Group__10__Impl"
    // InternalMyDsl.g:1233:1: rule__IfStatement__Group__10__Impl : ( 'pattern' ) ;
    public final void rule__IfStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( 'pattern' ) )
            // InternalMyDsl.g:1238:1: ( 'pattern' )
            {
            // InternalMyDsl.g:1238:1: ( 'pattern' )
            // InternalMyDsl.g:1239:2: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getPatternKeyword_10()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getPatternKeyword_10()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__10__Impl"


    // $ANTLR start "rule__IfStatement__Group__11"
    // InternalMyDsl.g:1248:1: rule__IfStatement__Group__11 : rule__IfStatement__Group__11__Impl rule__IfStatement__Group__12 ;
    public final void rule__IfStatement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( rule__IfStatement__Group__11__Impl rule__IfStatement__Group__12 )
            // InternalMyDsl.g:1253:2: rule__IfStatement__Group__11__Impl rule__IfStatement__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__IfStatement__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__12();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__11"


    // $ANTLR start "rule__IfStatement__Group__11__Impl"
    // InternalMyDsl.g:1260:1: rule__IfStatement__Group__11__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( ( '(' ) )
            // InternalMyDsl.g:1265:1: ( '(' )
            {
            // InternalMyDsl.g:1265:1: ( '(' )
            // InternalMyDsl.g:1266:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_11()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_11()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__11__Impl"


    // $ANTLR start "rule__IfStatement__Group__12"
    // InternalMyDsl.g:1275:1: rule__IfStatement__Group__12 : rule__IfStatement__Group__12__Impl rule__IfStatement__Group__13 ;
    public final void rule__IfStatement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( rule__IfStatement__Group__12__Impl rule__IfStatement__Group__13 )
            // InternalMyDsl.g:1280:2: rule__IfStatement__Group__12__Impl rule__IfStatement__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__IfStatement__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__13();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__12"


    // $ANTLR start "rule__IfStatement__Group__12__Impl"
    // InternalMyDsl.g:1287:1: rule__IfStatement__Group__12__Impl : ( ( rule__IfStatement__PatternAssignment_12 ) ) ;
    public final void rule__IfStatement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ( rule__IfStatement__PatternAssignment_12 ) ) )
            // InternalMyDsl.g:1292:1: ( ( rule__IfStatement__PatternAssignment_12 ) )
            {
            // InternalMyDsl.g:1292:1: ( ( rule__IfStatement__PatternAssignment_12 ) )
            // InternalMyDsl.g:1293:2: ( rule__IfStatement__PatternAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getPatternAssignment_12()); 
            }
            // InternalMyDsl.g:1294:2: ( rule__IfStatement__PatternAssignment_12 )
            // InternalMyDsl.g:1294:3: rule__IfStatement__PatternAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__PatternAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getPatternAssignment_12()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__12__Impl"


    // $ANTLR start "rule__IfStatement__Group__13"
    // InternalMyDsl.g:1302:1: rule__IfStatement__Group__13 : rule__IfStatement__Group__13__Impl rule__IfStatement__Group__14 ;
    public final void rule__IfStatement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( rule__IfStatement__Group__13__Impl rule__IfStatement__Group__14 )
            // InternalMyDsl.g:1307:2: rule__IfStatement__Group__13__Impl rule__IfStatement__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__IfStatement__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__14();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__13"


    // $ANTLR start "rule__IfStatement__Group__13__Impl"
    // InternalMyDsl.g:1314:1: rule__IfStatement__Group__13__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( ')' ) )
            // InternalMyDsl.g:1319:1: ( ')' )
            {
            // InternalMyDsl.g:1319:1: ( ')' )
            // InternalMyDsl.g:1320:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_13()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_13()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__13__Impl"


    // $ANTLR start "rule__IfStatement__Group__14"
    // InternalMyDsl.g:1329:1: rule__IfStatement__Group__14 : rule__IfStatement__Group__14__Impl rule__IfStatement__Group__15 ;
    public final void rule__IfStatement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( rule__IfStatement__Group__14__Impl rule__IfStatement__Group__15 )
            // InternalMyDsl.g:1334:2: rule__IfStatement__Group__14__Impl rule__IfStatement__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__15();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__14"


    // $ANTLR start "rule__IfStatement__Group__14__Impl"
    // InternalMyDsl.g:1341:1: rule__IfStatement__Group__14__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( ( ')' ) )
            // InternalMyDsl.g:1346:1: ( ')' )
            {
            // InternalMyDsl.g:1346:1: ( ')' )
            // InternalMyDsl.g:1347:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_14()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_14()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__14__Impl"


    // $ANTLR start "rule__IfStatement__Group__15"
    // InternalMyDsl.g:1356:1: rule__IfStatement__Group__15 : rule__IfStatement__Group__15__Impl rule__IfStatement__Group__16 ;
    public final void rule__IfStatement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( rule__IfStatement__Group__15__Impl rule__IfStatement__Group__16 )
            // InternalMyDsl.g:1361:2: rule__IfStatement__Group__15__Impl rule__IfStatement__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__16();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__15"


    // $ANTLR start "rule__IfStatement__Group__15__Impl"
    // InternalMyDsl.g:1368:1: rule__IfStatement__Group__15__Impl : ( ( rule__IfStatement__AltstatementsAssignment_15 )* ) ;
    public final void rule__IfStatement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( ( rule__IfStatement__AltstatementsAssignment_15 )* ) )
            // InternalMyDsl.g:1373:1: ( ( rule__IfStatement__AltstatementsAssignment_15 )* )
            {
            // InternalMyDsl.g:1373:1: ( ( rule__IfStatement__AltstatementsAssignment_15 )* )
            // InternalMyDsl.g:1374:2: ( rule__IfStatement__AltstatementsAssignment_15 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getAltstatementsAssignment_15()); 
            }
            // InternalMyDsl.g:1375:2: ( rule__IfStatement__AltstatementsAssignment_15 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=15 && LA8_0<=21)||LA8_0==26||LA8_0==29||(LA8_0>=34 && LA8_0<=36)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1375:3: rule__IfStatement__AltstatementsAssignment_15
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__IfStatement__AltstatementsAssignment_15();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getAltstatementsAssignment_15()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__15__Impl"


    // $ANTLR start "rule__IfStatement__Group__16"
    // InternalMyDsl.g:1383:1: rule__IfStatement__Group__16 : rule__IfStatement__Group__16__Impl rule__IfStatement__Group__17 ;
    public final void rule__IfStatement__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( rule__IfStatement__Group__16__Impl rule__IfStatement__Group__17 )
            // InternalMyDsl.g:1388:2: rule__IfStatement__Group__16__Impl rule__IfStatement__Group__17
            {
            pushFollow(FOLLOW_9);
            rule__IfStatement__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__17();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__16"


    // $ANTLR start "rule__IfStatement__Group__16__Impl"
    // InternalMyDsl.g:1395:1: rule__IfStatement__Group__16__Impl : ( ( rule__IfStatement__Group_16__0 )* ) ;
    public final void rule__IfStatement__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( ( ( rule__IfStatement__Group_16__0 )* ) )
            // InternalMyDsl.g:1400:1: ( ( rule__IfStatement__Group_16__0 )* )
            {
            // InternalMyDsl.g:1400:1: ( ( rule__IfStatement__Group_16__0 )* )
            // InternalMyDsl.g:1401:2: ( rule__IfStatement__Group_16__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getGroup_16()); 
            }
            // InternalMyDsl.g:1402:2: ( rule__IfStatement__Group_16__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1402:3: rule__IfStatement__Group_16__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__IfStatement__Group_16__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getGroup_16()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__16__Impl"


    // $ANTLR start "rule__IfStatement__Group__17"
    // InternalMyDsl.g:1410:1: rule__IfStatement__Group__17 : rule__IfStatement__Group__17__Impl ;
    public final void rule__IfStatement__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( rule__IfStatement__Group__17__Impl )
            // InternalMyDsl.g:1415:2: rule__IfStatement__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group__17"


    // $ANTLR start "rule__IfStatement__Group__17__Impl"
    // InternalMyDsl.g:1421:1: rule__IfStatement__Group__17__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( 'end' ) )
            // InternalMyDsl.g:1426:1: ( 'end' )
            {
            // InternalMyDsl.g:1426:1: ( 'end' )
            // InternalMyDsl.g:1427:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getEndKeyword_17()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getEndKeyword_17()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group__17__Impl"


    // $ANTLR start "rule__IfStatement__Group_16__0"
    // InternalMyDsl.g:1437:1: rule__IfStatement__Group_16__0 : rule__IfStatement__Group_16__0__Impl rule__IfStatement__Group_16__1 ;
    public final void rule__IfStatement__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( rule__IfStatement__Group_16__0__Impl rule__IfStatement__Group_16__1 )
            // InternalMyDsl.g:1442:2: rule__IfStatement__Group_16__0__Impl rule__IfStatement__Group_16__1
            {
            pushFollow(FOLLOW_12);
            rule__IfStatement__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_16__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group_16__0"


    // $ANTLR start "rule__IfStatement__Group_16__0__Impl"
    // InternalMyDsl.g:1449:1: rule__IfStatement__Group_16__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( 'else' ) )
            // InternalMyDsl.g:1454:1: ( 'else' )
            {
            // InternalMyDsl.g:1454:1: ( 'else' )
            // InternalMyDsl.g:1455:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElseKeyword_16_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElseKeyword_16_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group_16__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_16__1"
    // InternalMyDsl.g:1464:1: rule__IfStatement__Group_16__1 : rule__IfStatement__Group_16__1__Impl ;
    public final void rule__IfStatement__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( rule__IfStatement__Group_16__1__Impl )
            // InternalMyDsl.g:1469:2: rule__IfStatement__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IfStatement__Group_16__1"


    // $ANTLR start "rule__IfStatement__Group_16__1__Impl"
    // InternalMyDsl.g:1475:1: rule__IfStatement__Group_16__1__Impl : ( ( rule__IfStatement__ElsestatementsAssignment_16_1 )* ) ;
    public final void rule__IfStatement__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( ( rule__IfStatement__ElsestatementsAssignment_16_1 )* ) )
            // InternalMyDsl.g:1480:1: ( ( rule__IfStatement__ElsestatementsAssignment_16_1 )* )
            {
            // InternalMyDsl.g:1480:1: ( ( rule__IfStatement__ElsestatementsAssignment_16_1 )* )
            // InternalMyDsl.g:1481:2: ( rule__IfStatement__ElsestatementsAssignment_16_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElsestatementsAssignment_16_1()); 
            }
            // InternalMyDsl.g:1482:2: ( rule__IfStatement__ElsestatementsAssignment_16_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=15 && LA10_0<=21)||LA10_0==26||LA10_0==29||(LA10_0>=34 && LA10_0<=36)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1482:3: rule__IfStatement__ElsestatementsAssignment_16_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__IfStatement__ElsestatementsAssignment_16_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElsestatementsAssignment_16_1()); 
            }

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
    // $ANTLR end "rule__IfStatement__Group_16__1__Impl"


    // $ANTLR start "rule__LoopStatement__Group__0"
    // InternalMyDsl.g:1491:1: rule__LoopStatement__Group__0 : rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 ;
    public final void rule__LoopStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1 )
            // InternalMyDsl.g:1496:2: rule__LoopStatement__Group__0__Impl rule__LoopStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LoopStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LoopStatement__Group__0"


    // $ANTLR start "rule__LoopStatement__Group__0__Impl"
    // InternalMyDsl.g:1503:1: rule__LoopStatement__Group__0__Impl : ( 'loop' ) ;
    public final void rule__LoopStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( ( 'loop' ) )
            // InternalMyDsl.g:1508:1: ( 'loop' )
            {
            // InternalMyDsl.g:1508:1: ( 'loop' )
            // InternalMyDsl.g:1509:2: 'loop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getLoopKeyword_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__0__Impl"


    // $ANTLR start "rule__LoopStatement__Group__1"
    // InternalMyDsl.g:1518:1: rule__LoopStatement__Group__1 : rule__LoopStatement__Group__1__Impl ;
    public final void rule__LoopStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( rule__LoopStatement__Group__1__Impl )
            // InternalMyDsl.g:1523:2: rule__LoopStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LoopStatement__Group__1"


    // $ANTLR start "rule__LoopStatement__Group__1__Impl"
    // InternalMyDsl.g:1529:1: rule__LoopStatement__Group__1__Impl : ( ( rule__LoopStatement__NameAssignment_1 ) ) ;
    public final void rule__LoopStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ( rule__LoopStatement__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1534:1: ( ( rule__LoopStatement__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1534:1: ( ( rule__LoopStatement__NameAssignment_1 ) )
            // InternalMyDsl.g:1535:2: ( rule__LoopStatement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:1536:2: ( rule__LoopStatement__NameAssignment_1 )
            // InternalMyDsl.g:1536:3: rule__LoopStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopStatement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__LoopStatement__Group__1__Impl"


    // $ANTLR start "rule__GroupStatement__Group__0"
    // InternalMyDsl.g:1545:1: rule__GroupStatement__Group__0 : rule__GroupStatement__Group__0__Impl rule__GroupStatement__Group__1 ;
    public final void rule__GroupStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( rule__GroupStatement__Group__0__Impl rule__GroupStatement__Group__1 )
            // InternalMyDsl.g:1550:2: rule__GroupStatement__Group__0__Impl rule__GroupStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__GroupStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GroupStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__GroupStatement__Group__0"


    // $ANTLR start "rule__GroupStatement__Group__0__Impl"
    // InternalMyDsl.g:1557:1: rule__GroupStatement__Group__0__Impl : ( 'group' ) ;
    public final void rule__GroupStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( ( 'group' ) )
            // InternalMyDsl.g:1562:1: ( 'group' )
            {
            // InternalMyDsl.g:1562:1: ( 'group' )
            // InternalMyDsl.g:1563:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupStatementAccess().getGroupKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupStatementAccess().getGroupKeyword_0()); 
            }

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
    // $ANTLR end "rule__GroupStatement__Group__0__Impl"


    // $ANTLR start "rule__GroupStatement__Group__1"
    // InternalMyDsl.g:1572:1: rule__GroupStatement__Group__1 : rule__GroupStatement__Group__1__Impl ;
    public final void rule__GroupStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( rule__GroupStatement__Group__1__Impl )
            // InternalMyDsl.g:1577:2: rule__GroupStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__GroupStatement__Group__1"


    // $ANTLR start "rule__GroupStatement__Group__1__Impl"
    // InternalMyDsl.g:1583:1: rule__GroupStatement__Group__1__Impl : ( ( rule__GroupStatement__NameAssignment_1 ) ) ;
    public final void rule__GroupStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( ( ( rule__GroupStatement__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1588:1: ( ( rule__GroupStatement__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1588:1: ( ( rule__GroupStatement__NameAssignment_1 ) )
            // InternalMyDsl.g:1589:2: ( rule__GroupStatement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupStatementAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:1590:2: ( rule__GroupStatement__NameAssignment_1 )
            // InternalMyDsl.g:1590:3: rule__GroupStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupStatement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupStatementAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__GroupStatement__Group__1__Impl"


    // $ANTLR start "rule__RefStatement__Group__0"
    // InternalMyDsl.g:1599:1: rule__RefStatement__Group__0 : rule__RefStatement__Group__0__Impl rule__RefStatement__Group__1 ;
    public final void rule__RefStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( rule__RefStatement__Group__0__Impl rule__RefStatement__Group__1 )
            // InternalMyDsl.g:1604:2: rule__RefStatement__Group__0__Impl rule__RefStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RefStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RefStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefStatement__Group__0"


    // $ANTLR start "rule__RefStatement__Group__0__Impl"
    // InternalMyDsl.g:1611:1: rule__RefStatement__Group__0__Impl : ( 'ref' ) ;
    public final void rule__RefStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( 'ref' ) )
            // InternalMyDsl.g:1616:1: ( 'ref' )
            {
            // InternalMyDsl.g:1616:1: ( 'ref' )
            // InternalMyDsl.g:1617:2: 'ref'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefStatementAccess().getRefKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefStatementAccess().getRefKeyword_0()); 
            }

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
    // $ANTLR end "rule__RefStatement__Group__0__Impl"


    // $ANTLR start "rule__RefStatement__Group__1"
    // InternalMyDsl.g:1626:1: rule__RefStatement__Group__1 : rule__RefStatement__Group__1__Impl ;
    public final void rule__RefStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( rule__RefStatement__Group__1__Impl )
            // InternalMyDsl.g:1631:2: rule__RefStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RefStatement__Group__1"


    // $ANTLR start "rule__RefStatement__Group__1__Impl"
    // InternalMyDsl.g:1637:1: rule__RefStatement__Group__1__Impl : ( ( rule__RefStatement__NameAssignment_1 ) ) ;
    public final void rule__RefStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( ( rule__RefStatement__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1642:1: ( ( rule__RefStatement__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1642:1: ( ( rule__RefStatement__NameAssignment_1 ) )
            // InternalMyDsl.g:1643:2: ( rule__RefStatement__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefStatementAccess().getNameAssignment_1()); 
            }
            // InternalMyDsl.g:1644:2: ( rule__RefStatement__NameAssignment_1 )
            // InternalMyDsl.g:1644:3: rule__RefStatement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RefStatement__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefStatementAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__RefStatement__Group__1__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__0"
    // InternalMyDsl.g:1653:1: rule__ParticipantStatement__Group_0__0 : rule__ParticipantStatement__Group_0__0__Impl rule__ParticipantStatement__Group_0__1 ;
    public final void rule__ParticipantStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( rule__ParticipantStatement__Group_0__0__Impl rule__ParticipantStatement__Group_0__1 )
            // InternalMyDsl.g:1658:2: rule__ParticipantStatement__Group_0__0__Impl rule__ParticipantStatement__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ParticipantStatement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__0"


    // $ANTLR start "rule__ParticipantStatement__Group_0__0__Impl"
    // InternalMyDsl.g:1665:1: rule__ParticipantStatement__Group_0__0__Impl : ( 'participant' ) ;
    public final void rule__ParticipantStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( ( 'participant' ) )
            // InternalMyDsl.g:1670:1: ( 'participant' )
            {
            // InternalMyDsl.g:1670:1: ( 'participant' )
            // InternalMyDsl.g:1671:2: 'participant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_0_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__0__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__1"
    // InternalMyDsl.g:1680:1: rule__ParticipantStatement__Group_0__1 : rule__ParticipantStatement__Group_0__1__Impl rule__ParticipantStatement__Group_0__2 ;
    public final void rule__ParticipantStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( rule__ParticipantStatement__Group_0__1__Impl rule__ParticipantStatement__Group_0__2 )
            // InternalMyDsl.g:1685:2: rule__ParticipantStatement__Group_0__1__Impl rule__ParticipantStatement__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ParticipantStatement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__1"


    // $ANTLR start "rule__ParticipantStatement__Group_0__1__Impl"
    // InternalMyDsl.g:1692:1: rule__ParticipantStatement__Group_0__1__Impl : ( ( rule__ParticipantStatement__NameAssignment_0_1 ) ) ;
    public final void rule__ParticipantStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( ( rule__ParticipantStatement__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:1697:1: ( ( rule__ParticipantStatement__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1697:1: ( ( rule__ParticipantStatement__NameAssignment_0_1 ) )
            // InternalMyDsl.g:1698:2: ( rule__ParticipantStatement__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameAssignment_0_1()); 
            }
            // InternalMyDsl.g:1699:2: ( rule__ParticipantStatement__NameAssignment_0_1 )
            // InternalMyDsl.g:1699:3: rule__ParticipantStatement__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__1__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__2"
    // InternalMyDsl.g:1707:1: rule__ParticipantStatement__Group_0__2 : rule__ParticipantStatement__Group_0__2__Impl rule__ParticipantStatement__Group_0__3 ;
    public final void rule__ParticipantStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__ParticipantStatement__Group_0__2__Impl rule__ParticipantStatement__Group_0__3 )
            // InternalMyDsl.g:1712:2: rule__ParticipantStatement__Group_0__2__Impl rule__ParticipantStatement__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__ParticipantStatement__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__2"


    // $ANTLR start "rule__ParticipantStatement__Group_0__2__Impl"
    // InternalMyDsl.g:1719:1: rule__ParticipantStatement__Group_0__2__Impl : ( ':' ) ;
    public final void rule__ParticipantStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( ':' ) )
            // InternalMyDsl.g:1724:1: ( ':' )
            {
            // InternalMyDsl.g:1724:1: ( ':' )
            // InternalMyDsl.g:1725:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getColonKeyword_0_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getColonKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__2__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__3"
    // InternalMyDsl.g:1734:1: rule__ParticipantStatement__Group_0__3 : rule__ParticipantStatement__Group_0__3__Impl rule__ParticipantStatement__Group_0__4 ;
    public final void rule__ParticipantStatement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__ParticipantStatement__Group_0__3__Impl rule__ParticipantStatement__Group_0__4 )
            // InternalMyDsl.g:1739:2: rule__ParticipantStatement__Group_0__3__Impl rule__ParticipantStatement__Group_0__4
            {
            pushFollow(FOLLOW_3);
            rule__ParticipantStatement__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__3"


    // $ANTLR start "rule__ParticipantStatement__Group_0__3__Impl"
    // InternalMyDsl.g:1746:1: rule__ParticipantStatement__Group_0__3__Impl : ( ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 ) ) ;
    public final void rule__ParticipantStatement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 ) ) )
            // InternalMyDsl.g:1751:1: ( ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 ) )
            {
            // InternalMyDsl.g:1751:1: ( ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 ) )
            // InternalMyDsl.g:1752:2: ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getParticipantTypeAssignment_0_3()); 
            }
            // InternalMyDsl.g:1753:2: ( rule__ParticipantStatement__ParticipantTypeAssignment_0_3 )
            // InternalMyDsl.g:1753:3: rule__ParticipantStatement__ParticipantTypeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__ParticipantTypeAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getParticipantTypeAssignment_0_3()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__3__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__4"
    // InternalMyDsl.g:1761:1: rule__ParticipantStatement__Group_0__4 : rule__ParticipantStatement__Group_0__4__Impl rule__ParticipantStatement__Group_0__5 ;
    public final void rule__ParticipantStatement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__ParticipantStatement__Group_0__4__Impl rule__ParticipantStatement__Group_0__5 )
            // InternalMyDsl.g:1766:2: rule__ParticipantStatement__Group_0__4__Impl rule__ParticipantStatement__Group_0__5
            {
            pushFollow(FOLLOW_4);
            rule__ParticipantStatement__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__4"


    // $ANTLR start "rule__ParticipantStatement__Group_0__4__Impl"
    // InternalMyDsl.g:1773:1: rule__ParticipantStatement__Group_0__4__Impl : ( '(' ) ;
    public final void rule__ParticipantStatement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( '(' ) )
            // InternalMyDsl.g:1778:1: ( '(' )
            {
            // InternalMyDsl.g:1778:1: ( '(' )
            // InternalMyDsl.g:1779:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getLeftParenthesisKeyword_0_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getLeftParenthesisKeyword_0_4()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__4__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__5"
    // InternalMyDsl.g:1788:1: rule__ParticipantStatement__Group_0__5 : rule__ParticipantStatement__Group_0__5__Impl rule__ParticipantStatement__Group_0__6 ;
    public final void rule__ParticipantStatement__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__ParticipantStatement__Group_0__5__Impl rule__ParticipantStatement__Group_0__6 )
            // InternalMyDsl.g:1793:2: rule__ParticipantStatement__Group_0__5__Impl rule__ParticipantStatement__Group_0__6
            {
            pushFollow(FOLLOW_5);
            rule__ParticipantStatement__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__5"


    // $ANTLR start "rule__ParticipantStatement__Group_0__5__Impl"
    // InternalMyDsl.g:1800:1: rule__ParticipantStatement__Group_0__5__Impl : ( ( rule__ParticipantStatement__DescriptionAssignment_0_5 ) ) ;
    public final void rule__ParticipantStatement__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ( rule__ParticipantStatement__DescriptionAssignment_0_5 ) ) )
            // InternalMyDsl.g:1805:1: ( ( rule__ParticipantStatement__DescriptionAssignment_0_5 ) )
            {
            // InternalMyDsl.g:1805:1: ( ( rule__ParticipantStatement__DescriptionAssignment_0_5 ) )
            // InternalMyDsl.g:1806:2: ( rule__ParticipantStatement__DescriptionAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getDescriptionAssignment_0_5()); 
            }
            // InternalMyDsl.g:1807:2: ( rule__ParticipantStatement__DescriptionAssignment_0_5 )
            // InternalMyDsl.g:1807:3: rule__ParticipantStatement__DescriptionAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__DescriptionAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getDescriptionAssignment_0_5()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__5__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_0__6"
    // InternalMyDsl.g:1815:1: rule__ParticipantStatement__Group_0__6 : rule__ParticipantStatement__Group_0__6__Impl ;
    public final void rule__ParticipantStatement__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__ParticipantStatement__Group_0__6__Impl )
            // InternalMyDsl.g:1820:2: rule__ParticipantStatement__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__6"


    // $ANTLR start "rule__ParticipantStatement__Group_0__6__Impl"
    // InternalMyDsl.g:1826:1: rule__ParticipantStatement__Group_0__6__Impl : ( ')' ) ;
    public final void rule__ParticipantStatement__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( ( ')' ) )
            // InternalMyDsl.g:1831:1: ( ')' )
            {
            // InternalMyDsl.g:1831:1: ( ')' )
            // InternalMyDsl.g:1832:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getRightParenthesisKeyword_0_6()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getRightParenthesisKeyword_0_6()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_0__6__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_1__0"
    // InternalMyDsl.g:1842:1: rule__ParticipantStatement__Group_1__0 : rule__ParticipantStatement__Group_1__0__Impl rule__ParticipantStatement__Group_1__1 ;
    public final void rule__ParticipantStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__ParticipantStatement__Group_1__0__Impl rule__ParticipantStatement__Group_1__1 )
            // InternalMyDsl.g:1847:2: rule__ParticipantStatement__Group_1__0__Impl rule__ParticipantStatement__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ParticipantStatement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__0"


    // $ANTLR start "rule__ParticipantStatement__Group_1__0__Impl"
    // InternalMyDsl.g:1854:1: rule__ParticipantStatement__Group_1__0__Impl : ( 'participant' ) ;
    public final void rule__ParticipantStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( 'participant' ) )
            // InternalMyDsl.g:1859:1: ( 'participant' )
            {
            // InternalMyDsl.g:1859:1: ( 'participant' )
            // InternalMyDsl.g:1860:2: 'participant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__0__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_1__1"
    // InternalMyDsl.g:1869:1: rule__ParticipantStatement__Group_1__1 : rule__ParticipantStatement__Group_1__1__Impl rule__ParticipantStatement__Group_1__2 ;
    public final void rule__ParticipantStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__ParticipantStatement__Group_1__1__Impl rule__ParticipantStatement__Group_1__2 )
            // InternalMyDsl.g:1874:2: rule__ParticipantStatement__Group_1__1__Impl rule__ParticipantStatement__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ParticipantStatement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__1"


    // $ANTLR start "rule__ParticipantStatement__Group_1__1__Impl"
    // InternalMyDsl.g:1881:1: rule__ParticipantStatement__Group_1__1__Impl : ( ( rule__ParticipantStatement__NameAssignment_1_1 ) ) ;
    public final void rule__ParticipantStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( ( rule__ParticipantStatement__NameAssignment_1_1 ) ) )
            // InternalMyDsl.g:1886:1: ( ( rule__ParticipantStatement__NameAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1886:1: ( ( rule__ParticipantStatement__NameAssignment_1_1 ) )
            // InternalMyDsl.g:1887:2: ( rule__ParticipantStatement__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameAssignment_1_1()); 
            }
            // InternalMyDsl.g:1888:2: ( rule__ParticipantStatement__NameAssignment_1_1 )
            // InternalMyDsl.g:1888:3: rule__ParticipantStatement__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__1__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_1__2"
    // InternalMyDsl.g:1896:1: rule__ParticipantStatement__Group_1__2 : rule__ParticipantStatement__Group_1__2__Impl rule__ParticipantStatement__Group_1__3 ;
    public final void rule__ParticipantStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__ParticipantStatement__Group_1__2__Impl rule__ParticipantStatement__Group_1__3 )
            // InternalMyDsl.g:1901:2: rule__ParticipantStatement__Group_1__2__Impl rule__ParticipantStatement__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__ParticipantStatement__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__2"


    // $ANTLR start "rule__ParticipantStatement__Group_1__2__Impl"
    // InternalMyDsl.g:1908:1: rule__ParticipantStatement__Group_1__2__Impl : ( ':' ) ;
    public final void rule__ParticipantStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( ':' ) )
            // InternalMyDsl.g:1913:1: ( ':' )
            {
            // InternalMyDsl.g:1913:1: ( ':' )
            // InternalMyDsl.g:1914:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getColonKeyword_1_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getColonKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__2__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_1__3"
    // InternalMyDsl.g:1923:1: rule__ParticipantStatement__Group_1__3 : rule__ParticipantStatement__Group_1__3__Impl ;
    public final void rule__ParticipantStatement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__ParticipantStatement__Group_1__3__Impl )
            // InternalMyDsl.g:1928:2: rule__ParticipantStatement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__3"


    // $ANTLR start "rule__ParticipantStatement__Group_1__3__Impl"
    // InternalMyDsl.g:1934:1: rule__ParticipantStatement__Group_1__3__Impl : ( ( rule__ParticipantStatement__OutboundsAssignment_1_3 ) ) ;
    public final void rule__ParticipantStatement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( ( rule__ParticipantStatement__OutboundsAssignment_1_3 ) ) )
            // InternalMyDsl.g:1939:1: ( ( rule__ParticipantStatement__OutboundsAssignment_1_3 ) )
            {
            // InternalMyDsl.g:1939:1: ( ( rule__ParticipantStatement__OutboundsAssignment_1_3 ) )
            // InternalMyDsl.g:1940:2: ( rule__ParticipantStatement__OutboundsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getOutboundsAssignment_1_3()); 
            }
            // InternalMyDsl.g:1941:2: ( rule__ParticipantStatement__OutboundsAssignment_1_3 )
            // InternalMyDsl.g:1941:3: rule__ParticipantStatement__OutboundsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__OutboundsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getOutboundsAssignment_1_3()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_1__3__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_2__0"
    // InternalMyDsl.g:1950:1: rule__ParticipantStatement__Group_2__0 : rule__ParticipantStatement__Group_2__0__Impl rule__ParticipantStatement__Group_2__1 ;
    public final void rule__ParticipantStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__ParticipantStatement__Group_2__0__Impl rule__ParticipantStatement__Group_2__1 )
            // InternalMyDsl.g:1955:2: rule__ParticipantStatement__Group_2__0__Impl rule__ParticipantStatement__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ParticipantStatement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__0"


    // $ANTLR start "rule__ParticipantStatement__Group_2__0__Impl"
    // InternalMyDsl.g:1962:1: rule__ParticipantStatement__Group_2__0__Impl : ( 'participant' ) ;
    public final void rule__ParticipantStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( ( 'participant' ) )
            // InternalMyDsl.g:1967:1: ( 'participant' )
            {
            // InternalMyDsl.g:1967:1: ( 'participant' )
            // InternalMyDsl.g:1968:2: 'participant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getParticipantKeyword_2_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__0__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_2__1"
    // InternalMyDsl.g:1977:1: rule__ParticipantStatement__Group_2__1 : rule__ParticipantStatement__Group_2__1__Impl rule__ParticipantStatement__Group_2__2 ;
    public final void rule__ParticipantStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__ParticipantStatement__Group_2__1__Impl rule__ParticipantStatement__Group_2__2 )
            // InternalMyDsl.g:1982:2: rule__ParticipantStatement__Group_2__1__Impl rule__ParticipantStatement__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ParticipantStatement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__1"


    // $ANTLR start "rule__ParticipantStatement__Group_2__1__Impl"
    // InternalMyDsl.g:1989:1: rule__ParticipantStatement__Group_2__1__Impl : ( ( rule__ParticipantStatement__NameAssignment_2_1 ) ) ;
    public final void rule__ParticipantStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( ( rule__ParticipantStatement__NameAssignment_2_1 ) ) )
            // InternalMyDsl.g:1994:1: ( ( rule__ParticipantStatement__NameAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1994:1: ( ( rule__ParticipantStatement__NameAssignment_2_1 ) )
            // InternalMyDsl.g:1995:2: ( rule__ParticipantStatement__NameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameAssignment_2_1()); 
            }
            // InternalMyDsl.g:1996:2: ( rule__ParticipantStatement__NameAssignment_2_1 )
            // InternalMyDsl.g:1996:3: rule__ParticipantStatement__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__NameAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__1__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_2__2"
    // InternalMyDsl.g:2004:1: rule__ParticipantStatement__Group_2__2 : rule__ParticipantStatement__Group_2__2__Impl rule__ParticipantStatement__Group_2__3 ;
    public final void rule__ParticipantStatement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__ParticipantStatement__Group_2__2__Impl rule__ParticipantStatement__Group_2__3 )
            // InternalMyDsl.g:2009:2: rule__ParticipantStatement__Group_2__2__Impl rule__ParticipantStatement__Group_2__3
            {
            pushFollow(FOLLOW_19);
            rule__ParticipantStatement__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__2"


    // $ANTLR start "rule__ParticipantStatement__Group_2__2__Impl"
    // InternalMyDsl.g:2016:1: rule__ParticipantStatement__Group_2__2__Impl : ( ':' ) ;
    public final void rule__ParticipantStatement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( ':' ) )
            // InternalMyDsl.g:2021:1: ( ':' )
            {
            // InternalMyDsl.g:2021:1: ( ':' )
            // InternalMyDsl.g:2022:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getColonKeyword_2_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getColonKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__2__Impl"


    // $ANTLR start "rule__ParticipantStatement__Group_2__3"
    // InternalMyDsl.g:2031:1: rule__ParticipantStatement__Group_2__3 : rule__ParticipantStatement__Group_2__3__Impl ;
    public final void rule__ParticipantStatement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__ParticipantStatement__Group_2__3__Impl )
            // InternalMyDsl.g:2036:2: rule__ParticipantStatement__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__3"


    // $ANTLR start "rule__ParticipantStatement__Group_2__3__Impl"
    // InternalMyDsl.g:2042:1: rule__ParticipantStatement__Group_2__3__Impl : ( ( rule__ParticipantStatement__InboundsAssignment_2_3 ) ) ;
    public final void rule__ParticipantStatement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( ( rule__ParticipantStatement__InboundsAssignment_2_3 ) ) )
            // InternalMyDsl.g:2047:1: ( ( rule__ParticipantStatement__InboundsAssignment_2_3 ) )
            {
            // InternalMyDsl.g:2047:1: ( ( rule__ParticipantStatement__InboundsAssignment_2_3 ) )
            // InternalMyDsl.g:2048:2: ( rule__ParticipantStatement__InboundsAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getInboundsAssignment_2_3()); 
            }
            // InternalMyDsl.g:2049:2: ( rule__ParticipantStatement__InboundsAssignment_2_3 )
            // InternalMyDsl.g:2049:3: rule__ParticipantStatement__InboundsAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__ParticipantStatement__InboundsAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getInboundsAssignment_2_3()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__Group_2__3__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__0"
    // InternalMyDsl.g:2058:1: rule__OutboundEndpointDef__Group__0 : rule__OutboundEndpointDef__Group__0__Impl rule__OutboundEndpointDef__Group__1 ;
    public final void rule__OutboundEndpointDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__OutboundEndpointDef__Group__0__Impl rule__OutboundEndpointDef__Group__1 )
            // InternalMyDsl.g:2063:2: rule__OutboundEndpointDef__Group__0__Impl rule__OutboundEndpointDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__OutboundEndpointDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__0"


    // $ANTLR start "rule__OutboundEndpointDef__Group__0__Impl"
    // InternalMyDsl.g:2070:1: rule__OutboundEndpointDef__Group__0__Impl : ( 'OutboundEndpoint' ) ;
    public final void rule__OutboundEndpointDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( 'OutboundEndpoint' ) )
            // InternalMyDsl.g:2075:1: ( 'OutboundEndpoint' )
            {
            // InternalMyDsl.g:2075:1: ( 'OutboundEndpoint' )
            // InternalMyDsl.g:2076:2: 'OutboundEndpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getOutboundEndpointKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getOutboundEndpointKeyword_0()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__0__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__1"
    // InternalMyDsl.g:2085:1: rule__OutboundEndpointDef__Group__1 : rule__OutboundEndpointDef__Group__1__Impl rule__OutboundEndpointDef__Group__2 ;
    public final void rule__OutboundEndpointDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__OutboundEndpointDef__Group__1__Impl rule__OutboundEndpointDef__Group__2 )
            // InternalMyDsl.g:2090:2: rule__OutboundEndpointDef__Group__1__Impl rule__OutboundEndpointDef__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__OutboundEndpointDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__1"


    // $ANTLR start "rule__OutboundEndpointDef__Group__1__Impl"
    // InternalMyDsl.g:2097:1: rule__OutboundEndpointDef__Group__1__Impl : ( ( ( '(' ) ) ( ( '(' )* ) ) ;
    public final void rule__OutboundEndpointDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( ( ( '(' ) ) ( ( '(' )* ) ) )
            // InternalMyDsl.g:2102:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            {
            // InternalMyDsl.g:2102:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            // InternalMyDsl.g:2103:2: ( ( '(' ) ) ( ( '(' )* )
            {
            // InternalMyDsl.g:2103:2: ( ( '(' ) )
            // InternalMyDsl.g:2104:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }
            // InternalMyDsl.g:2105:3: ( '(' )
            // InternalMyDsl.g:2105:4: '('
            {
            match(input,22,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            // InternalMyDsl.g:2108:2: ( ( '(' )* )
            // InternalMyDsl.g:2109:3: ( '(' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }
            // InternalMyDsl.g:2110:3: ( '(' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2110:4: '('
            	    {
            	    match(input,22,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }

            }


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
    // $ANTLR end "rule__OutboundEndpointDef__Group__1__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__2"
    // InternalMyDsl.g:2119:1: rule__OutboundEndpointDef__Group__2 : rule__OutboundEndpointDef__Group__2__Impl rule__OutboundEndpointDef__Group__3 ;
    public final void rule__OutboundEndpointDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__OutboundEndpointDef__Group__2__Impl rule__OutboundEndpointDef__Group__3 )
            // InternalMyDsl.g:2124:2: rule__OutboundEndpointDef__Group__2__Impl rule__OutboundEndpointDef__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__OutboundEndpointDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__2"


    // $ANTLR start "rule__OutboundEndpointDef__Group__2__Impl"
    // InternalMyDsl.g:2131:1: rule__OutboundEndpointDef__Group__2__Impl : ( 'protocol' ) ;
    public final void rule__OutboundEndpointDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2136:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2136:1: ( 'protocol' )
            // InternalMyDsl.g:2137:2: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getProtocolKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getProtocolKeyword_2()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__2__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__3"
    // InternalMyDsl.g:2146:1: rule__OutboundEndpointDef__Group__3 : rule__OutboundEndpointDef__Group__3__Impl rule__OutboundEndpointDef__Group__4 ;
    public final void rule__OutboundEndpointDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__OutboundEndpointDef__Group__3__Impl rule__OutboundEndpointDef__Group__4 )
            // InternalMyDsl.g:2151:2: rule__OutboundEndpointDef__Group__3__Impl rule__OutboundEndpointDef__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__OutboundEndpointDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__3"


    // $ANTLR start "rule__OutboundEndpointDef__Group__3__Impl"
    // InternalMyDsl.g:2158:1: rule__OutboundEndpointDef__Group__3__Impl : ( '(' ) ;
    public final void rule__OutboundEndpointDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( '(' ) )
            // InternalMyDsl.g:2163:1: ( '(' )
            {
            // InternalMyDsl.g:2163:1: ( '(' )
            // InternalMyDsl.g:2164:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__3__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__4"
    // InternalMyDsl.g:2173:1: rule__OutboundEndpointDef__Group__4 : rule__OutboundEndpointDef__Group__4__Impl rule__OutboundEndpointDef__Group__5 ;
    public final void rule__OutboundEndpointDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__OutboundEndpointDef__Group__4__Impl rule__OutboundEndpointDef__Group__5 )
            // InternalMyDsl.g:2178:2: rule__OutboundEndpointDef__Group__4__Impl rule__OutboundEndpointDef__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__OutboundEndpointDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__4"


    // $ANTLR start "rule__OutboundEndpointDef__Group__4__Impl"
    // InternalMyDsl.g:2185:1: rule__OutboundEndpointDef__Group__4__Impl : ( ( rule__OutboundEndpointDef__ProtocolAssignment_4 ) ) ;
    public final void rule__OutboundEndpointDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( ( rule__OutboundEndpointDef__ProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:2190:1: ( ( rule__OutboundEndpointDef__ProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:2190:1: ( ( rule__OutboundEndpointDef__ProtocolAssignment_4 ) )
            // InternalMyDsl.g:2191:2: ( rule__OutboundEndpointDef__ProtocolAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getProtocolAssignment_4()); 
            }
            // InternalMyDsl.g:2192:2: ( rule__OutboundEndpointDef__ProtocolAssignment_4 )
            // InternalMyDsl.g:2192:3: rule__OutboundEndpointDef__ProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__ProtocolAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getProtocolAssignment_4()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__4__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__5"
    // InternalMyDsl.g:2200:1: rule__OutboundEndpointDef__Group__5 : rule__OutboundEndpointDef__Group__5__Impl rule__OutboundEndpointDef__Group__6 ;
    public final void rule__OutboundEndpointDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__OutboundEndpointDef__Group__5__Impl rule__OutboundEndpointDef__Group__6 )
            // InternalMyDsl.g:2205:2: rule__OutboundEndpointDef__Group__5__Impl rule__OutboundEndpointDef__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__OutboundEndpointDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__5"


    // $ANTLR start "rule__OutboundEndpointDef__Group__5__Impl"
    // InternalMyDsl.g:2212:1: rule__OutboundEndpointDef__Group__5__Impl : ( ')' ) ;
    public final void rule__OutboundEndpointDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( ')' ) )
            // InternalMyDsl.g:2217:1: ( ')' )
            {
            // InternalMyDsl.g:2217:1: ( ')' )
            // InternalMyDsl.g:2218:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__5__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__6"
    // InternalMyDsl.g:2227:1: rule__OutboundEndpointDef__Group__6 : rule__OutboundEndpointDef__Group__6__Impl rule__OutboundEndpointDef__Group__7 ;
    public final void rule__OutboundEndpointDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__OutboundEndpointDef__Group__6__Impl rule__OutboundEndpointDef__Group__7 )
            // InternalMyDsl.g:2232:2: rule__OutboundEndpointDef__Group__6__Impl rule__OutboundEndpointDef__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__OutboundEndpointDef__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__6"


    // $ANTLR start "rule__OutboundEndpointDef__Group__6__Impl"
    // InternalMyDsl.g:2239:1: rule__OutboundEndpointDef__Group__6__Impl : ( ',' ) ;
    public final void rule__OutboundEndpointDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( ',' ) )
            // InternalMyDsl.g:2244:1: ( ',' )
            {
            // InternalMyDsl.g:2244:1: ( ',' )
            // InternalMyDsl.g:2245:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getCommaKeyword_6()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getCommaKeyword_6()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__6__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__7"
    // InternalMyDsl.g:2254:1: rule__OutboundEndpointDef__Group__7 : rule__OutboundEndpointDef__Group__7__Impl rule__OutboundEndpointDef__Group__8 ;
    public final void rule__OutboundEndpointDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__OutboundEndpointDef__Group__7__Impl rule__OutboundEndpointDef__Group__8 )
            // InternalMyDsl.g:2259:2: rule__OutboundEndpointDef__Group__7__Impl rule__OutboundEndpointDef__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__OutboundEndpointDef__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__7"


    // $ANTLR start "rule__OutboundEndpointDef__Group__7__Impl"
    // InternalMyDsl.g:2266:1: rule__OutboundEndpointDef__Group__7__Impl : ( 'host' ) ;
    public final void rule__OutboundEndpointDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( 'host' ) )
            // InternalMyDsl.g:2271:1: ( 'host' )
            {
            // InternalMyDsl.g:2271:1: ( 'host' )
            // InternalMyDsl.g:2272:2: 'host'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getHostKeyword_7()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getHostKeyword_7()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__7__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__8"
    // InternalMyDsl.g:2281:1: rule__OutboundEndpointDef__Group__8 : rule__OutboundEndpointDef__Group__8__Impl rule__OutboundEndpointDef__Group__9 ;
    public final void rule__OutboundEndpointDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__OutboundEndpointDef__Group__8__Impl rule__OutboundEndpointDef__Group__9 )
            // InternalMyDsl.g:2286:2: rule__OutboundEndpointDef__Group__8__Impl rule__OutboundEndpointDef__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__OutboundEndpointDef__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__8"


    // $ANTLR start "rule__OutboundEndpointDef__Group__8__Impl"
    // InternalMyDsl.g:2293:1: rule__OutboundEndpointDef__Group__8__Impl : ( '(' ) ;
    public final void rule__OutboundEndpointDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( ( '(' ) )
            // InternalMyDsl.g:2298:1: ( '(' )
            {
            // InternalMyDsl.g:2298:1: ( '(' )
            // InternalMyDsl.g:2299:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_8()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__8__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__9"
    // InternalMyDsl.g:2308:1: rule__OutboundEndpointDef__Group__9 : rule__OutboundEndpointDef__Group__9__Impl rule__OutboundEndpointDef__Group__10 ;
    public final void rule__OutboundEndpointDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__OutboundEndpointDef__Group__9__Impl rule__OutboundEndpointDef__Group__10 )
            // InternalMyDsl.g:2313:2: rule__OutboundEndpointDef__Group__9__Impl rule__OutboundEndpointDef__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__OutboundEndpointDef__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__9"


    // $ANTLR start "rule__OutboundEndpointDef__Group__9__Impl"
    // InternalMyDsl.g:2320:1: rule__OutboundEndpointDef__Group__9__Impl : ( ( rule__OutboundEndpointDef__HostAssignment_9 ) ) ;
    public final void rule__OutboundEndpointDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( ( rule__OutboundEndpointDef__HostAssignment_9 ) ) )
            // InternalMyDsl.g:2325:1: ( ( rule__OutboundEndpointDef__HostAssignment_9 ) )
            {
            // InternalMyDsl.g:2325:1: ( ( rule__OutboundEndpointDef__HostAssignment_9 ) )
            // InternalMyDsl.g:2326:2: ( rule__OutboundEndpointDef__HostAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getHostAssignment_9()); 
            }
            // InternalMyDsl.g:2327:2: ( rule__OutboundEndpointDef__HostAssignment_9 )
            // InternalMyDsl.g:2327:3: rule__OutboundEndpointDef__HostAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__HostAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getHostAssignment_9()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__9__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__10"
    // InternalMyDsl.g:2335:1: rule__OutboundEndpointDef__Group__10 : rule__OutboundEndpointDef__Group__10__Impl rule__OutboundEndpointDef__Group__11 ;
    public final void rule__OutboundEndpointDef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__OutboundEndpointDef__Group__10__Impl rule__OutboundEndpointDef__Group__11 )
            // InternalMyDsl.g:2340:2: rule__OutboundEndpointDef__Group__10__Impl rule__OutboundEndpointDef__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__OutboundEndpointDef__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__10"


    // $ANTLR start "rule__OutboundEndpointDef__Group__10__Impl"
    // InternalMyDsl.g:2347:1: rule__OutboundEndpointDef__Group__10__Impl : ( ')' ) ;
    public final void rule__OutboundEndpointDef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ')' ) )
            // InternalMyDsl.g:2352:1: ( ')' )
            {
            // InternalMyDsl.g:2352:1: ( ')' )
            // InternalMyDsl.g:2353:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_10()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__10__Impl"


    // $ANTLR start "rule__OutboundEndpointDef__Group__11"
    // InternalMyDsl.g:2362:1: rule__OutboundEndpointDef__Group__11 : rule__OutboundEndpointDef__Group__11__Impl ;
    public final void rule__OutboundEndpointDef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__OutboundEndpointDef__Group__11__Impl )
            // InternalMyDsl.g:2367:2: rule__OutboundEndpointDef__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutboundEndpointDef__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__11"


    // $ANTLR start "rule__OutboundEndpointDef__Group__11__Impl"
    // InternalMyDsl.g:2373:1: rule__OutboundEndpointDef__Group__11__Impl : ( ')' ) ;
    public final void rule__OutboundEndpointDef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( ')' ) )
            // InternalMyDsl.g:2378:1: ( ')' )
            {
            // InternalMyDsl.g:2378:1: ( ')' )
            // InternalMyDsl.g:2379:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_11()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_11()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__Group__11__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__0"
    // InternalMyDsl.g:2389:1: rule__InboundEndpointDef__Group__0 : rule__InboundEndpointDef__Group__0__Impl rule__InboundEndpointDef__Group__1 ;
    public final void rule__InboundEndpointDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__InboundEndpointDef__Group__0__Impl rule__InboundEndpointDef__Group__1 )
            // InternalMyDsl.g:2394:2: rule__InboundEndpointDef__Group__0__Impl rule__InboundEndpointDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InboundEndpointDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__0"


    // $ANTLR start "rule__InboundEndpointDef__Group__0__Impl"
    // InternalMyDsl.g:2401:1: rule__InboundEndpointDef__Group__0__Impl : ( 'InboundEndpoint' ) ;
    public final void rule__InboundEndpointDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( 'InboundEndpoint' ) )
            // InternalMyDsl.g:2406:1: ( 'InboundEndpoint' )
            {
            // InternalMyDsl.g:2406:1: ( 'InboundEndpoint' )
            // InternalMyDsl.g:2407:2: 'InboundEndpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getInboundEndpointKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getInboundEndpointKeyword_0()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__0__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__1"
    // InternalMyDsl.g:2416:1: rule__InboundEndpointDef__Group__1 : rule__InboundEndpointDef__Group__1__Impl rule__InboundEndpointDef__Group__2 ;
    public final void rule__InboundEndpointDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__InboundEndpointDef__Group__1__Impl rule__InboundEndpointDef__Group__2 )
            // InternalMyDsl.g:2421:2: rule__InboundEndpointDef__Group__1__Impl rule__InboundEndpointDef__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InboundEndpointDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__1"


    // $ANTLR start "rule__InboundEndpointDef__Group__1__Impl"
    // InternalMyDsl.g:2428:1: rule__InboundEndpointDef__Group__1__Impl : ( ( ( '(' ) ) ( ( '(' )* ) ) ;
    public final void rule__InboundEndpointDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( ( ( '(' ) ) ( ( '(' )* ) ) )
            // InternalMyDsl.g:2433:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            {
            // InternalMyDsl.g:2433:1: ( ( ( '(' ) ) ( ( '(' )* ) )
            // InternalMyDsl.g:2434:2: ( ( '(' ) ) ( ( '(' )* )
            {
            // InternalMyDsl.g:2434:2: ( ( '(' ) )
            // InternalMyDsl.g:2435:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }
            // InternalMyDsl.g:2436:3: ( '(' )
            // InternalMyDsl.g:2436:4: '('
            {
            match(input,22,FOLLOW_21); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }

            }

            // InternalMyDsl.g:2439:2: ( ( '(' )* )
            // InternalMyDsl.g:2440:3: ( '(' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }
            // InternalMyDsl.g:2441:3: ( '(' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2441:4: '('
            	    {
            	    match(input,22,FOLLOW_21); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1()); 
            }

            }


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
    // $ANTLR end "rule__InboundEndpointDef__Group__1__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__2"
    // InternalMyDsl.g:2450:1: rule__InboundEndpointDef__Group__2 : rule__InboundEndpointDef__Group__2__Impl rule__InboundEndpointDef__Group__3 ;
    public final void rule__InboundEndpointDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2454:1: ( rule__InboundEndpointDef__Group__2__Impl rule__InboundEndpointDef__Group__3 )
            // InternalMyDsl.g:2455:2: rule__InboundEndpointDef__Group__2__Impl rule__InboundEndpointDef__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__InboundEndpointDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__2"


    // $ANTLR start "rule__InboundEndpointDef__Group__2__Impl"
    // InternalMyDsl.g:2462:1: rule__InboundEndpointDef__Group__2__Impl : ( 'protocol' ) ;
    public final void rule__InboundEndpointDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( ( 'protocol' ) )
            // InternalMyDsl.g:2467:1: ( 'protocol' )
            {
            // InternalMyDsl.g:2467:1: ( 'protocol' )
            // InternalMyDsl.g:2468:2: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getProtocolKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getProtocolKeyword_2()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__2__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__3"
    // InternalMyDsl.g:2477:1: rule__InboundEndpointDef__Group__3 : rule__InboundEndpointDef__Group__3__Impl rule__InboundEndpointDef__Group__4 ;
    public final void rule__InboundEndpointDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2481:1: ( rule__InboundEndpointDef__Group__3__Impl rule__InboundEndpointDef__Group__4 )
            // InternalMyDsl.g:2482:2: rule__InboundEndpointDef__Group__3__Impl rule__InboundEndpointDef__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__InboundEndpointDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__3"


    // $ANTLR start "rule__InboundEndpointDef__Group__3__Impl"
    // InternalMyDsl.g:2489:1: rule__InboundEndpointDef__Group__3__Impl : ( '(' ) ;
    public final void rule__InboundEndpointDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( '(' ) )
            // InternalMyDsl.g:2494:1: ( '(' )
            {
            // InternalMyDsl.g:2494:1: ( '(' )
            // InternalMyDsl.g:2495:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__3__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__4"
    // InternalMyDsl.g:2504:1: rule__InboundEndpointDef__Group__4 : rule__InboundEndpointDef__Group__4__Impl rule__InboundEndpointDef__Group__5 ;
    public final void rule__InboundEndpointDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( rule__InboundEndpointDef__Group__4__Impl rule__InboundEndpointDef__Group__5 )
            // InternalMyDsl.g:2509:2: rule__InboundEndpointDef__Group__4__Impl rule__InboundEndpointDef__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__InboundEndpointDef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__4"


    // $ANTLR start "rule__InboundEndpointDef__Group__4__Impl"
    // InternalMyDsl.g:2516:1: rule__InboundEndpointDef__Group__4__Impl : ( ( rule__InboundEndpointDef__ProtocolAssignment_4 ) ) ;
    public final void rule__InboundEndpointDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( ( rule__InboundEndpointDef__ProtocolAssignment_4 ) ) )
            // InternalMyDsl.g:2521:1: ( ( rule__InboundEndpointDef__ProtocolAssignment_4 ) )
            {
            // InternalMyDsl.g:2521:1: ( ( rule__InboundEndpointDef__ProtocolAssignment_4 ) )
            // InternalMyDsl.g:2522:2: ( rule__InboundEndpointDef__ProtocolAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getProtocolAssignment_4()); 
            }
            // InternalMyDsl.g:2523:2: ( rule__InboundEndpointDef__ProtocolAssignment_4 )
            // InternalMyDsl.g:2523:3: rule__InboundEndpointDef__ProtocolAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__ProtocolAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getProtocolAssignment_4()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__4__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__5"
    // InternalMyDsl.g:2531:1: rule__InboundEndpointDef__Group__5 : rule__InboundEndpointDef__Group__5__Impl rule__InboundEndpointDef__Group__6 ;
    public final void rule__InboundEndpointDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2535:1: ( rule__InboundEndpointDef__Group__5__Impl rule__InboundEndpointDef__Group__6 )
            // InternalMyDsl.g:2536:2: rule__InboundEndpointDef__Group__5__Impl rule__InboundEndpointDef__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__InboundEndpointDef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__5"


    // $ANTLR start "rule__InboundEndpointDef__Group__5__Impl"
    // InternalMyDsl.g:2543:1: rule__InboundEndpointDef__Group__5__Impl : ( ')' ) ;
    public final void rule__InboundEndpointDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( ')' ) )
            // InternalMyDsl.g:2548:1: ( ')' )
            {
            // InternalMyDsl.g:2548:1: ( ')' )
            // InternalMyDsl.g:2549:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__5__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__6"
    // InternalMyDsl.g:2558:1: rule__InboundEndpointDef__Group__6 : rule__InboundEndpointDef__Group__6__Impl rule__InboundEndpointDef__Group__7 ;
    public final void rule__InboundEndpointDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2562:1: ( rule__InboundEndpointDef__Group__6__Impl rule__InboundEndpointDef__Group__7 )
            // InternalMyDsl.g:2563:2: rule__InboundEndpointDef__Group__6__Impl rule__InboundEndpointDef__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__InboundEndpointDef__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__6"


    // $ANTLR start "rule__InboundEndpointDef__Group__6__Impl"
    // InternalMyDsl.g:2570:1: rule__InboundEndpointDef__Group__6__Impl : ( ',' ) ;
    public final void rule__InboundEndpointDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( ( ',' ) )
            // InternalMyDsl.g:2575:1: ( ',' )
            {
            // InternalMyDsl.g:2575:1: ( ',' )
            // InternalMyDsl.g:2576:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_6()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_6()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__6__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__7"
    // InternalMyDsl.g:2585:1: rule__InboundEndpointDef__Group__7 : rule__InboundEndpointDef__Group__7__Impl rule__InboundEndpointDef__Group__8 ;
    public final void rule__InboundEndpointDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( rule__InboundEndpointDef__Group__7__Impl rule__InboundEndpointDef__Group__8 )
            // InternalMyDsl.g:2590:2: rule__InboundEndpointDef__Group__7__Impl rule__InboundEndpointDef__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__InboundEndpointDef__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__7"


    // $ANTLR start "rule__InboundEndpointDef__Group__7__Impl"
    // InternalMyDsl.g:2597:1: rule__InboundEndpointDef__Group__7__Impl : ( 'port' ) ;
    public final void rule__InboundEndpointDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( 'port' ) )
            // InternalMyDsl.g:2602:1: ( 'port' )
            {
            // InternalMyDsl.g:2602:1: ( 'port' )
            // InternalMyDsl.g:2603:2: 'port'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getPortKeyword_7()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getPortKeyword_7()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__7__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__8"
    // InternalMyDsl.g:2612:1: rule__InboundEndpointDef__Group__8 : rule__InboundEndpointDef__Group__8__Impl rule__InboundEndpointDef__Group__9 ;
    public final void rule__InboundEndpointDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( rule__InboundEndpointDef__Group__8__Impl rule__InboundEndpointDef__Group__9 )
            // InternalMyDsl.g:2617:2: rule__InboundEndpointDef__Group__8__Impl rule__InboundEndpointDef__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__InboundEndpointDef__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__8"


    // $ANTLR start "rule__InboundEndpointDef__Group__8__Impl"
    // InternalMyDsl.g:2624:1: rule__InboundEndpointDef__Group__8__Impl : ( '(' ) ;
    public final void rule__InboundEndpointDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( '(' ) )
            // InternalMyDsl.g:2629:1: ( '(' )
            {
            // InternalMyDsl.g:2629:1: ( '(' )
            // InternalMyDsl.g:2630:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_8()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__8__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__9"
    // InternalMyDsl.g:2639:1: rule__InboundEndpointDef__Group__9 : rule__InboundEndpointDef__Group__9__Impl rule__InboundEndpointDef__Group__10 ;
    public final void rule__InboundEndpointDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2643:1: ( rule__InboundEndpointDef__Group__9__Impl rule__InboundEndpointDef__Group__10 )
            // InternalMyDsl.g:2644:2: rule__InboundEndpointDef__Group__9__Impl rule__InboundEndpointDef__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__InboundEndpointDef__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__9"


    // $ANTLR start "rule__InboundEndpointDef__Group__9__Impl"
    // InternalMyDsl.g:2651:1: rule__InboundEndpointDef__Group__9__Impl : ( ( rule__InboundEndpointDef__PortAssignment_9 ) ) ;
    public final void rule__InboundEndpointDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( ( rule__InboundEndpointDef__PortAssignment_9 ) ) )
            // InternalMyDsl.g:2656:1: ( ( rule__InboundEndpointDef__PortAssignment_9 ) )
            {
            // InternalMyDsl.g:2656:1: ( ( rule__InboundEndpointDef__PortAssignment_9 ) )
            // InternalMyDsl.g:2657:2: ( rule__InboundEndpointDef__PortAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getPortAssignment_9()); 
            }
            // InternalMyDsl.g:2658:2: ( rule__InboundEndpointDef__PortAssignment_9 )
            // InternalMyDsl.g:2658:3: rule__InboundEndpointDef__PortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__PortAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getPortAssignment_9()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__9__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__10"
    // InternalMyDsl.g:2666:1: rule__InboundEndpointDef__Group__10 : rule__InboundEndpointDef__Group__10__Impl rule__InboundEndpointDef__Group__11 ;
    public final void rule__InboundEndpointDef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( rule__InboundEndpointDef__Group__10__Impl rule__InboundEndpointDef__Group__11 )
            // InternalMyDsl.g:2671:2: rule__InboundEndpointDef__Group__10__Impl rule__InboundEndpointDef__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__InboundEndpointDef__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__11();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__10"


    // $ANTLR start "rule__InboundEndpointDef__Group__10__Impl"
    // InternalMyDsl.g:2678:1: rule__InboundEndpointDef__Group__10__Impl : ( ')' ) ;
    public final void rule__InboundEndpointDef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( ( ')' ) )
            // InternalMyDsl.g:2683:1: ( ')' )
            {
            // InternalMyDsl.g:2683:1: ( ')' )
            // InternalMyDsl.g:2684:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_10()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__10__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__11"
    // InternalMyDsl.g:2693:1: rule__InboundEndpointDef__Group__11 : rule__InboundEndpointDef__Group__11__Impl rule__InboundEndpointDef__Group__12 ;
    public final void rule__InboundEndpointDef__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( rule__InboundEndpointDef__Group__11__Impl rule__InboundEndpointDef__Group__12 )
            // InternalMyDsl.g:2698:2: rule__InboundEndpointDef__Group__11__Impl rule__InboundEndpointDef__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__InboundEndpointDef__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__12();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__11"


    // $ANTLR start "rule__InboundEndpointDef__Group__11__Impl"
    // InternalMyDsl.g:2705:1: rule__InboundEndpointDef__Group__11__Impl : ( ',' ) ;
    public final void rule__InboundEndpointDef__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( ',' ) )
            // InternalMyDsl.g:2710:1: ( ',' )
            {
            // InternalMyDsl.g:2710:1: ( ',' )
            // InternalMyDsl.g:2711:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_11()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_11()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__11__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__12"
    // InternalMyDsl.g:2720:1: rule__InboundEndpointDef__Group__12 : rule__InboundEndpointDef__Group__12__Impl rule__InboundEndpointDef__Group__13 ;
    public final void rule__InboundEndpointDef__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( rule__InboundEndpointDef__Group__12__Impl rule__InboundEndpointDef__Group__13 )
            // InternalMyDsl.g:2725:2: rule__InboundEndpointDef__Group__12__Impl rule__InboundEndpointDef__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__InboundEndpointDef__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__13();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__12"


    // $ANTLR start "rule__InboundEndpointDef__Group__12__Impl"
    // InternalMyDsl.g:2732:1: rule__InboundEndpointDef__Group__12__Impl : ( 'context' ) ;
    public final void rule__InboundEndpointDef__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( ( 'context' ) )
            // InternalMyDsl.g:2737:1: ( 'context' )
            {
            // InternalMyDsl.g:2737:1: ( 'context' )
            // InternalMyDsl.g:2738:2: 'context'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getContextKeyword_12()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getContextKeyword_12()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__12__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__13"
    // InternalMyDsl.g:2747:1: rule__InboundEndpointDef__Group__13 : rule__InboundEndpointDef__Group__13__Impl rule__InboundEndpointDef__Group__14 ;
    public final void rule__InboundEndpointDef__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( rule__InboundEndpointDef__Group__13__Impl rule__InboundEndpointDef__Group__14 )
            // InternalMyDsl.g:2752:2: rule__InboundEndpointDef__Group__13__Impl rule__InboundEndpointDef__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__InboundEndpointDef__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__14();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__13"


    // $ANTLR start "rule__InboundEndpointDef__Group__13__Impl"
    // InternalMyDsl.g:2759:1: rule__InboundEndpointDef__Group__13__Impl : ( '(' ) ;
    public final void rule__InboundEndpointDef__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( '(' ) )
            // InternalMyDsl.g:2764:1: ( '(' )
            {
            // InternalMyDsl.g:2764:1: ( '(' )
            // InternalMyDsl.g:2765:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_13()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_13()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__13__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__14"
    // InternalMyDsl.g:2774:1: rule__InboundEndpointDef__Group__14 : rule__InboundEndpointDef__Group__14__Impl rule__InboundEndpointDef__Group__15 ;
    public final void rule__InboundEndpointDef__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( rule__InboundEndpointDef__Group__14__Impl rule__InboundEndpointDef__Group__15 )
            // InternalMyDsl.g:2779:2: rule__InboundEndpointDef__Group__14__Impl rule__InboundEndpointDef__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__InboundEndpointDef__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__15();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__14"


    // $ANTLR start "rule__InboundEndpointDef__Group__14__Impl"
    // InternalMyDsl.g:2786:1: rule__InboundEndpointDef__Group__14__Impl : ( ( rule__InboundEndpointDef__ContextAssignment_14 ) ) ;
    public final void rule__InboundEndpointDef__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( ( ( rule__InboundEndpointDef__ContextAssignment_14 ) ) )
            // InternalMyDsl.g:2791:1: ( ( rule__InboundEndpointDef__ContextAssignment_14 ) )
            {
            // InternalMyDsl.g:2791:1: ( ( rule__InboundEndpointDef__ContextAssignment_14 ) )
            // InternalMyDsl.g:2792:2: ( rule__InboundEndpointDef__ContextAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getContextAssignment_14()); 
            }
            // InternalMyDsl.g:2793:2: ( rule__InboundEndpointDef__ContextAssignment_14 )
            // InternalMyDsl.g:2793:3: rule__InboundEndpointDef__ContextAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__ContextAssignment_14();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getContextAssignment_14()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__14__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__15"
    // InternalMyDsl.g:2801:1: rule__InboundEndpointDef__Group__15 : rule__InboundEndpointDef__Group__15__Impl rule__InboundEndpointDef__Group__16 ;
    public final void rule__InboundEndpointDef__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2805:1: ( rule__InboundEndpointDef__Group__15__Impl rule__InboundEndpointDef__Group__16 )
            // InternalMyDsl.g:2806:2: rule__InboundEndpointDef__Group__15__Impl rule__InboundEndpointDef__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__InboundEndpointDef__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__16();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__15"


    // $ANTLR start "rule__InboundEndpointDef__Group__15__Impl"
    // InternalMyDsl.g:2813:1: rule__InboundEndpointDef__Group__15__Impl : ( ')' ) ;
    public final void rule__InboundEndpointDef__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( ')' ) )
            // InternalMyDsl.g:2818:1: ( ')' )
            {
            // InternalMyDsl.g:2818:1: ( ')' )
            // InternalMyDsl.g:2819:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_15()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_15()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__15__Impl"


    // $ANTLR start "rule__InboundEndpointDef__Group__16"
    // InternalMyDsl.g:2828:1: rule__InboundEndpointDef__Group__16 : rule__InboundEndpointDef__Group__16__Impl ;
    public final void rule__InboundEndpointDef__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( rule__InboundEndpointDef__Group__16__Impl )
            // InternalMyDsl.g:2833:2: rule__InboundEndpointDef__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InboundEndpointDef__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__InboundEndpointDef__Group__16"


    // $ANTLR start "rule__InboundEndpointDef__Group__16__Impl"
    // InternalMyDsl.g:2839:1: rule__InboundEndpointDef__Group__16__Impl : ( ')' ) ;
    public final void rule__InboundEndpointDef__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2843:1: ( ( ')' ) )
            // InternalMyDsl.g:2844:1: ( ')' )
            {
            // InternalMyDsl.g:2844:1: ( ')' )
            // InternalMyDsl.g:2845:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_16()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_16()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__Group__16__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup"
    // InternalMyDsl.g:2855:1: rule__Model__UnorderedGroup : ( rule__Model__UnorderedGroup__0 )? ;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( rule__Model__UnorderedGroup__0 )? )
            // InternalMyDsl.g:2861:2: ( rule__Model__UnorderedGroup__0 )?
            {
            // InternalMyDsl.g:2861:2: ( rule__Model__UnorderedGroup__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( ( LA13_0 == RULE_ID || LA13_0 >= 15 && LA13_0 <= 21 || LA13_0 == 26 || LA13_0 == 29 || LA13_0 >= 34 && LA13_0 <= 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2861:2: rule__Model__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UnorderedGroup__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup"


    // $ANTLR start "rule__Model__UnorderedGroup__Impl"
    // InternalMyDsl.g:2869:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyDsl.g:2874:1: ( ( ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) ) ) )
            // InternalMyDsl.g:2875:3: ( ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) ) )
            {
            // InternalMyDsl.g:2875:3: ( ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt16=1;
            }
            else if ( ( LA16_0 == RULE_ID || LA16_0 >= 15 && LA16_0 <= 21 || LA16_0 == 26 || LA16_0 == 29 || LA16_0 >= 34 && LA16_0 <= 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2876:3: ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) )
                    {
                    // InternalMyDsl.g:2876:3: ({...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) ) )
                    // InternalMyDsl.g:2877:4: {...}? => ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyDsl.g:2877:99: ( ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) ) )
                    // InternalMyDsl.g:2878:5: ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // InternalMyDsl.g:2884:5: ( ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* ) )
                    // InternalMyDsl.g:2885:6: ( ( rule__Model__ParticipantsAssignment_0 ) ) ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* )
                    {
                    // InternalMyDsl.g:2885:6: ( ( rule__Model__ParticipantsAssignment_0 ) )
                    // InternalMyDsl.g:2886:7: ( rule__Model__ParticipantsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getParticipantsAssignment_0()); 
                    }
                    // InternalMyDsl.g:2887:7: ( rule__Model__ParticipantsAssignment_0 )
                    // InternalMyDsl.g:2887:8: rule__Model__ParticipantsAssignment_0
                    {
                    pushFollow(FOLLOW_26);
                    rule__Model__ParticipantsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getParticipantsAssignment_0()); 
                    }

                    }

                    // InternalMyDsl.g:2890:6: ( ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )* )
                    // InternalMyDsl.g:2891:7: ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getParticipantsAssignment_0()); 
                    }
                    // InternalMyDsl.g:2892:7: ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )*
                    loop14:
                    do {
                        int alt14=2;
                        alt14 = dfa14.predict(input);
                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:2892:8: ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_26);
                    	    rule__Model__ParticipantsAssignment_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getParticipantsAssignment_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2898:3: ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) )
                    {
                    // InternalMyDsl.g:2898:3: ({...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) ) )
                    // InternalMyDsl.g:2899:4: {...}? => ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyDsl.g:2899:99: ( ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) ) )
                    // InternalMyDsl.g:2900:5: ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // InternalMyDsl.g:2906:5: ( ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* ) )
                    // InternalMyDsl.g:2907:6: ( ( rule__Model__StatementsAssignment_1 ) ) ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* )
                    {
                    // InternalMyDsl.g:2907:6: ( ( rule__Model__StatementsAssignment_1 ) )
                    // InternalMyDsl.g:2908:7: ( rule__Model__StatementsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
                    }
                    // InternalMyDsl.g:2909:7: ( rule__Model__StatementsAssignment_1 )
                    // InternalMyDsl.g:2909:8: rule__Model__StatementsAssignment_1
                    {
                    pushFollow(FOLLOW_10);
                    rule__Model__StatementsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
                    }

                    }

                    // InternalMyDsl.g:2912:6: ( ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )* )
                    // InternalMyDsl.g:2913:7: ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
                    }
                    // InternalMyDsl.g:2914:7: ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )*
                    loop15:
                    do {
                        int alt15=2;
                        alt15 = dfa15.predict(input);
                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:2914:8: ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_10);
                    	    rule__Model__StatementsAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getStatementsAssignment_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup__0"
    // InternalMyDsl.g:2928:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // InternalMyDsl.g:2933:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_27);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMyDsl.g:2934:2: ( rule__Model__UnorderedGroup__1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt17=1;
            }
            else if ( ( LA17_0 == RULE_ID || LA17_0 >= 15 && LA17_0 <= 21 || LA17_0 == 26 || LA17_0 == 29 || LA17_0 >= 34 && LA17_0 <= 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2934:2: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Model__UnorderedGroup__0"


    // $ANTLR start "rule__Model__UnorderedGroup__1"
    // InternalMyDsl.g:2940:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( rule__Model__UnorderedGroup__Impl )
            // InternalMyDsl.g:2945:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__UnorderedGroup__1"


    // $ANTLR start "rule__Model__ParticipantsAssignment_0"
    // InternalMyDsl.g:2952:1: rule__Model__ParticipantsAssignment_0 : ( ruleParticipantStatement ) ;
    public final void rule__Model__ParticipantsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( ( ruleParticipantStatement ) )
            // InternalMyDsl.g:2957:2: ( ruleParticipantStatement )
            {
            // InternalMyDsl.g:2957:2: ( ruleParticipantStatement )
            // InternalMyDsl.g:2958:3: ruleParticipantStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getParticipantsParticipantStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParticipantStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getParticipantsParticipantStatementParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Model__ParticipantsAssignment_0"


    // $ANTLR start "rule__Model__StatementsAssignment_1"
    // InternalMyDsl.g:2967:1: rule__Model__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2972:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2972:2: ( ruleStatement )
            // InternalMyDsl.g:2973:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Model__StatementsAssignment_1"


    // $ANTLR start "rule__MediatorStatement__MediatorStatementAssignment_0"
    // InternalMyDsl.g:2982:1: rule__MediatorStatement__MediatorStatementAssignment_0 : ( ruleMediatorType ) ;
    public final void rule__MediatorStatement__MediatorStatementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( ruleMediatorType ) )
            // InternalMyDsl.g:2987:2: ( ruleMediatorType )
            {
            // InternalMyDsl.g:2987:2: ( ruleMediatorType )
            // InternalMyDsl.g:2988:3: ruleMediatorType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getMediatorStatementMediatorTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMediatorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getMediatorStatementMediatorTypeEnumRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__MediatorStatementAssignment_0"


    // $ANTLR start "rule__MediatorStatement__ConfigAssignment_2"
    // InternalMyDsl.g:2997:1: rule__MediatorStatement__ConfigAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MediatorStatement__ConfigAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3002:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3002:2: ( RULE_STRING )
            // InternalMyDsl.g:3003:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMediatorStatementAccess().getConfigSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMediatorStatementAccess().getConfigSTRINGTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__MediatorStatement__ConfigAssignment_2"


    // $ANTLR start "rule__RoutingStatement__SourceAssignment_0"
    // InternalMyDsl.g:3012:1: rule__RoutingStatement__SourceAssignment_0 : ( RULE_ID ) ;
    public final void rule__RoutingStatement__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3017:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3017:2: ( RULE_ID )
            // InternalMyDsl.g:3018:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getSourceIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getSourceIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__SourceAssignment_0"


    // $ANTLR start "rule__RoutingStatement__TargetAssignment_2"
    // InternalMyDsl.g:3027:1: rule__RoutingStatement__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__RoutingStatement__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3032:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3032:2: ( RULE_ID )
            // InternalMyDsl.g:3033:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getTargetIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getTargetIDTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__TargetAssignment_2"


    // $ANTLR start "rule__RoutingStatement__ActionAssignment_4"
    // InternalMyDsl.g:3042:1: rule__RoutingStatement__ActionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RoutingStatement__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3047:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3047:2: ( RULE_STRING )
            // InternalMyDsl.g:3048:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRoutingStatementAccess().getActionSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRoutingStatementAccess().getActionSTRINGTerminalRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__RoutingStatement__ActionAssignment_4"


    // $ANTLR start "rule__ParallelStatement__ParstatementsAssignment_1"
    // InternalMyDsl.g:3057:1: rule__ParallelStatement__ParstatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__ParallelStatement__ParstatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:3062:2: ( ruleStatement )
            {
            // InternalMyDsl.g:3062:2: ( ruleStatement )
            // InternalMyDsl.g:3063:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getParstatementsStatementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getParstatementsStatementParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__ParstatementsAssignment_1"


    // $ANTLR start "rule__ParallelStatement__ElsestatementsAssignment_2_1"
    // InternalMyDsl.g:3072:1: rule__ParallelStatement__ElsestatementsAssignment_2_1 : ( ruleStatement ) ;
    public final void rule__ParallelStatement__ElsestatementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:3077:2: ( ruleStatement )
            {
            // InternalMyDsl.g:3077:2: ( ruleStatement )
            // InternalMyDsl.g:3078:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelStatementAccess().getElsestatementsStatementParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelStatementAccess().getElsestatementsStatementParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__ParallelStatement__ElsestatementsAssignment_2_1"


    // $ANTLR start "rule__IfStatement__RouteIdAssignment_5"
    // InternalMyDsl.g:3087:1: rule__IfStatement__RouteIdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__IfStatement__RouteIdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3092:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3092:2: ( RULE_STRING )
            // InternalMyDsl.g:3093:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getRouteIdSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getRouteIdSTRINGTerminalRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__RouteIdAssignment_5"


    // $ANTLR start "rule__IfStatement__TransportAssignment_7"
    // InternalMyDsl.g:3102:1: rule__IfStatement__TransportAssignment_7 : ( RULE_STRING ) ;
    public final void rule__IfStatement__TransportAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3107:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3107:2: ( RULE_STRING )
            // InternalMyDsl.g:3108:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getTransportSTRINGTerminalRuleCall_7_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getTransportSTRINGTerminalRuleCall_7_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__TransportAssignment_7"


    // $ANTLR start "rule__IfStatement__PatternAssignment_12"
    // InternalMyDsl.g:3117:1: rule__IfStatement__PatternAssignment_12 : ( RULE_STRING ) ;
    public final void rule__IfStatement__PatternAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3122:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3122:2: ( RULE_STRING )
            // InternalMyDsl.g:3123:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getPatternSTRINGTerminalRuleCall_12_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getPatternSTRINGTerminalRuleCall_12_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__PatternAssignment_12"


    // $ANTLR start "rule__IfStatement__AltstatementsAssignment_15"
    // InternalMyDsl.g:3132:1: rule__IfStatement__AltstatementsAssignment_15 : ( ruleStatement ) ;
    public final void rule__IfStatement__AltstatementsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3136:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:3137:2: ( ruleStatement )
            {
            // InternalMyDsl.g:3137:2: ( ruleStatement )
            // InternalMyDsl.g:3138:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getAltstatementsStatementParserRuleCall_15_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getAltstatementsStatementParserRuleCall_15_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__AltstatementsAssignment_15"


    // $ANTLR start "rule__IfStatement__ElsestatementsAssignment_16_1"
    // InternalMyDsl.g:3147:1: rule__IfStatement__ElsestatementsAssignment_16_1 : ( ruleStatement ) ;
    public final void rule__IfStatement__ElsestatementsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:3152:2: ( ruleStatement )
            {
            // InternalMyDsl.g:3152:2: ( ruleStatement )
            // InternalMyDsl.g:3153:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfStatementAccess().getElsestatementsStatementParserRuleCall_16_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfStatementAccess().getElsestatementsStatementParserRuleCall_16_1_0()); 
            }

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
    // $ANTLR end "rule__IfStatement__ElsestatementsAssignment_16_1"


    // $ANTLR start "rule__LoopStatement__NameAssignment_1"
    // InternalMyDsl.g:3162:1: rule__LoopStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LoopStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3167:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3167:2: ( RULE_ID )
            // InternalMyDsl.g:3168:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__LoopStatement__NameAssignment_1"


    // $ANTLR start "rule__GroupStatement__NameAssignment_1"
    // InternalMyDsl.g:3177:1: rule__GroupStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GroupStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3182:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3182:2: ( RULE_ID )
            // InternalMyDsl.g:3183:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__GroupStatement__NameAssignment_1"


    // $ANTLR start "rule__RefStatement__NameAssignment_1"
    // InternalMyDsl.g:3192:1: rule__RefStatement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RefStatement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3197:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3197:2: ( RULE_ID )
            // InternalMyDsl.g:3198:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__RefStatement__NameAssignment_1"


    // $ANTLR start "rule__ParticipantStatement__NameAssignment_0_1"
    // InternalMyDsl.g:3207:1: rule__ParticipantStatement__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ParticipantStatement__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3212:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3212:2: ( RULE_ID )
            // InternalMyDsl.g:3213:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__NameAssignment_0_1"


    // $ANTLR start "rule__ParticipantStatement__ParticipantTypeAssignment_0_3"
    // InternalMyDsl.g:3222:1: rule__ParticipantStatement__ParticipantTypeAssignment_0_3 : ( ruleParticipantType ) ;
    public final void rule__ParticipantStatement__ParticipantTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( ( ruleParticipantType ) )
            // InternalMyDsl.g:3227:2: ( ruleParticipantType )
            {
            // InternalMyDsl.g:3227:2: ( ruleParticipantType )
            // InternalMyDsl.g:3228:3: ruleParticipantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getParticipantTypeParticipantTypeEnumRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParticipantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getParticipantTypeParticipantTypeEnumRuleCall_0_3_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__ParticipantTypeAssignment_0_3"


    // $ANTLR start "rule__ParticipantStatement__DescriptionAssignment_0_5"
    // InternalMyDsl.g:3237:1: rule__ParticipantStatement__DescriptionAssignment_0_5 : ( RULE_STRING ) ;
    public final void rule__ParticipantStatement__DescriptionAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3242:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3242:2: ( RULE_STRING )
            // InternalMyDsl.g:3243:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getDescriptionSTRINGTerminalRuleCall_0_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getDescriptionSTRINGTerminalRuleCall_0_5_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__DescriptionAssignment_0_5"


    // $ANTLR start "rule__ParticipantStatement__NameAssignment_1_1"
    // InternalMyDsl.g:3252:1: rule__ParticipantStatement__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ParticipantStatement__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3257:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3257:2: ( RULE_ID )
            // InternalMyDsl.g:3258:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__NameAssignment_1_1"


    // $ANTLR start "rule__ParticipantStatement__OutboundsAssignment_1_3"
    // InternalMyDsl.g:3267:1: rule__ParticipantStatement__OutboundsAssignment_1_3 : ( ruleOutboundEndpointDef ) ;
    public final void rule__ParticipantStatement__OutboundsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( ( ruleOutboundEndpointDef ) )
            // InternalMyDsl.g:3272:2: ( ruleOutboundEndpointDef )
            {
            // InternalMyDsl.g:3272:2: ( ruleOutboundEndpointDef )
            // InternalMyDsl.g:3273:3: ruleOutboundEndpointDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getOutboundsOutboundEndpointDefParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOutboundEndpointDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getOutboundsOutboundEndpointDefParserRuleCall_1_3_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__OutboundsAssignment_1_3"


    // $ANTLR start "rule__ParticipantStatement__NameAssignment_2_1"
    // InternalMyDsl.g:3282:1: rule__ParticipantStatement__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__ParticipantStatement__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3286:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3287:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3287:2: ( RULE_ID )
            // InternalMyDsl.g:3288:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_2_1_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__NameAssignment_2_1"


    // $ANTLR start "rule__ParticipantStatement__InboundsAssignment_2_3"
    // InternalMyDsl.g:3297:1: rule__ParticipantStatement__InboundsAssignment_2_3 : ( ruleInboundEndpointDef ) ;
    public final void rule__ParticipantStatement__InboundsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( ruleInboundEndpointDef ) )
            // InternalMyDsl.g:3302:2: ( ruleInboundEndpointDef )
            {
            // InternalMyDsl.g:3302:2: ( ruleInboundEndpointDef )
            // InternalMyDsl.g:3303:3: ruleInboundEndpointDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantStatementAccess().getInboundsInboundEndpointDefParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInboundEndpointDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantStatementAccess().getInboundsInboundEndpointDefParserRuleCall_2_3_0()); 
            }

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
    // $ANTLR end "rule__ParticipantStatement__InboundsAssignment_2_3"


    // $ANTLR start "rule__OutboundEndpointDef__ProtocolAssignment_4"
    // InternalMyDsl.g:3312:1: rule__OutboundEndpointDef__ProtocolAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OutboundEndpointDef__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3317:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3317:2: ( RULE_STRING )
            // InternalMyDsl.g:3318:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__ProtocolAssignment_4"


    // $ANTLR start "rule__OutboundEndpointDef__HostAssignment_9"
    // InternalMyDsl.g:3327:1: rule__OutboundEndpointDef__HostAssignment_9 : ( RULE_STRING ) ;
    public final void rule__OutboundEndpointDef__HostAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3332:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3332:2: ( RULE_STRING )
            // InternalMyDsl.g:3333:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutboundEndpointDefAccess().getHostSTRINGTerminalRuleCall_9_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutboundEndpointDefAccess().getHostSTRINGTerminalRuleCall_9_0()); 
            }

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
    // $ANTLR end "rule__OutboundEndpointDef__HostAssignment_9"


    // $ANTLR start "rule__InboundEndpointDef__ProtocolAssignment_4"
    // InternalMyDsl.g:3342:1: rule__InboundEndpointDef__ProtocolAssignment_4 : ( RULE_STRING ) ;
    public final void rule__InboundEndpointDef__ProtocolAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3347:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3347:2: ( RULE_STRING )
            // InternalMyDsl.g:3348:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__ProtocolAssignment_4"


    // $ANTLR start "rule__InboundEndpointDef__PortAssignment_9"
    // InternalMyDsl.g:3357:1: rule__InboundEndpointDef__PortAssignment_9 : ( RULE_INT ) ;
    public final void rule__InboundEndpointDef__PortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3362:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3362:2: ( RULE_INT )
            // InternalMyDsl.g:3363:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getPortINTTerminalRuleCall_9_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getPortINTTerminalRuleCall_9_0()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__PortAssignment_9"


    // $ANTLR start "rule__InboundEndpointDef__ContextAssignment_14"
    // InternalMyDsl.g:3372:1: rule__InboundEndpointDef__ContextAssignment_14 : ( RULE_STRING ) ;
    public final void rule__InboundEndpointDef__ContextAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3376:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3377:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3377:2: ( RULE_STRING )
            // InternalMyDsl.g:3378:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInboundEndpointDefAccess().getContextSTRINGTerminalRuleCall_14_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInboundEndpointDefAccess().getContextSTRINGTerminalRuleCall_14_0()); 
            }

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
    // $ANTLR end "rule__InboundEndpointDef__ContextAssignment_14"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2892:8: ( rule__Model__ParticipantsAssignment_0 )
        // InternalMyDsl.g:2892:9: rule__Model__ParticipantsAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__Model__ParticipantsAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2914:8: ( rule__Model__StatementsAssignment_1 )
        // InternalMyDsl.g:2914:9: rule__Model__StatementsAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__Model__StatementsAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\45\1\5\1\31\1\13\1\26\1\uffff\1\26\2\4\2\uffff";
    static final String dfa_3s = "\1\45\1\5\1\31\1\16\1\26\1\uffff\1\26\2\46\2\uffff";
    static final String dfa_4s = "\5\uffff\1\1\3\uffff\1\2\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\5\1\6\1\4\1\5",
            "\1\7",
            "",
            "\1\10",
            "\1\5\21\uffff\1\11\17\uffff\1\11",
            "\1\5\21\uffff\1\12\17\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "435:1: rule__ParticipantStatement__Alternatives : ( ( ( rule__ParticipantStatement__Group_0__0 ) ) | ( ( rule__ParticipantStatement__Group_1__0 ) ) | ( ( rule__ParticipantStatement__Group_2__0 ) ) );";
        }
    }
    static final String dfa_7s = "\52\uffff";
    static final String dfa_8s = "\1\2\51\uffff";
    static final String dfa_9s = "\2\5\1\uffff\1\31\1\13\4\26\3\4\1\27\4\26\1\0\2\4\1\uffff\2\27\2\40\1\50\1\47\2\26\1\6\1\4\2\27\1\40\1\27\1\51\1\0\1\26\1\4\2\27\1\0";
    static final String dfa_10s = "\1\45\1\5\1\uffff\1\31\1\16\4\26\1\46\1\4\1\46\1\27\1\46\1\26\1\46\1\26\1\0\2\4\1\uffff\2\27\2\40\1\50\1\47\2\26\1\6\1\4\2\27\1\40\1\27\1\51\1\0\1\26\1\4\2\27\1\0";
    static final String dfa_11s = "\2\uffff\1\2\21\uffff\1\1\25\uffff";
    static final String dfa_12s = "\21\uffff\1\2\22\uffff\1\1\4\uffff\1\0}>";
    static final String[] dfa_13s = {
            "\1\2\11\uffff\7\2\4\uffff\1\2\2\uffff\1\2\4\uffff\3\2\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\6\1\5\1\7\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\12",
            "\1\14\21\uffff\1\15\17\uffff\1\16",
            "\1\14",
            "\1\14\21\uffff\1\17\17\uffff\1\20",
            "\1\21",
            "\1\15\17\uffff\1\16",
            "\1\22",
            "\1\17\17\uffff\1\20",
            "\1\23",
            "\1\uffff",
            "\1\25",
            "\1\26",
            "",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\uffff",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\uffff"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 2892:7: ( ( rule__Model__ParticipantsAssignment_0 )=> rule__Model__ParticipantsAssignment_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_41 = input.LA(1);

                         
                        int index14_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_41);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_36 = input.LA(1);

                         
                        int index14_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_36);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_17 = input.LA(1);

                         
                        int index14_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index14_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\21\uffff";
    static final String dfa_15s = "\1\1\20\uffff";
    static final String dfa_16s = "\1\5\1\uffff\15\0\2\uffff";
    static final String dfa_17s = "\1\45\1\uffff\15\0\2\uffff";
    static final String dfa_18s = "\1\uffff\1\2\16\uffff\1\1";
    static final String dfa_19s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff}>";
    static final String[] dfa_20s = {
            "\1\11\11\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\4\uffff\1\12\2\uffff\1\13\4\uffff\1\14\1\15\1\16\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 2914:7: ( ( rule__Model__StatementsAssignment_1 )=> rule__Model__StatementsAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001C3C3F8020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001C243F8022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001C243F8020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003C243F8022L});

}
