// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g 2010-01-28 15:16:11
package uk.ac.bham.cs.zas.pddl.antlr;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

/**
 * PDDL grammar for ANTLR v3
 * Zeyn Saigol
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: Pddl.g 33 2007-02-23 15:45:34Z zas $
 */
public class PddlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOMAIN", "DOMAIN_NAME", "REQUIREMENTS", "TYPES", "EITHER_TYPE", "CONSTANTS", "FUNCTIONS", "PREDICATES", "ACTION", "DURATIVE_ACTION", "PROBLEM", "PROBLEM_NAME", "PROBLEM_DOMAIN", "OBJECTS", "INIT", "FUNC_HEAD", "PRECONDITION", "EFFECT", "AND_GD", "OR_GD", "NOT_GD", "IMPLY_GD", "EXISTS_GD", "FORALL_GD", "COMPARISON_GD", "AND_EFFECT", "FORALL_EFFECT", "WHEN_EFFECT", "ASSIGN_EFFECT", "NOT_EFFECT", "PRED_HEAD", "GOAL", "BINARY_OP", "UNARY_MINUS", "INIT_EQ", "INIT_AT", "NOT_PRED_INIT", "PRED_INST", "PROBLEM_CONSTRAINT", "PROBLEM_METRIC", "NAME", "REQUIRE_KEY", "VARIABLE", "NUMBER", "LETTER", "ANY_CHAR", "DIGIT", "LINE_COMMENT", "WHITESPACE", "'('", "'define'", "')'", "'domain'", "':requirements'", "':types'", "'-'", "'either'", "':functions'", "'number'", "':constants'", "':predicates'", "':constraints'", "':action'", "':parameters'", "':precondition'", "':effect'", "'and'", "'or'", "'not'", "'imply'", "'exists'", "'forall'", "':durative-action'", "':duration'", "':condition'", "'preference'", "'at'", "'over'", "'start'", "'end'", "'all'", "':derived'", "'when'", "'*'", "'+'", "'/'", "'>'", "'<'", "'='", "'>='", "'<='", "'assign'", "'scale-up'", "'scale-down'", "'increase'", "'decrease'", "'?duration'", "'problem'", "':domain'", "':objects'", "':init'", "':goal'", "':metric'", "'minimize'", "'maximize'", "'total-time'", "'is-violated'", "'always'", "'sometime'", "'within'", "'at-most-once'", "'sometime-after'", "'sometime-before'", "'always-within'", "'hold-during'", "'hold-after'"
    };
    public static final int REQUIRE_KEY=45;
    public static final int FUNCTIONS=10;
    public static final int LETTER=48;
    public static final int PRED_INST=41;
    public static final int TYPES=7;
    public static final int EXISTS_GD=26;
    public static final int EOF=-1;
    public static final int COMPARISON_GD=28;
    public static final int ACTION=12;
    public static final int T__93=93;
    public static final int ANY_CHAR=49;
    public static final int T__94=94;
    public static final int NOT_EFFECT=33;
    public static final int T__91=91;
    public static final int NAME=44;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int PROBLEM_DOMAIN=16;
    public static final int OBJECTS=17;
    public static final int ASSIGN_EFFECT=32;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LINE_COMMENT=51;
    public static final int PROBLEM=14;
    public static final int NUMBER=47;
    public static final int WHITESPACE=52;
    public static final int UNARY_MINUS=37;
    public static final int OR_GD=23;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int DOMAIN_NAME=5;
    public static final int PRED_HEAD=34;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int PREDICATES=11;
    public static final int VARIABLE=46;
    public static final int T__70=70;
    public static final int INIT_AT=39;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int INIT=18;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int AND_GD=22;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int FUNC_HEAD=19;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int PROBLEM_NAME=15;
    public static final int NOT_GD=24;
    public static final int T__118=118;
    public static final int DURATIVE_ACTION=13;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int PROBLEM_METRIC=43;
    public static final int CONSTANTS=9;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IMPLY_GD=25;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int INIT_EQ=38;
    public static final int DIGIT=50;
    public static final int NOT_PRED_INIT=40;
    public static final int BINARY_OP=36;
    public static final int GOAL=35;
    public static final int FORALL_GD=27;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int DOMAIN=4;
    public static final int WHEN_EFFECT=31;
    public static final int PRECONDITION=20;
    public static final int EFFECT=21;
    public static final int PROBLEM_CONSTRAINT=42;
    public static final int AND_EFFECT=29;
    public static final int EITHER_TYPE=8;
    public static final int FORALL_EFFECT=30;
    public static final int REQUIREMENTS=6;

    // delegates
    // delegators


        public PddlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PddlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PddlParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g"; }


    private boolean wasError = false;
    public void reportError(RecognitionException e) {
    	wasError = true;
    	super.reportError(e);
    }
    public boolean invalidGrammar() {
    	return wasError;
    }


    public static class pddlDoc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pddlDoc"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:85:1: pddlDoc : ( domain | problem );
    public final PddlParser.pddlDoc_return pddlDoc() throws RecognitionException {
        PddlParser.pddlDoc_return retval = new PddlParser.pddlDoc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.domain_return domain1 = null;

        PddlParser.problem_return problem2 = null;



        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:87:9: ( domain | problem )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==53) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==54) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==53) ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3==101) ) {
                            alt1=2;
                        }
                        else if ( (LA1_3==56) ) {
                            alt1=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:87:11: domain
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_domain_in_pddlDoc305);
                    domain1=domain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, domain1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:87:20: problem
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_problem_in_pddlDoc309);
                    problem2=problem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, problem2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pddlDoc"

    public static class domain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:89:1: domain : '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) ;
    public final PddlParser.domain_return domain() throws RecognitionException {
        PddlParser.domain_return retval = new PddlParser.domain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token string_literal4=null;
        Token char_literal13=null;
        PddlParser.domainName_return domainName5 = null;

        PddlParser.requireDef_return requireDef6 = null;

        PddlParser.typesDef_return typesDef7 = null;

        PddlParser.constantsDef_return constantsDef8 = null;

        PddlParser.predicatesDef_return predicatesDef9 = null;

        PddlParser.functionsDef_return functionsDef10 = null;

        PddlParser.constraints_return constraints11 = null;

        PddlParser.structureDef_return structureDef12 = null;


        Object char_literal3_tree=null;
        Object string_literal4_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_constantsDef=new RewriteRuleSubtreeStream(adaptor,"rule constantsDef");
        RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
        RewriteRuleSubtreeStream stream_predicatesDef=new RewriteRuleSubtreeStream(adaptor,"rule predicatesDef");
        RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
        RewriteRuleSubtreeStream stream_structureDef=new RewriteRuleSubtreeStream(adaptor,"rule structureDef");
        RewriteRuleSubtreeStream stream_domainName=new RewriteRuleSubtreeStream(adaptor,"rule domainName");
        RewriteRuleSubtreeStream stream_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule functionsDef");
        RewriteRuleSubtreeStream stream_typesDef=new RewriteRuleSubtreeStream(adaptor,"rule typesDef");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:92:5: ( '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:92:7: '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')'
            {
            char_literal3=(Token)match(input,53,FOLLOW_53_in_domain324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal3);

            string_literal4=(Token)match(input,54,FOLLOW_54_in_domain326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(string_literal4);

            pushFollow(FOLLOW_domainName_in_domain328);
            domainName5=domainName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_domainName.add(domainName5.getTree());
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:93:7: ( requireDef )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==53) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==57) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: requireDef
                    {
                    pushFollow(FOLLOW_requireDef_in_domain336);
                    requireDef6=requireDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_requireDef.add(requireDef6.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:94:7: ( typesDef )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==53) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==58) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: typesDef
                    {
                    pushFollow(FOLLOW_typesDef_in_domain345);
                    typesDef7=typesDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typesDef.add(typesDef7.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:95:7: ( constantsDef )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==63) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: constantsDef
                    {
                    pushFollow(FOLLOW_constantsDef_in_domain354);
                    constantsDef8=constantsDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constantsDef.add(constantsDef8.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:96:7: ( predicatesDef )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==64) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: predicatesDef
                    {
                    pushFollow(FOLLOW_predicatesDef_in_domain363);
                    predicatesDef9=predicatesDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_predicatesDef.add(predicatesDef9.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:97:7: ( functionsDef )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==53) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==61) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: functionsDef
                    {
                    pushFollow(FOLLOW_functionsDef_in_domain372);
                    functionsDef10=functionsDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionsDef.add(functionsDef10.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:98:7: ( constraints )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==53) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==65) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: constraints
                    {
                    pushFollow(FOLLOW_constraints_in_domain381);
                    constraints11=constraints();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constraints.add(constraints11.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:99:7: ( structureDef )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==53) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: structureDef
            	    {
            	    pushFollow(FOLLOW_structureDef_in_domain390);
            	    structureDef12=structureDef();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_structureDef.add(structureDef12.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal13=(Token)match(input,55,FOLLOW_55_in_domain399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal13);



            // AST REWRITE
            // elements: constraints, predicatesDef, constantsDef, typesDef, domainName, functionsDef, structureDef, requireDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 101:7: -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:101:10: ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN, "DOMAIN"), root_1);

                adaptor.addChild(root_1, stream_domainName.nextTree());
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:101:30: ( requireDef )?
                if ( stream_requireDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_requireDef.nextTree());

                }
                stream_requireDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:101:42: ( typesDef )?
                if ( stream_typesDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_typesDef.nextTree());

                }
                stream_typesDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:102:17: ( constantsDef )?
                if ( stream_constantsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_constantsDef.nextTree());

                }
                stream_constantsDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:102:31: ( predicatesDef )?
                if ( stream_predicatesDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_predicatesDef.nextTree());

                }
                stream_predicatesDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:102:46: ( functionsDef )?
                if ( stream_functionsDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionsDef.nextTree());

                }
                stream_functionsDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:103:17: ( constraints )?
                if ( stream_constraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraints.nextTree());

                }
                stream_constraints.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:103:30: ( structureDef )*
                while ( stream_structureDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_structureDef.nextTree());

                }
                stream_structureDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "domain"

    public static class domainName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domainName"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:106:1: domainName : '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) ;
    public final PddlParser.domainName_return domainName() throws RecognitionException {
        PddlParser.domainName_return retval = new PddlParser.domainName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token string_literal15=null;
        Token NAME16=null;
        Token char_literal17=null;

        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object NAME16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:107:5: ( '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:107:7: '(' 'domain' NAME ')'
            {
            char_literal14=(Token)match(input,53,FOLLOW_53_in_domainName483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal14);

            string_literal15=(Token)match(input,56,FOLLOW_56_in_domainName485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal15);

            NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_domainName487); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME16);

            char_literal17=(Token)match(input,55,FOLLOW_55_in_domainName489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal17);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:6: -> ^( DOMAIN_NAME NAME )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:108:9: ^( DOMAIN_NAME NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN_NAME, "DOMAIN_NAME"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "domainName"

    public static class requireDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requireDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:111:1: requireDef : '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) ;
    public final PddlParser.requireDef_return requireDef() throws RecognitionException {
        PddlParser.requireDef_return retval = new PddlParser.requireDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal18=null;
        Token string_literal19=null;
        Token REQUIRE_KEY20=null;
        Token char_literal21=null;

        Object char_literal18_tree=null;
        Object string_literal19_tree=null;
        Object REQUIRE_KEY20_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_REQUIRE_KEY=new RewriteRuleTokenStream(adaptor,"token REQUIRE_KEY");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:112:2: ( '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:112:4: '(' ':requirements' ( REQUIRE_KEY )+ ')'
            {
            char_literal18=(Token)match(input,53,FOLLOW_53_in_requireDef516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal18);

            string_literal19=(Token)match(input,57,FOLLOW_57_in_requireDef518); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(string_literal19);

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:112:24: ( REQUIRE_KEY )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==REQUIRE_KEY) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: REQUIRE_KEY
            	    {
            	    REQUIRE_KEY20=(Token)match(input,REQUIRE_KEY,FOLLOW_REQUIRE_KEY_in_requireDef520); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_REQUIRE_KEY.add(REQUIRE_KEY20);


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            char_literal21=(Token)match(input,55,FOLLOW_55_in_requireDef523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal21);



            // AST REWRITE
            // elements: REQUIRE_KEY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:2: -> ^( REQUIREMENTS ( REQUIRE_KEY )+ )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:113:5: ^( REQUIREMENTS ( REQUIRE_KEY )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREMENTS, "REQUIREMENTS"), root_1);

                if ( !(stream_REQUIRE_KEY.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_REQUIRE_KEY.hasNext() ) {
                    adaptor.addChild(root_1, stream_REQUIRE_KEY.nextNode());

                }
                stream_REQUIRE_KEY.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requireDef"

    public static class typesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typesDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:116:1: typesDef : '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) ;
    public final PddlParser.typesDef_return typesDef() throws RecognitionException {
        PddlParser.typesDef_return retval = new PddlParser.typesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        Token string_literal23=null;
        Token char_literal25=null;
        PddlParser.typedNameList_return typedNameList24 = null;


        Object char_literal22_tree=null;
        Object string_literal23_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:117:2: ( '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:117:4: '(' ':types' typedNameList ')'
            {
            char_literal22=(Token)match(input,53,FOLLOW_53_in_typesDef544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal22);

            string_literal23=(Token)match(input,58,FOLLOW_58_in_typesDef546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(string_literal23);

            pushFollow(FOLLOW_typedNameList_in_typesDef548);
            typedNameList24=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList24.getTree());
            char_literal25=(Token)match(input,55,FOLLOW_55_in_typesDef550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal25);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:4: -> ^( TYPES typedNameList )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:118:7: ^( TYPES typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typesDef"

    public static class typedNameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedNameList"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:121:1: typedNameList : ( ( NAME )* | ( ( NAME )+ '-' t= type typedNameList ) -> ( ^( NAME $t) )+ typedNameList );
    public final PddlParser.typedNameList_return typedNameList() throws RecognitionException {
        PddlParser.typedNameList_return retval = new PddlParser.typedNameList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME26=null;
        Token NAME27=null;
        Token char_literal28=null;
        PddlParser.type_return t = null;

        PddlParser.typedNameList_return typedNameList29 = null;


        Object NAME26_tree=null;
        Object NAME27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:122:2: ( ( NAME )* | ( ( NAME )+ '-' t= type typedNameList ) -> ( ^( NAME $t) )+ typedNameList )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:122:4: ( NAME )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:122:4: ( NAME )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==NAME) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME26=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList572); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME26_tree = (Object)adaptor.create(NAME26);
                    	    adaptor.addChild(root_0, NAME26_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:123:4: ( ( NAME )+ '-' t= type typedNameList )
                    {
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:123:4: ( ( NAME )+ '-' t= type typedNameList )
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:123:5: ( NAME )+ '-' t= type typedNameList
                    {
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:123:5: ( NAME )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==NAME) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME27=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList579); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_NAME.add(NAME27);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    char_literal28=(Token)match(input,59,FOLLOW_59_in_typedNameList582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal28);

                    pushFollow(FOLLOW_type_in_typedNameList586);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(t.getTree());
                    pushFollow(FOLLOW_typedNameList_in_typedNameList588);
                    typedNameList29=typedNameList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList29.getTree());

                    }



                    // AST REWRITE
                    // elements: t, NAME, typedNameList
                    // token labels: 
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:4: -> ( ^( NAME $t) )+ typedNameList
                    {
                        if ( !(stream_t.hasNext()||stream_NAME.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_t.hasNext()||stream_NAME.hasNext() ) {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:124:7: ^( NAME $t)
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(stream_NAME.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_t.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_t.reset();
                        stream_NAME.reset();
                        adaptor.addChild(root_0, stream_typedNameList.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typedNameList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:127:1: type : ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType );
    public final PddlParser.type_return type() throws RecognitionException {
        PddlParser.type_return retval = new PddlParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        Token string_literal31=null;
        Token char_literal33=null;
        PddlParser.primType_return primType32 = null;

        PddlParser.primType_return primType34 = null;


        Object char_literal30_tree=null;
        Object string_literal31_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_primType=new RewriteRuleSubtreeStream(adaptor,"rule primType");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:128:2: ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            else if ( (LA14_0==NAME) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:128:4: ( '(' 'either' ( primType )+ ')' )
                    {
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:128:4: ( '(' 'either' ( primType )+ ')' )
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:128:6: '(' 'either' ( primType )+ ')'
                    {
                    char_literal30=(Token)match(input,53,FOLLOW_53_in_type617); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal30);

                    string_literal31=(Token)match(input,60,FOLLOW_60_in_type619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal31);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:128:19: ( primType )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==NAME) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: primType
                    	    {
                    	    pushFollow(FOLLOW_primType_in_type621);
                    	    primType32=primType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_primType.add(primType32.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    char_literal33=(Token)match(input,55,FOLLOW_55_in_type624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal33);


                    }



                    // AST REWRITE
                    // elements: primType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:4: -> ^( EITHER_TYPE ( primType )+ )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:129:7: ^( EITHER_TYPE ( primType )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EITHER_TYPE, "EITHER_TYPE"), root_1);

                        if ( !(stream_primType.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_primType.hasNext() ) {
                            adaptor.addChild(root_1, stream_primType.nextTree());

                        }
                        stream_primType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:130:4: primType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primType_in_type643);
                    primType34=primType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primType34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class primType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primType"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:133:1: primType : NAME ;
    public final PddlParser.primType_return primType() throws RecognitionException {
        PddlParser.primType_return retval = new PddlParser.primType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME35=null;

        Object NAME35_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:133:10: ( NAME )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:133:12: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME35=(Token)match(input,NAME,FOLLOW_NAME_in_primType653); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME35_tree = (Object)adaptor.create(NAME35);
            adaptor.addChild(root_0, NAME35_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primType"

    public static class functionsDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionsDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:135:1: functionsDef : '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) ;
    public final PddlParser.functionsDef_return functionsDef() throws RecognitionException {
        PddlParser.functionsDef_return retval = new PddlParser.functionsDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal36=null;
        Token string_literal37=null;
        Token char_literal39=null;
        PddlParser.functionList_return functionList38 = null;


        Object char_literal36_tree=null;
        Object string_literal37_tree=null;
        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:136:2: ( '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:136:4: '(' ':functions' functionList ')'
            {
            char_literal36=(Token)match(input,53,FOLLOW_53_in_functionsDef663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal36);

            string_literal37=(Token)match(input,61,FOLLOW_61_in_functionsDef665); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(string_literal37);

            pushFollow(FOLLOW_functionList_in_functionsDef667);
            functionList38=functionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionList.add(functionList38.getTree());
            char_literal39=(Token)match(input,55,FOLLOW_55_in_functionsDef669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal39);



            // AST REWRITE
            // elements: functionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:2: -> ^( FUNCTIONS functionList )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:137:5: ^( FUNCTIONS functionList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);

                adaptor.addChild(root_1, stream_functionList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionsDef"

    public static class functionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionList"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:140:1: functionList : ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* ;
    public final PddlParser.functionList_return functionList() throws RecognitionException {
        PddlParser.functionList_return retval = new PddlParser.functionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal41=null;
        PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton40 = null;

        PddlParser.functionType_return functionType42 = null;


        Object char_literal41_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:2: ( ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )* )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:4: ( ( atomicFunctionSkeleton )+ ( '-' functionType )? )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:5: ( atomicFunctionSkeleton )+ ( '-' functionType )?
            	    {
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:5: ( atomicFunctionSkeleton )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==53) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( (synpred15_Pddl()) ) {
            	                alt15=1;
            	            }


            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: atomicFunctionSkeleton
            	    	    {
            	    	    pushFollow(FOLLOW_atomicFunctionSkeleton_in_functionList690);
            	    	    atomicFunctionSkeleton40=atomicFunctionSkeleton();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicFunctionSkeleton40.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	    	    if (state.backtracking>0) {state.failed=true; return retval;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:29: ( '-' functionType )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==59) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:30: '-' functionType
            	            {
            	            char_literal41=(Token)match(input,59,FOLLOW_59_in_functionList694); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal41_tree = (Object)adaptor.create(char_literal41);
            	            adaptor.addChild(root_0, char_literal41_tree);
            	            }
            	            pushFollow(FOLLOW_functionType_in_functionList696);
            	            functionType42=functionType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionType42.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionList"

    public static class atomicFunctionSkeleton_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicFunctionSkeleton"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:144:1: atomicFunctionSkeleton : '(' functionSymbol typedVariableList ')' ;
    public final PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton() throws RecognitionException {
        PddlParser.atomicFunctionSkeleton_return retval = new PddlParser.atomicFunctionSkeleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal43=null;
        Token char_literal46=null;
        PddlParser.functionSymbol_return functionSymbol44 = null;

        PddlParser.typedVariableList_return typedVariableList45 = null;


        Object char_literal43_tree=null;
        Object char_literal46_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:145:2: ( '(' functionSymbol typedVariableList ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:145:4: '(' functionSymbol typedVariableList ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal43=(Token)match(input,53,FOLLOW_53_in_atomicFunctionSkeleton712); if (state.failed) return retval;
            pushFollow(FOLLOW_functionSymbol_in_atomicFunctionSkeleton715);
            functionSymbol44=functionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(functionSymbol44.getTree(), root_0);
            pushFollow(FOLLOW_typedVariableList_in_atomicFunctionSkeleton718);
            typedVariableList45=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList45.getTree());
            char_literal46=(Token)match(input,55,FOLLOW_55_in_atomicFunctionSkeleton720); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicFunctionSkeleton"

    public static class functionSymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionSymbol"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:148:1: functionSymbol : NAME ;
    public final PddlParser.functionSymbol_return functionSymbol() throws RecognitionException {
        PddlParser.functionSymbol_return retval = new PddlParser.functionSymbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME47=null;

        Object NAME47_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:148:16: ( NAME )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:148:18: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME47=(Token)match(input,NAME,FOLLOW_NAME_in_functionSymbol731); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME47_tree = (Object)adaptor.create(NAME47);
            adaptor.addChild(root_0, NAME47_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionSymbol"

    public static class functionType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionType"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:150:1: functionType : 'number' ;
    public final PddlParser.functionType_return functionType() throws RecognitionException {
        PddlParser.functionType_return retval = new PddlParser.functionType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal48=null;

        Object string_literal48_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:150:14: ( 'number' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:150:16: 'number'
            {
            root_0 = (Object)adaptor.nil();

            string_literal48=(Token)match(input,62,FOLLOW_62_in_functionType740); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal48_tree = (Object)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionType"

    public static class constantsDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantsDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:152:1: constantsDef : '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) ;
    public final PddlParser.constantsDef_return constantsDef() throws RecognitionException {
        PddlParser.constantsDef_return retval = new PddlParser.constantsDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        Token string_literal50=null;
        Token char_literal52=null;
        PddlParser.typedNameList_return typedNameList51 = null;


        Object char_literal49_tree=null;
        Object string_literal50_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:153:2: ( '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:153:4: '(' ':constants' typedNameList ')'
            {
            char_literal49=(Token)match(input,53,FOLLOW_53_in_constantsDef751); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal49);

            string_literal50=(Token)match(input,63,FOLLOW_63_in_constantsDef753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_63.add(string_literal50);

            pushFollow(FOLLOW_typedNameList_in_constantsDef755);
            typedNameList51=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList51.getTree());
            char_literal52=(Token)match(input,55,FOLLOW_55_in_constantsDef757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal52);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 154:2: -> ^( CONSTANTS typedNameList )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:154:5: ^( CONSTANTS typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantsDef"

    public static class predicatesDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicatesDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:157:1: predicatesDef : '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) ;
    public final PddlParser.predicatesDef_return predicatesDef() throws RecognitionException {
        PddlParser.predicatesDef_return retval = new PddlParser.predicatesDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal53=null;
        Token string_literal54=null;
        Token char_literal56=null;
        PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton55 = null;


        Object char_literal53_tree=null;
        Object string_literal54_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_atomicFormulaSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFormulaSkeleton");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:158:2: ( '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:158:4: '(' ':predicates' ( atomicFormulaSkeleton )+ ')'
            {
            char_literal53=(Token)match(input,53,FOLLOW_53_in_predicatesDef777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal53);

            string_literal54=(Token)match(input,64,FOLLOW_64_in_predicatesDef779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(string_literal54);

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:158:22: ( atomicFormulaSkeleton )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: atomicFormulaSkeleton
            	    {
            	    pushFollow(FOLLOW_atomicFormulaSkeleton_in_predicatesDef781);
            	    atomicFormulaSkeleton55=atomicFormulaSkeleton();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_atomicFormulaSkeleton.add(atomicFormulaSkeleton55.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            char_literal56=(Token)match(input,55,FOLLOW_55_in_predicatesDef784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal56);



            // AST REWRITE
            // elements: atomicFormulaSkeleton
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:2: -> ^( PREDICATES ( atomicFormulaSkeleton )+ )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:159:5: ^( PREDICATES ( atomicFormulaSkeleton )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATES, "PREDICATES"), root_1);

                if ( !(stream_atomicFormulaSkeleton.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_atomicFormulaSkeleton.hasNext() ) {
                    adaptor.addChild(root_1, stream_atomicFormulaSkeleton.nextTree());

                }
                stream_atomicFormulaSkeleton.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicatesDef"

    public static class atomicFormulaSkeleton_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicFormulaSkeleton"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:162:1: atomicFormulaSkeleton : '(' predicate typedVariableList ')' ;
    public final PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton() throws RecognitionException {
        PddlParser.atomicFormulaSkeleton_return retval = new PddlParser.atomicFormulaSkeleton_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal57=null;
        Token char_literal60=null;
        PddlParser.predicate_return predicate58 = null;

        PddlParser.typedVariableList_return typedVariableList59 = null;


        Object char_literal57_tree=null;
        Object char_literal60_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:163:2: ( '(' predicate typedVariableList ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:163:4: '(' predicate typedVariableList ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal57=(Token)match(input,53,FOLLOW_53_in_atomicFormulaSkeleton805); if (state.failed) return retval;
            pushFollow(FOLLOW_predicate_in_atomicFormulaSkeleton808);
            predicate58=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(predicate58.getTree(), root_0);
            pushFollow(FOLLOW_typedVariableList_in_atomicFormulaSkeleton811);
            typedVariableList59=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList59.getTree());
            char_literal60=(Token)match(input,55,FOLLOW_55_in_atomicFormulaSkeleton813); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicFormulaSkeleton"

    public static class predicate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predicate"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:166:1: predicate : NAME ;
    public final PddlParser.predicate_return predicate() throws RecognitionException {
        PddlParser.predicate_return retval = new PddlParser.predicate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME61=null;

        Object NAME61_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:166:11: ( NAME )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:166:13: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME61=(Token)match(input,NAME,FOLLOW_NAME_in_predicate824); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME61_tree = (Object)adaptor.create(NAME61);
            adaptor.addChild(root_0, NAME61_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "predicate"

    public static class typedVariableList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedVariableList"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:168:1: typedVariableList : ( ( VARIABLE )* | ( ( VARIABLE )+ '-' t= type typedVariableList ) -> ( ^( VARIABLE $t) )+ typedVariableList );
    public final PddlParser.typedVariableList_return typedVariableList() throws RecognitionException {
        PddlParser.typedVariableList_return retval = new PddlParser.typedVariableList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARIABLE62=null;
        Token VARIABLE63=null;
        Token char_literal64=null;
        PddlParser.type_return t = null;

        PddlParser.typedVariableList_return typedVariableList65 = null;


        Object VARIABLE62_tree=null;
        Object VARIABLE63_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:169:2: ( ( VARIABLE )* | ( ( VARIABLE )+ '-' t= type typedVariableList ) -> ( ^( VARIABLE $t) )+ typedVariableList )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:169:4: ( VARIABLE )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:169:4: ( VARIABLE )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==VARIABLE) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: VARIABLE
                    	    {
                    	    VARIABLE62=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList834); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    VARIABLE62_tree = (Object)adaptor.create(VARIABLE62);
                    	    adaptor.addChild(root_0, VARIABLE62_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:170:4: ( ( VARIABLE )+ '-' t= type typedVariableList )
                    {
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:170:4: ( ( VARIABLE )+ '-' t= type typedVariableList )
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:170:5: ( VARIABLE )+ '-' t= type typedVariableList
                    {
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:170:5: ( VARIABLE )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==VARIABLE) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: VARIABLE
                    	    {
                    	    VARIABLE63=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList841); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE63);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    char_literal64=(Token)match(input,59,FOLLOW_59_in_typedVariableList844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal64);

                    pushFollow(FOLLOW_type_in_typedVariableList848);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(t.getTree());
                    pushFollow(FOLLOW_typedVariableList_in_typedVariableList850);
                    typedVariableList65=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList65.getTree());

                    }



                    // AST REWRITE
                    // elements: t, typedVariableList, VARIABLE
                    // token labels: 
                    // rule labels: retval, t
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:4: -> ( ^( VARIABLE $t) )+ typedVariableList
                    {
                        if ( !(stream_t.hasNext()||stream_VARIABLE.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_t.hasNext()||stream_VARIABLE.hasNext() ) {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:171:7: ^( VARIABLE $t)
                            {
                            Object root_1 = (Object)adaptor.nil();
                            root_1 = (Object)adaptor.becomeRoot(stream_VARIABLE.nextNode(), root_1);

                            adaptor.addChild(root_1, stream_t.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_t.reset();
                        stream_VARIABLE.reset();
                        adaptor.addChild(root_0, stream_typedVariableList.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typedVariableList"

    public static class constraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraints"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:174:1: constraints : '(' ':constraints' conGD ')' ;
    public final PddlParser.constraints_return constraints() throws RecognitionException {
        PddlParser.constraints_return retval = new PddlParser.constraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal69=null;
        PddlParser.conGD_return conGD68 = null;


        Object char_literal66_tree=null;
        Object string_literal67_tree=null;
        Object char_literal69_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:175:2: ( '(' ':constraints' conGD ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:175:4: '(' ':constraints' conGD ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal66=(Token)match(input,53,FOLLOW_53_in_constraints877); if (state.failed) return retval;
            string_literal67=(Token)match(input,65,FOLLOW_65_in_constraints880); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal67_tree = (Object)adaptor.create(string_literal67);
            root_0 = (Object)adaptor.becomeRoot(string_literal67_tree, root_0);
            }
            pushFollow(FOLLOW_conGD_in_constraints883);
            conGD68=conGD();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD68.getTree());
            char_literal69=(Token)match(input,55,FOLLOW_55_in_constraints885); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraints"

    public static class structureDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structureDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:178:1: structureDef : ( actionDef | durativeActionDef | derivedDef );
    public final PddlParser.structureDef_return structureDef() throws RecognitionException {
        PddlParser.structureDef_return retval = new PddlParser.structureDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.actionDef_return actionDef70 = null;

        PddlParser.durativeActionDef_return durativeActionDef71 = null;

        PddlParser.derivedDef_return derivedDef72 = null;



        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:179:2: ( actionDef | durativeActionDef | derivedDef )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                switch ( input.LA(2) ) {
                case 66:
                    {
                    alt22=1;
                    }
                    break;
                case 76:
                    {
                    alt22=2;
                    }
                    break;
                case 85:
                    {
                    alt22=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:179:4: actionDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_actionDef_in_structureDef897);
                    actionDef70=actionDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, actionDef70.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:180:4: durativeActionDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_durativeActionDef_in_structureDef902);
                    durativeActionDef71=durativeActionDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durativeActionDef71.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:181:4: derivedDef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_derivedDef_in_structureDef907);
                    derivedDef72=derivedDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedDef72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structureDef"

    public static class actionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:185:1: actionDef : '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol typedVariableList actionDefBody ) ;
    public final PddlParser.actionDef_return actionDef() throws RecognitionException {
        PddlParser.actionDef_return retval = new PddlParser.actionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token string_literal74=null;
        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        PddlParser.actionSymbol_return actionSymbol75 = null;

        PddlParser.typedVariableList_return typedVariableList78 = null;

        PddlParser.actionDefBody_return actionDefBody80 = null;


        Object char_literal73_tree=null;
        Object string_literal74_tree=null;
        Object string_literal76_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:188:2: ( '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')' -> ^( ACTION actionSymbol typedVariableList actionDefBody ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:188:4: '(' ':action' actionSymbol ':parameters' '(' typedVariableList ')' actionDefBody ')'
            {
            char_literal73=(Token)match(input,53,FOLLOW_53_in_actionDef922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal73);

            string_literal74=(Token)match(input,66,FOLLOW_66_in_actionDef924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(string_literal74);

            pushFollow(FOLLOW_actionSymbol_in_actionDef926);
            actionSymbol75=actionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol75.getTree());
            string_literal76=(Token)match(input,67,FOLLOW_67_in_actionDef935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal76);

            char_literal77=(Token)match(input,53,FOLLOW_53_in_actionDef937); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal77);

            pushFollow(FOLLOW_typedVariableList_in_actionDef939);
            typedVariableList78=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList78.getTree());
            char_literal79=(Token)match(input,55,FOLLOW_55_in_actionDef941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal79);

            pushFollow(FOLLOW_actionDefBody_in_actionDef954);
            actionDefBody80=actionDefBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody80.getTree());
            char_literal81=(Token)match(input,55,FOLLOW_55_in_actionDef956); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal81);



            // AST REWRITE
            // elements: actionSymbol, typedVariableList, actionDefBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:8: -> ^( ACTION actionSymbol typedVariableList actionDefBody )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:191:11: ^( ACTION actionSymbol typedVariableList actionDefBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);

                adaptor.addChild(root_1, stream_actionSymbol.nextTree());
                adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                adaptor.addChild(root_1, stream_actionDefBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionDef"

    public static class actionSymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionSymbol"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:194:1: actionSymbol : NAME ;
    public final PddlParser.actionSymbol_return actionSymbol() throws RecognitionException {
        PddlParser.actionSymbol_return retval = new PddlParser.actionSymbol_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME82=null;

        Object NAME82_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:194:14: ( NAME )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:194:16: NAME
            {
            root_0 = (Object)adaptor.nil();

            NAME82=(Token)match(input,NAME,FOLLOW_NAME_in_actionSymbol988); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NAME82_tree = (Object)adaptor.create(NAME82);
            adaptor.addChild(root_0, NAME82_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionSymbol"

    public static class actionDefBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actionDefBody"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:200:1: actionDefBody : ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) ;
    public final PddlParser.actionDefBody_return actionDefBody() throws RecognitionException {
        PddlParser.actionDefBody_return retval = new PddlParser.actionDefBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal84=null;
        Token char_literal85=null;
        Token string_literal87=null;
        Token char_literal88=null;
        Token char_literal89=null;
        PddlParser.goalDesc_return goalDesc86 = null;

        PddlParser.effect_return effect90 = null;


        Object string_literal83_tree=null;
        Object char_literal84_tree=null;
        Object char_literal85_tree=null;
        Object string_literal87_tree=null;
        Object char_literal88_tree=null;
        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:2: ( ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )? ( ':effect' ( ( '(' ')' ) | effect ) )?
            {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:4: ( ':precondition' ( ( '(' ')' ) | goalDesc ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:6: ':precondition' ( ( '(' ')' ) | goalDesc )
                    {
                    string_literal83=(Token)match(input,68,FOLLOW_68_in_actionDefBody1004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal83);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:22: ( ( '(' ')' ) | goalDesc )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==53) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==55) ) {
                            alt23=1;
                        }
                        else if ( (LA23_1==NAME||(LA23_1>=70 && LA23_1<=75)||(LA23_1>=90 && LA23_1<=94)) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:23: ( '(' ')' )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:23: ( '(' ')' )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:24: '(' ')'
                            {
                            char_literal84=(Token)match(input,53,FOLLOW_53_in_actionDefBody1008); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_53.add(char_literal84);

                            char_literal85=(Token)match(input,55,FOLLOW_55_in_actionDefBody1010); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal85);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:201:35: goalDesc
                            {
                            pushFollow(FOLLOW_goalDesc_in_actionDefBody1015);
                            goalDesc86=goalDesc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc86.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:4: ( ':effect' ( ( '(' ')' ) | effect ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:6: ':effect' ( ( '(' ')' ) | effect )
                    {
                    string_literal87=(Token)match(input,69,FOLLOW_69_in_actionDefBody1025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(string_literal87);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:16: ( ( '(' ')' ) | effect )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==53) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==55) ) {
                            alt25=1;
                        }
                        else if ( (LA25_1==NAME||LA25_1==70||LA25_1==72||LA25_1==75||LA25_1==86||(LA25_1>=95 && LA25_1<=99)) ) {
                            alt25=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:17: ( '(' ')' )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:17: ( '(' ')' )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:18: '(' ')'
                            {
                            char_literal88=(Token)match(input,53,FOLLOW_53_in_actionDefBody1029); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_53.add(char_literal88);

                            char_literal89=(Token)match(input,55,FOLLOW_55_in_actionDefBody1031); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_55.add(char_literal89);


                            }


                            }
                            break;
                        case 2 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:202:29: effect
                            {
                            pushFollow(FOLLOW_effect_in_actionDefBody1036);
                            effect90=effect();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_effect.add(effect90.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: effect, goalDesc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 203:4: -> ^( PRECONDITION ( goalDesc )? ) ^( EFFECT ( effect )? )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:203:7: ^( PRECONDITION ( goalDesc )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);

                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:203:22: ( goalDesc )?
                if ( stream_goalDesc.hasNext() ) {
                    adaptor.addChild(root_1, stream_goalDesc.nextTree());

                }
                stream_goalDesc.reset();

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:203:33: ^( EFFECT ( effect )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);

                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:203:42: ( effect )?
                if ( stream_effect.hasNext() ) {
                    adaptor.addChild(root_1, stream_effect.nextTree());

                }
                stream_effect.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionDefBody"

    public static class goalDesc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goalDesc"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:217:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) );
    public final PddlParser.goalDesc_return goalDesc() throws RecognitionException {
        PddlParser.goalDesc_return retval = new PddlParser.goalDesc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal92=null;
        Token string_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token string_literal97=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token string_literal101=null;
        Token char_literal103=null;
        Token char_literal104=null;
        Token string_literal105=null;
        Token char_literal108=null;
        Token char_literal109=null;
        Token string_literal110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal116=null;
        Token string_literal117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        PddlParser.atomicTermFormula_return atomicTermFormula91 = null;

        PddlParser.goalDesc_return goalDesc94 = null;

        PddlParser.goalDesc_return goalDesc98 = null;

        PddlParser.goalDesc_return goalDesc102 = null;

        PddlParser.goalDesc_return goalDesc106 = null;

        PddlParser.goalDesc_return goalDesc107 = null;

        PddlParser.typedVariableList_return typedVariableList112 = null;

        PddlParser.goalDesc_return goalDesc114 = null;

        PddlParser.typedVariableList_return typedVariableList119 = null;

        PddlParser.goalDesc_return goalDesc121 = null;

        PddlParser.fComp_return fComp123 = null;


        Object char_literal92_tree=null;
        Object string_literal93_tree=null;
        Object char_literal95_tree=null;
        Object char_literal96_tree=null;
        Object string_literal97_tree=null;
        Object char_literal99_tree=null;
        Object char_literal100_tree=null;
        Object string_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal104_tree=null;
        Object string_literal105_tree=null;
        Object char_literal108_tree=null;
        Object char_literal109_tree=null;
        Object string_literal110_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_fComp=new RewriteRuleSubtreeStream(adaptor,"rule fComp");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:218:2: ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:218:4: atomicTermFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicTermFormula_in_goalDesc1080);
                    atomicTermFormula91=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula91.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:219:4: '(' 'and' ( goalDesc )* ')'
                    {
                    char_literal92=(Token)match(input,53,FOLLOW_53_in_goalDesc1085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal92);

                    string_literal93=(Token)match(input,70,FOLLOW_70_in_goalDesc1087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal93);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:219:14: ( goalDesc )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==53) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: goalDesc
                    	    {
                    	    pushFollow(FOLLOW_goalDesc_in_goalDesc1089);
                    	    goalDesc94=goalDesc();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    char_literal95=(Token)match(input,55,FOLLOW_55_in_goalDesc1092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal95);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:12: -> ^( AND_GD ( goalDesc )* )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:220:15: ^( AND_GD ( goalDesc )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_GD, "AND_GD"), root_1);

                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:220:24: ( goalDesc )*
                        while ( stream_goalDesc.hasNext() ) {
                            adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        }
                        stream_goalDesc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:221:4: '(' 'or' ( goalDesc )* ')'
                    {
                    char_literal96=(Token)match(input,53,FOLLOW_53_in_goalDesc1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal96);

                    string_literal97=(Token)match(input,71,FOLLOW_71_in_goalDesc1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal97);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:221:13: ( goalDesc )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==53) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: goalDesc
                    	    {
                    	    pushFollow(FOLLOW_goalDesc_in_goalDesc1121);
                    	    goalDesc98=goalDesc();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc98.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    char_literal99=(Token)match(input,55,FOLLOW_55_in_goalDesc1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal99);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:12: -> ^( OR_GD ( goalDesc )* )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:222:15: ^( OR_GD ( goalDesc )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_GD, "OR_GD"), root_1);

                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:222:23: ( goalDesc )*
                        while ( stream_goalDesc.hasNext() ) {
                            adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        }
                        stream_goalDesc.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:223:4: '(' 'not' goalDesc ')'
                    {
                    char_literal100=(Token)match(input,53,FOLLOW_53_in_goalDesc1149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal100);

                    string_literal101=(Token)match(input,72,FOLLOW_72_in_goalDesc1151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal101);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1153);
                    goalDesc102=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc102.getTree());
                    char_literal103=(Token)match(input,55,FOLLOW_55_in_goalDesc1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal103);



                    // AST REWRITE
                    // elements: goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:12: -> ^( NOT_GD goalDesc )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:224:15: ^( NOT_GD goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_GD, "NOT_GD"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:225:4: '(' 'imply' goalDesc goalDesc ')'
                    {
                    char_literal104=(Token)match(input,53,FOLLOW_53_in_goalDesc1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal104);

                    string_literal105=(Token)match(input,73,FOLLOW_73_in_goalDesc1181); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(string_literal105);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1183);
                    goalDesc106=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc106.getTree());
                    pushFollow(FOLLOW_goalDesc_in_goalDesc1185);
                    goalDesc107=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc107.getTree());
                    char_literal108=(Token)match(input,55,FOLLOW_55_in_goalDesc1187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal108);



                    // AST REWRITE
                    // elements: goalDesc, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:12: -> ^( IMPLY_GD goalDesc goalDesc )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:226:15: ^( IMPLY_GD goalDesc goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLY_GD, "IMPLY_GD"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:227:4: '(' 'exists' '(' typedVariableList ')' goalDesc ')'
                    {
                    char_literal109=(Token)match(input,53,FOLLOW_53_in_goalDesc1213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal109);

                    string_literal110=(Token)match(input,74,FOLLOW_74_in_goalDesc1215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal110);

                    char_literal111=(Token)match(input,53,FOLLOW_53_in_goalDesc1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal111);

                    pushFollow(FOLLOW_typedVariableList_in_goalDesc1219);
                    typedVariableList112=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList112.getTree());
                    char_literal113=(Token)match(input,55,FOLLOW_55_in_goalDesc1221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal113);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1223);
                    goalDesc114=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc114.getTree());
                    char_literal115=(Token)match(input,55,FOLLOW_55_in_goalDesc1225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal115);



                    // AST REWRITE
                    // elements: goalDesc, typedVariableList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:12: -> ^( EXISTS_GD typedVariableList goalDesc )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:228:15: ^( EXISTS_GD typedVariableList goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXISTS_GD, "EXISTS_GD"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:229:4: '(' 'forall' '(' typedVariableList ')' goalDesc ')'
                    {
                    char_literal116=(Token)match(input,53,FOLLOW_53_in_goalDesc1251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal116);

                    string_literal117=(Token)match(input,75,FOLLOW_75_in_goalDesc1253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal117);

                    char_literal118=(Token)match(input,53,FOLLOW_53_in_goalDesc1255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal118);

                    pushFollow(FOLLOW_typedVariableList_in_goalDesc1257);
                    typedVariableList119=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList119.getTree());
                    char_literal120=(Token)match(input,55,FOLLOW_55_in_goalDesc1259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal120);

                    pushFollow(FOLLOW_goalDesc_in_goalDesc1261);
                    goalDesc121=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc121.getTree());
                    char_literal122=(Token)match(input,55,FOLLOW_55_in_goalDesc1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal122);



                    // AST REWRITE
                    // elements: typedVariableList, goalDesc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:12: -> ^( FORALL_GD typedVariableList goalDesc )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:230:15: ^( FORALL_GD typedVariableList goalDesc )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_GD, "FORALL_GD"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_goalDesc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:231:7: fComp
                    {
                    pushFollow(FOLLOW_fComp_in_goalDesc1292);
                    fComp123=fComp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fComp.add(fComp123.getTree());


                    // AST REWRITE
                    // elements: fComp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:15: -> ^( COMPARISON_GD fComp )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:232:18: ^( COMPARISON_GD fComp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPARISON_GD, "COMPARISON_GD"), root_1);

                        adaptor.addChild(root_1, stream_fComp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goalDesc"

    public static class fComp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fComp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:235:1: fComp : '(' binaryComp fExp fExp ')' ;
    public final PddlParser.fComp_return fComp() throws RecognitionException {
        PddlParser.fComp_return retval = new PddlParser.fComp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        Token char_literal128=null;
        PddlParser.binaryComp_return binaryComp125 = null;

        PddlParser.fExp_return fExp126 = null;

        PddlParser.fExp_return fExp127 = null;


        Object char_literal124_tree=null;
        Object char_literal128_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:236:2: ( '(' binaryComp fExp fExp ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:236:4: '(' binaryComp fExp fExp ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal124=(Token)match(input,53,FOLLOW_53_in_fComp1328); if (state.failed) return retval;
            pushFollow(FOLLOW_binaryComp_in_fComp1331);
            binaryComp125=binaryComp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryComp125.getTree());
            pushFollow(FOLLOW_fExp_in_fComp1333);
            fExp126=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp126.getTree());
            pushFollow(FOLLOW_fExp_in_fComp1335);
            fExp127=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp127.getTree());
            char_literal128=(Token)match(input,55,FOLLOW_55_in_fComp1337); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fComp"

    public static class atomicTermFormula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicTermFormula"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:239:1: atomicTermFormula : '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) ;
    public final PddlParser.atomicTermFormula_return atomicTermFormula() throws RecognitionException {
        PddlParser.atomicTermFormula_return retval = new PddlParser.atomicTermFormula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal129=null;
        Token char_literal132=null;
        PddlParser.predicate_return predicate130 = null;

        PddlParser.term_return term131 = null;


        Object char_literal129_tree=null;
        Object char_literal132_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:240:2: ( '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ( term )* ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:240:4: '(' predicate ( term )* ')'
            {
            char_literal129=(Token)match(input,53,FOLLOW_53_in_atomicTermFormula1349); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal129);

            pushFollow(FOLLOW_predicate_in_atomicTermFormula1351);
            predicate130=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicate.add(predicate130.getTree());
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:240:18: ( term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==NAME||LA30_0==VARIABLE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: term
            	    {
            	    pushFollow(FOLLOW_term_in_atomicTermFormula1353);
            	    term131=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_term.add(term131.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            char_literal132=(Token)match(input,55,FOLLOW_55_in_atomicTermFormula1356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal132);



            // AST REWRITE
            // elements: term, predicate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:28: -> ^( PRED_HEAD predicate ( term )* )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:240:31: ^( PRED_HEAD predicate ( term )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_HEAD, "PRED_HEAD"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:240:53: ( term )*
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicTermFormula"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:243:1: term : ( NAME | VARIABLE );
    public final PddlParser.term_return term() throws RecognitionException {
        PddlParser.term_return retval = new PddlParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set133=null;

        Object set133_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:243:6: ( NAME | VARIABLE )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set133=(Token)input.LT(1);
            if ( input.LA(1)==NAME||input.LA(1)==VARIABLE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set133));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class durativeActionDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durativeActionDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:245:1: durativeActionDef : '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) ;
    public final PddlParser.durativeActionDef_return durativeActionDef() throws RecognitionException {
        PddlParser.durativeActionDef_return retval = new PddlParser.durativeActionDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal134=null;
        Token string_literal135=null;
        Token string_literal137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Token char_literal142=null;
        PddlParser.actionSymbol_return actionSymbol136 = null;

        PddlParser.typedVariableList_return typedVariableList139 = null;

        PddlParser.daDefBody_return daDefBody141 = null;


        Object char_literal134_tree=null;
        Object string_literal135_tree=null;
        Object string_literal137_tree=null;
        Object char_literal138_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");
        RewriteRuleSubtreeStream stream_daDefBody=new RewriteRuleSubtreeStream(adaptor,"rule daDefBody");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:248:2: ( '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:248:4: '(' ':durative-action' actionSymbol ':parameters' '(' typedVariableList ')' daDefBody ')'
            {
            char_literal134=(Token)match(input,53,FOLLOW_53_in_durativeActionDef1394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal134);

            string_literal135=(Token)match(input,76,FOLLOW_76_in_durativeActionDef1396); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal135);

            pushFollow(FOLLOW_actionSymbol_in_durativeActionDef1398);
            actionSymbol136=actionSymbol();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol136.getTree());
            string_literal137=(Token)match(input,67,FOLLOW_67_in_durativeActionDef1407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(string_literal137);

            char_literal138=(Token)match(input,53,FOLLOW_53_in_durativeActionDef1409); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal138);

            pushFollow(FOLLOW_typedVariableList_in_durativeActionDef1411);
            typedVariableList139=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList139.getTree());
            char_literal140=(Token)match(input,55,FOLLOW_55_in_durativeActionDef1413); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal140);

            pushFollow(FOLLOW_daDefBody_in_durativeActionDef1426);
            daDefBody141=daDefBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_daDefBody.add(daDefBody141.getTree());
            char_literal142=(Token)match(input,55,FOLLOW_55_in_durativeActionDef1428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal142);



            // AST REWRITE
            // elements: typedVariableList, actionSymbol, daDefBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 251:8: -> ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:251:11: ^( DURATIVE_ACTION actionSymbol typedVariableList daDefBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATIVE_ACTION, "DURATIVE_ACTION"), root_1);

                adaptor.addChild(root_1, stream_actionSymbol.nextTree());
                adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                adaptor.addChild(root_1, stream_daDefBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durativeActionDef"

    public static class daDefBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daDefBody"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:254:1: daDefBody : ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) );
    public final PddlParser.daDefBody_return daDefBody() throws RecognitionException {
        PddlParser.daDefBody_return retval = new PddlParser.daDefBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        Token string_literal145=null;
        Token char_literal146=null;
        Token char_literal147=null;
        Token string_literal149=null;
        Token char_literal150=null;
        Token char_literal151=null;
        PddlParser.durationConstraint_return durationConstraint144 = null;

        PddlParser.daGD_return daGD148 = null;

        PddlParser.daEffect_return daEffect152 = null;


        Object string_literal143_tree=null;
        Object string_literal145_tree=null;
        Object char_literal146_tree=null;
        Object char_literal147_tree=null;
        Object string_literal149_tree=null;
        Object char_literal150_tree=null;
        Object char_literal151_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:255:2: ( ':duration' durationConstraint | ':condition' ( ( '(' ')' ) | daGD ) | ':effect' ( ( '(' ')' ) | daEffect ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt33=1;
                }
                break;
            case 78:
                {
                alt33=2;
                }
                break;
            case 69:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:255:4: ':duration' durationConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal143=(Token)match(input,77,FOLLOW_77_in_daDefBody1461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = (Object)adaptor.create(string_literal143);
                    adaptor.addChild(root_0, string_literal143_tree);
                    }
                    pushFollow(FOLLOW_durationConstraint_in_daDefBody1463);
                    durationConstraint144=durationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durationConstraint144.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:4: ':condition' ( ( '(' ')' ) | daGD )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal145=(Token)match(input,78,FOLLOW_78_in_daDefBody1468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal145_tree = (Object)adaptor.create(string_literal145);
                    adaptor.addChild(root_0, string_literal145_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:17: ( ( '(' ')' ) | daGD )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==53) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==55) ) {
                            alt31=1;
                        }
                        else if ( (LA31_1==70||LA31_1==75||(LA31_1>=79 && LA31_1<=81)) ) {
                            alt31=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:18: ( '(' ')' )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:18: ( '(' ')' )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:19: '(' ')'
                            {
                            char_literal146=(Token)match(input,53,FOLLOW_53_in_daDefBody1472); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal146_tree = (Object)adaptor.create(char_literal146);
                            adaptor.addChild(root_0, char_literal146_tree);
                            }
                            char_literal147=(Token)match(input,55,FOLLOW_55_in_daDefBody1474); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal147_tree = (Object)adaptor.create(char_literal147);
                            adaptor.addChild(root_0, char_literal147_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:256:30: daGD
                            {
                            pushFollow(FOLLOW_daGD_in_daDefBody1479);
                            daGD148=daGD();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD148.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:7: ':effect' ( ( '(' ')' ) | daEffect )
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal149=(Token)match(input,69,FOLLOW_69_in_daDefBody1488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal149_tree = (Object)adaptor.create(string_literal149);
                    adaptor.addChild(root_0, string_literal149_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:17: ( ( '(' ')' ) | daEffect )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==53) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==55) ) {
                            alt32=1;
                        }
                        else if ( (LA32_1==70||LA32_1==75||LA32_1==80||LA32_1==86||(LA32_1>=95 && LA32_1<=99)) ) {
                            alt32=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:18: ( '(' ')' )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:18: ( '(' ')' )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:19: '(' ')'
                            {
                            char_literal150=(Token)match(input,53,FOLLOW_53_in_daDefBody1492); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal150_tree = (Object)adaptor.create(char_literal150);
                            adaptor.addChild(root_0, char_literal150_tree);
                            }
                            char_literal151=(Token)match(input,55,FOLLOW_55_in_daDefBody1494); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal151_tree = (Object)adaptor.create(char_literal151);
                            adaptor.addChild(root_0, char_literal151_tree);
                            }

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:257:30: daEffect
                            {
                            pushFollow(FOLLOW_daEffect_in_daDefBody1499);
                            daEffect152=daEffect();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect152.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daDefBody"

    public static class daGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daGD"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:260:1: daGD : ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' );
    public final PddlParser.daGD_return daGD() throws RecognitionException {
        PddlParser.daGD_return retval = new PddlParser.daGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal154=null;
        Token string_literal155=null;
        Token char_literal157=null;
        Token char_literal158=null;
        Token string_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token char_literal164=null;
        PddlParser.prefTimedGD_return prefTimedGD153 = null;

        PddlParser.daGD_return daGD156 = null;

        PddlParser.typedVariableList_return typedVariableList161 = null;

        PddlParser.daGD_return daGD163 = null;


        Object char_literal154_tree=null;
        Object string_literal155_tree=null;
        Object char_literal157_tree=null;
        Object char_literal158_tree=null;
        Object string_literal159_tree=null;
        Object char_literal160_tree=null;
        Object char_literal162_tree=null;
        Object char_literal164_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:261:2: ( prefTimedGD | '(' 'and' ( daGD )* ')' | '(' 'forall' '(' typedVariableList ')' daGD ')' )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                switch ( input.LA(2) ) {
                case 79:
                case 80:
                case 81:
                    {
                    alt35=1;
                    }
                    break;
                case 70:
                    {
                    alt35=2;
                    }
                    break;
                case 75:
                    {
                    alt35=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:261:4: prefTimedGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefTimedGD_in_daGD1514);
                    prefTimedGD153=prefTimedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefTimedGD153.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:262:4: '(' 'and' ( daGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal154=(Token)match(input,53,FOLLOW_53_in_daGD1519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal154_tree = (Object)adaptor.create(char_literal154);
                    adaptor.addChild(root_0, char_literal154_tree);
                    }
                    string_literal155=(Token)match(input,70,FOLLOW_70_in_daGD1521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal155_tree = (Object)adaptor.create(string_literal155);
                    adaptor.addChild(root_0, string_literal155_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:262:14: ( daGD )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==53) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: daGD
                    	    {
                    	    pushFollow(FOLLOW_daGD_in_daGD1523);
                    	    daGD156=daGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD156.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    char_literal157=(Token)match(input,55,FOLLOW_55_in_daGD1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal157_tree = (Object)adaptor.create(char_literal157);
                    adaptor.addChild(root_0, char_literal157_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:263:4: '(' 'forall' '(' typedVariableList ')' daGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal158=(Token)match(input,53,FOLLOW_53_in_daGD1531); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal158_tree = (Object)adaptor.create(char_literal158);
                    adaptor.addChild(root_0, char_literal158_tree);
                    }
                    string_literal159=(Token)match(input,75,FOLLOW_75_in_daGD1533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal159_tree = (Object)adaptor.create(string_literal159);
                    adaptor.addChild(root_0, string_literal159_tree);
                    }
                    char_literal160=(Token)match(input,53,FOLLOW_53_in_daGD1535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal160_tree = (Object)adaptor.create(char_literal160);
                    adaptor.addChild(root_0, char_literal160_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_daGD1537);
                    typedVariableList161=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList161.getTree());
                    char_literal162=(Token)match(input,55,FOLLOW_55_in_daGD1539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal162_tree = (Object)adaptor.create(char_literal162);
                    adaptor.addChild(root_0, char_literal162_tree);
                    }
                    pushFollow(FOLLOW_daGD_in_daGD1541);
                    daGD163=daGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD163.getTree());
                    char_literal164=(Token)match(input,55,FOLLOW_55_in_daGD1543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal164_tree = (Object)adaptor.create(char_literal164);
                    adaptor.addChild(root_0, char_literal164_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daGD"

    public static class prefTimedGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefTimedGD"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:266:1: prefTimedGD : ( timedGD | '(' 'preference' ( NAME )? timedGD ')' );
    public final PddlParser.prefTimedGD_return prefTimedGD() throws RecognitionException {
        PddlParser.prefTimedGD_return retval = new PddlParser.prefTimedGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal166=null;
        Token string_literal167=null;
        Token NAME168=null;
        Token char_literal170=null;
        PddlParser.timedGD_return timedGD165 = null;

        PddlParser.timedGD_return timedGD169 = null;


        Object char_literal166_tree=null;
        Object string_literal167_tree=null;
        Object NAME168_tree=null;
        Object char_literal170_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:267:2: ( timedGD | '(' 'preference' ( NAME )? timedGD ')' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==53) ) {
                int LA37_1 = input.LA(2);

                if ( ((LA37_1>=80 && LA37_1<=81)) ) {
                    alt37=1;
                }
                else if ( (LA37_1==79) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:267:4: timedGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_timedGD_in_prefTimedGD1554);
                    timedGD165=timedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD165.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:268:4: '(' 'preference' ( NAME )? timedGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal166=(Token)match(input,53,FOLLOW_53_in_prefTimedGD1559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = (Object)adaptor.create(char_literal166);
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    string_literal167=(Token)match(input,79,FOLLOW_79_in_prefTimedGD1561); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal167_tree = (Object)adaptor.create(string_literal167);
                    adaptor.addChild(root_0, string_literal167_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:268:21: ( NAME )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NAME) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                            {
                            NAME168=(Token)match(input,NAME,FOLLOW_NAME_in_prefTimedGD1563); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAME168_tree = (Object)adaptor.create(NAME168);
                            adaptor.addChild(root_0, NAME168_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_timedGD_in_prefTimedGD1566);
                    timedGD169=timedGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedGD169.getTree());
                    char_literal170=(Token)match(input,55,FOLLOW_55_in_prefTimedGD1568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal170_tree = (Object)adaptor.create(char_literal170);
                    adaptor.addChild(root_0, char_literal170_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefTimedGD"

    public static class timedGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timedGD"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:271:1: timedGD : ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' );
    public final PddlParser.timedGD_return timedGD() throws RecognitionException {
        PddlParser.timedGD_return retval = new PddlParser.timedGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal171=null;
        Token string_literal172=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token string_literal177=null;
        Token char_literal180=null;
        PddlParser.timeSpecifier_return timeSpecifier173 = null;

        PddlParser.goalDesc_return goalDesc174 = null;

        PddlParser.interval_return interval178 = null;

        PddlParser.goalDesc_return goalDesc179 = null;


        Object char_literal171_tree=null;
        Object string_literal172_tree=null;
        Object char_literal175_tree=null;
        Object char_literal176_tree=null;
        Object string_literal177_tree=null;
        Object char_literal180_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:272:2: ( '(' 'at' timeSpecifier goalDesc ')' | '(' 'over' interval goalDesc ')' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==80) ) {
                    alt38=1;
                }
                else if ( (LA38_1==81) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:272:4: '(' 'at' timeSpecifier goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal171=(Token)match(input,53,FOLLOW_53_in_timedGD1579); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal171_tree = (Object)adaptor.create(char_literal171);
                    adaptor.addChild(root_0, char_literal171_tree);
                    }
                    string_literal172=(Token)match(input,80,FOLLOW_80_in_timedGD1581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal172_tree = (Object)adaptor.create(string_literal172);
                    adaptor.addChild(root_0, string_literal172_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedGD1583);
                    timeSpecifier173=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier173.getTree());
                    pushFollow(FOLLOW_goalDesc_in_timedGD1585);
                    goalDesc174=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc174.getTree());
                    char_literal175=(Token)match(input,55,FOLLOW_55_in_timedGD1587); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal175_tree = (Object)adaptor.create(char_literal175);
                    adaptor.addChild(root_0, char_literal175_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:273:4: '(' 'over' interval goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal176=(Token)match(input,53,FOLLOW_53_in_timedGD1592); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal176_tree = (Object)adaptor.create(char_literal176);
                    adaptor.addChild(root_0, char_literal176_tree);
                    }
                    string_literal177=(Token)match(input,81,FOLLOW_81_in_timedGD1594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal177_tree = (Object)adaptor.create(string_literal177);
                    adaptor.addChild(root_0, string_literal177_tree);
                    }
                    pushFollow(FOLLOW_interval_in_timedGD1596);
                    interval178=interval();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interval178.getTree());
                    pushFollow(FOLLOW_goalDesc_in_timedGD1598);
                    goalDesc179=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc179.getTree());
                    char_literal180=(Token)match(input,55,FOLLOW_55_in_timedGD1600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal180_tree = (Object)adaptor.create(char_literal180);
                    adaptor.addChild(root_0, char_literal180_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timedGD"

    public static class timeSpecifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timeSpecifier"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:276:1: timeSpecifier : ( 'start' | 'end' );
    public final PddlParser.timeSpecifier_return timeSpecifier() throws RecognitionException {
        PddlParser.timeSpecifier_return retval = new PddlParser.timeSpecifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set181=null;

        Object set181_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:276:15: ( 'start' | 'end' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set181=(Token)input.LT(1);
            if ( (input.LA(1)>=82 && input.LA(1)<=83) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set181));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timeSpecifier"

    public static class interval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interval"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:277:1: interval : 'all' ;
    public final PddlParser.interval_return interval() throws RecognitionException {
        PddlParser.interval_return retval = new PddlParser.interval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal182=null;

        Object string_literal182_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:277:10: ( 'all' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:277:12: 'all'
            {
            root_0 = (Object)adaptor.nil();

            string_literal182=(Token)match(input,84,FOLLOW_84_in_interval1622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal182_tree = (Object)adaptor.create(string_literal182);
            adaptor.addChild(root_0, string_literal182_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "interval"

    public static class derivedDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "derivedDef"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:279:1: derivedDef : '(' ':derived' typedVariableList goalDesc ')' ;
    public final PddlParser.derivedDef_return derivedDef() throws RecognitionException {
        PddlParser.derivedDef_return retval = new PddlParser.derivedDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal183=null;
        Token string_literal184=null;
        Token char_literal187=null;
        PddlParser.typedVariableList_return typedVariableList185 = null;

        PddlParser.goalDesc_return goalDesc186 = null;


        Object char_literal183_tree=null;
        Object string_literal184_tree=null;
        Object char_literal187_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:282:2: ( '(' ':derived' typedVariableList goalDesc ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:282:4: '(' ':derived' typedVariableList goalDesc ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal183=(Token)match(input,53,FOLLOW_53_in_derivedDef1635); if (state.failed) return retval;
            string_literal184=(Token)match(input,85,FOLLOW_85_in_derivedDef1638); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal184_tree = (Object)adaptor.create(string_literal184);
            root_0 = (Object)adaptor.becomeRoot(string_literal184_tree, root_0);
            }
            pushFollow(FOLLOW_typedVariableList_in_derivedDef1641);
            typedVariableList185=typedVariableList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList185.getTree());
            pushFollow(FOLLOW_goalDesc_in_derivedDef1643);
            goalDesc186=goalDesc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc186.getTree());
            char_literal187=(Token)match(input,55,FOLLOW_55_in_derivedDef1645); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "derivedDef"

    public static class fExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:285:1: fExp : ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead );
    public final PddlParser.fExp_return fExp() throws RecognitionException {
        PddlParser.fExp_return retval = new PddlParser.fExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER188=null;
        Token char_literal189=null;
        Token char_literal193=null;
        Token char_literal194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        PddlParser.binaryOp_return binaryOp190 = null;

        PddlParser.fExp_return fExp191 = null;

        PddlParser.fExp2_return fExp2192 = null;

        PddlParser.fExp_return fExp196 = null;

        PddlParser.fHead_return fHead198 = null;


        Object NUMBER188_tree=null;
        Object char_literal189_tree=null;
        Object char_literal193_tree=null;
        Object char_literal194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_fExp2=new RewriteRuleSubtreeStream(adaptor,"rule fExp2");
        RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
        RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:288:2: ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead )
            int alt39=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt39=1;
                }
                break;
            case 53:
                {
                int LA39_2 = input.LA(2);

                if ( (synpred51_Pddl()) ) {
                    alt39=2;
                }
                else if ( (synpred52_Pddl()) ) {
                    alt39=3;
                }
                else if ( (true) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case NAME:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:288:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER188=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fExp1660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER188_tree = (Object)adaptor.create(NUMBER188);
                    adaptor.addChild(root_0, NUMBER188_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:289:4: '(' binaryOp fExp fExp2 ')'
                    {
                    char_literal189=(Token)match(input,53,FOLLOW_53_in_fExp1665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal189);

                    pushFollow(FOLLOW_binaryOp_in_fExp1667);
                    binaryOp190=binaryOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp190.getTree());
                    pushFollow(FOLLOW_fExp_in_fExp1669);
                    fExp191=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp191.getTree());
                    pushFollow(FOLLOW_fExp2_in_fExp1671);
                    fExp2192=fExp2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp2.add(fExp2192.getTree());
                    char_literal193=(Token)match(input,55,FOLLOW_55_in_fExp1673); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal193);



                    // AST REWRITE
                    // elements: fExp2, binaryOp, fExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 289:32: -> ^( BINARY_OP binaryOp fExp fExp2 )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:289:35: ^( BINARY_OP binaryOp fExp fExp2 )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);

                        adaptor.addChild(root_1, stream_binaryOp.nextTree());
                        adaptor.addChild(root_1, stream_fExp.nextTree());
                        adaptor.addChild(root_1, stream_fExp2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:290:4: '(' '-' fExp ')'
                    {
                    char_literal194=(Token)match(input,53,FOLLOW_53_in_fExp1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal194);

                    char_literal195=(Token)match(input,59,FOLLOW_59_in_fExp1692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal195);

                    pushFollow(FOLLOW_fExp_in_fExp1694);
                    fExp196=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp196.getTree());
                    char_literal197=(Token)match(input,55,FOLLOW_55_in_fExp1696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal197);



                    // AST REWRITE
                    // elements: fExp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 290:21: -> ^( UNARY_MINUS fExp )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:290:24: ^( UNARY_MINUS fExp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_fExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:291:4: fHead
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fHead_in_fExp1709);
                    fHead198=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead198.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExp"

    public static class fExp2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExp2"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:296:1: fExp2 : fExp ;
    public final PddlParser.fExp2_return fExp2() throws RecognitionException {
        PddlParser.fExp2_return retval = new PddlParser.fExp2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PddlParser.fExp_return fExp199 = null;



        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:296:7: ( fExp )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:296:9: fExp
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fExp_in_fExp21721);
            fExp199=fExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp199.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExp2"

    public static class fHead_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fHead"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:298:1: fHead : ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) );
    public final PddlParser.fHead_return fHead() throws RecognitionException {
        PddlParser.fHead_return retval = new PddlParser.fHead_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal200=null;
        Token char_literal203=null;
        PddlParser.functionSymbol_return functionSymbol201 = null;

        PddlParser.term_return term202 = null;

        PddlParser.functionSymbol_return functionSymbol204 = null;


        Object char_literal200_tree=null;
        Object char_literal203_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:299:2: ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ( term )* ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            else if ( (LA41_0==NAME) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:299:4: '(' functionSymbol ( term )* ')'
                    {
                    char_literal200=(Token)match(input,53,FOLLOW_53_in_fHead1731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal200);

                    pushFollow(FOLLOW_functionSymbol_in_fHead1733);
                    functionSymbol201=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol201.getTree());
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:299:23: ( term )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==NAME||LA40_0==VARIABLE) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: term
                    	    {
                    	    pushFollow(FOLLOW_term_in_fHead1735);
                    	    term202=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_term.add(term202.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    char_literal203=(Token)match(input,55,FOLLOW_55_in_fHead1738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal203);



                    // AST REWRITE
                    // elements: functionSymbol, term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 299:33: -> ^( FUNC_HEAD functionSymbol ( term )* )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:299:36: ^( FUNC_HEAD functionSymbol ( term )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);

                        adaptor.addChild(root_1, stream_functionSymbol.nextTree());
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:299:63: ( term )*
                        while ( stream_term.hasNext() ) {
                            adaptor.addChild(root_1, stream_term.nextTree());

                        }
                        stream_term.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:300:4: functionSymbol
                    {
                    pushFollow(FOLLOW_functionSymbol_in_fHead1754);
                    functionSymbol204=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol204.getTree());


                    // AST REWRITE
                    // elements: functionSymbol
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:19: -> ^( FUNC_HEAD functionSymbol )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:300:22: ^( FUNC_HEAD functionSymbol )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);

                        adaptor.addChild(root_1, stream_functionSymbol.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fHead"

    public static class effect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "effect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:303:1: effect : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
    public final PddlParser.effect_return effect() throws RecognitionException {
        PddlParser.effect_return retval = new PddlParser.effect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal205=null;
        Token string_literal206=null;
        Token char_literal208=null;
        PddlParser.cEffect_return cEffect207 = null;

        PddlParser.cEffect_return cEffect209 = null;


        Object char_literal205_tree=null;
        Object string_literal206_tree=null;
        Object char_literal208_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:304:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==70) ) {
                    alt43=1;
                }
                else if ( (LA43_1==NAME||LA43_1==72||LA43_1==75||LA43_1==86||(LA43_1>=95 && LA43_1<=99)) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:304:4: '(' 'and' ( cEffect )* ')'
                    {
                    char_literal205=(Token)match(input,53,FOLLOW_53_in_effect1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal205);

                    string_literal206=(Token)match(input,70,FOLLOW_70_in_effect1775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal206);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:304:14: ( cEffect )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==53) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: cEffect
                    	    {
                    	    pushFollow(FOLLOW_cEffect_in_effect1777);
                    	    cEffect207=cEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_cEffect.add(cEffect207.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    char_literal208=(Token)match(input,55,FOLLOW_55_in_effect1780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal208);



                    // AST REWRITE
                    // elements: cEffect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:27: -> ^( AND_EFFECT ( cEffect )* )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:304:30: ^( AND_EFFECT ( cEffect )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);

                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:304:43: ( cEffect )*
                        while ( stream_cEffect.hasNext() ) {
                            adaptor.addChild(root_1, stream_cEffect.nextTree());

                        }
                        stream_cEffect.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:305:4: cEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cEffect_in_effect1794);
                    cEffect209=cEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect209.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "effect"

    public static class cEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cEffect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:308:1: cEffect : ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect );
    public final PddlParser.cEffect_return cEffect() throws RecognitionException {
        PddlParser.cEffect_return retval = new PddlParser.cEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal210=null;
        Token string_literal211=null;
        Token char_literal212=null;
        Token char_literal214=null;
        Token char_literal216=null;
        Token char_literal217=null;
        Token string_literal218=null;
        Token char_literal221=null;
        PddlParser.typedVariableList_return typedVariableList213 = null;

        PddlParser.effect_return effect215 = null;

        PddlParser.goalDesc_return goalDesc219 = null;

        PddlParser.condEffect_return condEffect220 = null;

        PddlParser.pEffect_return pEffect222 = null;


        Object char_literal210_tree=null;
        Object string_literal211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal214_tree=null;
        Object char_literal216_tree=null;
        Object char_literal217_tree=null;
        Object string_literal218_tree=null;
        Object char_literal221_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
        RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:309:2: ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EFFECT typedVariableList effect ) | '(' 'when' goalDesc condEffect ')' -> ^( WHEN_EFFECT goalDesc condEffect ) | pEffect )
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                switch ( input.LA(2) ) {
                case 75:
                    {
                    alt44=1;
                    }
                    break;
                case 86:
                    {
                    alt44=2;
                    }
                    break;
                case NAME:
                case 72:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                    {
                    alt44=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:309:4: '(' 'forall' '(' typedVariableList ')' effect ')'
                    {
                    char_literal210=(Token)match(input,53,FOLLOW_53_in_cEffect1805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal210);

                    string_literal211=(Token)match(input,75,FOLLOW_75_in_cEffect1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal211);

                    char_literal212=(Token)match(input,53,FOLLOW_53_in_cEffect1809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal212);

                    pushFollow(FOLLOW_typedVariableList_in_cEffect1811);
                    typedVariableList213=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList213.getTree());
                    char_literal214=(Token)match(input,55,FOLLOW_55_in_cEffect1813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal214);

                    pushFollow(FOLLOW_effect_in_cEffect1815);
                    effect215=effect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_effect.add(effect215.getTree());
                    char_literal216=(Token)match(input,55,FOLLOW_55_in_cEffect1817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal216);



                    // AST REWRITE
                    // elements: typedVariableList, effect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 310:4: -> ^( FORALL_EFFECT typedVariableList effect )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:310:7: ^( FORALL_EFFECT typedVariableList effect )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EFFECT, "FORALL_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_typedVariableList.nextTree());
                        adaptor.addChild(root_1, stream_effect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:311:4: '(' 'when' goalDesc condEffect ')'
                    {
                    char_literal217=(Token)match(input,53,FOLLOW_53_in_cEffect1835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal217);

                    string_literal218=(Token)match(input,86,FOLLOW_86_in_cEffect1837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_86.add(string_literal218);

                    pushFollow(FOLLOW_goalDesc_in_cEffect1839);
                    goalDesc219=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc219.getTree());
                    pushFollow(FOLLOW_condEffect_in_cEffect1841);
                    condEffect220=condEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condEffect.add(condEffect220.getTree());
                    char_literal221=(Token)match(input,55,FOLLOW_55_in_cEffect1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal221);



                    // AST REWRITE
                    // elements: goalDesc, condEffect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:4: -> ^( WHEN_EFFECT goalDesc condEffect )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:312:7: ^( WHEN_EFFECT goalDesc condEffect )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EFFECT, "WHEN_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_goalDesc.nextTree());
                        adaptor.addChild(root_1, stream_condEffect.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:313:4: pEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pEffect_in_cEffect1861);
                    pEffect222=pEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect222.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cEffect"

    public static class pEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pEffect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:316:1: pEffect : ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula );
    public final PddlParser.pEffect_return pEffect() throws RecognitionException {
        PddlParser.pEffect_return retval = new PddlParser.pEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal223=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token string_literal229=null;
        Token char_literal231=null;
        PddlParser.assignOp_return assignOp224 = null;

        PddlParser.fHead_return fHead225 = null;

        PddlParser.fExp_return fExp226 = null;

        PddlParser.atomicTermFormula_return atomicTermFormula230 = null;

        PddlParser.atomicTermFormula_return atomicTermFormula232 = null;


        Object char_literal223_tree=null;
        Object char_literal227_tree=null;
        Object char_literal228_tree=null;
        Object string_literal229_tree=null;
        Object char_literal231_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
        RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
        RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");
        RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:317:2: ( '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                switch ( input.LA(2) ) {
                case 72:
                    {
                    alt45=2;
                    }
                    break;
                case NAME:
                    {
                    alt45=3;
                    }
                    break;
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                    {
                    alt45=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:317:4: '(' assignOp fHead fExp ')'
                    {
                    char_literal223=(Token)match(input,53,FOLLOW_53_in_pEffect1872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal223);

                    pushFollow(FOLLOW_assignOp_in_pEffect1874);
                    assignOp224=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignOp.add(assignOp224.getTree());
                    pushFollow(FOLLOW_fHead_in_pEffect1876);
                    fHead225=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fHead.add(fHead225.getTree());
                    pushFollow(FOLLOW_fExp_in_pEffect1878);
                    fExp226=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fExp.add(fExp226.getTree());
                    char_literal227=(Token)match(input,55,FOLLOW_55_in_pEffect1880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal227);



                    // AST REWRITE
                    // elements: fExp, assignOp, fHead
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:4: -> ^( ASSIGN_EFFECT assignOp fHead fExp )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:318:7: ^( ASSIGN_EFFECT assignOp fHead fExp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_assignOp.nextTree());
                        adaptor.addChild(root_1, stream_fHead.nextTree());
                        adaptor.addChild(root_1, stream_fExp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:319:4: '(' 'not' atomicTermFormula ')'
                    {
                    char_literal228=(Token)match(input,53,FOLLOW_53_in_pEffect1900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal228);

                    string_literal229=(Token)match(input,72,FOLLOW_72_in_pEffect1902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal229);

                    pushFollow(FOLLOW_atomicTermFormula_in_pEffect1904);
                    atomicTermFormula230=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula230.getTree());
                    char_literal231=(Token)match(input,55,FOLLOW_55_in_pEffect1906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal231);



                    // AST REWRITE
                    // elements: atomicTermFormula
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 320:4: -> ^( NOT_EFFECT atomicTermFormula )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:320:7: ^( NOT_EFFECT atomicTermFormula )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);

                        adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:321:4: atomicTermFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicTermFormula_in_pEffect1922);
                    atomicTermFormula232=atomicTermFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula232.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pEffect"

    public static class condEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condEffect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:326:1: condEffect : ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect );
    public final PddlParser.condEffect_return condEffect() throws RecognitionException {
        PddlParser.condEffect_return retval = new PddlParser.condEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal233=null;
        Token string_literal234=null;
        Token char_literal236=null;
        PddlParser.pEffect_return pEffect235 = null;

        PddlParser.pEffect_return pEffect237 = null;


        Object char_literal233_tree=null;
        Object string_literal234_tree=null;
        Object char_literal236_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_pEffect=new RewriteRuleSubtreeStream(adaptor,"rule pEffect");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:327:2: ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==70) ) {
                    alt47=1;
                }
                else if ( (LA47_1==NAME||LA47_1==72||(LA47_1>=95 && LA47_1<=99)) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:327:4: '(' 'and' ( pEffect )* ')'
                    {
                    char_literal233=(Token)match(input,53,FOLLOW_53_in_condEffect1935); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal233);

                    string_literal234=(Token)match(input,70,FOLLOW_70_in_condEffect1937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal234);

                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:327:14: ( pEffect )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==53) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: pEffect
                    	    {
                    	    pushFollow(FOLLOW_pEffect_in_condEffect1939);
                    	    pEffect235=pEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pEffect.add(pEffect235.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    char_literal236=(Token)match(input,55,FOLLOW_55_in_condEffect1942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal236);



                    // AST REWRITE
                    // elements: pEffect
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 327:27: -> ^( AND_EFFECT ( pEffect )* )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:327:30: ^( AND_EFFECT ( pEffect )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);

                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:327:43: ( pEffect )*
                        while ( stream_pEffect.hasNext() ) {
                            adaptor.addChild(root_1, stream_pEffect.nextTree());

                        }
                        stream_pEffect.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:328:4: pEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pEffect_in_condEffect1956);
                    pEffect237=pEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condEffect"

    public static class binaryOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryOp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:332:1: binaryOp : ( '*' | '+' | '-' | '/' );
    public final PddlParser.binaryOp_return binaryOp() throws RecognitionException {
        PddlParser.binaryOp_return retval = new PddlParser.binaryOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set238=null;

        Object set238_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:332:10: ( '*' | '+' | '-' | '/' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set238=(Token)input.LT(1);
            if ( input.LA(1)==59||(input.LA(1)>=87 && input.LA(1)<=89) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set238));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryOp"

    public static class binaryComp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryComp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:334:1: binaryComp : ( '>' | '<' | '=' | '>=' | '<=' );
    public final PddlParser.binaryComp_return binaryComp() throws RecognitionException {
        PddlParser.binaryComp_return retval = new PddlParser.binaryComp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set239=null;

        Object set239_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:334:12: ( '>' | '<' | '=' | '>=' | '<=' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set239=(Token)input.LT(1);
            if ( (input.LA(1)>=90 && input.LA(1)<=94) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set239));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryComp"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:336:1: assignOp : ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' );
    public final PddlParser.assignOp_return assignOp() throws RecognitionException {
        PddlParser.assignOp_return retval = new PddlParser.assignOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set240=null;

        Object set240_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:336:10: ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set240=(Token)input.LT(1);
            if ( (input.LA(1)>=95 && input.LA(1)<=99) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignOp"

    public static class durationConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durationConstraint"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:339:1: durationConstraint : ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint );
    public final PddlParser.durationConstraint_return durationConstraint() throws RecognitionException {
        PddlParser.durationConstraint_return retval = new PddlParser.durationConstraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal241=null;
        Token string_literal242=null;
        Token char_literal244=null;
        Token char_literal245=null;
        Token char_literal246=null;
        PddlParser.simpleDurationConstraint_return simpleDurationConstraint243 = null;

        PddlParser.simpleDurationConstraint_return simpleDurationConstraint247 = null;


        Object char_literal241_tree=null;
        Object string_literal242_tree=null;
        Object char_literal244_tree=null;
        Object char_literal245_tree=null;
        Object char_literal246_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:342:2: ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' | simpleDurationConstraint )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                switch ( input.LA(2) ) {
                case 70:
                    {
                    alt49=1;
                    }
                    break;
                case 55:
                    {
                    alt49=2;
                    }
                    break;
                case 80:
                case 92:
                case 93:
                case 94:
                    {
                    alt49=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:342:4: '(' 'and' ( simpleDurationConstraint )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal241=(Token)match(input,53,FOLLOW_53_in_durationConstraint2043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal241_tree = (Object)adaptor.create(char_literal241);
                    adaptor.addChild(root_0, char_literal241_tree);
                    }
                    string_literal242=(Token)match(input,70,FOLLOW_70_in_durationConstraint2045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal242_tree = (Object)adaptor.create(string_literal242);
                    adaptor.addChild(root_0, string_literal242_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:342:14: ( simpleDurationConstraint )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==53) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: simpleDurationConstraint
                    	    {
                    	    pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2047);
                    	    simpleDurationConstraint243=simpleDurationConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint243.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    char_literal244=(Token)match(input,55,FOLLOW_55_in_durationConstraint2050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal244_tree = (Object)adaptor.create(char_literal244);
                    adaptor.addChild(root_0, char_literal244_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:343:4: '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal245=(Token)match(input,53,FOLLOW_53_in_durationConstraint2055); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal245_tree = (Object)adaptor.create(char_literal245);
                    adaptor.addChild(root_0, char_literal245_tree);
                    }
                    char_literal246=(Token)match(input,55,FOLLOW_55_in_durationConstraint2057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal246_tree = (Object)adaptor.create(char_literal246);
                    adaptor.addChild(root_0, char_literal246_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:344:4: simpleDurationConstraint
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2062);
                    simpleDurationConstraint247=simpleDurationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint247.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durationConstraint"

    public static class simpleDurationConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleDurationConstraint"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:347:1: simpleDurationConstraint : ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' );
    public final PddlParser.simpleDurationConstraint_return simpleDurationConstraint() throws RecognitionException {
        PddlParser.simpleDurationConstraint_return retval = new PddlParser.simpleDurationConstraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal248=null;
        Token string_literal250=null;
        Token char_literal252=null;
        Token char_literal253=null;
        Token string_literal254=null;
        Token char_literal257=null;
        PddlParser.durOp_return durOp249 = null;

        PddlParser.durValue_return durValue251 = null;

        PddlParser.timeSpecifier_return timeSpecifier255 = null;

        PddlParser.simpleDurationConstraint_return simpleDurationConstraint256 = null;


        Object char_literal248_tree=null;
        Object string_literal250_tree=null;
        Object char_literal252_tree=null;
        Object char_literal253_tree=null;
        Object string_literal254_tree=null;
        Object char_literal257_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:348:2: ( '(' durOp '?duration' durValue ')' | '(' 'at' timeSpecifier simpleDurationConstraint ')' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==80) ) {
                    alt50=2;
                }
                else if ( ((LA50_1>=92 && LA50_1<=94)) ) {
                    alt50=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:348:4: '(' durOp '?duration' durValue ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal248=(Token)match(input,53,FOLLOW_53_in_simpleDurationConstraint2073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal248_tree = (Object)adaptor.create(char_literal248);
                    adaptor.addChild(root_0, char_literal248_tree);
                    }
                    pushFollow(FOLLOW_durOp_in_simpleDurationConstraint2075);
                    durOp249=durOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durOp249.getTree());
                    string_literal250=(Token)match(input,100,FOLLOW_100_in_simpleDurationConstraint2077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal250_tree = (Object)adaptor.create(string_literal250);
                    adaptor.addChild(root_0, string_literal250_tree);
                    }
                    pushFollow(FOLLOW_durValue_in_simpleDurationConstraint2079);
                    durValue251=durValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, durValue251.getTree());
                    char_literal252=(Token)match(input,55,FOLLOW_55_in_simpleDurationConstraint2081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal252_tree = (Object)adaptor.create(char_literal252);
                    adaptor.addChild(root_0, char_literal252_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:349:4: '(' 'at' timeSpecifier simpleDurationConstraint ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal253=(Token)match(input,53,FOLLOW_53_in_simpleDurationConstraint2086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal253_tree = (Object)adaptor.create(char_literal253);
                    adaptor.addChild(root_0, char_literal253_tree);
                    }
                    string_literal254=(Token)match(input,80,FOLLOW_80_in_simpleDurationConstraint2088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal254_tree = (Object)adaptor.create(string_literal254);
                    adaptor.addChild(root_0, string_literal254_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_simpleDurationConstraint2090);
                    timeSpecifier255=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier255.getTree());
                    pushFollow(FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2092);
                    simpleDurationConstraint256=simpleDurationConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint256.getTree());
                    char_literal257=(Token)match(input,55,FOLLOW_55_in_simpleDurationConstraint2094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal257_tree = (Object)adaptor.create(char_literal257);
                    adaptor.addChild(root_0, char_literal257_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleDurationConstraint"

    public static class durOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durOp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:352:1: durOp : ( '<=' | '>=' | '=' );
    public final PddlParser.durOp_return durOp() throws RecognitionException {
        PddlParser.durOp_return retval = new PddlParser.durOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set258=null;

        Object set258_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:352:7: ( '<=' | '>=' | '=' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set258=(Token)input.LT(1);
            if ( (input.LA(1)>=92 && input.LA(1)<=94) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set258));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durOp"

    public static class durValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "durValue"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:1: durValue : ( NUMBER | fExp );
    public final PddlParser.durValue_return durValue() throws RecognitionException {
        PddlParser.durValue_return retval = new PddlParser.durValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER259=null;
        PddlParser.fExp_return fExp260 = null;


        Object NUMBER259_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:10: ( NUMBER | fExp )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==NUMBER) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred80_Pddl()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==NAME||LA51_0==53) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:12: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER259=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_durValue2121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER259_tree = (Object)adaptor.create(NUMBER259);
                    adaptor.addChild(root_0, NUMBER259_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:21: fExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fExp_in_durValue2125);
                    fExp260=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "durValue"

    public static class daEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "daEffect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:356:1: daEffect : ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' );
    public final PddlParser.daEffect_return daEffect() throws RecognitionException {
        PddlParser.daEffect_return retval = new PddlParser.daEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal261=null;
        Token string_literal262=null;
        Token char_literal264=null;
        Token char_literal266=null;
        Token string_literal267=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token char_literal272=null;
        Token char_literal273=null;
        Token string_literal274=null;
        Token char_literal277=null;
        Token char_literal278=null;
        Token char_literal282=null;
        PddlParser.daEffect_return daEffect263 = null;

        PddlParser.timedEffect_return timedEffect265 = null;

        PddlParser.typedVariableList_return typedVariableList269 = null;

        PddlParser.daEffect_return daEffect271 = null;

        PddlParser.daGD_return daGD275 = null;

        PddlParser.timedEffect_return timedEffect276 = null;

        PddlParser.assignOp_return assignOp279 = null;

        PddlParser.fHead_return fHead280 = null;

        PddlParser.fExpDA_return fExpDA281 = null;


        Object char_literal261_tree=null;
        Object string_literal262_tree=null;
        Object char_literal264_tree=null;
        Object char_literal266_tree=null;
        Object string_literal267_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object char_literal272_tree=null;
        Object char_literal273_tree=null;
        Object string_literal274_tree=null;
        Object char_literal277_tree=null;
        Object char_literal278_tree=null;
        Object char_literal282_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:2: ( '(' 'and' ( daEffect )* ')' | timedEffect | '(' 'forall' '(' typedVariableList ')' daEffect ')' | '(' 'when' daGD timedEffect ')' | '(' assignOp fHead fExpDA ')' )
            int alt53=5;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred82_Pddl()) ) {
                    alt53=1;
                }
                else if ( (synpred83_Pddl()) ) {
                    alt53=2;
                }
                else if ( (synpred84_Pddl()) ) {
                    alt53=3;
                }
                else if ( (synpred85_Pddl()) ) {
                    alt53=4;
                }
                else if ( (true) ) {
                    alt53=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:4: '(' 'and' ( daEffect )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal261=(Token)match(input,53,FOLLOW_53_in_daEffect2135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = (Object)adaptor.create(char_literal261);
                    adaptor.addChild(root_0, char_literal261_tree);
                    }
                    string_literal262=(Token)match(input,70,FOLLOW_70_in_daEffect2137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal262_tree = (Object)adaptor.create(string_literal262);
                    adaptor.addChild(root_0, string_literal262_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:14: ( daEffect )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==53) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: daEffect
                    	    {
                    	    pushFollow(FOLLOW_daEffect_in_daEffect2139);
                    	    daEffect263=daEffect();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect263.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    char_literal264=(Token)match(input,55,FOLLOW_55_in_daEffect2142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = (Object)adaptor.create(char_literal264);
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:358:4: timedEffect
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_timedEffect_in_daEffect2147);
                    timedEffect265=timedEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect265.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:359:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal266=(Token)match(input,53,FOLLOW_53_in_daEffect2152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal266_tree = (Object)adaptor.create(char_literal266);
                    adaptor.addChild(root_0, char_literal266_tree);
                    }
                    string_literal267=(Token)match(input,75,FOLLOW_75_in_daEffect2154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal267_tree = (Object)adaptor.create(string_literal267);
                    adaptor.addChild(root_0, string_literal267_tree);
                    }
                    char_literal268=(Token)match(input,53,FOLLOW_53_in_daEffect2156); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal268_tree = (Object)adaptor.create(char_literal268);
                    adaptor.addChild(root_0, char_literal268_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_daEffect2158);
                    typedVariableList269=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList269.getTree());
                    char_literal270=(Token)match(input,55,FOLLOW_55_in_daEffect2160); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal270_tree = (Object)adaptor.create(char_literal270);
                    adaptor.addChild(root_0, char_literal270_tree);
                    }
                    pushFollow(FOLLOW_daEffect_in_daEffect2162);
                    daEffect271=daEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect271.getTree());
                    char_literal272=(Token)match(input,55,FOLLOW_55_in_daEffect2164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal272_tree = (Object)adaptor.create(char_literal272);
                    adaptor.addChild(root_0, char_literal272_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:360:4: '(' 'when' daGD timedEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal273=(Token)match(input,53,FOLLOW_53_in_daEffect2169); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal273_tree = (Object)adaptor.create(char_literal273);
                    adaptor.addChild(root_0, char_literal273_tree);
                    }
                    string_literal274=(Token)match(input,86,FOLLOW_86_in_daEffect2171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal274_tree = (Object)adaptor.create(string_literal274);
                    adaptor.addChild(root_0, string_literal274_tree);
                    }
                    pushFollow(FOLLOW_daGD_in_daEffect2173);
                    daGD275=daGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daGD275.getTree());
                    pushFollow(FOLLOW_timedEffect_in_daEffect2175);
                    timedEffect276=timedEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect276.getTree());
                    char_literal277=(Token)match(input,55,FOLLOW_55_in_daEffect2177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal277_tree = (Object)adaptor.create(char_literal277);
                    adaptor.addChild(root_0, char_literal277_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:361:4: '(' assignOp fHead fExpDA ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal278=(Token)match(input,53,FOLLOW_53_in_daEffect2182); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal278_tree = (Object)adaptor.create(char_literal278);
                    adaptor.addChild(root_0, char_literal278_tree);
                    }
                    pushFollow(FOLLOW_assignOp_in_daEffect2184);
                    assignOp279=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp279.getTree());
                    pushFollow(FOLLOW_fHead_in_daEffect2186);
                    fHead280=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead280.getTree());
                    pushFollow(FOLLOW_fExpDA_in_daEffect2188);
                    fExpDA281=fExpDA();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA281.getTree());
                    char_literal282=(Token)match(input,55,FOLLOW_55_in_daEffect2190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal282_tree = (Object)adaptor.create(char_literal282);
                    adaptor.addChild(root_0, char_literal282_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "daEffect"

    public static class timedEffect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timedEffect"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:364:1: timedEffect : ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' );
    public final PddlParser.timedEffect_return timedEffect() throws RecognitionException {
        PddlParser.timedEffect_return retval = new PddlParser.timedEffect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal283=null;
        Token string_literal284=null;
        Token char_literal287=null;
        Token char_literal288=null;
        Token string_literal289=null;
        Token char_literal292=null;
        Token char_literal293=null;
        Token char_literal297=null;
        PddlParser.timeSpecifier_return timeSpecifier285 = null;

        PddlParser.daEffect_return daEffect286 = null;

        PddlParser.timeSpecifier_return timeSpecifier290 = null;

        PddlParser.fAssignDA_return fAssignDA291 = null;

        PddlParser.assignOp_return assignOp294 = null;

        PddlParser.fHead_return fHead295 = null;

        PddlParser.fExp_return fExp296 = null;


        Object char_literal283_tree=null;
        Object string_literal284_tree=null;
        Object char_literal287_tree=null;
        Object char_literal288_tree=null;
        Object string_literal289_tree=null;
        Object char_literal292_tree=null;
        Object char_literal293_tree=null;
        Object char_literal297_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:365:2: ( '(' 'at' timeSpecifier daEffect ')' | '(' 'at' timeSpecifier fAssignDA ')' | '(' assignOp fHead fExp ')' )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred86_Pddl()) ) {
                    alt54=1;
                }
                else if ( (synpred87_Pddl()) ) {
                    alt54=2;
                }
                else if ( (true) ) {
                    alt54=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:365:4: '(' 'at' timeSpecifier daEffect ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal283=(Token)match(input,53,FOLLOW_53_in_timedEffect2201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal283_tree = (Object)adaptor.create(char_literal283);
                    adaptor.addChild(root_0, char_literal283_tree);
                    }
                    string_literal284=(Token)match(input,80,FOLLOW_80_in_timedEffect2203); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal284_tree = (Object)adaptor.create(string_literal284);
                    adaptor.addChild(root_0, string_literal284_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedEffect2205);
                    timeSpecifier285=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier285.getTree());
                    pushFollow(FOLLOW_daEffect_in_timedEffect2207);
                    daEffect286=daEffect();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, daEffect286.getTree());
                    char_literal287=(Token)match(input,55,FOLLOW_55_in_timedEffect2209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal287_tree = (Object)adaptor.create(char_literal287);
                    adaptor.addChild(root_0, char_literal287_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:366:4: '(' 'at' timeSpecifier fAssignDA ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal288=(Token)match(input,53,FOLLOW_53_in_timedEffect2219); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal288_tree = (Object)adaptor.create(char_literal288);
                    adaptor.addChild(root_0, char_literal288_tree);
                    }
                    string_literal289=(Token)match(input,80,FOLLOW_80_in_timedEffect2221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal289_tree = (Object)adaptor.create(string_literal289);
                    adaptor.addChild(root_0, string_literal289_tree);
                    }
                    pushFollow(FOLLOW_timeSpecifier_in_timedEffect2223);
                    timeSpecifier290=timeSpecifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier290.getTree());
                    pushFollow(FOLLOW_fAssignDA_in_timedEffect2225);
                    fAssignDA291=fAssignDA();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fAssignDA291.getTree());
                    char_literal292=(Token)match(input,55,FOLLOW_55_in_timedEffect2227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal292_tree = (Object)adaptor.create(char_literal292);
                    adaptor.addChild(root_0, char_literal292_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:367:4: '(' assignOp fHead fExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal293=(Token)match(input,53,FOLLOW_53_in_timedEffect2232); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal293_tree = (Object)adaptor.create(char_literal293);
                    adaptor.addChild(root_0, char_literal293_tree);
                    }
                    pushFollow(FOLLOW_assignOp_in_timedEffect2234);
                    assignOp294=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp294.getTree());
                    pushFollow(FOLLOW_fHead_in_timedEffect2236);
                    fHead295=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead295.getTree());
                    pushFollow(FOLLOW_fExp_in_timedEffect2238);
                    fExp296=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp296.getTree());
                    char_literal297=(Token)match(input,55,FOLLOW_55_in_timedEffect2240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal297_tree = (Object)adaptor.create(char_literal297);
                    adaptor.addChild(root_0, char_literal297_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timedEffect"

    public static class fAssignDA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fAssignDA"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:370:1: fAssignDA : '(' assignOp fHead fExpDA ')' ;
    public final PddlParser.fAssignDA_return fAssignDA() throws RecognitionException {
        PddlParser.fAssignDA_return retval = new PddlParser.fAssignDA_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal298=null;
        Token char_literal302=null;
        PddlParser.assignOp_return assignOp299 = null;

        PddlParser.fHead_return fHead300 = null;

        PddlParser.fExpDA_return fExpDA301 = null;


        Object char_literal298_tree=null;
        Object char_literal302_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:371:2: ( '(' assignOp fHead fExpDA ')' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:371:4: '(' assignOp fHead fExpDA ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal298=(Token)match(input,53,FOLLOW_53_in_fAssignDA2260); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal298_tree = (Object)adaptor.create(char_literal298);
            adaptor.addChild(root_0, char_literal298_tree);
            }
            pushFollow(FOLLOW_assignOp_in_fAssignDA2262);
            assignOp299=assignOp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignOp299.getTree());
            pushFollow(FOLLOW_fHead_in_fAssignDA2264);
            fHead300=fHead();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead300.getTree());
            pushFollow(FOLLOW_fExpDA_in_fAssignDA2266);
            fExpDA301=fExpDA();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA301.getTree());
            char_literal302=(Token)match(input,55,FOLLOW_55_in_fAssignDA2268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal302_tree = (Object)adaptor.create(char_literal302);
            adaptor.addChild(root_0, char_literal302_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fAssignDA"

    public static class fExpDA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fExpDA"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:374:1: fExpDA : ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp );
    public final PddlParser.fExpDA_return fExpDA() throws RecognitionException {
        PddlParser.fExpDA_return retval = new PddlParser.fExpDA_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal303=null;
        Token char_literal307=null;
        Token char_literal309=null;
        Token string_literal310=null;
        PddlParser.binaryOp_return binaryOp304 = null;

        PddlParser.fExpDA_return fExpDA305 = null;

        PddlParser.fExpDA_return fExpDA306 = null;

        PddlParser.fExpDA_return fExpDA308 = null;

        PddlParser.fExp_return fExp311 = null;


        Object char_literal303_tree=null;
        Object char_literal307_tree=null;
        Object char_literal309_tree=null;
        Object string_literal310_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:2: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' | '?duration' | fExp )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA56_1 = input.LA(2);

                if ( (synpred89_Pddl()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case 100:
                {
                alt56=2;
                }
                break;
            case NAME:
            case NUMBER:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal303=(Token)match(input,53,FOLLOW_53_in_fExpDA2279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal303_tree = (Object)adaptor.create(char_literal303);
                    adaptor.addChild(root_0, char_literal303_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==59) ) {
                        int LA55_1 = input.LA(2);

                        if ( (synpred88_Pddl()) ) {
                            alt55=1;
                        }
                        else if ( (true) ) {
                            alt55=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 55, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA55_0>=87 && LA55_0<=89)) ) {
                        alt55=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:10: binaryOp fExpDA fExpDA
                            {
                            pushFollow(FOLLOW_binaryOp_in_fExpDA2283);
                            binaryOp304=binaryOp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp304.getTree());
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2285);
                            fExpDA305=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA305.getTree());
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2287);
                            fExpDA306=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA306.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:36: ( '-' fExpDA )
                            {
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:36: ( '-' fExpDA )
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:37: '-' fExpDA
                            {
                            char_literal307=(Token)match(input,59,FOLLOW_59_in_fExpDA2293); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal307_tree = (Object)adaptor.create(char_literal307);
                            adaptor.addChild(root_0, char_literal307_tree);
                            }
                            pushFollow(FOLLOW_fExpDA_in_fExpDA2295);
                            fExpDA308=fExpDA();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, fExpDA308.getTree());

                            }


                            }
                            break;

                    }

                    char_literal309=(Token)match(input,55,FOLLOW_55_in_fExpDA2299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal309_tree = (Object)adaptor.create(char_literal309);
                    adaptor.addChild(root_0, char_literal309_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:376:4: '?duration'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal310=(Token)match(input,100,FOLLOW_100_in_fExpDA2304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal310_tree = (Object)adaptor.create(string_literal310);
                    adaptor.addChild(root_0, string_literal310_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:377:4: fExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fExp_in_fExpDA2309);
                    fExp311=fExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp311.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fExpDA"

    public static class problem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problem"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:380:1: problem : '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) ;
    public final PddlParser.problem_return problem() throws RecognitionException {
        PddlParser.problem_return retval = new PddlParser.problem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal312=null;
        Token string_literal313=null;
        Token char_literal322=null;
        PddlParser.problemDecl_return problemDecl314 = null;

        PddlParser.problemDomain_return problemDomain315 = null;

        PddlParser.requireDef_return requireDef316 = null;

        PddlParser.objectDecl_return objectDecl317 = null;

        PddlParser.init_return init318 = null;

        PddlParser.goal_return goal319 = null;

        PddlParser.probConstraints_return probConstraints320 = null;

        PddlParser.metricSpec_return metricSpec321 = null;


        Object char_literal312_tree=null;
        Object string_literal313_tree=null;
        Object char_literal322_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_metricSpec=new RewriteRuleSubtreeStream(adaptor,"rule metricSpec");
        RewriteRuleSubtreeStream stream_objectDecl=new RewriteRuleSubtreeStream(adaptor,"rule objectDecl");
        RewriteRuleSubtreeStream stream_problemDecl=new RewriteRuleSubtreeStream(adaptor,"rule problemDecl");
        RewriteRuleSubtreeStream stream_probConstraints=new RewriteRuleSubtreeStream(adaptor,"rule probConstraints");
        RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
        RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
        RewriteRuleSubtreeStream stream_problemDomain=new RewriteRuleSubtreeStream(adaptor,"rule problemDomain");
        RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:383:2: ( '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:383:4: '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')'
            {
            char_literal312=(Token)match(input,53,FOLLOW_53_in_problem2323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal312);

            string_literal313=(Token)match(input,54,FOLLOW_54_in_problem2325); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(string_literal313);

            pushFollow(FOLLOW_problemDecl_in_problem2327);
            problemDecl314=problemDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_problemDecl.add(problemDecl314.getTree());
            pushFollow(FOLLOW_problemDomain_in_problem2332);
            problemDomain315=problemDomain();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_problemDomain.add(problemDomain315.getTree());
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:385:7: ( requireDef )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==57) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: requireDef
                    {
                    pushFollow(FOLLOW_requireDef_in_problem2340);
                    requireDef316=requireDef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_requireDef.add(requireDef316.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:386:7: ( objectDecl )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==53) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==103) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: objectDecl
                    {
                    pushFollow(FOLLOW_objectDecl_in_problem2349);
                    objectDecl317=objectDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objectDecl.add(objectDecl317.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_init_in_problem2358);
            init318=init();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init.add(init318.getTree());
            pushFollow(FOLLOW_goal_in_problem2366);
            goal319=goal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_goal.add(goal319.getTree());
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:389:7: ( probConstraints )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==65) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: probConstraints
                    {
                    pushFollow(FOLLOW_probConstraints_in_problem2374);
                    probConstraints320=probConstraints();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_probConstraints.add(probConstraints320.getTree());

                    }
                    break;

            }

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:390:7: ( metricSpec )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: metricSpec
                    {
                    pushFollow(FOLLOW_metricSpec_in_problem2383);
                    metricSpec321=metricSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_metricSpec.add(metricSpec321.getTree());

                    }
                    break;

            }

            char_literal322=(Token)match(input,55,FOLLOW_55_in_problem2399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal322);



            // AST REWRITE
            // elements: goal, problemDomain, metricSpec, requireDef, objectDecl, init, probConstraints, problemDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 393:7: -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:393:10: ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM, "PROBLEM"), root_1);

                adaptor.addChild(root_1, stream_problemDecl.nextTree());
                adaptor.addChild(root_1, stream_problemDomain.nextTree());
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:393:46: ( requireDef )?
                if ( stream_requireDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_requireDef.nextTree());

                }
                stream_requireDef.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:393:58: ( objectDecl )?
                if ( stream_objectDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_objectDecl.nextTree());

                }
                stream_objectDecl.reset();
                adaptor.addChild(root_1, stream_init.nextTree());
                adaptor.addChild(root_1, stream_goal.nextTree());
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:394:19: ( probConstraints )?
                if ( stream_probConstraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_probConstraints.nextTree());

                }
                stream_probConstraints.reset();
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:394:36: ( metricSpec )?
                if ( stream_metricSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_metricSpec.nextTree());

                }
                stream_metricSpec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problem"

    public static class problemDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problemDecl"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:397:1: problemDecl : '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) ;
    public final PddlParser.problemDecl_return problemDecl() throws RecognitionException {
        PddlParser.problemDecl_return retval = new PddlParser.problemDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal323=null;
        Token string_literal324=null;
        Token NAME325=null;
        Token char_literal326=null;

        Object char_literal323_tree=null;
        Object string_literal324_tree=null;
        Object NAME325_tree=null;
        Object char_literal326_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:398:5: ( '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:398:7: '(' 'problem' NAME ')'
            {
            char_literal323=(Token)match(input,53,FOLLOW_53_in_problemDecl2456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal323);

            string_literal324=(Token)match(input,101,FOLLOW_101_in_problemDecl2458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(string_literal324);

            NAME325=(Token)match(input,NAME,FOLLOW_NAME_in_problemDecl2460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME325);

            char_literal326=(Token)match(input,55,FOLLOW_55_in_problemDecl2462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal326);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 399:5: -> ^( PROBLEM_NAME NAME )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:399:8: ^( PROBLEM_NAME NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_NAME, "PROBLEM_NAME"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problemDecl"

    public static class problemDomain_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "problemDomain"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:402:1: problemDomain : '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) ;
    public final PddlParser.problemDomain_return problemDomain() throws RecognitionException {
        PddlParser.problemDomain_return retval = new PddlParser.problemDomain_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal327=null;
        Token string_literal328=null;
        Token NAME329=null;
        Token char_literal330=null;

        Object char_literal327_tree=null;
        Object string_literal328_tree=null;
        Object NAME329_tree=null;
        Object char_literal330_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:403:2: ( '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:403:4: '(' ':domain' NAME ')'
            {
            char_literal327=(Token)match(input,53,FOLLOW_53_in_problemDomain2488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal327);

            string_literal328=(Token)match(input,102,FOLLOW_102_in_problemDomain2490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(string_literal328);

            NAME329=(Token)match(input,NAME,FOLLOW_NAME_in_problemDomain2492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NAME.add(NAME329);

            char_literal330=(Token)match(input,55,FOLLOW_55_in_problemDomain2494); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal330);



            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 404:2: -> ^( PROBLEM_DOMAIN NAME )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:404:5: ^( PROBLEM_DOMAIN NAME )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_DOMAIN, "PROBLEM_DOMAIN"), root_1);

                adaptor.addChild(root_1, stream_NAME.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "problemDomain"

    public static class objectDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectDecl"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:407:1: objectDecl : '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) ;
    public final PddlParser.objectDecl_return objectDecl() throws RecognitionException {
        PddlParser.objectDecl_return retval = new PddlParser.objectDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal331=null;
        Token string_literal332=null;
        Token char_literal334=null;
        PddlParser.typedNameList_return typedNameList333 = null;


        Object char_literal331_tree=null;
        Object string_literal332_tree=null;
        Object char_literal334_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:408:2: ( '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:408:4: '(' ':objects' typedNameList ')'
            {
            char_literal331=(Token)match(input,53,FOLLOW_53_in_objectDecl2514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal331);

            string_literal332=(Token)match(input,103,FOLLOW_103_in_objectDecl2516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(string_literal332);

            pushFollow(FOLLOW_typedNameList_in_objectDecl2518);
            typedNameList333=typedNameList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList333.getTree());
            char_literal334=(Token)match(input,55,FOLLOW_55_in_objectDecl2520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal334);



            // AST REWRITE
            // elements: typedNameList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 409:2: -> ^( OBJECTS typedNameList )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:409:5: ^( OBJECTS typedNameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECTS, "OBJECTS"), root_1);

                adaptor.addChild(root_1, stream_typedNameList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectDecl"

    public static class init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:412:1: init : '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) ;
    public final PddlParser.init_return init() throws RecognitionException {
        PddlParser.init_return retval = new PddlParser.init_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal335=null;
        Token string_literal336=null;
        Token char_literal338=null;
        PddlParser.initEl_return initEl337 = null;


        Object char_literal335_tree=null;
        Object string_literal336_tree=null;
        Object char_literal338_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_initEl=new RewriteRuleSubtreeStream(adaptor,"rule initEl");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:413:2: ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:413:4: '(' ':init' ( initEl )* ')'
            {
            char_literal335=(Token)match(input,53,FOLLOW_53_in_init2540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal335);

            string_literal336=(Token)match(input,104,FOLLOW_104_in_init2542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(string_literal336);

            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:413:16: ( initEl )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==53) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: initEl
            	    {
            	    pushFollow(FOLLOW_initEl_in_init2544);
            	    initEl337=initEl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_initEl.add(initEl337.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            char_literal338=(Token)match(input,55,FOLLOW_55_in_init2547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal338);



            // AST REWRITE
            // elements: initEl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 414:2: -> ^( INIT ( initEl )* )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:414:5: ^( INIT ( initEl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);

                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:414:12: ( initEl )*
                while ( stream_initEl.hasNext() ) {
                    adaptor.addChild(root_1, stream_initEl.nextTree());

                }
                stream_initEl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class initEl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initEl"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:417:1: initEl : ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) );
    public final PddlParser.initEl_return initEl() throws RecognitionException {
        PddlParser.initEl_return retval = new PddlParser.initEl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal340=null;
        Token char_literal341=null;
        Token NUMBER343=null;
        Token char_literal344=null;
        Token char_literal345=null;
        Token string_literal346=null;
        Token NUMBER347=null;
        Token char_literal349=null;
        PddlParser.nameLiteral_return nameLiteral339 = null;

        PddlParser.fHead_return fHead342 = null;

        PddlParser.nameLiteral_return nameLiteral348 = null;


        Object char_literal340_tree=null;
        Object char_literal341_tree=null;
        Object NUMBER343_tree=null;
        Object char_literal344_tree=null;
        Object char_literal345_tree=null;
        Object string_literal346_tree=null;
        Object NUMBER347_tree=null;
        Object char_literal349_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
        RewriteRuleSubtreeStream stream_nameLiteral=new RewriteRuleSubtreeStream(adaptor,"rule nameLiteral");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:418:2: ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                switch ( input.LA(2) ) {
                case NAME:
                case 72:
                    {
                    alt62=1;
                    }
                    break;
                case 92:
                    {
                    alt62=2;
                    }
                    break;
                case 80:
                    {
                    alt62=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:418:4: nameLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nameLiteral_in_initEl2568);
                    nameLiteral339=nameLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nameLiteral339.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:419:4: '(' '=' fHead NUMBER ')'
                    {
                    char_literal340=(Token)match(input,53,FOLLOW_53_in_initEl2573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal340);

                    char_literal341=(Token)match(input,92,FOLLOW_92_in_initEl2575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal341);

                    pushFollow(FOLLOW_fHead_in_initEl2577);
                    fHead342=fHead();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fHead.add(fHead342.getTree());
                    NUMBER343=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER343);

                    char_literal344=(Token)match(input,55,FOLLOW_55_in_initEl2581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal344);



                    // AST REWRITE
                    // elements: NUMBER, fHead
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:37: -> ^( INIT_EQ fHead NUMBER )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:419:40: ^( INIT_EQ fHead NUMBER )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);

                        adaptor.addChild(root_1, stream_fHead.nextTree());
                        adaptor.addChild(root_1, stream_NUMBER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:420:4: '(' 'at' NUMBER nameLiteral ')'
                    {
                    char_literal345=(Token)match(input,53,FOLLOW_53_in_initEl2604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal345);

                    string_literal346=(Token)match(input,80,FOLLOW_80_in_initEl2606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(string_literal346);

                    NUMBER347=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl2608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER347);

                    pushFollow(FOLLOW_nameLiteral_in_initEl2610);
                    nameLiteral348=nameLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral348.getTree());
                    char_literal349=(Token)match(input,55,FOLLOW_55_in_initEl2612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal349);



                    // AST REWRITE
                    // elements: nameLiteral, NUMBER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 420:37: -> ^( INIT_AT NUMBER nameLiteral )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:420:40: ^( INIT_AT NUMBER nameLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_AT, "INIT_AT"), root_1);

                        adaptor.addChild(root_1, stream_NUMBER.nextNode());
                        adaptor.addChild(root_1, stream_nameLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "initEl"

    public static class nameLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameLiteral"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:423:1: nameLiteral : ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) );
    public final PddlParser.nameLiteral_return nameLiteral() throws RecognitionException {
        PddlParser.nameLiteral_return retval = new PddlParser.nameLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal351=null;
        Token string_literal352=null;
        Token char_literal354=null;
        PddlParser.atomicNameFormula_return atomicNameFormula350 = null;

        PddlParser.atomicNameFormula_return atomicNameFormula353 = null;


        Object char_literal351_tree=null;
        Object string_literal352_tree=null;
        Object char_literal354_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:424:2: ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==53) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==72) ) {
                    alt63=2;
                }
                else if ( (LA63_1==NAME) ) {
                    alt63=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:424:4: atomicNameFormula
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2634);
                    atomicNameFormula350=atomicNameFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicNameFormula350.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:425:4: '(' 'not' atomicNameFormula ')'
                    {
                    char_literal351=(Token)match(input,53,FOLLOW_53_in_nameLiteral2639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal351);

                    string_literal352=(Token)match(input,72,FOLLOW_72_in_nameLiteral2641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal352);

                    pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral2643);
                    atomicNameFormula353=atomicNameFormula();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula353.getTree());
                    char_literal354=(Token)match(input,55,FOLLOW_55_in_nameLiteral2645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal354);



                    // AST REWRITE
                    // elements: atomicNameFormula
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:36: -> ^( NOT_PRED_INIT atomicNameFormula )
                    {
                        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:425:39: ^( NOT_PRED_INIT atomicNameFormula )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_PRED_INIT, "NOT_PRED_INIT"), root_1);

                        adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameLiteral"

    public static class atomicNameFormula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomicNameFormula"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:428:1: atomicNameFormula : '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) ;
    public final PddlParser.atomicNameFormula_return atomicNameFormula() throws RecognitionException {
        PddlParser.atomicNameFormula_return retval = new PddlParser.atomicNameFormula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal355=null;
        Token NAME357=null;
        Token char_literal358=null;
        PddlParser.predicate_return predicate356 = null;


        Object char_literal355_tree=null;
        Object NAME357_tree=null;
        Object char_literal358_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:429:2: ( '(' predicate ( NAME )* ')' -> ^( PRED_INST predicate ( NAME )* ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:429:4: '(' predicate ( NAME )* ')'
            {
            char_literal355=(Token)match(input,53,FOLLOW_53_in_atomicNameFormula2664); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal355);

            pushFollow(FOLLOW_predicate_in_atomicNameFormula2666);
            predicate356=predicate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_predicate.add(predicate356.getTree());
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:429:18: ( NAME )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==NAME) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
            	    {
            	    NAME357=(Token)match(input,NAME,FOLLOW_NAME_in_atomicNameFormula2668); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NAME.add(NAME357);


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            char_literal358=(Token)match(input,55,FOLLOW_55_in_atomicNameFormula2671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal358);



            // AST REWRITE
            // elements: predicate, NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 429:28: -> ^( PRED_INST predicate ( NAME )* )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:429:31: ^( PRED_INST predicate ( NAME )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_INST, "PRED_INST"), root_1);

                adaptor.addChild(root_1, stream_predicate.nextTree());
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:429:53: ( NAME )*
                while ( stream_NAME.hasNext() ) {
                    adaptor.addChild(root_1, stream_NAME.nextNode());

                }
                stream_NAME.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomicNameFormula"

    public static class goal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "goal"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:436:1: goal : '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) ;
    public final PddlParser.goal_return goal() throws RecognitionException {
        PddlParser.goal_return retval = new PddlParser.goal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal359=null;
        Token string_literal360=null;
        Token char_literal362=null;
        PddlParser.goalDesc_return goalDesc361 = null;


        Object char_literal359_tree=null;
        Object string_literal360_tree=null;
        Object char_literal362_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_goalDesc=new RewriteRuleSubtreeStream(adaptor,"rule goalDesc");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:436:6: ( '(' ':goal' goalDesc ')' -> ^( GOAL goalDesc ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:436:8: '(' ':goal' goalDesc ')'
            {
            char_literal359=(Token)match(input,53,FOLLOW_53_in_goal2696); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal359);

            string_literal360=(Token)match(input,105,FOLLOW_105_in_goal2698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(string_literal360);

            pushFollow(FOLLOW_goalDesc_in_goal2700);
            goalDesc361=goalDesc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_goalDesc.add(goalDesc361.getTree());
            char_literal362=(Token)match(input,55,FOLLOW_55_in_goal2702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal362);



            // AST REWRITE
            // elements: goalDesc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 436:33: -> ^( GOAL goalDesc )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:436:36: ^( GOAL goalDesc )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOAL, "GOAL"), root_1);

                adaptor.addChild(root_1, stream_goalDesc.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "goal"

    public static class probConstraints_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "probConstraints"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:438:1: probConstraints : '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) ;
    public final PddlParser.probConstraints_return probConstraints() throws RecognitionException {
        PddlParser.probConstraints_return retval = new PddlParser.probConstraints_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal363=null;
        Token string_literal364=null;
        Token char_literal366=null;
        PddlParser.prefConGD_return prefConGD365 = null;


        Object char_literal363_tree=null;
        Object string_literal364_tree=null;
        Object char_literal366_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_prefConGD=new RewriteRuleSubtreeStream(adaptor,"rule prefConGD");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:439:2: ( '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:439:4: '(' ':constraints' prefConGD ')'
            {
            char_literal363=(Token)match(input,53,FOLLOW_53_in_probConstraints2720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal363);

            string_literal364=(Token)match(input,65,FOLLOW_65_in_probConstraints2722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(string_literal364);

            pushFollow(FOLLOW_prefConGD_in_probConstraints2725);
            prefConGD365=prefConGD();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_prefConGD.add(prefConGD365.getTree());
            char_literal366=(Token)match(input,55,FOLLOW_55_in_probConstraints2727); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal366);



            // AST REWRITE
            // elements: prefConGD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 440:4: -> ^( PROBLEM_CONSTRAINT prefConGD )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:440:7: ^( PROBLEM_CONSTRAINT prefConGD )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_CONSTRAINT, "PROBLEM_CONSTRAINT"), root_1);

                adaptor.addChild(root_1, stream_prefConGD.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "probConstraints"

    public static class prefConGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefConGD"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:443:1: prefConGD : ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD );
    public final PddlParser.prefConGD_return prefConGD() throws RecognitionException {
        PddlParser.prefConGD_return retval = new PddlParser.prefConGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal367=null;
        Token string_literal368=null;
        Token char_literal370=null;
        Token char_literal371=null;
        Token string_literal372=null;
        Token char_literal373=null;
        Token char_literal375=null;
        Token char_literal377=null;
        Token char_literal378=null;
        Token string_literal379=null;
        Token NAME380=null;
        Token char_literal382=null;
        PddlParser.prefConGD_return prefConGD369 = null;

        PddlParser.typedVariableList_return typedVariableList374 = null;

        PddlParser.prefConGD_return prefConGD376 = null;

        PddlParser.conGD_return conGD381 = null;

        PddlParser.conGD_return conGD383 = null;


        Object char_literal367_tree=null;
        Object string_literal368_tree=null;
        Object char_literal370_tree=null;
        Object char_literal371_tree=null;
        Object string_literal372_tree=null;
        Object char_literal373_tree=null;
        Object char_literal375_tree=null;
        Object char_literal377_tree=null;
        Object char_literal378_tree=null;
        Object string_literal379_tree=null;
        Object NAME380_tree=null;
        Object char_literal382_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:2: ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD )
            int alt67=4;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred101_Pddl()) ) {
                    alt67=1;
                }
                else if ( (synpred102_Pddl()) ) {
                    alt67=2;
                }
                else if ( (synpred104_Pddl()) ) {
                    alt67=3;
                }
                else if ( (true) ) {
                    alt67=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:4: '(' 'and' ( prefConGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal367=(Token)match(input,53,FOLLOW_53_in_prefConGD2749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal367_tree = (Object)adaptor.create(char_literal367);
                    adaptor.addChild(root_0, char_literal367_tree);
                    }
                    string_literal368=(Token)match(input,70,FOLLOW_70_in_prefConGD2751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal368_tree = (Object)adaptor.create(string_literal368);
                    adaptor.addChild(root_0, string_literal368_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:14: ( prefConGD )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==53) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: prefConGD
                    	    {
                    	    pushFollow(FOLLOW_prefConGD_in_prefConGD2753);
                    	    prefConGD369=prefConGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD369.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    char_literal370=(Token)match(input,55,FOLLOW_55_in_prefConGD2756); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal370_tree = (Object)adaptor.create(char_literal370);
                    adaptor.addChild(root_0, char_literal370_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:445:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal371=(Token)match(input,53,FOLLOW_53_in_prefConGD2761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal371_tree = (Object)adaptor.create(char_literal371);
                    adaptor.addChild(root_0, char_literal371_tree);
                    }
                    string_literal372=(Token)match(input,75,FOLLOW_75_in_prefConGD2763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal372_tree = (Object)adaptor.create(string_literal372);
                    adaptor.addChild(root_0, string_literal372_tree);
                    }
                    char_literal373=(Token)match(input,53,FOLLOW_53_in_prefConGD2765); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal373_tree = (Object)adaptor.create(char_literal373);
                    adaptor.addChild(root_0, char_literal373_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_prefConGD2767);
                    typedVariableList374=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList374.getTree());
                    char_literal375=(Token)match(input,55,FOLLOW_55_in_prefConGD2769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal375_tree = (Object)adaptor.create(char_literal375);
                    adaptor.addChild(root_0, char_literal375_tree);
                    }
                    pushFollow(FOLLOW_prefConGD_in_prefConGD2771);
                    prefConGD376=prefConGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD376.getTree());
                    char_literal377=(Token)match(input,55,FOLLOW_55_in_prefConGD2773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal377_tree = (Object)adaptor.create(char_literal377);
                    adaptor.addChild(root_0, char_literal377_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:446:4: '(' 'preference' ( NAME )? conGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal378=(Token)match(input,53,FOLLOW_53_in_prefConGD2778); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal378_tree = (Object)adaptor.create(char_literal378);
                    adaptor.addChild(root_0, char_literal378_tree);
                    }
                    string_literal379=(Token)match(input,79,FOLLOW_79_in_prefConGD2780); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal379_tree = (Object)adaptor.create(string_literal379);
                    adaptor.addChild(root_0, string_literal379_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:446:21: ( NAME )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==NAME) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                            {
                            NAME380=(Token)match(input,NAME,FOLLOW_NAME_in_prefConGD2782); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAME380_tree = (Object)adaptor.create(NAME380);
                            adaptor.addChild(root_0, NAME380_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_conGD_in_prefConGD2785);
                    conGD381=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD381.getTree());
                    char_literal382=(Token)match(input,55,FOLLOW_55_in_prefConGD2787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = (Object)adaptor.create(char_literal382);
                    adaptor.addChild(root_0, char_literal382_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:447:4: conGD
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conGD_in_prefConGD2792);
                    conGD383=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD383.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefConGD"

    public static class metricSpec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metricSpec"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:450:1: metricSpec : '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) ;
    public final PddlParser.metricSpec_return metricSpec() throws RecognitionException {
        PddlParser.metricSpec_return retval = new PddlParser.metricSpec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal384=null;
        Token string_literal385=null;
        Token char_literal388=null;
        PddlParser.optimization_return optimization386 = null;

        PddlParser.metricFExp_return metricFExp387 = null;


        Object char_literal384_tree=null;
        Object string_literal385_tree=null;
        Object char_literal388_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_optimization=new RewriteRuleSubtreeStream(adaptor,"rule optimization");
        RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:451:2: ( '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:451:4: '(' ':metric' optimization metricFExp ')'
            {
            char_literal384=(Token)match(input,53,FOLLOW_53_in_metricSpec2803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal384);

            string_literal385=(Token)match(input,106,FOLLOW_106_in_metricSpec2805); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal385);

            pushFollow(FOLLOW_optimization_in_metricSpec2807);
            optimization386=optimization();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_optimization.add(optimization386.getTree());
            pushFollow(FOLLOW_metricFExp_in_metricSpec2809);
            metricFExp387=metricFExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp387.getTree());
            char_literal388=(Token)match(input,55,FOLLOW_55_in_metricSpec2811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal388);



            // AST REWRITE
            // elements: metricFExp, optimization
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 452:4: -> ^( PROBLEM_METRIC optimization metricFExp )
            {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:452:7: ^( PROBLEM_METRIC optimization metricFExp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_METRIC, "PROBLEM_METRIC"), root_1);

                adaptor.addChild(root_1, stream_optimization.nextTree());
                adaptor.addChild(root_1, stream_metricFExp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "metricSpec"

    public static class optimization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optimization"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:455:1: optimization : ( 'minimize' | 'maximize' );
    public final PddlParser.optimization_return optimization() throws RecognitionException {
        PddlParser.optimization_return retval = new PddlParser.optimization_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set389=null;

        Object set389_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:455:14: ( 'minimize' | 'maximize' )
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:
            {
            root_0 = (Object)adaptor.nil();

            set389=(Token)input.LT(1);
            if ( (input.LA(1)>=107 && input.LA(1)<=108) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set389));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optimization"

    public static class metricFExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "metricFExp"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:457:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' );
    public final PddlParser.metricFExp_return metricFExp() throws RecognitionException {
        PddlParser.metricFExp_return retval = new PddlParser.metricFExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal390=null;
        Token char_literal394=null;
        Token char_literal395=null;
        Token set396=null;
        Token char_literal399=null;
        Token char_literal400=null;
        Token char_literal401=null;
        Token char_literal403=null;
        Token NUMBER404=null;
        Token char_literal405=null;
        Token NAME407=null;
        Token char_literal408=null;
        Token string_literal410=null;
        Token char_literal411=null;
        Token string_literal412=null;
        Token NAME413=null;
        Token char_literal414=null;
        PddlParser.binaryOp_return binaryOp391 = null;

        PddlParser.metricFExp_return metricFExp392 = null;

        PddlParser.metricFExp_return metricFExp393 = null;

        PddlParser.metricFExp_return metricFExp397 = null;

        PddlParser.metricFExp_return metricFExp398 = null;

        PddlParser.metricFExp_return metricFExp402 = null;

        PddlParser.functionSymbol_return functionSymbol406 = null;

        PddlParser.functionSymbol_return functionSymbol409 = null;


        Object char_literal390_tree=null;
        Object char_literal394_tree=null;
        Object char_literal395_tree=null;
        Object set396_tree=null;
        Object char_literal399_tree=null;
        Object char_literal400_tree=null;
        Object char_literal401_tree=null;
        Object char_literal403_tree=null;
        Object NUMBER404_tree=null;
        Object char_literal405_tree=null;
        Object NAME407_tree=null;
        Object char_literal408_tree=null;
        Object string_literal410_tree=null;
        Object char_literal411_tree=null;
        Object string_literal412_tree=null;
        Object NAME413_tree=null;
        Object char_literal414_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:458:2: ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' )
            int alt70=8;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:458:4: '(' binaryOp metricFExp metricFExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal390=(Token)match(input,53,FOLLOW_53_in_metricFExp2848); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal390_tree = (Object)adaptor.create(char_literal390);
                    adaptor.addChild(root_0, char_literal390_tree);
                    }
                    pushFollow(FOLLOW_binaryOp_in_metricFExp2850);
                    binaryOp391=binaryOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryOp391.getTree());
                    pushFollow(FOLLOW_metricFExp_in_metricFExp2852);
                    metricFExp392=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp392.getTree());
                    pushFollow(FOLLOW_metricFExp_in_metricFExp2854);
                    metricFExp393=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp393.getTree());
                    char_literal394=(Token)match(input,55,FOLLOW_55_in_metricFExp2856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal394_tree = (Object)adaptor.create(char_literal394);
                    adaptor.addChild(root_0, char_literal394_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:459:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal395=(Token)match(input,53,FOLLOW_53_in_metricFExp2861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal395_tree = (Object)adaptor.create(char_literal395);
                    adaptor.addChild(root_0, char_literal395_tree);
                    }
                    set396=(Token)input.LT(1);
                    if ( input.LA(1)==87||input.LA(1)==89 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set396));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_metricFExp_in_metricFExp2869);
                    metricFExp397=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp397.getTree());
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:459:29: ( metricFExp )+
                    int cnt68=0;
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==NAME||LA68_0==NUMBER||LA68_0==53||LA68_0==109) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: metricFExp
                    	    {
                    	    pushFollow(FOLLOW_metricFExp_in_metricFExp2871);
                    	    metricFExp398=metricFExp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp398.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt68 >= 1 ) break loop68;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(68, input);
                                throw eee;
                        }
                        cnt68++;
                    } while (true);

                    char_literal399=(Token)match(input,55,FOLLOW_55_in_metricFExp2874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal399_tree = (Object)adaptor.create(char_literal399);
                    adaptor.addChild(root_0, char_literal399_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:460:4: '(' '-' metricFExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal400=(Token)match(input,53,FOLLOW_53_in_metricFExp2879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal400_tree = (Object)adaptor.create(char_literal400);
                    adaptor.addChild(root_0, char_literal400_tree);
                    }
                    char_literal401=(Token)match(input,59,FOLLOW_59_in_metricFExp2881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal401_tree = (Object)adaptor.create(char_literal401);
                    adaptor.addChild(root_0, char_literal401_tree);
                    }
                    pushFollow(FOLLOW_metricFExp_in_metricFExp2883);
                    metricFExp402=metricFExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metricFExp402.getTree());
                    char_literal403=(Token)match(input,55,FOLLOW_55_in_metricFExp2885); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal403_tree = (Object)adaptor.create(char_literal403);
                    adaptor.addChild(root_0, char_literal403_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:461:4: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER404=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metricFExp2890); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER404_tree = (Object)adaptor.create(NUMBER404);
                    adaptor.addChild(root_0, NUMBER404_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:462:4: '(' functionSymbol ( NAME )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal405=(Token)match(input,53,FOLLOW_53_in_metricFExp2895); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal405_tree = (Object)adaptor.create(char_literal405);
                    adaptor.addChild(root_0, char_literal405_tree);
                    }
                    pushFollow(FOLLOW_functionSymbol_in_metricFExp2897);
                    functionSymbol406=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol406.getTree());
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:462:23: ( NAME )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==NAME) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                    	    {
                    	    NAME407=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp2899); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NAME407_tree = (Object)adaptor.create(NAME407);
                    	    adaptor.addChild(root_0, NAME407_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    char_literal408=(Token)match(input,55,FOLLOW_55_in_metricFExp2902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal408_tree = (Object)adaptor.create(char_literal408);
                    adaptor.addChild(root_0, char_literal408_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:463:4: functionSymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionSymbol_in_metricFExp2907);
                    functionSymbol409=functionSymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionSymbol409.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:464:7: 'total-time'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal410=(Token)match(input,109,FOLLOW_109_in_metricFExp2915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal410_tree = (Object)adaptor.create(string_literal410);
                    adaptor.addChild(root_0, string_literal410_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:465:4: '(' 'is-violated' NAME ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal411=(Token)match(input,53,FOLLOW_53_in_metricFExp2920); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal411_tree = (Object)adaptor.create(char_literal411);
                    adaptor.addChild(root_0, char_literal411_tree);
                    }
                    string_literal412=(Token)match(input,110,FOLLOW_110_in_metricFExp2922); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal412_tree = (Object)adaptor.create(string_literal412);
                    adaptor.addChild(root_0, string_literal412_tree);
                    }
                    NAME413=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp2924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME413_tree = (Object)adaptor.create(NAME413);
                    adaptor.addChild(root_0, NAME413_tree);
                    }
                    char_literal414=(Token)match(input,55,FOLLOW_55_in_metricFExp2926); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal414_tree = (Object)adaptor.create(char_literal414);
                    adaptor.addChild(root_0, char_literal414_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "metricFExp"

    public static class conGD_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conGD"
    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:468:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );
    public final PddlParser.conGD_return conGD() throws RecognitionException {
        PddlParser.conGD_return retval = new PddlParser.conGD_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal415=null;
        Token string_literal416=null;
        Token char_literal418=null;
        Token char_literal419=null;
        Token string_literal420=null;
        Token char_literal421=null;
        Token char_literal423=null;
        Token char_literal425=null;
        Token char_literal426=null;
        Token string_literal427=null;
        Token string_literal428=null;
        Token char_literal430=null;
        Token char_literal431=null;
        Token string_literal432=null;
        Token char_literal434=null;
        Token char_literal435=null;
        Token string_literal436=null;
        Token char_literal438=null;
        Token char_literal439=null;
        Token string_literal440=null;
        Token NUMBER441=null;
        Token char_literal443=null;
        Token char_literal444=null;
        Token string_literal445=null;
        Token char_literal447=null;
        Token char_literal448=null;
        Token string_literal449=null;
        Token char_literal452=null;
        Token char_literal453=null;
        Token string_literal454=null;
        Token char_literal457=null;
        Token char_literal458=null;
        Token string_literal459=null;
        Token NUMBER460=null;
        Token char_literal463=null;
        Token char_literal464=null;
        Token string_literal465=null;
        Token NUMBER466=null;
        Token NUMBER467=null;
        Token char_literal469=null;
        Token char_literal470=null;
        Token string_literal471=null;
        Token NUMBER472=null;
        Token char_literal474=null;
        PddlParser.conGD_return conGD417 = null;

        PddlParser.typedVariableList_return typedVariableList422 = null;

        PddlParser.conGD_return conGD424 = null;

        PddlParser.goalDesc_return goalDesc429 = null;

        PddlParser.goalDesc_return goalDesc433 = null;

        PddlParser.goalDesc_return goalDesc437 = null;

        PddlParser.goalDesc_return goalDesc442 = null;

        PddlParser.goalDesc_return goalDesc446 = null;

        PddlParser.goalDesc_return goalDesc450 = null;

        PddlParser.goalDesc_return goalDesc451 = null;

        PddlParser.goalDesc_return goalDesc455 = null;

        PddlParser.goalDesc_return goalDesc456 = null;

        PddlParser.goalDesc_return goalDesc461 = null;

        PddlParser.goalDesc_return goalDesc462 = null;

        PddlParser.goalDesc_return goalDesc468 = null;

        PddlParser.goalDesc_return goalDesc473 = null;


        Object char_literal415_tree=null;
        Object string_literal416_tree=null;
        Object char_literal418_tree=null;
        Object char_literal419_tree=null;
        Object string_literal420_tree=null;
        Object char_literal421_tree=null;
        Object char_literal423_tree=null;
        Object char_literal425_tree=null;
        Object char_literal426_tree=null;
        Object string_literal427_tree=null;
        Object string_literal428_tree=null;
        Object char_literal430_tree=null;
        Object char_literal431_tree=null;
        Object string_literal432_tree=null;
        Object char_literal434_tree=null;
        Object char_literal435_tree=null;
        Object string_literal436_tree=null;
        Object char_literal438_tree=null;
        Object char_literal439_tree=null;
        Object string_literal440_tree=null;
        Object NUMBER441_tree=null;
        Object char_literal443_tree=null;
        Object char_literal444_tree=null;
        Object string_literal445_tree=null;
        Object char_literal447_tree=null;
        Object char_literal448_tree=null;
        Object string_literal449_tree=null;
        Object char_literal452_tree=null;
        Object char_literal453_tree=null;
        Object string_literal454_tree=null;
        Object char_literal457_tree=null;
        Object char_literal458_tree=null;
        Object string_literal459_tree=null;
        Object NUMBER460_tree=null;
        Object char_literal463_tree=null;
        Object char_literal464_tree=null;
        Object string_literal465_tree=null;
        Object NUMBER466_tree=null;
        Object NUMBER467_tree=null;
        Object char_literal469_tree=null;
        Object char_literal470_tree=null;
        Object string_literal471_tree=null;
        Object NUMBER472_tree=null;
        Object char_literal474_tree=null;

        try {
            // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:471:2: ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' )
            int alt72=12;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:471:4: '(' 'and' ( conGD )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal415=(Token)match(input,53,FOLLOW_53_in_conGD2940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal415_tree = (Object)adaptor.create(char_literal415);
                    adaptor.addChild(root_0, char_literal415_tree);
                    }
                    string_literal416=(Token)match(input,70,FOLLOW_70_in_conGD2942); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal416_tree = (Object)adaptor.create(string_literal416);
                    adaptor.addChild(root_0, string_literal416_tree);
                    }
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:471:14: ( conGD )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==53) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: conGD
                    	    {
                    	    pushFollow(FOLLOW_conGD_in_conGD2944);
                    	    conGD417=conGD();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD417.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    char_literal418=(Token)match(input,55,FOLLOW_55_in_conGD2947); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal418_tree = (Object)adaptor.create(char_literal418);
                    adaptor.addChild(root_0, char_literal418_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:472:4: '(' 'forall' '(' typedVariableList ')' conGD ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal419=(Token)match(input,53,FOLLOW_53_in_conGD2952); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = (Object)adaptor.create(char_literal419);
                    adaptor.addChild(root_0, char_literal419_tree);
                    }
                    string_literal420=(Token)match(input,75,FOLLOW_75_in_conGD2954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal420_tree = (Object)adaptor.create(string_literal420);
                    adaptor.addChild(root_0, string_literal420_tree);
                    }
                    char_literal421=(Token)match(input,53,FOLLOW_53_in_conGD2956); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal421_tree = (Object)adaptor.create(char_literal421);
                    adaptor.addChild(root_0, char_literal421_tree);
                    }
                    pushFollow(FOLLOW_typedVariableList_in_conGD2958);
                    typedVariableList422=typedVariableList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList422.getTree());
                    char_literal423=(Token)match(input,55,FOLLOW_55_in_conGD2960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal423_tree = (Object)adaptor.create(char_literal423);
                    adaptor.addChild(root_0, char_literal423_tree);
                    }
                    pushFollow(FOLLOW_conGD_in_conGD2962);
                    conGD424=conGD();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD424.getTree());
                    char_literal425=(Token)match(input,55,FOLLOW_55_in_conGD2964); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal425_tree = (Object)adaptor.create(char_literal425);
                    adaptor.addChild(root_0, char_literal425_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:473:4: '(' 'at' 'end' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal426=(Token)match(input,53,FOLLOW_53_in_conGD2969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal426_tree = (Object)adaptor.create(char_literal426);
                    adaptor.addChild(root_0, char_literal426_tree);
                    }
                    string_literal427=(Token)match(input,80,FOLLOW_80_in_conGD2971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal427_tree = (Object)adaptor.create(string_literal427);
                    adaptor.addChild(root_0, string_literal427_tree);
                    }
                    string_literal428=(Token)match(input,83,FOLLOW_83_in_conGD2973); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal428_tree = (Object)adaptor.create(string_literal428);
                    adaptor.addChild(root_0, string_literal428_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD2975);
                    goalDesc429=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc429.getTree());
                    char_literal430=(Token)match(input,55,FOLLOW_55_in_conGD2977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal430_tree = (Object)adaptor.create(char_literal430);
                    adaptor.addChild(root_0, char_literal430_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:474:7: '(' 'always' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal431=(Token)match(input,53,FOLLOW_53_in_conGD2985); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal431_tree = (Object)adaptor.create(char_literal431);
                    adaptor.addChild(root_0, char_literal431_tree);
                    }
                    string_literal432=(Token)match(input,111,FOLLOW_111_in_conGD2987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal432_tree = (Object)adaptor.create(string_literal432);
                    adaptor.addChild(root_0, string_literal432_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD2989);
                    goalDesc433=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc433.getTree());
                    char_literal434=(Token)match(input,55,FOLLOW_55_in_conGD2991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal434_tree = (Object)adaptor.create(char_literal434);
                    adaptor.addChild(root_0, char_literal434_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:475:4: '(' 'sometime' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal435=(Token)match(input,53,FOLLOW_53_in_conGD2996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal435_tree = (Object)adaptor.create(char_literal435);
                    adaptor.addChild(root_0, char_literal435_tree);
                    }
                    string_literal436=(Token)match(input,112,FOLLOW_112_in_conGD2998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal436_tree = (Object)adaptor.create(string_literal436);
                    adaptor.addChild(root_0, string_literal436_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3000);
                    goalDesc437=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc437.getTree());
                    char_literal438=(Token)match(input,55,FOLLOW_55_in_conGD3002); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal438_tree = (Object)adaptor.create(char_literal438);
                    adaptor.addChild(root_0, char_literal438_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:476:5: '(' 'within' NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal439=(Token)match(input,53,FOLLOW_53_in_conGD3008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal439_tree = (Object)adaptor.create(char_literal439);
                    adaptor.addChild(root_0, char_literal439_tree);
                    }
                    string_literal440=(Token)match(input,113,FOLLOW_113_in_conGD3010); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal440_tree = (Object)adaptor.create(string_literal440);
                    adaptor.addChild(root_0, string_literal440_tree);
                    }
                    NUMBER441=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3012); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER441_tree = (Object)adaptor.create(NUMBER441);
                    adaptor.addChild(root_0, NUMBER441_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3014);
                    goalDesc442=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc442.getTree());
                    char_literal443=(Token)match(input,55,FOLLOW_55_in_conGD3016); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal443_tree = (Object)adaptor.create(char_literal443);
                    adaptor.addChild(root_0, char_literal443_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:477:4: '(' 'at-most-once' goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal444=(Token)match(input,53,FOLLOW_53_in_conGD3021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal444_tree = (Object)adaptor.create(char_literal444);
                    adaptor.addChild(root_0, char_literal444_tree);
                    }
                    string_literal445=(Token)match(input,114,FOLLOW_114_in_conGD3023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal445_tree = (Object)adaptor.create(string_literal445);
                    adaptor.addChild(root_0, string_literal445_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3025);
                    goalDesc446=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc446.getTree());
                    char_literal447=(Token)match(input,55,FOLLOW_55_in_conGD3027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal447_tree = (Object)adaptor.create(char_literal447);
                    adaptor.addChild(root_0, char_literal447_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:478:4: '(' 'sometime-after' goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal448=(Token)match(input,53,FOLLOW_53_in_conGD3032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal448_tree = (Object)adaptor.create(char_literal448);
                    adaptor.addChild(root_0, char_literal448_tree);
                    }
                    string_literal449=(Token)match(input,115,FOLLOW_115_in_conGD3034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal449_tree = (Object)adaptor.create(string_literal449);
                    adaptor.addChild(root_0, string_literal449_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3036);
                    goalDesc450=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc450.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3038);
                    goalDesc451=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc451.getTree());
                    char_literal452=(Token)match(input,55,FOLLOW_55_in_conGD3040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal452_tree = (Object)adaptor.create(char_literal452);
                    adaptor.addChild(root_0, char_literal452_tree);
                    }

                    }
                    break;
                case 9 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:479:4: '(' 'sometime-before' goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal453=(Token)match(input,53,FOLLOW_53_in_conGD3045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal453_tree = (Object)adaptor.create(char_literal453);
                    adaptor.addChild(root_0, char_literal453_tree);
                    }
                    string_literal454=(Token)match(input,116,FOLLOW_116_in_conGD3047); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal454_tree = (Object)adaptor.create(string_literal454);
                    adaptor.addChild(root_0, string_literal454_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3049);
                    goalDesc455=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc455.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3051);
                    goalDesc456=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc456.getTree());
                    char_literal457=(Token)match(input,55,FOLLOW_55_in_conGD3053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal457_tree = (Object)adaptor.create(char_literal457);
                    adaptor.addChild(root_0, char_literal457_tree);
                    }

                    }
                    break;
                case 10 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:480:4: '(' 'always-within' NUMBER goalDesc goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal458=(Token)match(input,53,FOLLOW_53_in_conGD3058); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal458_tree = (Object)adaptor.create(char_literal458);
                    adaptor.addChild(root_0, char_literal458_tree);
                    }
                    string_literal459=(Token)match(input,117,FOLLOW_117_in_conGD3060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal459_tree = (Object)adaptor.create(string_literal459);
                    adaptor.addChild(root_0, string_literal459_tree);
                    }
                    NUMBER460=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER460_tree = (Object)adaptor.create(NUMBER460);
                    adaptor.addChild(root_0, NUMBER460_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3064);
                    goalDesc461=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc461.getTree());
                    pushFollow(FOLLOW_goalDesc_in_conGD3066);
                    goalDesc462=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc462.getTree());
                    char_literal463=(Token)match(input,55,FOLLOW_55_in_conGD3068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal463_tree = (Object)adaptor.create(char_literal463);
                    adaptor.addChild(root_0, char_literal463_tree);
                    }

                    }
                    break;
                case 11 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:481:4: '(' 'hold-during' NUMBER NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal464=(Token)match(input,53,FOLLOW_53_in_conGD3073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal464_tree = (Object)adaptor.create(char_literal464);
                    adaptor.addChild(root_0, char_literal464_tree);
                    }
                    string_literal465=(Token)match(input,118,FOLLOW_118_in_conGD3075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal465_tree = (Object)adaptor.create(string_literal465);
                    adaptor.addChild(root_0, string_literal465_tree);
                    }
                    NUMBER466=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3077); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER466_tree = (Object)adaptor.create(NUMBER466);
                    adaptor.addChild(root_0, NUMBER466_tree);
                    }
                    NUMBER467=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER467_tree = (Object)adaptor.create(NUMBER467);
                    adaptor.addChild(root_0, NUMBER467_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3081);
                    goalDesc468=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc468.getTree());
                    char_literal469=(Token)match(input,55,FOLLOW_55_in_conGD3083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal469_tree = (Object)adaptor.create(char_literal469);
                    adaptor.addChild(root_0, char_literal469_tree);
                    }

                    }
                    break;
                case 12 :
                    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:482:4: '(' 'hold-after' NUMBER goalDesc ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal470=(Token)match(input,53,FOLLOW_53_in_conGD3088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal470_tree = (Object)adaptor.create(char_literal470);
                    adaptor.addChild(root_0, char_literal470_tree);
                    }
                    string_literal471=(Token)match(input,119,FOLLOW_119_in_conGD3090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal471_tree = (Object)adaptor.create(string_literal471);
                    adaptor.addChild(root_0, string_literal471_tree);
                    }
                    NUMBER472=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD3092); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER472_tree = (Object)adaptor.create(NUMBER472);
                    adaptor.addChild(root_0, NUMBER472_tree);
                    }
                    pushFollow(FOLLOW_goalDesc_in_conGD3094);
                    goalDesc473=goalDesc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goalDesc473.getTree());
                    char_literal474=(Token)match(input,55,FOLLOW_55_in_conGD3096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal474_tree = (Object)adaptor.create(char_literal474);
                    adaptor.addChild(root_0, char_literal474_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conGD"

    // $ANTLR start synpred15_Pddl
    public final void synpred15_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:5: ( atomicFunctionSkeleton )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:141:5: atomicFunctionSkeleton
        {
        pushFollow(FOLLOW_atomicFunctionSkeleton_in_synpred15_Pddl690);
        atomicFunctionSkeleton();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Pddl

    // $ANTLR start synpred51_Pddl
    public final void synpred51_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:289:4: ( '(' binaryOp fExp fExp2 ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:289:4: '(' binaryOp fExp fExp2 ')'
        {
        match(input,53,FOLLOW_53_in_synpred51_Pddl1665); if (state.failed) return ;
        pushFollow(FOLLOW_binaryOp_in_synpred51_Pddl1667);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExp_in_synpred51_Pddl1669);
        fExp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExp2_in_synpred51_Pddl1671);
        fExp2();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred51_Pddl1673); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_Pddl

    // $ANTLR start synpred52_Pddl
    public final void synpred52_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:290:4: ( '(' '-' fExp ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:290:4: '(' '-' fExp ')'
        {
        match(input,53,FOLLOW_53_in_synpred52_Pddl1690); if (state.failed) return ;
        match(input,59,FOLLOW_59_in_synpred52_Pddl1692); if (state.failed) return ;
        pushFollow(FOLLOW_fExp_in_synpred52_Pddl1694);
        fExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred52_Pddl1696); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_Pddl

    // $ANTLR start synpred80_Pddl
    public final void synpred80_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:12: ( NUMBER )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:354:12: NUMBER
        {
        match(input,NUMBER,FOLLOW_NUMBER_in_synpred80_Pddl2121); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_Pddl

    // $ANTLR start synpred82_Pddl
    public final void synpred82_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:4: ( '(' 'and' ( daEffect )* ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:4: '(' 'and' ( daEffect )* ')'
        {
        match(input,53,FOLLOW_53_in_synpred82_Pddl2135); if (state.failed) return ;
        match(input,70,FOLLOW_70_in_synpred82_Pddl2137); if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:357:14: ( daEffect )*
        loop88:
        do {
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==53) ) {
                alt88=1;
            }


            switch (alt88) {
        	case 1 :
        	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: daEffect
        	    {
        	    pushFollow(FOLLOW_daEffect_in_synpred82_Pddl2139);
        	    daEffect();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop88;
            }
        } while (true);

        match(input,55,FOLLOW_55_in_synpred82_Pddl2142); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_Pddl

    // $ANTLR start synpred83_Pddl
    public final void synpred83_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:358:4: ( timedEffect )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:358:4: timedEffect
        {
        pushFollow(FOLLOW_timedEffect_in_synpred83_Pddl2147);
        timedEffect();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred83_Pddl

    // $ANTLR start synpred84_Pddl
    public final void synpred84_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:359:4: ( '(' 'forall' '(' typedVariableList ')' daEffect ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:359:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
        {
        match(input,53,FOLLOW_53_in_synpred84_Pddl2152); if (state.failed) return ;
        match(input,75,FOLLOW_75_in_synpred84_Pddl2154); if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred84_Pddl2156); if (state.failed) return ;
        pushFollow(FOLLOW_typedVariableList_in_synpred84_Pddl2158);
        typedVariableList();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred84_Pddl2160); if (state.failed) return ;
        pushFollow(FOLLOW_daEffect_in_synpred84_Pddl2162);
        daEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred84_Pddl2164); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_Pddl

    // $ANTLR start synpred85_Pddl
    public final void synpred85_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:360:4: ( '(' 'when' daGD timedEffect ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:360:4: '(' 'when' daGD timedEffect ')'
        {
        match(input,53,FOLLOW_53_in_synpred85_Pddl2169); if (state.failed) return ;
        match(input,86,FOLLOW_86_in_synpred85_Pddl2171); if (state.failed) return ;
        pushFollow(FOLLOW_daGD_in_synpred85_Pddl2173);
        daGD();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_timedEffect_in_synpred85_Pddl2175);
        timedEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred85_Pddl2177); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_Pddl

    // $ANTLR start synpred86_Pddl
    public final void synpred86_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:365:4: ( '(' 'at' timeSpecifier daEffect ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:365:4: '(' 'at' timeSpecifier daEffect ')'
        {
        match(input,53,FOLLOW_53_in_synpred86_Pddl2201); if (state.failed) return ;
        match(input,80,FOLLOW_80_in_synpred86_Pddl2203); if (state.failed) return ;
        pushFollow(FOLLOW_timeSpecifier_in_synpred86_Pddl2205);
        timeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_daEffect_in_synpred86_Pddl2207);
        daEffect();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred86_Pddl2209); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_Pddl

    // $ANTLR start synpred87_Pddl
    public final void synpred87_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:366:4: ( '(' 'at' timeSpecifier fAssignDA ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:366:4: '(' 'at' timeSpecifier fAssignDA ')'
        {
        match(input,53,FOLLOW_53_in_synpred87_Pddl2219); if (state.failed) return ;
        match(input,80,FOLLOW_80_in_synpred87_Pddl2221); if (state.failed) return ;
        pushFollow(FOLLOW_timeSpecifier_in_synpred87_Pddl2223);
        timeSpecifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fAssignDA_in_synpred87_Pddl2225);
        fAssignDA();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred87_Pddl2227); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_Pddl

    // $ANTLR start synpred88_Pddl
    public final void synpred88_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( ( binaryOp fExpDA fExpDA ) )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
        {
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:10: binaryOp fExpDA fExpDA
        {
        pushFollow(FOLLOW_binaryOp_in_synpred88_Pddl2283);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExpDA_in_synpred88_Pddl2285);
        fExpDA();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_fExpDA_in_synpred88_Pddl2287);
        fExpDA();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred88_Pddl

    // $ANTLR start synpred89_Pddl
    public final void synpred89_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:4: ( '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:4: '(' ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) ) ')'
        {
        match(input,53,FOLLOW_53_in_synpred89_Pddl2279); if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:8: ( ( binaryOp fExpDA fExpDA ) | ( '-' fExpDA ) )
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==59) ) {
            int LA89_1 = input.LA(2);

            if ( (synpred88_Pddl()) ) {
                alt89=1;
            }
            else if ( (true) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 1, input);

                throw nvae;
            }
        }
        else if ( ((LA89_0>=87 && LA89_0<=89)) ) {
            alt89=1;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }
        switch (alt89) {
            case 1 :
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
                {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:9: ( binaryOp fExpDA fExpDA )
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:10: binaryOp fExpDA fExpDA
                {
                pushFollow(FOLLOW_binaryOp_in_synpred89_Pddl2283);
                binaryOp();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred89_Pddl2285);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred89_Pddl2287);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:36: ( '-' fExpDA )
                {
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:36: ( '-' fExpDA )
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:375:37: '-' fExpDA
                {
                match(input,59,FOLLOW_59_in_synpred89_Pddl2293); if (state.failed) return ;
                pushFollow(FOLLOW_fExpDA_in_synpred89_Pddl2295);
                fExpDA();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        match(input,55,FOLLOW_55_in_synpred89_Pddl2299); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_Pddl

    // $ANTLR start synpred101_Pddl
    public final void synpred101_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:4: ( '(' 'and' ( prefConGD )* ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:4: '(' 'and' ( prefConGD )* ')'
        {
        match(input,53,FOLLOW_53_in_synpred101_Pddl2749); if (state.failed) return ;
        match(input,70,FOLLOW_70_in_synpred101_Pddl2751); if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:444:14: ( prefConGD )*
        loop90:
        do {
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==53) ) {
                alt90=1;
            }


            switch (alt90) {
        	case 1 :
        	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: prefConGD
        	    {
        	    pushFollow(FOLLOW_prefConGD_in_synpred101_Pddl2753);
        	    prefConGD();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop90;
            }
        } while (true);

        match(input,55,FOLLOW_55_in_synpred101_Pddl2756); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_Pddl

    // $ANTLR start synpred102_Pddl
    public final void synpred102_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:445:4: ( '(' 'forall' '(' typedVariableList ')' prefConGD ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:445:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
        {
        match(input,53,FOLLOW_53_in_synpred102_Pddl2761); if (state.failed) return ;
        match(input,75,FOLLOW_75_in_synpred102_Pddl2763); if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred102_Pddl2765); if (state.failed) return ;
        pushFollow(FOLLOW_typedVariableList_in_synpred102_Pddl2767);
        typedVariableList();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred102_Pddl2769); if (state.failed) return ;
        pushFollow(FOLLOW_prefConGD_in_synpred102_Pddl2771);
        prefConGD();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred102_Pddl2773); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_Pddl

    // $ANTLR start synpred104_Pddl
    public final void synpred104_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:446:4: ( '(' 'preference' ( NAME )? conGD ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:446:4: '(' 'preference' ( NAME )? conGD ')'
        {
        match(input,53,FOLLOW_53_in_synpred104_Pddl2778); if (state.failed) return ;
        match(input,79,FOLLOW_79_in_synpred104_Pddl2780); if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:446:21: ( NAME )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==NAME) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
                {
                match(input,NAME,FOLLOW_NAME_in_synpred104_Pddl2782); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_conGD_in_synpred104_Pddl2785);
        conGD();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred104_Pddl2787); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_Pddl

    // $ANTLR start synpred106_Pddl
    public final void synpred106_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:458:4: ( '(' binaryOp metricFExp metricFExp ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:458:4: '(' binaryOp metricFExp metricFExp ')'
        {
        match(input,53,FOLLOW_53_in_synpred106_Pddl2848); if (state.failed) return ;
        pushFollow(FOLLOW_binaryOp_in_synpred106_Pddl2850);
        binaryOp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred106_Pddl2852);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred106_Pddl2854);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred106_Pddl2856); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_Pddl

    // $ANTLR start synpred109_Pddl
    public final void synpred109_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:459:4: ( '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:459:4: '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')'
        {
        match(input,53,FOLLOW_53_in_synpred109_Pddl2861); if (state.failed) return ;
        if ( input.LA(1)==87||input.LA(1)==89 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_metricFExp_in_synpred109_Pddl2869);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:459:29: ( metricFExp )+
        int cnt92=0;
        loop92:
        do {
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==NAME||LA92_0==NUMBER||LA92_0==53||LA92_0==109) ) {
                alt92=1;
            }


            switch (alt92) {
        	case 1 :
        	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: metricFExp
        	    {
        	    pushFollow(FOLLOW_metricFExp_in_synpred109_Pddl2871);
        	    metricFExp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt92 >= 1 ) break loop92;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(92, input);
                    throw eee;
            }
            cnt92++;
        } while (true);

        match(input,55,FOLLOW_55_in_synpred109_Pddl2874); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_Pddl

    // $ANTLR start synpred110_Pddl
    public final void synpred110_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:460:4: ( '(' '-' metricFExp ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:460:4: '(' '-' metricFExp ')'
        {
        match(input,53,FOLLOW_53_in_synpred110_Pddl2879); if (state.failed) return ;
        match(input,59,FOLLOW_59_in_synpred110_Pddl2881); if (state.failed) return ;
        pushFollow(FOLLOW_metricFExp_in_synpred110_Pddl2883);
        metricFExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,55,FOLLOW_55_in_synpred110_Pddl2885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_Pddl

    // $ANTLR start synpred113_Pddl
    public final void synpred113_Pddl_fragment() throws RecognitionException {   
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:462:4: ( '(' functionSymbol ( NAME )* ')' )
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:462:4: '(' functionSymbol ( NAME )* ')'
        {
        match(input,53,FOLLOW_53_in_synpred113_Pddl2895); if (state.failed) return ;
        pushFollow(FOLLOW_functionSymbol_in_synpred113_Pddl2897);
        functionSymbol();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:462:23: ( NAME )*
        loop93:
        do {
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NAME) ) {
                alt93=1;
            }


            switch (alt93) {
        	case 1 :
        	    // C:\\Dokumente und Einstellungen\\paka.MASSLOV\\Desktop\\Pddl.g:0:0: NAME
        	    {
        	    match(input,NAME,FOLLOW_NAME_in_synpred113_Pddl2899); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop93;
            }
        } while (true);

        match(input,55,FOLLOW_55_in_synpred113_Pddl2902); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_Pddl

    // Delegated rules

    public final boolean synpred113_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_Pddl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_Pddl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\2\54\2\uffff";
    static final String DFA12_maxS =
        "\1\67\1\73\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\12\uffff\1\2",
            "\1\1\12\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "121:1: typedNameList : ( ( NAME )* | ( ( NAME )+ '-' t= type typedNameList ) -> ( ^( NAME $t) )+ typedNameList );";
        }
    }
    static final String DFA21_eotS =
        "\4\uffff";
    static final String DFA21_eofS =
        "\4\uffff";
    static final String DFA21_minS =
        "\2\56\2\uffff";
    static final String DFA21_maxS =
        "\1\67\1\73\2\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\4\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\6\uffff\1\2\1\uffff\1\2",
            "\1\1\6\uffff\1\2\1\uffff\1\2\3\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "168:1: typedVariableList : ( ( VARIABLE )* | ( ( VARIABLE )+ '-' t= type typedVariableList ) -> ( ^( VARIABLE $t) )+ typedVariableList );";
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\65\1\54\10\uffff";
    static final String DFA29_maxS =
        "\1\65\1\136\10\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\11\31\uffff\1\2\1\3\1\4\1\5\1\6\1\7\16\uffff\5\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "217:1: goalDesc : ( atomicTermFormula | '(' 'and' ( goalDesc )* ')' -> ^( AND_GD ( goalDesc )* ) | '(' 'or' ( goalDesc )* ')' -> ^( OR_GD ( goalDesc )* ) | '(' 'not' goalDesc ')' -> ^( NOT_GD goalDesc ) | '(' 'imply' goalDesc goalDesc ')' -> ^( IMPLY_GD goalDesc goalDesc ) | '(' 'exists' '(' typedVariableList ')' goalDesc ')' -> ^( EXISTS_GD typedVariableList goalDesc ) | '(' 'forall' '(' typedVariableList ')' goalDesc ')' -> ^( FORALL_GD typedVariableList goalDesc ) | fComp -> ^( COMPARISON_GD fComp ) );";
        }
    }
    static final String DFA70_eotS =
        "\12\uffff";
    static final String DFA70_eofS =
        "\12\uffff";
    static final String DFA70_minS =
        "\1\54\1\0\10\uffff";
    static final String DFA70_maxS =
        "\1\155\1\0\10\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\4\1\6\1\7\1\1\1\2\1\3\1\5\1\10";
    static final String DFA70_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\3\2\uffff\1\2\5\uffff\1\1\67\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "457:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' | '(' ( '*' | '/' ) metricFExp ( metricFExp )+ ')' | '(' '-' metricFExp ')' | NUMBER | '(' functionSymbol ( NAME )* ')' | functionSymbol | 'total-time' | '(' 'is-violated' NAME ')' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_Pddl()) ) {s = 5;}

                        else if ( (synpred109_Pddl()) ) {s = 6;}

                        else if ( (synpred110_Pddl()) ) {s = 7;}

                        else if ( (synpred113_Pddl()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\16\uffff";
    static final String DFA72_eofS =
        "\16\uffff";
    static final String DFA72_minS =
        "\1\65\1\106\14\uffff";
    static final String DFA72_maxS =
        "\1\65\1\167\14\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String DFA72_specialS =
        "\16\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1",
            "\1\2\4\uffff\1\3\4\uffff\1\4\36\uffff\1\5\1\6\1\7\1\10\1\11"+
            "\1\12\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "468:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' goalDesc ')' | '(' 'always' goalDesc ')' | '(' 'sometime' goalDesc ')' | '(' 'within' NUMBER goalDesc ')' | '(' 'at-most-once' goalDesc ')' | '(' 'sometime-after' goalDesc goalDesc ')' | '(' 'sometime-before' goalDesc goalDesc ')' | '(' 'always-within' NUMBER goalDesc goalDesc ')' | '(' 'hold-during' NUMBER NUMBER goalDesc ')' | '(' 'hold-after' NUMBER goalDesc ')' );";
        }
    }
 

    public static final BitSet FOLLOW_domain_in_pddlDoc305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_problem_in_pddlDoc309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_domain324 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_domain326 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_domainName_in_domain328 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_requireDef_in_domain336 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_typesDef_in_domain345 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_constantsDef_in_domain354 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_predicatesDef_in_domain363 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_functionsDef_in_domain372 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_constraints_in_domain381 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_structureDef_in_domain390 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_domain399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_domainName483 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_domainName485 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_domainName487 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_domainName489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_requireDef516 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_requireDef518 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_REQUIRE_KEY_in_requireDef520 = new BitSet(new long[]{0x0080200000000000L});
    public static final BitSet FOLLOW_55_in_requireDef523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_typesDef544 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_typesDef546 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_typedNameList_in_typesDef548 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_typesDef550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_typedNameList572 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_NAME_in_typedNameList579 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_59_in_typedNameList582 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_type_in_typedNameList586 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_typedNameList_in_typedNameList588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_type617 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_type619 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_primType_in_type621 = new BitSet(new long[]{0x00A0100000000000L});
    public static final BitSet FOLLOW_55_in_type624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primType_in_type643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_primType653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_functionsDef663 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_functionsDef665 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_functionList_in_functionsDef667 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_functionsDef669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicFunctionSkeleton_in_functionList690 = new BitSet(new long[]{0x0820000000000002L});
    public static final BitSet FOLLOW_59_in_functionList694 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_functionType_in_functionList696 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_atomicFunctionSkeleton712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_atomicFunctionSkeleton715 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_atomicFunctionSkeleton718 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atomicFunctionSkeleton720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_functionSymbol731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_functionType740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_constantsDef751 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_constantsDef753 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_typedNameList_in_constantsDef755 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constantsDef757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_predicatesDef777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_predicatesDef779 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_atomicFormulaSkeleton_in_predicatesDef781 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_predicatesDef784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atomicFormulaSkeleton805 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicFormulaSkeleton808 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_atomicFormulaSkeleton811 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atomicFormulaSkeleton813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_predicate824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_typedVariableList834 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_typedVariableList841 = new BitSet(new long[]{0x0800400000000000L});
    public static final BitSet FOLLOW_59_in_typedVariableList844 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_type_in_typedVariableList848 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_typedVariableList850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_constraints877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_constraints880 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_conGD_in_constraints883 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constraints885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actionDef_in_structureDef897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_durativeActionDef_in_structureDef902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedDef_in_structureDef907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_actionDef922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_actionDef924 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_actionSymbol_in_actionDef926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_actionDef935 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_actionDef937 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_actionDef939 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDef941 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_actionDefBody_in_actionDef954 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDef956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_actionSymbol988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_actionDefBody1004 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_actionDefBody1008 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1010 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_goalDesc_in_actionDefBody1015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_actionDefBody1025 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_actionDefBody1029 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_actionDefBody1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_effect_in_actionDefBody1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicTermFormula_in_goalDesc1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_goalDesc1087 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1089 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_goalDesc1119 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1121 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_goalDesc1151 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1153 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_goalDesc1181 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1183 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1185 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_goalDesc1215 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_goalDesc1217 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_goalDesc1219 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1221 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1223 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goalDesc1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_goalDesc1253 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_goalDesc1255 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_goalDesc1257 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1259 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goalDesc1261 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goalDesc1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fComp_in_goalDesc1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fComp1328 = new BitSet(new long[]{0x0000000000000000L,0x000000007C000000L});
    public static final BitSet FOLLOW_binaryComp_in_fComp1331 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_fComp1333 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_fComp1335 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fComp1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atomicTermFormula1349 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicTermFormula1351 = new BitSet(new long[]{0x0080500000000000L});
    public static final BitSet FOLLOW_term_in_atomicTermFormula1353 = new BitSet(new long[]{0x0080500000000000L});
    public static final BitSet FOLLOW_55_in_atomicTermFormula1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_term0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_durativeActionDef1394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_durativeActionDef1396 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_actionSymbol_in_durativeActionDef1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_durativeActionDef1407 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_durativeActionDef1409 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_durativeActionDef1411 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_durativeActionDef1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006020L});
    public static final BitSet FOLLOW_daDefBody_in_durativeActionDef1426 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_durativeActionDef1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_daDefBody1461 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_durationConstraint_in_daDefBody1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_daDefBody1468 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_daDefBody1472 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daDefBody1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_daGD_in_daDefBody1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_daDefBody1488 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_daDefBody1492 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daDefBody1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_daEffect_in_daDefBody1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefTimedGD_in_daGD1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daGD1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_daGD1521 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_daGD_in_daGD1523 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_daGD1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daGD1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_daGD1533 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_daGD1535 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_daGD1537 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daGD1539 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daGD_in_daGD1541 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daGD1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedGD_in_prefTimedGD1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_prefTimedGD1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_prefTimedGD1561 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_NAME_in_prefTimedGD1563 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_timedGD_in_prefTimedGD1566 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_prefTimedGD1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_timedGD1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timedGD1581 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedGD1583 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_timedGD1585 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_timedGD1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_timedGD1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_timedGD1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_interval_in_timedGD1596 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_timedGD1598 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_timedGD1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_timeSpecifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_interval1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_derivedDef1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_derivedDef1638 = new BitSet(new long[]{0x0020400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_derivedDef1641 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_derivedDef1643 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_derivedDef1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_fExp1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fExp1665 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_fExp1667 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_fExp1669 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp2_in_fExp1671 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fExp1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fExp1690 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_fExp1692 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_fExp1694 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fExp1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fHead_in_fExp1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_fExp21721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fHead1731 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_fHead1733 = new BitSet(new long[]{0x0080500000000000L});
    public static final BitSet FOLLOW_term_in_fHead1735 = new BitSet(new long[]{0x0080500000000000L});
    public static final BitSet FOLLOW_55_in_fHead1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionSymbol_in_fHead1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_effect1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_effect1775 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_cEffect_in_effect1777 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_effect1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cEffect_in_effect1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_cEffect1805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_cEffect1807 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_cEffect1809 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_cEffect1811 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_cEffect1813 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_effect_in_cEffect1815 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_cEffect1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_cEffect1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_cEffect1837 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_cEffect1839 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_condEffect_in_cEffect1841 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_cEffect1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pEffect_in_cEffect1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_pEffect1872 = new BitSet(new long[]{0x0000000000000000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_assignOp_in_pEffect1874 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fHead_in_pEffect1876 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_pEffect1878 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_pEffect1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_pEffect1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pEffect1902 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_atomicTermFormula_in_pEffect1904 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_pEffect1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicTermFormula_in_pEffect1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_condEffect1935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_condEffect1937 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_pEffect_in_condEffect1939 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_condEffect1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pEffect_in_condEffect1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binaryOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_binaryComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_durationConstraint2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_durationConstraint2045 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2047 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_durationConstraint2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_durationConstraint2055 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_durationConstraint2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_simpleDurationConstraint2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_durOp_in_simpleDurationConstraint2075 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_simpleDurationConstraint2077 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_durValue_in_simpleDurationConstraint2079 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_simpleDurationConstraint2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_simpleDurationConstraint2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_simpleDurationConstraint2088 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_simpleDurationConstraint2090 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2092 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_simpleDurationConstraint2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_durOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_durValue2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_durValue2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daEffect2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_daEffect2137 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_daEffect_in_daEffect2139 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedEffect_in_daEffect2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daEffect2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_daEffect2154 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_daEffect2156 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_daEffect2158 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2160 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daEffect_in_daEffect2162 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daEffect2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_daEffect2171 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daGD_in_daEffect2173 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_timedEffect_in_daEffect2175 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_daEffect2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_assignOp_in_daEffect2184 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fHead_in_daEffect2186 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_daEffect2188 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_daEffect2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_timedEffect2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timedEffect2203 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2205 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daEffect_in_timedEffect2207 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_timedEffect2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_timedEffect2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_timedEffect2221 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2223 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_fAssignDA_in_timedEffect2225 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_timedEffect2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_timedEffect2232 = new BitSet(new long[]{0x0000000000000000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_assignOp_in_timedEffect2234 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fHead_in_timedEffect2236 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_timedEffect2238 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_timedEffect2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fAssignDA2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_assignOp_in_fAssignDA2262 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fHead_in_fAssignDA2264 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fAssignDA2266 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fAssignDA2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_fExpDA2279 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_fExpDA2283 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2285 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2287 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59_in_fExpDA2293 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_fExpDA2295 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_fExpDA2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_fExpDA2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fExp_in_fExpDA2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_problem2323 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_problem2325 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_problemDecl_in_problem2327 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_problemDomain_in_problem2332 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_requireDef_in_problem2340 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_objectDecl_in_problem2349 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_init_in_problem2358 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goal_in_problem2366 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_probConstraints_in_problem2374 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_metricSpec_in_problem2383 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_problem2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_problemDecl2456 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_problemDecl2458 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_problemDecl2460 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_problemDecl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_problemDomain2488 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_problemDomain2490 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_problemDomain2492 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_problemDomain2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_objectDecl2514 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_objectDecl2516 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_typedNameList_in_objectDecl2518 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_objectDecl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_init2540 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_init2542 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_initEl_in_init2544 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_init2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameLiteral_in_initEl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_initEl2573 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_initEl2575 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fHead_in_initEl2577 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_initEl2579 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_initEl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_initEl2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_initEl2606 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_initEl2608 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_nameLiteral_in_initEl2610 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_initEl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_nameLiteral2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_nameLiteral2641 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral2643 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_nameLiteral2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atomicNameFormula2664 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_predicate_in_atomicNameFormula2666 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_NAME_in_atomicNameFormula2668 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_55_in_atomicNameFormula2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_goal2696 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_goal2698 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_goal2700 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_goal2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_probConstraints2720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_probConstraints2722 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_probConstraints2725 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_probConstraints2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_prefConGD2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_prefConGD2751 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_prefConGD2753 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_prefConGD2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_prefConGD2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_prefConGD2763 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_prefConGD2765 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_prefConGD2767 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_prefConGD2769 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_prefConGD2771 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_prefConGD2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_prefConGD2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_prefConGD2780 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_NAME_in_prefConGD2782 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_conGD_in_prefConGD2785 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_prefConGD2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conGD_in_prefConGD2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricSpec2803 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_metricSpec2805 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_optimization_in_metricSpec2807 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricSpec2809 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_metricSpec2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_optimization0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricFExp2848 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_metricFExp2850 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp2852 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp2854 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_metricFExp2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricFExp2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_metricFExp2863 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp2869 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp2871 = new BitSet(new long[]{0x00A0900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_55_in_metricFExp2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricFExp2879 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_metricFExp2881 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_metricFExp2883 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_metricFExp2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_metricFExp2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricFExp2895 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_metricFExp2897 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_NAME_in_metricFExp2899 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_55_in_metricFExp2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionSymbol_in_metricFExp2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_metricFExp2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_metricFExp2920 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_metricFExp2922 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_NAME_in_metricFExp2924 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_metricFExp2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD2940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_conGD2942 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_conGD_in_conGD2944 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_conGD2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD2952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_conGD2954 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_conGD2956 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_conGD2958 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD2960 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_conGD_in_conGD2962 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD2969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_conGD2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_conGD2973 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD2975 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD2985 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_conGD2987 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD2989 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD2996 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_conGD2998 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3000 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3008 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_conGD3010 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3012 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3014 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3021 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_conGD3023 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3025 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3032 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_conGD3034 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3036 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3038 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3045 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_conGD3047 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3049 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3051 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3058 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_conGD3060 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3062 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3064 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3066 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3073 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_conGD3075 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3077 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3079 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3081 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conGD3088 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_conGD3090 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_NUMBER_in_conGD3092 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_goalDesc_in_conGD3094 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_conGD3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicFunctionSkeleton_in_synpred15_Pddl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred51_Pddl1665 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred51_Pddl1667 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_synpred51_Pddl1669 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp2_in_synpred51_Pddl1671 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred51_Pddl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred52_Pddl1690 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred52_Pddl1692 = new BitSet(new long[]{0x0020900000000000L});
    public static final BitSet FOLLOW_fExp_in_synpred52_Pddl1694 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred52_Pddl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred80_Pddl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred82_Pddl2135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred82_Pddl2137 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred82_Pddl2139 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_synpred82_Pddl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timedEffect_in_synpred83_Pddl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred84_Pddl2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred84_Pddl2154 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred84_Pddl2156 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_synpred84_Pddl2158 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred84_Pddl2160 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred84_Pddl2162 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred84_Pddl2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred85_Pddl2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_synpred85_Pddl2171 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daGD_in_synpred85_Pddl2173 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_timedEffect_in_synpred85_Pddl2175 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred85_Pddl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred86_Pddl2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_synpred86_Pddl2203 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_synpred86_Pddl2205 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_daEffect_in_synpred86_Pddl2207 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred86_Pddl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred87_Pddl2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_synpred87_Pddl2221 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_timeSpecifier_in_synpred87_Pddl2223 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_fAssignDA_in_synpred87_Pddl2225 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred87_Pddl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binaryOp_in_synpred88_Pddl2283 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred88_Pddl2285 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred88_Pddl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred89_Pddl2279 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred89_Pddl2283 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred89_Pddl2285 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred89_Pddl2287 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59_in_synpred89_Pddl2293 = new BitSet(new long[]{0x0020900000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_fExpDA_in_synpred89_Pddl2295 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred89_Pddl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred101_Pddl2749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_synpred101_Pddl2751 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_synpred101_Pddl2753 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_synpred101_Pddl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred102_Pddl2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_synpred102_Pddl2763 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred102_Pddl2765 = new BitSet(new long[]{0x0080400000000000L});
    public static final BitSet FOLLOW_typedVariableList_in_synpred102_Pddl2767 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred102_Pddl2769 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_prefConGD_in_synpred102_Pddl2771 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred102_Pddl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred104_Pddl2778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred104_Pddl2780 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_NAME_in_synpred104_Pddl2782 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_conGD_in_synpred104_Pddl2785 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred104_Pddl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred106_Pddl2848 = new BitSet(new long[]{0x0800000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_binaryOp_in_synpred106_Pddl2850 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred106_Pddl2852 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred106_Pddl2854 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred106_Pddl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred109_Pddl2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_set_in_synpred109_Pddl2863 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred109_Pddl2869 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred109_Pddl2871 = new BitSet(new long[]{0x00A0900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_55_in_synpred109_Pddl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred110_Pddl2879 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_synpred110_Pddl2881 = new BitSet(new long[]{0x0020900000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_metricFExp_in_synpred110_Pddl2883 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred110_Pddl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred113_Pddl2895 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionSymbol_in_synpred113_Pddl2897 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_NAME_in_synpred113_Pddl2899 = new BitSet(new long[]{0x0080100000000000L});
    public static final BitSet FOLLOW_55_in_synpred113_Pddl2902 = new BitSet(new long[]{0x0000000000000002L});

}