// Generated from C:/Users/SALAH/IdeaProjects/untitledCompiler/typescriptparser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class typescriptparser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, FUNCTION=4, CLASS=5, INTERFACE=6, IMPORT=7, EXPORT=8, 
		CONST=9, LET=10, VAR=11, FROM=12, COMPONENT=13, SELECTOR=14, STANDALONE=15, 
		IMPORTS=16, TEMPLATE=17, STYLES=18, STRING_TYPE=19, NUMBER_TYPE=20, BOOLEAN_TYPE=21, 
		ANY_TYPE=22, VOID_TYPE=23, COMMA=24, COLON=25, DOT=26, SEMICOLON=27, EQUALS=28, 
		THIS=29, ASSIGN=30, PLUS=31, MINUS=32, STAR=33, SLASH=34, LESS=35, GREATER=36, 
		EQUAL=37, NOT_EQUAL=38, LPAREN=39, RPAREN=40, LBRACE=41, RBRACE=42, TRUE=43, 
		FALSE=44, ID=45, STRING_LIT=46, NUMBER_LIT=47, WS=48, LINE_COMMENT=49, 
		BLOCK_COMMENT=50, DECORATOR=51, AS=52, TYPE=53, LBRACKET=54, RBRACKET=55;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_componentDeclaration = 2, RULE_componentDeclarationBody = 3, 
		RULE_componentBodyElement = 4, RULE_selector = 5, RULE_standalone = 6, 
		RULE_template = 7, RULE_styles = 8, RULE_isboolean = 9, RULE_classDeclaration = 10, 
		RULE_classDeclarationBody = 11, RULE_classMember = 12, RULE_propertyDeclaration = 13, 
		RULE_methodDeclaration = 14, RULE_methodBody = 15, RULE_statementMethod = 16, 
		RULE_interfaceDeclaration = 17, RULE_interfaceMember = 18, RULE_parameter = 19, 
		RULE_parameterList = 20, RULE_variableDeclaration = 21, RULE_importDeclaration = 22, 
		RULE_type = 23, RULE_list = 24, RULE_bodylist = 25, RULE_object = 26, 
		RULE_bodyobject = 27, RULE_initvalue = 28, RULE_expression = 29, RULE_functionCall = 30, 
		RULE_argument = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "componentDeclaration", "componentDeclarationBody", 
			"componentBodyElement", "selector", "standalone", "template", "styles", 
			"isboolean", "classDeclaration", "classDeclarationBody", "classMember", 
			"propertyDeclaration", "methodDeclaration", "methodBody", "statementMethod", 
			"interfaceDeclaration", "interfaceMember", "parameter", "parameterList", 
			"variableDeclaration", "importDeclaration", "type", "list", "bodylist", 
			"object", "bodyobject", "initvalue", "expression", "functionCall", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'function'", "'class'", "'interface'", 
			"'import'", "'export'", "'const'", "'let'", "'var'", "'from'", "'Component'", 
			"'selector'", "'standalone'", "'imports'", "'tamplate'", "'styles'", 
			"'string'", "'number'", "'boolean'", "'any'", "'void'", "','", "':'", 
			"'.'", "';'", null, "'this'", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", null, "'!='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", 
			null, null, null, null, null, null, "'@'", "'as'", "'type'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "FUNCTION", "CLASS", "INTERFACE", "IMPORT", 
			"EXPORT", "CONST", "LET", "VAR", "FROM", "COMPONENT", "SELECTOR", "STANDALONE", 
			"IMPORTS", "TEMPLATE", "STYLES", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", 
			"ANY_TYPE", "VOID_TYPE", "COMMA", "COLON", "DOT", "SEMICOLON", "EQUALS", 
			"THIS", "ASSIGN", "PLUS", "MINUS", "STAR", "SLASH", "LESS", "GREATER", 
			"EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "TRUE", 
			"FALSE", "ID", "STRING_LIT", "NUMBER_LIT", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"DECORATOR", "AS", "TYPE", "LBRACKET", "RBRACKET"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "typescriptparser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public typescriptparser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2286984185843680L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECORATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				componentDeclaration();
				}
				break;
			case CLASS:
			case EXPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				classDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				interfaceDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				methodDeclaration();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				variableDeclaration();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				importDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(typescriptparser.DECORATOR, 0); }
		public TerminalNode COMPONENT() { return getToken(typescriptparser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(typescriptparser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public ComponentDeclarationBodyContext componentDeclarationBody() {
			return getRuleContext(ComponentDeclarationBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(typescriptparser.RPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DECORATOR);
			setState(78);
			match(COMPONENT);
			setState(79);
			match(LPAREN);
			setState(80);
			match(LBRACE);
			setState(81);
			componentDeclarationBody();
			setState(82);
			match(RBRACE);
			setState(83);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationBodyContext extends ParserRuleContext {
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public ComponentDeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterComponentDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitComponentDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitComponentDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationBodyContext componentDeclarationBody() throws RecognitionException {
		ComponentDeclarationBodyContext _localctx = new ComponentDeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508032L) != 0)) {
				{
				setState(85);
				componentBodyElement();
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(86);
					match(COMMA);
					}
					break;
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					match(COMMA);
					setState(90);
					componentBodyElement();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyElementContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitComponentBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitComponentBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentBodyElement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				selector();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				standalone();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				importDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				template();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				styles();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(typescriptparser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SELECTOR);
			setState(106);
			match(COLON);
			setState(107);
			match(STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(typescriptparser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(STANDALONE);
			setState(110);
			match(COLON);
			setState(111);
			isboolean();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(typescriptparser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(TEMPLATE);
			setState(114);
			match(COLON);
			setState(115);
			match(STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(typescriptparser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(typescriptparser.LBRACKET, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TerminalNode RBRACKET() { return getToken(typescriptparser.RBRACKET, 0); }
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(STYLES);
			setState(118);
			match(COLON);
			setState(119);
			match(LBRACKET);
			setState(120);
			match(STRING_LIT);
			setState(121);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsbooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(typescriptparser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(typescriptparser.FALSE, 0); }
		public IsbooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isboolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterIsboolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitIsboolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitIsboolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsbooleanContext isboolean() throws RecognitionException {
		IsbooleanContext _localctx = new IsbooleanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_isboolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(typescriptparser.CLASS, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public ClassDeclarationBodyContext classDeclarationBody() {
			return getRuleContext(ClassDeclarationBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(typescriptparser.EXPORT, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(125);
				match(EXPORT);
				}
			}

			setState(128);
			match(CLASS);
			setState(129);
			match(ID);
			setState(130);
			classDeclarationBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(typescriptparser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(typescriptparser.SEMICOLON, i);
		}
		public ClassDeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterClassDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitClassDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitClassDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationBodyContext classDeclarationBody() throws RecognitionException {
		ClassDeclarationBodyContext _localctx = new ClassDeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LBRACE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(133);
				classMember();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(134);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classMember);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(typescriptparser.ASSIGN, 0); }
		public InitvalueContext initvalue() {
			return getRuleContext(InitvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyDeclaration);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(COLON);
				setState(150);
				type();
				setState(151);
				match(ASSIGN);
				setState(152);
				initvalue();
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(153);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
				match(COLON);
				setState(158);
				type();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(159);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(typescriptparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(typescriptparser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ID);
			setState(165);
			match(LPAREN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(166);
				parameterList();
				}
			}

			setState(169);
			match(RPAREN);
			setState(170);
			match(COLON);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184388341760L) != 0)) {
				{
				setState(171);
				type();
				}
			}

			setState(174);
			match(LBRACE);
			setState(175);
			methodBody();
			setState(176);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementMethodContext> statementMethod() {
			return getRuleContexts(StatementMethodContext.class);
		}
		public StatementMethodContext statementMethod(int i) {
			return getRuleContext(StatementMethodContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 272679420562944L) != 0)) {
				{
				{
				setState(178);
				statementMethod();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementMethodContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(typescriptparser.ID); }
		public TerminalNode ID(int i) {
			return getToken(typescriptparser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(typescriptparser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public TerminalNode THIS() { return getToken(typescriptparser.THIS, 0); }
		public TerminalNode DOT() { return getToken(typescriptparser.DOT, 0); }
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementMethod);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(ID);
				setState(185);
				match(ASSIGN);
				setState(186);
				expression();
				setState(187);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(THIS);
				setState(190);
				match(DOT);
				setState(191);
				match(ID);
				setState(192);
				match(ASSIGN);
				setState(193);
				match(ID);
				setState(194);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(THIS);
				setState(196);
				match(DOT);
				setState(197);
				match(ID);
				setState(198);
				match(ASSIGN);
				setState(199);
				expression();
				setState(200);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				expression();
				setState(203);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(typescriptparser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(INTERFACE);
			setState(208);
			match(ID);
			setState(209);
			match(LBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(210);
				interfaceMember();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitInterfaceMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitInterfaceMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceMember);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ID);
			setState(223);
			match(COLON);
			setState(224);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			parameter();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				parameter();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(typescriptparser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(typescriptparser.CONST, 0); }
		public TerminalNode LET() { return getToken(typescriptparser.LET, 0); }
		public TerminalNode VAR() { return getToken(typescriptparser.VAR, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			match(ID);
			setState(236);
			match(ASSIGN);
			setState(237);
			expression();
			setState(238);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(typescriptparser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(typescriptparser.FROM, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public TerminalNode COMPONENT() { return getToken(typescriptparser.COMPONENT, 0); }
		public TerminalNode IMPORTS() { return getToken(typescriptparser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(typescriptparser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(typescriptparser.RBRACKET, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_importDeclaration);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(IMPORT);
				setState(241);
				match(LBRACE);
				setState(242);
				match(ID);
				setState(243);
				match(RBRACE);
				setState(244);
				match(FROM);
				setState(245);
				match(STRING_LIT);
				setState(246);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(IMPORT);
				setState(248);
				match(LBRACE);
				setState(249);
				match(COMPONENT);
				setState(250);
				match(RBRACE);
				setState(251);
				match(FROM);
				setState(252);
				match(STRING_LIT);
				setState(253);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(IMPORTS);
				setState(255);
				match(COLON);
				setState(256);
				match(LBRACKET);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(257);
					match(ID);
					}
				}

				setState(260);
				match(RBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(typescriptparser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(typescriptparser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(typescriptparser.BOOLEAN_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(typescriptparser.ANY_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(typescriptparser.VOID_TYPE, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(NUMBER_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(BOOLEAN_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(ANY_TYPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(VOID_TYPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(typescriptparser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(typescriptparser.RBRACKET, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			setState(273);
			match(LBRACKET);
			setState(274);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodylistContext extends ParserRuleContext {
		public List<InitvalueContext> initvalue() {
			return getRuleContexts(InitvalueContext.class);
		}
		public InitvalueContext initvalue(int i) {
			return getRuleContext(InitvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public BodylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterBodylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitBodylist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitBodylist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodylistContext bodylist() throws RecognitionException {
		BodylistContext _localctx = new BodylistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodylist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18254092044337152L) != 0)) {
				{
				setState(276);
				initvalue();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(277);
					match(COMMA);
					setState(278);
					initvalue();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public BodyobjectContext bodyobject() {
			return getRuleContext(BodyobjectContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(typescriptparser.COMMA, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LBRACE);
			setState(287);
			bodyobject();
			setState(288);
			match(RBRACE);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(289);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyobjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(typescriptparser.ID); }
		public TerminalNode ID(int i) {
			return getToken(typescriptparser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(typescriptparser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(typescriptparser.COLON, i);
		}
		public List<InitvalueContext> initvalue() {
			return getRuleContexts(InitvalueContext.class);
		}
		public InitvalueContext initvalue(int i) {
			return getRuleContext(InitvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public BodyobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterBodyobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitBodyobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitBodyobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyobjectContext bodyobject() throws RecognitionException {
		BodyobjectContext _localctx = new BodyobjectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bodyobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(292);
				match(ID);
				setState(293);
				match(COLON);
				setState(294);
				initvalue();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(295);
					match(COMMA);
					setState(296);
					match(ID);
					setState(297);
					match(COLON);
					setState(298);
					initvalue();
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(299);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitvalueContext extends ParserRuleContext {
		public TerminalNode NUMBER_LIT() { return getToken(typescriptparser.NUMBER_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(typescriptparser.LBRACKET, 0); }
		public BodylistContext bodylist() {
			return getRuleContext(BodylistContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(typescriptparser.RBRACKET, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public InitvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterInitvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitInitvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitInitvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitvalueContext initvalue() throws RecognitionException {
		InitvalueContext _localctx = new InitvalueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initvalue);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(NUMBER_LIT);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(STRING_LIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				isboolean();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(LBRACKET);
				setState(313);
				bodylist();
				setState(314);
				match(RBRACKET);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TerminalNode NUMBER_LIT() { return getToken(typescriptparser.NUMBER_LIT, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(STRING_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(NUMBER_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				isboolean();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(typescriptparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(typescriptparser.RPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(ID);
			setState(328);
			match(LPAREN);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883692032L) != 0)) {
				{
				{
				setState(329);
				argument();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b\u0000"+
		"\f\u0000C\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001L\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0003\u0003a\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0003"+
		"\n\u007f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0088\b\u000b\u0005\u000b\u008a\b\u000b\n\u000b\f\u000b"+
		"\u008d\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0093\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009b\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0003\r\u00a3\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ad\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0005\u000f\u00b4\b\u000f\n\u000f\f\u000f\u00b7"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ce\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d4\b\u0011\n"+
		"\u0011\f\u0011\u00d7\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00dd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e6\b\u0014\n"+
		"\u0014\f\u0014\u00e9\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0106\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0118\b\u0019\n\u0019\f\u0019\u011b\t\u0019\u0003\u0019\u011d\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0123"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u012d\b\u001b\u0005\u001b\u012f"+
		"\b\u001b\n\u001b\f\u001b\u0132\t\u001b\u0003\u001b\u0134\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u013e\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0146\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u014b\b\u001e\n\u001e\f\u001e"+
		"\u014e\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0002\u0001\u0000+,\u0001"+
		"\u0000\t\u000b\u0169\u0000A\u0001\u0000\u0000\u0000\u0002K\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000"+
		"\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fm\u0001\u0000"+
		"\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000"+
		"\u0012{\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0084"+
		"\u0001\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u00a2"+
		"\u0001\u0000\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00b5"+
		"\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000\"\u00cf\u0001"+
		"\u0000\u0000\u0000$\u00dc\u0001\u0000\u0000\u0000&\u00de\u0001\u0000\u0000"+
		"\u0000(\u00e2\u0001\u0000\u0000\u0000*\u00ea\u0001\u0000\u0000\u0000,"+
		"\u0105\u0001\u0000\u0000\u0000.\u010e\u0001\u0000\u0000\u00000\u0110\u0001"+
		"\u0000\u0000\u00002\u011c\u0001\u0000\u0000\u00004\u011e\u0001\u0000\u0000"+
		"\u00006\u0133\u0001\u0000\u0000\u00008\u013d\u0001\u0000\u0000\u0000:"+
		"\u0145\u0001\u0000\u0000\u0000<\u0147\u0001\u0000\u0000\u0000>\u0151\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0001\u0001\u0000\u0000\u0000EL\u0003\u0004\u0002\u0000FL\u0003"+
		"\u0014\n\u0000GL\u0003\"\u0011\u0000HL\u0003\u001c\u000e\u0000IL\u0003"+
		"*\u0015\u0000JL\u0003,\u0016\u0000KE\u0001\u0000\u0000\u0000KF\u0001\u0000"+
		"\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0003\u0001\u0000\u0000"+
		"\u0000MN\u00053\u0000\u0000NO\u0005\r\u0000\u0000OP\u0005\'\u0000\u0000"+
		"PQ\u0005)\u0000\u0000QR\u0003\u0006\u0003\u0000RS\u0005*\u0000\u0000S"+
		"T\u0005(\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UW\u0003\b\u0004\u0000"+
		"VX\u0005\u0018\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X]\u0001\u0000\u0000\u0000YZ\u0005\u0018\u0000\u0000Z\\\u0003\b"+
		"\u0004\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`U\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\u0007\u0001\u0000\u0000\u0000bh\u0003\n\u0005\u0000ch\u0003\f"+
		"\u0006\u0000dh\u0003,\u0016\u0000eh\u0003\u000e\u0007\u0000fh\u0003\u0010"+
		"\b\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000gd\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\t\u0001"+
		"\u0000\u0000\u0000ij\u0005\u000e\u0000\u0000jk\u0005\u0019\u0000\u0000"+
		"kl\u0005.\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005\u000f\u0000"+
		"\u0000no\u0005\u0019\u0000\u0000op\u0003\u0012\t\u0000p\r\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0011\u0000\u0000rs\u0005\u0019\u0000\u0000st\u0005"+
		".\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\u0012\u0000\u0000"+
		"vw\u0005\u0019\u0000\u0000wx\u00056\u0000\u0000xy\u0005.\u0000\u0000y"+
		"z\u00057\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000"+
		"\u0000|\u0013\u0001\u0000\u0000\u0000}\u007f\u0005\b\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0082\u0005-\u0000"+
		"\u0000\u0082\u0083\u0003\u0016\u000b\u0000\u0083\u0015\u0001\u0000\u0000"+
		"\u0000\u0084\u008b\u0005)\u0000\u0000\u0085\u0087\u0003\u0018\f\u0000"+
		"\u0086\u0088\u0005\u001b\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005*\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0003\u001c\u000e\u0000\u0091\u0093\u0003\u001a\r\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0019"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005-\u0000\u0000\u0095\u0096\u0005"+
		"\u0019\u0000\u0000\u0096\u0097\u0003.\u0017\u0000\u0097\u0098\u0005\u001e"+
		"\u0000\u0000\u0098\u009a\u00038\u001c\u0000\u0099\u009b\u0005\u001b\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u00a3\u0001\u0000\u0000\u0000\u009c\u009d\u0005-\u0000\u0000"+
		"\u009d\u009e\u0005\u0019\u0000\u0000\u009e\u00a0\u0003.\u0017\u0000\u009f"+
		"\u00a1\u0005\u001b\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2"+
		"\u0094\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a3"+
		"\u001b\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005-\u0000\u0000\u00a5\u00a7"+
		"\u0005\'\u0000\u0000\u00a6\u00a8\u0003(\u0014\u0000\u00a7\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005(\u0000\u0000\u00aa\u00ac\u0005\u0019"+
		"\u0000\u0000\u00ab\u00ad\u0003.\u0017\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b0\u0003\u001e\u000f\u0000"+
		"\u00b0\u00b1\u0005*\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0003 \u0010\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b9\u00ba\u0005"+
		"\u001e\u0000\u0000\u00ba\u00bb\u0003:\u001d\u0000\u00bb\u00bc\u0005\u001b"+
		"\u0000\u0000\u00bc\u00ce\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u001d"+
		"\u0000\u0000\u00be\u00bf\u0005\u001a\u0000\u0000\u00bf\u00c0\u0005-\u0000"+
		"\u0000\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1\u00c2\u0005-\u0000\u0000"+
		"\u00c2\u00ce\u0005\u001b\u0000\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000"+
		"\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5\u00c6\u0005-\u0000\u0000\u00c6"+
		"\u00c7\u0005\u001e\u0000\u0000\u00c7\u00c8\u0003:\u001d\u0000\u00c8\u00c9"+
		"\u0005\u001b\u0000\u0000\u00c9\u00ce\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0003:\u001d\u0000\u00cb\u00cc\u0005\u001b\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00b8\u0001\u0000\u0000\u0000\u00cd\u00bd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c3\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ce!\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0006"+
		"\u0000\u0000\u00d0\u00d1\u0005-\u0000\u0000\u00d1\u00d5\u0005)\u0000\u0000"+
		"\u00d2\u00d4\u0003$\u0012\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005*\u0000\u0000\u00d9#\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0003\u001a\r\u0000\u00db\u00dd\u0003\u001c"+
		"\u000e\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd%\u0001\u0000\u0000\u0000\u00de\u00df\u0005-\u0000\u0000"+
		"\u00df\u00e0\u0005\u0019\u0000\u0000\u00e0\u00e1\u0003.\u0017\u0000\u00e1"+
		"\'\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003&\u0013\u0000\u00e3\u00e4"+
		"\u0005\u0018\u0000\u0000\u00e4\u00e6\u0003&\u0013\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8)\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0007\u0001"+
		"\u0000\u0000\u00eb\u00ec\u0005-\u0000\u0000\u00ec\u00ed\u0005\u001e\u0000"+
		"\u0000\u00ed\u00ee\u0003:\u001d\u0000\u00ee\u00ef\u0005\u001b\u0000\u0000"+
		"\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0007\u0000\u0000\u00f1"+
		"\u00f2\u0005)\u0000\u0000\u00f2\u00f3\u0005-\u0000\u0000\u00f3\u00f4\u0005"+
		"*\u0000\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5\u00f6\u0005.\u0000"+
		"\u0000\u00f6\u0106\u0005\u001b\u0000\u0000\u00f7\u00f8\u0005\u0007\u0000"+
		"\u0000\u00f8\u00f9\u0005)\u0000\u0000\u00f9\u00fa\u0005\r\u0000\u0000"+
		"\u00fa\u00fb\u0005*\u0000\u0000\u00fb\u00fc\u0005\f\u0000\u0000\u00fc"+
		"\u00fd\u0005.\u0000\u0000\u00fd\u0106\u0005\u001b\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0010\u0000\u0000\u00ff\u0100\u0005\u0019\u0000\u0000\u0100\u0102"+
		"\u00056\u0000\u0000\u0101\u0103\u0005-\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u00057\u0000\u0000\u0105\u00f0\u0001\u0000\u0000"+
		"\u0000\u0105\u00f7\u0001\u0000\u0000\u0000\u0105\u00fe\u0001\u0000\u0000"+
		"\u0000\u0106-\u0001\u0000\u0000\u0000\u0107\u010f\u0005\u0013\u0000\u0000"+
		"\u0108\u010f\u0005\u0014\u0000\u0000\u0109\u010f\u0005\u0015\u0000\u0000"+
		"\u010a\u010f\u0005\u0016\u0000\u0000\u010b\u010f\u0005\u0017\u0000\u0000"+
		"\u010c\u010f\u0005-\u0000\u0000\u010d\u010f\u00030\u0018\u0000\u010e\u0107"+
		"\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u0109"+
		"\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010b"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d"+
		"\u0001\u0000\u0000\u0000\u010f/\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"-\u0000\u0000\u0111\u0112\u00056\u0000\u0000\u0112\u0113\u00057\u0000"+
		"\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0119\u00038\u001c\u0000\u0115"+
		"\u0116\u0005\u0018\u0000\u0000\u0116\u0118\u00038\u001c\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0114"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d3\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0120\u00036\u001b"+
		"\u0000\u0120\u0122\u0005*\u0000\u0000\u0121\u0123\u0005\u0018\u0000\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u01235\u0001\u0000\u0000\u0000\u0124\u0125\u0005-\u0000\u0000\u0125\u0126"+
		"\u0005\u0019\u0000\u0000\u0126\u0130\u00038\u001c\u0000\u0127\u0128\u0005"+
		"\u0018\u0000\u0000\u0128\u0129\u0005-\u0000\u0000\u0129\u012a\u0005\u0019"+
		"\u0000\u0000\u012a\u012c\u00038\u001c\u0000\u012b\u012d\u0005\u0018\u0000"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u0127\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0124\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u01347\u0001\u0000\u0000\u0000"+
		"\u0135\u013e\u0005/\u0000\u0000\u0136\u013e\u0005.\u0000\u0000\u0137\u013e"+
		"\u0003\u0012\t\u0000\u0138\u0139\u00056\u0000\u0000\u0139\u013a\u0003"+
		"2\u0019\u0000\u013a\u013b\u00057\u0000\u0000\u013b\u013e\u0001\u0000\u0000"+
		"\u0000\u013c\u013e\u00034\u001a\u0000\u013d\u0135\u0001\u0000\u0000\u0000"+
		"\u013d\u0136\u0001\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000"+
		"\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000"+
		"\u013e9\u0001\u0000\u0000\u0000\u013f\u0146\u0005.\u0000\u0000\u0140\u0146"+
		"\u0005/\u0000\u0000\u0141\u0146\u0005-\u0000\u0000\u0142\u0146\u0003\u0012"+
		"\t\u0000\u0143\u0146\u0003<\u001e\u0000\u0144\u0146\u0003*\u0015\u0000"+
		"\u0145\u013f\u0001\u0000\u0000\u0000\u0145\u0140\u0001\u0000\u0000\u0000"+
		"\u0145\u0141\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000"+
		"\u0146;\u0001\u0000\u0000\u0000\u0147\u0148\u0005-\u0000\u0000\u0148\u014c"+
		"\u0005\'\u0000\u0000\u0149\u014b\u0003>\u001f\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"(\u0000\u0000\u0150=\u0001\u0000\u0000\u0000\u0151\u0152\u0003:\u001d"+
		"\u0000\u0152?\u0001\u0000\u0000\u0000 CKW]`g~\u0087\u008b\u0092\u009a"+
		"\u00a0\u00a2\u00a7\u00ac\u00b5\u00cd\u00d5\u00dc\u00e7\u0102\u0105\u010e"+
		"\u0119\u011c\u0122\u012c\u0130\u0133\u013d\u0145\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}