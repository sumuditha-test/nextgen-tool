package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'->'", "':'", "'par'", "'else'", "'end'", "'alt'", "'condition'", "'source'", "','", "'pattern'", "'loop'", "'group'", "'ref'", "'participant'", "'OutboundEndpoint'", "'protocol'", "'host'", "'InboundEndpoint'", "'port'", "'context'", "'IntegrationFlow'", "'Pipeline'", "'log'", "'call'", "'respond'", "'filter'", "'transform'", "'enrich'", "'external'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_participants_1_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) ) ) )
            // InternalMyDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) ) )
            {
            // InternalMyDsl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) ) )
            // InternalMyDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) )
            {
            // InternalMyDsl.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* ) )
            // InternalMyDsl.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )* )
            // InternalMyDsl.g:85:5: ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )*
            {
            // InternalMyDsl.g:85:5: ( ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( ( LA3_0 == RULE_ID || LA3_0 == 15 || LA3_0 == 18 || LA3_0 >= 23 && LA3_0 <= 25 || LA3_0 >= 35 && LA3_0 <= 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:86:3: ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:86:3: ({...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ ) )
            	    // InternalMyDsl.g:87:4: {...}? => ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:87:99: ( ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+ )
            	    // InternalMyDsl.g:88:5: ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:91:8: ({...}? => ( (lv_participants_1_0= ruleParticipantStatement ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==26) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:91:9: {...}? => ( (lv_participants_1_0= ruleParticipantStatement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalMyDsl.g:91:18: ( (lv_participants_1_0= ruleParticipantStatement ) )
            	    	    // InternalMyDsl.g:91:19: (lv_participants_1_0= ruleParticipantStatement )
            	    	    {
            	    	    // InternalMyDsl.g:91:19: (lv_participants_1_0= ruleParticipantStatement )
            	    	    // InternalMyDsl.g:92:9: lv_participants_1_0= ruleParticipantStatement
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getParticipantsParticipantStatementParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_participants_1_0=ruleParticipantStatement();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"participants",
            	    	    										lv_participants_1_0,
            	    	    										"org.xtext.example.mydsl.MyDsl.ParticipantStatement");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:114:3: ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:114:3: ({...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ ) )
            	    // InternalMyDsl.g:115:4: {...}? => ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:115:99: ( ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+ )
            	    // InternalMyDsl.g:116:5: ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:119:8: ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        alt2 = dfa2.predict(input);
            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:119:9: {...}? => ( (lv_statements_2_0= ruleStatement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalMyDsl.g:119:18: ( (lv_statements_2_0= ruleStatement ) )
            	    	    // InternalMyDsl.g:119:19: (lv_statements_2_0= ruleStatement )
            	    	    {
            	    	    // InternalMyDsl.g:119:19: (lv_statements_2_0= ruleStatement )
            	    	    // InternalMyDsl.g:120:9: lv_statements_2_0= ruleStatement
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_statements_2_0=ruleStatement();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"statements",
            	    	    										lv_statements_2_0,
            	    	    										"org.xtext.example.mydsl.MyDsl.Statement");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:152:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:152:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:153:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:159:1: ruleStatement returns [EObject current=null] : (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MediatorStatement_0 = null;

        EObject this_RoutingStatement_1 = null;

        EObject this_ParallelStatement_2 = null;

        EObject this_IfStatement_3 = null;

        EObject this_LoopStatement_4 = null;

        EObject this_GroupStatement_5 = null;

        EObject this_RefStatement_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:165:2: ( (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement ) )
            // InternalMyDsl.g:166:2: (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            {
            // InternalMyDsl.g:166:2: (this_MediatorStatement_0= ruleMediatorStatement | this_RoutingStatement_1= ruleRoutingStatement | this_ParallelStatement_2= ruleParallelStatement | this_IfStatement_3= ruleIfStatement | this_LoopStatement_4= ruleLoopStatement | this_GroupStatement_5= ruleGroupStatement | this_RefStatement_6= ruleRefStatement )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:167:3: this_MediatorStatement_0= ruleMediatorStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMediatorStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MediatorStatement_0=ruleMediatorStatement();

                    state._fsp--;


                    			current = this_MediatorStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:176:3: this_RoutingStatement_1= ruleRoutingStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRoutingStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RoutingStatement_1=ruleRoutingStatement();

                    state._fsp--;


                    			current = this_RoutingStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:185:3: this_ParallelStatement_2= ruleParallelStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getParallelStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParallelStatement_2=ruleParallelStatement();

                    state._fsp--;


                    			current = this_ParallelStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:194:3: this_IfStatement_3= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_3=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:203:3: this_LoopStatement_4= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_4=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:212:3: this_GroupStatement_5= ruleGroupStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGroupStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupStatement_5=ruleGroupStatement();

                    state._fsp--;


                    			current = this_GroupStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:221:3: this_RefStatement_6= ruleRefStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRefStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefStatement_6=ruleRefStatement();

                    state._fsp--;


                    			current = this_RefStatement_6;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleMediatorStatement"
    // InternalMyDsl.g:233:1: entryRuleMediatorStatement returns [EObject current=null] : iv_ruleMediatorStatement= ruleMediatorStatement EOF ;
    public final EObject entryRuleMediatorStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediatorStatement = null;


        try {
            // InternalMyDsl.g:233:58: (iv_ruleMediatorStatement= ruleMediatorStatement EOF )
            // InternalMyDsl.g:234:2: iv_ruleMediatorStatement= ruleMediatorStatement EOF
            {
             newCompositeNode(grammarAccess.getMediatorStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediatorStatement=ruleMediatorStatement();

            state._fsp--;

             current =iv_ruleMediatorStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMediatorStatement"


    // $ANTLR start "ruleMediatorStatement"
    // InternalMyDsl.g:240:1: ruleMediatorStatement returns [EObject current=null] : ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleMediatorStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_config_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_mediatorStatement_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:246:2: ( ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:247:2: ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:247:2: ( ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMyDsl.g:248:3: ( (lv_mediatorStatement_0_0= ruleMediatorType ) ) otherlv_1= '(' ( (lv_config_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:248:3: ( (lv_mediatorStatement_0_0= ruleMediatorType ) )
            // InternalMyDsl.g:249:4: (lv_mediatorStatement_0_0= ruleMediatorType )
            {
            // InternalMyDsl.g:249:4: (lv_mediatorStatement_0_0= ruleMediatorType )
            // InternalMyDsl.g:250:5: lv_mediatorStatement_0_0= ruleMediatorType
            {

            					newCompositeNode(grammarAccess.getMediatorStatementAccess().getMediatorStatementMediatorTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_mediatorStatement_0_0=ruleMediatorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMediatorStatementRule());
            					}
            					set(
            						current,
            						"mediatorStatement",
            						lv_mediatorStatement_0_0,
            						"org.xtext.example.mydsl.MyDsl.MediatorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMediatorStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:271:3: ( (lv_config_2_0= RULE_STRING ) )
            // InternalMyDsl.g:272:4: (lv_config_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:272:4: (lv_config_2_0= RULE_STRING )
            // InternalMyDsl.g:273:5: lv_config_2_0= RULE_STRING
            {
            lv_config_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_config_2_0, grammarAccess.getMediatorStatementAccess().getConfigSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMediatorStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"config",
            						lv_config_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMediatorStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMediatorStatement"


    // $ANTLR start "entryRuleRoutingStatement"
    // InternalMyDsl.g:297:1: entryRuleRoutingStatement returns [EObject current=null] : iv_ruleRoutingStatement= ruleRoutingStatement EOF ;
    public final EObject entryRuleRoutingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoutingStatement = null;


        try {
            // InternalMyDsl.g:297:57: (iv_ruleRoutingStatement= ruleRoutingStatement EOF )
            // InternalMyDsl.g:298:2: iv_ruleRoutingStatement= ruleRoutingStatement EOF
            {
             newCompositeNode(grammarAccess.getRoutingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoutingStatement=ruleRoutingStatement();

            state._fsp--;

             current =iv_ruleRoutingStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoutingStatement"


    // $ANTLR start "ruleRoutingStatement"
    // InternalMyDsl.g:304:1: ruleRoutingStatement returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRoutingStatement() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_action_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:310:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:311:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:311:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:312:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_action_4_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:312:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalMyDsl.g:313:4: (lv_source_0_0= RULE_ID )
            {
            // InternalMyDsl.g:313:4: (lv_source_0_0= RULE_ID )
            // InternalMyDsl.g:314:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_source_0_0, grammarAccess.getRoutingStatementAccess().getSourceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRoutingStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyDsl.g:334:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalMyDsl.g:335:4: (lv_target_2_0= RULE_ID )
            {
            // InternalMyDsl.g:335:4: (lv_target_2_0= RULE_ID )
            // InternalMyDsl.g:336:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_target_2_0, grammarAccess.getRoutingStatementAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRoutingStatementAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:356:3: ( (lv_action_4_0= RULE_STRING ) )
            // InternalMyDsl.g:357:4: (lv_action_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:357:4: (lv_action_4_0= RULE_STRING )
            // InternalMyDsl.g:358:5: lv_action_4_0= RULE_STRING
            {
            lv_action_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_action_4_0, grammarAccess.getRoutingStatementAccess().getActionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoutingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleRoutingStatement"


    // $ANTLR start "entryRuleParallelStatement"
    // InternalMyDsl.g:378:1: entryRuleParallelStatement returns [EObject current=null] : iv_ruleParallelStatement= ruleParallelStatement EOF ;
    public final EObject entryRuleParallelStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelStatement = null;


        try {
            // InternalMyDsl.g:378:58: (iv_ruleParallelStatement= ruleParallelStatement EOF )
            // InternalMyDsl.g:379:2: iv_ruleParallelStatement= ruleParallelStatement EOF
            {
             newCompositeNode(grammarAccess.getParallelStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelStatement=ruleParallelStatement();

            state._fsp--;

             current =iv_ruleParallelStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParallelStatement"


    // $ANTLR start "ruleParallelStatement"
    // InternalMyDsl.g:385:1: ruleParallelStatement returns [EObject current=null] : (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) ;
    public final EObject ruleParallelStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parstatements_1_0 = null;

        EObject lv_elsestatements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' ) )
            // InternalMyDsl.g:392:2: (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            {
            // InternalMyDsl.g:392:2: (otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end' )
            // InternalMyDsl.g:393:3: otherlv_0= 'par' ( (lv_parstatements_1_0= ruleStatement ) )* (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelStatementAccess().getParKeyword_0());
            		
            // InternalMyDsl.g:397:3: ( (lv_parstatements_1_0= ruleStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==15||LA5_0==18||(LA5_0>=23 && LA5_0<=25)||(LA5_0>=35 && LA5_0<=41)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:398:4: (lv_parstatements_1_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:398:4: (lv_parstatements_1_0= ruleStatement )
            	    // InternalMyDsl.g:399:5: lv_parstatements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getParallelStatementAccess().getParstatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_parstatements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parstatements",
            	    						lv_parstatements_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:416:3: (otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:417:4: otherlv_2= 'else' ( (lv_elsestatements_3_0= ruleStatement ) )*
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParallelStatementAccess().getElseKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:421:4: ( (lv_elsestatements_3_0= ruleStatement ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ID||LA6_0==15||LA6_0==18||(LA6_0>=23 && LA6_0<=25)||(LA6_0>=35 && LA6_0<=41)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:422:5: (lv_elsestatements_3_0= ruleStatement )
            	    	    {
            	    	    // InternalMyDsl.g:422:5: (lv_elsestatements_3_0= ruleStatement )
            	    	    // InternalMyDsl.g:423:6: lv_elsestatements_3_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getParallelStatementAccess().getElsestatementsStatementParserRuleCall_2_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_elsestatements_3_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getParallelStatementRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"elsestatements",
            	    	    							lv_elsestatements_3_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParallelStatementAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleParallelStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalMyDsl.g:449:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalMyDsl.g:449:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalMyDsl.g:450:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalMyDsl.g:456:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_routeId_5_0=null;
        Token otherlv_6=null;
        Token lv_transport_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_pattern_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_altstatements_15_0 = null;

        EObject lv_elsestatements_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' ) )
            // InternalMyDsl.g:463:2: (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' )
            {
            // InternalMyDsl.g:463:2: (otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end' )
            // InternalMyDsl.g:464:3: otherlv_0= 'alt' otherlv_1= 'condition' otherlv_2= '(' otherlv_3= 'source' otherlv_4= '(' ( (lv_routeId_5_0= RULE_STRING ) ) otherlv_6= ',' ( (lv_transport_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'pattern' otherlv_11= '(' ( (lv_pattern_12_0= RULE_STRING ) ) otherlv_13= ')' otherlv_14= ')' ( (lv_altstatements_15_0= ruleStatement ) )* (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )* otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getAltKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getSourceKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:484:3: ( (lv_routeId_5_0= RULE_STRING ) )
            // InternalMyDsl.g:485:4: (lv_routeId_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:485:4: (lv_routeId_5_0= RULE_STRING )
            // InternalMyDsl.g:486:5: lv_routeId_5_0= RULE_STRING
            {
            lv_routeId_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_routeId_5_0, grammarAccess.getIfStatementAccess().getRouteIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"routeId",
            						lv_routeId_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getCommaKeyword_6());
            		
            // InternalMyDsl.g:506:3: ( (lv_transport_7_0= RULE_STRING ) )
            // InternalMyDsl.g:507:4: (lv_transport_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:507:4: (lv_transport_7_0= RULE_STRING )
            // InternalMyDsl.g:508:5: lv_transport_7_0= RULE_STRING
            {
            lv_transport_7_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_transport_7_0, grammarAccess.getIfStatementAccess().getTransportSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"transport",
            						lv_transport_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getIfStatementAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getPatternKeyword_10());
            		
            otherlv_11=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_11());
            		
            // InternalMyDsl.g:540:3: ( (lv_pattern_12_0= RULE_STRING ) )
            // InternalMyDsl.g:541:4: (lv_pattern_12_0= RULE_STRING )
            {
            // InternalMyDsl.g:541:4: (lv_pattern_12_0= RULE_STRING )
            // InternalMyDsl.g:542:5: lv_pattern_12_0= RULE_STRING
            {
            lv_pattern_12_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_pattern_12_0, grammarAccess.getIfStatementAccess().getPatternSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pattern",
            						lv_pattern_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_14());
            		
            // InternalMyDsl.g:566:3: ( (lv_altstatements_15_0= ruleStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==15||LA8_0==18||(LA8_0>=23 && LA8_0<=25)||(LA8_0>=35 && LA8_0<=41)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:567:4: (lv_altstatements_15_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:567:4: (lv_altstatements_15_0= ruleStatement )
            	    // InternalMyDsl.g:568:5: lv_altstatements_15_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementAccess().getAltstatementsStatementParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_altstatements_15_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"altstatements",
            	    						lv_altstatements_15_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:585:3: (otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )* )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:586:4: otherlv_16= 'else' ( (lv_elsestatements_17_0= ruleStatement ) )*
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_16, grammarAccess.getIfStatementAccess().getElseKeyword_16_0());
            	    			
            	    // InternalMyDsl.g:590:4: ( (lv_elsestatements_17_0= ruleStatement ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID||LA9_0==15||LA9_0==18||(LA9_0>=23 && LA9_0<=25)||(LA9_0>=35 && LA9_0<=41)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:591:5: (lv_elsestatements_17_0= ruleStatement )
            	    	    {
            	    	    // InternalMyDsl.g:591:5: (lv_elsestatements_17_0= ruleStatement )
            	    	    // InternalMyDsl.g:592:6: lv_elsestatements_17_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElsestatementsStatementParserRuleCall_16_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_elsestatements_17_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"elsestatements",
            	    	    							lv_elsestatements_17_0,
            	    	    							"org.xtext.example.mydsl.MyDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getIfStatementAccess().getEndKeyword_17());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalMyDsl.g:618:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalMyDsl.g:618:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalMyDsl.g:619:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalMyDsl.g:625:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:631:2: ( (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:632:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:632:2: (otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:633:3: otherlv_0= 'loop' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getLoopKeyword_0());
            		
            // InternalMyDsl.g:637:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:638:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:638:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:639:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoopStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleGroupStatement"
    // InternalMyDsl.g:659:1: entryRuleGroupStatement returns [EObject current=null] : iv_ruleGroupStatement= ruleGroupStatement EOF ;
    public final EObject entryRuleGroupStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupStatement = null;


        try {
            // InternalMyDsl.g:659:55: (iv_ruleGroupStatement= ruleGroupStatement EOF )
            // InternalMyDsl.g:660:2: iv_ruleGroupStatement= ruleGroupStatement EOF
            {
             newCompositeNode(grammarAccess.getGroupStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupStatement=ruleGroupStatement();

            state._fsp--;

             current =iv_ruleGroupStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGroupStatement"


    // $ANTLR start "ruleGroupStatement"
    // InternalMyDsl.g:666:1: ruleGroupStatement returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGroupStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:672:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:673:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:673:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:674:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupStatementAccess().getGroupKeyword_0());
            		
            // InternalMyDsl.g:678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:679:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:680:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleGroupStatement"


    // $ANTLR start "entryRuleRefStatement"
    // InternalMyDsl.g:700:1: entryRuleRefStatement returns [EObject current=null] : iv_ruleRefStatement= ruleRefStatement EOF ;
    public final EObject entryRuleRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefStatement = null;


        try {
            // InternalMyDsl.g:700:53: (iv_ruleRefStatement= ruleRefStatement EOF )
            // InternalMyDsl.g:701:2: iv_ruleRefStatement= ruleRefStatement EOF
            {
             newCompositeNode(grammarAccess.getRefStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefStatement=ruleRefStatement();

            state._fsp--;

             current =iv_ruleRefStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefStatement"


    // $ANTLR start "ruleRefStatement"
    // InternalMyDsl.g:707:1: ruleRefStatement returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:714:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:714:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:715:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRefStatementAccess().getRefKeyword_0());
            		
            // InternalMyDsl.g:719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:720:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:721:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRefStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleRefStatement"


    // $ANTLR start "entryRuleParticipantStatement"
    // InternalMyDsl.g:741:1: entryRuleParticipantStatement returns [EObject current=null] : iv_ruleParticipantStatement= ruleParticipantStatement EOF ;
    public final EObject entryRuleParticipantStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantStatement = null;


        try {
            // InternalMyDsl.g:741:61: (iv_ruleParticipantStatement= ruleParticipantStatement EOF )
            // InternalMyDsl.g:742:2: iv_ruleParticipantStatement= ruleParticipantStatement EOF
            {
             newCompositeNode(grammarAccess.getParticipantStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantStatement=ruleParticipantStatement();

            state._fsp--;

             current =iv_ruleParticipantStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParticipantStatement"


    // $ANTLR start "ruleParticipantStatement"
    // InternalMyDsl.g:748:1: ruleParticipantStatement returns [EObject current=null] : ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) ) ;
    public final EObject ruleParticipantStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Enumerator lv_participantType_3_0 = null;

        EObject lv_outbounds_10_0 = null;

        EObject lv_inbounds_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:754:2: ( ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) ) )
            // InternalMyDsl.g:755:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )
            {
            // InternalMyDsl.g:755:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:756:3: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    {
                    // InternalMyDsl.g:756:3: (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' )
                    // InternalMyDsl.g:757:4: otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_0_0());
                    			
                    // InternalMyDsl.g:761:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:762:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:762:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:763:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getParticipantStatementAccess().getColonKeyword_0_2());
                    			
                    // InternalMyDsl.g:783:4: ( (lv_participantType_3_0= ruleParticipantType ) )
                    // InternalMyDsl.g:784:5: (lv_participantType_3_0= ruleParticipantType )
                    {
                    // InternalMyDsl.g:784:5: (lv_participantType_3_0= ruleParticipantType )
                    // InternalMyDsl.g:785:6: lv_participantType_3_0= ruleParticipantType
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getParticipantTypeParticipantTypeEnumRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_participantType_3_0=ruleParticipantType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"participantType",
                    							lv_participantType_3_0,
                    							"org.xtext.example.mydsl.MyDsl.ParticipantType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getParticipantStatementAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalMyDsl.g:806:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalMyDsl.g:807:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:807:5: (lv_description_5_0= RULE_STRING )
                    // InternalMyDsl.g:808:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getParticipantStatementAccess().getDescriptionSTRINGTerminalRuleCall_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getParticipantStatementAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:830:3: (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) )
                    {
                    // InternalMyDsl.g:830:3: (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) )
                    // InternalMyDsl.g:831:4: otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_1_0());
                    			
                    // InternalMyDsl.g:835:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalMyDsl.g:836:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalMyDsl.g:836:5: (lv_name_8_0= RULE_ID )
                    // InternalMyDsl.g:837:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getParticipantStatementAccess().getColonKeyword_1_2());
                    			
                    // InternalMyDsl.g:857:4: ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) )
                    // InternalMyDsl.g:858:5: (lv_outbounds_10_0= ruleOutboundEndpointDef )
                    {
                    // InternalMyDsl.g:858:5: (lv_outbounds_10_0= ruleOutboundEndpointDef )
                    // InternalMyDsl.g:859:6: lv_outbounds_10_0= ruleOutboundEndpointDef
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getOutboundsOutboundEndpointDefParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outbounds_10_0=ruleOutboundEndpointDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"outbounds",
                    							lv_outbounds_10_0,
                    							"org.xtext.example.mydsl.MyDsl.OutboundEndpointDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:878:3: (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) )
                    {
                    // InternalMyDsl.g:878:3: (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) )
                    // InternalMyDsl.g:879:4: otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) )
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getParticipantStatementAccess().getParticipantKeyword_2_0());
                    			
                    // InternalMyDsl.g:883:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalMyDsl.g:884:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalMyDsl.g:884:5: (lv_name_12_0= RULE_ID )
                    // InternalMyDsl.g:885:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_12_0, grammarAccess.getParticipantStatementAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParticipantStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getParticipantStatementAccess().getColonKeyword_2_2());
                    			
                    // InternalMyDsl.g:905:4: ( (lv_inbounds_14_0= ruleInboundEndpointDef ) )
                    // InternalMyDsl.g:906:5: (lv_inbounds_14_0= ruleInboundEndpointDef )
                    {
                    // InternalMyDsl.g:906:5: (lv_inbounds_14_0= ruleInboundEndpointDef )
                    // InternalMyDsl.g:907:6: lv_inbounds_14_0= ruleInboundEndpointDef
                    {

                    						newCompositeNode(grammarAccess.getParticipantStatementAccess().getInboundsInboundEndpointDefParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inbounds_14_0=ruleInboundEndpointDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParticipantStatementRule());
                    						}
                    						set(
                    							current,
                    							"inbounds",
                    							lv_inbounds_14_0,
                    							"org.xtext.example.mydsl.MyDsl.InboundEndpointDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleParticipantStatement"


    // $ANTLR start "entryRuleOutboundEndpointDef"
    // InternalMyDsl.g:929:1: entryRuleOutboundEndpointDef returns [EObject current=null] : iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF ;
    public final EObject entryRuleOutboundEndpointDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutboundEndpointDef = null;


        try {
            // InternalMyDsl.g:929:60: (iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF )
            // InternalMyDsl.g:930:2: iv_ruleOutboundEndpointDef= ruleOutboundEndpointDef EOF
            {
             newCompositeNode(grammarAccess.getOutboundEndpointDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutboundEndpointDef=ruleOutboundEndpointDef();

            state._fsp--;

             current =iv_ruleOutboundEndpointDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOutboundEndpointDef"


    // $ANTLR start "ruleOutboundEndpointDef"
    // InternalMyDsl.g:936:1: ruleOutboundEndpointDef returns [EObject current=null] : (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' ) ;
    public final EObject ruleOutboundEndpointDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_protocol_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_host_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:942:2: ( (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' ) )
            // InternalMyDsl.g:943:2: (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' )
            {
            // InternalMyDsl.g:943:2: (otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')' )
            // InternalMyDsl.g:944:3: otherlv_0= 'OutboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'host' otherlv_8= '(' ( (lv_host_9_0= RULE_STRING ) ) otherlv_10= ')' otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutboundEndpointDefAccess().getOutboundEndpointKeyword_0());
            		
            // InternalMyDsl.g:948:3: (otherlv_1= '(' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:949:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOutboundEndpointDefAccess().getProtocolKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:962:3: ( (lv_protocol_4_0= RULE_STRING ) )
            // InternalMyDsl.g:963:4: (lv_protocol_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:963:4: (lv_protocol_4_0= RULE_STRING )
            // InternalMyDsl.g:964:5: lv_protocol_4_0= RULE_STRING
            {
            lv_protocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_protocol_4_0, grammarAccess.getOutboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getOutboundEndpointDefAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getOutboundEndpointDefAccess().getHostKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getOutboundEndpointDefAccess().getLeftParenthesisKeyword_8());
            		
            // InternalMyDsl.g:996:3: ( (lv_host_9_0= RULE_STRING ) )
            // InternalMyDsl.g:997:4: (lv_host_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:997:4: (lv_host_9_0= RULE_STRING )
            // InternalMyDsl.g:998:5: lv_host_9_0= RULE_STRING
            {
            lv_host_9_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_host_9_0, grammarAccess.getOutboundEndpointDefAccess().getHostSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getOutboundEndpointDefAccess().getRightParenthesisKeyword_11());
            		

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
    // $ANTLR end "ruleOutboundEndpointDef"


    // $ANTLR start "entryRuleInboundEndpointDef"
    // InternalMyDsl.g:1026:1: entryRuleInboundEndpointDef returns [EObject current=null] : iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF ;
    public final EObject entryRuleInboundEndpointDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInboundEndpointDef = null;


        try {
            // InternalMyDsl.g:1026:59: (iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF )
            // InternalMyDsl.g:1027:2: iv_ruleInboundEndpointDef= ruleInboundEndpointDef EOF
            {
             newCompositeNode(grammarAccess.getInboundEndpointDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInboundEndpointDef=ruleInboundEndpointDef();

            state._fsp--;

             current =iv_ruleInboundEndpointDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInboundEndpointDef"


    // $ANTLR start "ruleInboundEndpointDef"
    // InternalMyDsl.g:1033:1: ruleInboundEndpointDef returns [EObject current=null] : (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' ) ;
    public final EObject ruleInboundEndpointDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_protocol_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_port_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_context_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1039:2: ( (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' ) )
            // InternalMyDsl.g:1040:2: (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' )
            {
            // InternalMyDsl.g:1040:2: (otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')' )
            // InternalMyDsl.g:1041:3: otherlv_0= 'InboundEndpoint' (otherlv_1= '(' )+ otherlv_2= 'protocol' otherlv_3= '(' ( (lv_protocol_4_0= RULE_STRING ) ) otherlv_5= ')' otherlv_6= ',' otherlv_7= 'port' otherlv_8= '(' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ',' otherlv_12= 'context' otherlv_13= '(' ( (lv_context_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInboundEndpointDefAccess().getInboundEndpointKeyword_0());
            		
            // InternalMyDsl.g:1045:3: (otherlv_1= '(' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1046:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_18); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getInboundEndpointDefAccess().getProtocolKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:1059:3: ( (lv_protocol_4_0= RULE_STRING ) )
            // InternalMyDsl.g:1060:4: (lv_protocol_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:1060:4: (lv_protocol_4_0= RULE_STRING )
            // InternalMyDsl.g:1061:5: lv_protocol_4_0= RULE_STRING
            {
            lv_protocol_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_protocol_4_0, grammarAccess.getInboundEndpointDefAccess().getProtocolSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"protocol",
            						lv_protocol_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getInboundEndpointDefAccess().getPortKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_8());
            		
            // InternalMyDsl.g:1093:3: ( (lv_port_9_0= RULE_INT ) )
            // InternalMyDsl.g:1094:4: (lv_port_9_0= RULE_INT )
            {
            // InternalMyDsl.g:1094:4: (lv_port_9_0= RULE_INT )
            // InternalMyDsl.g:1095:5: lv_port_9_0= RULE_INT
            {
            lv_port_9_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_port_9_0, grammarAccess.getInboundEndpointDefAccess().getPortINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_11, grammarAccess.getInboundEndpointDefAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getInboundEndpointDefAccess().getContextKeyword_12());
            		
            otherlv_13=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getInboundEndpointDefAccess().getLeftParenthesisKeyword_13());
            		
            // InternalMyDsl.g:1127:3: ( (lv_context_14_0= RULE_STRING ) )
            // InternalMyDsl.g:1128:4: (lv_context_14_0= RULE_STRING )
            {
            // InternalMyDsl.g:1128:4: (lv_context_14_0= RULE_STRING )
            // InternalMyDsl.g:1129:5: lv_context_14_0= RULE_STRING
            {
            lv_context_14_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_context_14_0, grammarAccess.getInboundEndpointDefAccess().getContextSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInboundEndpointDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"context",
            						lv_context_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInboundEndpointDefAccess().getRightParenthesisKeyword_16());
            		

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
    // $ANTLR end "ruleInboundEndpointDef"


    // $ANTLR start "ruleParticipantType"
    // InternalMyDsl.g:1157:1: ruleParticipantType returns [Enumerator current=null] : ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) ;
    public final Enumerator ruleParticipantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1163:2: ( ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) ) )
            // InternalMyDsl.g:1164:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            {
            // InternalMyDsl.g:1164:2: ( (enumLiteral_0= 'IntegrationFlow' ) | (enumLiteral_1= 'InboundEndpoint' ) | (enumLiteral_2= 'OutboundEndpoint' ) | (enumLiteral_3= 'Pipeline' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            case 34:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1165:3: (enumLiteral_0= 'IntegrationFlow' )
                    {
                    // InternalMyDsl.g:1165:3: (enumLiteral_0= 'IntegrationFlow' )
                    // InternalMyDsl.g:1166:4: enumLiteral_0= 'IntegrationFlow'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParticipantTypeAccess().getINTEGRATIONFLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1173:3: (enumLiteral_1= 'InboundEndpoint' )
                    {
                    // InternalMyDsl.g:1173:3: (enumLiteral_1= 'InboundEndpoint' )
                    // InternalMyDsl.g:1174:4: enumLiteral_1= 'InboundEndpoint'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParticipantTypeAccess().getINBOUNDENDPOINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1181:3: (enumLiteral_2= 'OutboundEndpoint' )
                    {
                    // InternalMyDsl.g:1181:3: (enumLiteral_2= 'OutboundEndpoint' )
                    // InternalMyDsl.g:1182:4: enumLiteral_2= 'OutboundEndpoint'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParticipantTypeAccess().getOUTBOUNDENDPOINTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1189:3: (enumLiteral_3= 'Pipeline' )
                    {
                    // InternalMyDsl.g:1189:3: (enumLiteral_3= 'Pipeline' )
                    // InternalMyDsl.g:1190:4: enumLiteral_3= 'Pipeline'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getParticipantTypeAccess().getPIPELINEEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleParticipantType"


    // $ANTLR start "ruleMediatorType"
    // InternalMyDsl.g:1200:1: ruleMediatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) ) ;
    public final Enumerator ruleMediatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1206:2: ( ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) ) )
            // InternalMyDsl.g:1207:2: ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) )
            {
            // InternalMyDsl.g:1207:2: ( (enumLiteral_0= 'log' ) | (enumLiteral_1= 'call' ) | (enumLiteral_2= 'respond' ) | (enumLiteral_3= 'filter' ) | (enumLiteral_4= 'transform' ) | (enumLiteral_5= 'enrich' ) | (enumLiteral_6= 'external' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 37:
                {
                alt15=3;
                }
                break;
            case 38:
                {
                alt15=4;
                }
                break;
            case 39:
                {
                alt15=5;
                }
                break;
            case 40:
                {
                alt15=6;
                }
                break;
            case 41:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1208:3: (enumLiteral_0= 'log' )
                    {
                    // InternalMyDsl.g:1208:3: (enumLiteral_0= 'log' )
                    // InternalMyDsl.g:1209:4: enumLiteral_0= 'log'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMediatorTypeAccess().getLOGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1216:3: (enumLiteral_1= 'call' )
                    {
                    // InternalMyDsl.g:1216:3: (enumLiteral_1= 'call' )
                    // InternalMyDsl.g:1217:4: enumLiteral_1= 'call'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMediatorTypeAccess().getCALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1224:3: (enumLiteral_2= 'respond' )
                    {
                    // InternalMyDsl.g:1224:3: (enumLiteral_2= 'respond' )
                    // InternalMyDsl.g:1225:4: enumLiteral_2= 'respond'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMediatorTypeAccess().getRESPONDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1232:3: (enumLiteral_3= 'filter' )
                    {
                    // InternalMyDsl.g:1232:3: (enumLiteral_3= 'filter' )
                    // InternalMyDsl.g:1233:4: enumLiteral_3= 'filter'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMediatorTypeAccess().getFILTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1240:3: (enumLiteral_4= 'transform' )
                    {
                    // InternalMyDsl.g:1240:3: (enumLiteral_4= 'transform' )
                    // InternalMyDsl.g:1241:4: enumLiteral_4= 'transform'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMediatorTypeAccess().getTRANSFORMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1248:3: (enumLiteral_5= 'enrich' )
                    {
                    // InternalMyDsl.g:1248:3: (enumLiteral_5= 'enrich' )
                    // InternalMyDsl.g:1249:4: enumLiteral_5= 'enrich'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMediatorTypeAccess().getENRICHEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1256:3: (enumLiteral_6= 'external' )
                    {
                    // InternalMyDsl.g:1256:3: (enumLiteral_6= 'external' )
                    // InternalMyDsl.g:1257:4: enumLiteral_6= 'external'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMediatorTypeAccess().getEXTERNALEnumLiteralDeclaration_6());
                    			

                    }


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
    // $ANTLR end "ruleMediatorType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\1\20\uffff";
    static final String dfa_3s = "\1\5\2\uffff\15\0\1\uffff";
    static final String dfa_4s = "\1\51\2\uffff\15\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\16\uffff\1\1";
    static final String dfa_6s = "\3\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\12\11\uffff\1\13\2\uffff\1\14\4\uffff\1\15\1\16\1\17\1\1\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 119:8: ({...}? => ( (lv_statements_2_0= ruleStatement ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_10 = input.LA(1);

                         
                        int index2_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\32\1\5\1\16\1\33\1\uffff\2\13\2\4\2\uffff";
    static final String dfa_10s = "\1\32\1\5\1\16\1\42\1\uffff\2\13\2\34\2\uffff";
    static final String dfa_11s = "\4\uffff\1\1\4\uffff\1\3\1\2";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\6\2\uffff\1\5\2\uffff\2\4",
            "",
            "\1\7",
            "\1\10",
            "\1\4\6\uffff\1\11\20\uffff\1\11",
            "\1\4\6\uffff\1\12\20\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "755:2: ( (otherlv_0= 'participant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_participantType_3_0= ruleParticipantType ) ) otherlv_4= '(' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ')' ) | (otherlv_7= 'participant' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ':' ( (lv_outbounds_10_0= ruleOutboundEndpointDef ) ) ) | (otherlv_11= 'participant' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ':' ( (lv_inbounds_14_0= ruleInboundEndpointDef ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000003F807848022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003F807878020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000648000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});

}
