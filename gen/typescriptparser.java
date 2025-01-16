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
		IMPORTS=16, TEMPLATE=17, STYLE=18, STRING_TYPE=19, NUMBER_TYPE=20, BOOLEAN_TYPE=21, 
		ANY_TYPE=22, VOID_TYPE=23, COMMA=24, COLON=25, DOT=26, SEMICOLON=27, EQUALS=28, 
		ASSIGN=29, PLUS=30, MINUS=31, STAR=32, SLASH=33, LESS=34, GREATER=35, 
		EQUAL=36, NOT_EQUAL=37, LPAREN=38, RPAREN=39, LBRACE=40, RBRACE=41, TRUE=42, 
		FALSE=43, ID=44, STRING_LIT=45, NUMBER_LIT=46, WS=47, LINE_COMMENT=48, 
		BLOCK_COMMENT=49, DECORATOR=50, AS=51, TYPE=52, LBRACKET=53, RBRACKET=54;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_componentDeclaration = 2, RULE_componentDeclarationBody = 3, 
		RULE_componentBodyElement = 4, RULE_selector = 5, RULE_standalone = 6, 
		RULE_template = 7, RULE_style = 8, RULE_isboolean = 9, RULE_classDeclaration = 10, 
		RULE_classDeclarationBody = 11, RULE_classMember = 12, RULE_propertyDeclaration = 13, 
		RULE_methodDeclaration = 14, RULE_interfaceDeclaration = 15, RULE_interfaceMember = 16, 
		RULE_functionDeclaration = 17, RULE_parameter = 18, RULE_variableDeclaration = 19, 
		RULE_importDeclaration = 20, RULE_type = 21, RULE_list = 22, RULE_bodylist = 23, 
		RULE_object = 24, RULE_bodyobject = 25, RULE_initvalue = 26, RULE_expression = 27, 
		RULE_functionCall = 28, RULE_argument = 29, RULE_typescriptFile = 30, 
		RULE_importStatement = 31, RULE_importSpecifier = 32, RULE_classBody = 33, 
		RULE_classBodyContent = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "componentDeclaration", "componentDeclarationBody", 
			"componentBodyElement", "selector", "standalone", "template", "style", 
			"isboolean", "classDeclaration", "classDeclarationBody", "classMember", 
			"propertyDeclaration", "methodDeclaration", "interfaceDeclaration", "interfaceMember", 
			"functionDeclaration", "parameter", "variableDeclaration", "importDeclaration", 
			"type", "list", "bodylist", "object", "bodyobject", "initvalue", "expression", 
			"functionCall", "argument", "typescriptFile", "importStatement", "importSpecifier", 
			"classBody", "classBodyContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'function'", "'class'", "'interface'", 
			"'import'", "'export'", "'const'", "'let'", "'var'", "'from'", "'Component'", 
			"'selector'", "'standalone'", "'imports'", "'tamplate'", "'style'", "'string'", 
			"'number'", "'boolean'", "'any'", "'void'", "','", "':'", "'.'", "';'", 
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", null, "'!='", 
			"'('", "')'", "'{'", "'}'", "'true'", "'false'", null, null, null, null, 
			null, null, "'@'", "'as'", "'type'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "FUNCTION", "CLASS", "INTERFACE", "IMPORT", 
			"EXPORT", "CONST", "LET", "VAR", "FROM", "COMPONENT", "SELECTOR", "STANDALONE", 
			"IMPORTS", "TEMPLATE", "STYLE", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", 
			"ANY_TYPE", "VOID_TYPE", "COMMA", "COLON", "DOT", "SEMICOLON", "EQUALS", 
			"ASSIGN", "PLUS", "MINUS", "STAR", "SLASH", "LESS", "GREATER", "EQUAL", 
			"NOT_EQUAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "TRUE", "FALSE", 
			"ID", "STRING_LIT", "NUMBER_LIT", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906912240L) != 0) );
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECORATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				componentDeclaration();
				}
				break;
			case CLASS:
			case EXPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				classDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				interfaceDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				functionDeclaration();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				variableDeclaration();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
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
			setState(83);
			match(DECORATOR);
			setState(84);
			match(COMPONENT);
			setState(85);
			match(LPAREN);
			setState(86);
			match(LBRACE);
			setState(87);
			componentDeclarationBody();
			setState(88);
			match(RBRACE);
			setState(89);
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
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 508032L) != 0)) {
				{
				setState(91);
				componentBodyElement();
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(92);
					match(COMMA);
					}
					break;
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					componentBodyElement();
					}
					}
					setState(101);
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
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				selector();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				standalone();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				importDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				template();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				style();
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
			setState(111);
			match(SELECTOR);
			setState(112);
			match(COLON);
			setState(113);
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
			setState(115);
			match(STANDALONE);
			setState(116);
			match(COLON);
			setState(117);
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
			setState(119);
			match(TEMPLATE);
			setState(120);
			match(COLON);
			setState(121);
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
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(typescriptparser.STYLE, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(typescriptparser.LBRACKET, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TerminalNode RBRACKET() { return getToken(typescriptparser.RBRACKET, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(STYLE);
			setState(124);
			match(COLON);
			setState(125);
			match(LBRACKET);
			setState(126);
			match(STRING_LIT);
			setState(127);
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
			setState(129);
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
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(131);
				match(EXPORT);
				}
			}

			setState(134);
			match(CLASS);
			setState(135);
			match(ID);
			setState(136);
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
		public ClassMemberContext classMember() {
			return getRuleContext(ClassMemberContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LBRACE);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(139);
				classMember();
				}
				break;
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
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
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
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(144);
					methodDeclaration();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(150);
					propertyDeclaration();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(COLON);
			setState(160);
			type();
			setState(161);
			match(ASSIGN);
			setState(162);
			initvalue();
			setState(163);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(typescriptparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(typescriptparser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
			setState(165);
			match(ID);
			setState(166);
			match(LPAREN);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(167);
				parameter();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RPAREN);
			setState(174);
			match(COLON);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592202297344L) != 0)) {
				{
				setState(175);
				type();
				}
			}

			setState(178);
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
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(INTERFACE);
			setState(181);
			match(ID);
			setState(182);
			match(LBRACE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(183);
				interfaceMember();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
		enterRule(_localctx, 32, RULE_interfaceMember);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(typescriptparser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(typescriptparser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(typescriptparser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FUNCTION);
			setState(196);
			match(ID);
			setState(197);
			match(LPAREN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(198);
				parameter();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RPAREN);
			setState(205);
			match(COLON);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592202297344L) != 0)) {
				{
				setState(206);
				type();
				}
			}

			setState(209);
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
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			setState(212);
			match(COLON);
			setState(213);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(typescriptparser.ID, 0); }
		public TerminalNode COLON() { return getToken(typescriptparser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			match(ID);
			setState(217);
			match(COLON);
			setState(218);
			type();
			setState(219);
			match(ASSIGN);
			setState(220);
			expression();
			setState(221);
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
		enterRule(_localctx, 40, RULE_importDeclaration);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(IMPORT);
				setState(224);
				match(LBRACE);
				setState(225);
				match(ID);
				setState(226);
				match(RBRACE);
				setState(227);
				match(FROM);
				setState(228);
				match(STRING_LIT);
				setState(229);
				match(SEMICOLON);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(IMPORTS);
				setState(231);
				match(COLON);
				setState(232);
				match(LBRACKET);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(233);
					match(ID);
					}
				}

				setState(236);
				match(RBRACKET);
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
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(NUMBER_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(BOOLEAN_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(ANY_TYPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(VOID_TYPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
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
		public List<TerminalNode> LBRACKET() { return getTokens(typescriptparser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(typescriptparser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(typescriptparser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(typescriptparser.RBRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(typescriptparser.ASSIGN, 0); }
		public BodylistContext bodylist() {
			return getRuleContext(BodylistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
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
		enterRule(_localctx, 44, RULE_list);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(ID);
				setState(249);
				match(LBRACKET);
				setState(250);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(ID);
				setState(252);
				match(LBRACKET);
				setState(253);
				match(RBRACKET);
				setState(254);
				match(ASSIGN);
				setState(255);
				match(LBRACKET);
				setState(256);
				bodylist();
				setState(257);
				match(RBRACKET);
				setState(258);
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
	public static class BodylistContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public List<TerminalNode> NUMBER_LIT() { return getTokens(typescriptparser.NUMBER_LIT); }
		public TerminalNode NUMBER_LIT(int i) {
			return getToken(typescriptparser.NUMBER_LIT, i);
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
		enterRule(_localctx, 46, RULE_bodylist);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(262);
					object();
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(263);
						match(COMMA);
						}
					}

					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER_LIT) {
					{
					{
					setState(271);
					match(NUMBER_LIT);
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(272);
						match(COMMA);
						}
					}

					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public BodyobjectContext bodyobject() {
			return getRuleContext(BodyobjectContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
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
		enterRule(_localctx, 48, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LBRACE);
			setState(283);
			bodyobject();
			setState(284);
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
		enterRule(_localctx, 50, RULE_bodyobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(286);
				match(ID);
				setState(287);
				match(COLON);
				setState(288);
				initvalue();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(289);
					match(COMMA);
					}
				}

				}
				}
				setState(296);
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
	public static class InitvalueContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER_LIT() { return getTokens(typescriptparser.NUMBER_LIT); }
		public TerminalNode NUMBER_LIT(int i) {
			return getToken(typescriptparser.NUMBER_LIT, i);
		}
		public List<TerminalNode> STRING_LIT() { return getTokens(typescriptparser.STRING_LIT); }
		public TerminalNode STRING_LIT(int i) {
			return getToken(typescriptparser.STRING_LIT, i);
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
		enterRule(_localctx, 52, RULE_initvalue);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					match(NUMBER_LIT);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER_LIT );
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					match(STRING_LIT);
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_LIT );
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 54, RULE_expression);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(STRING_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(NUMBER_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				functionCall();
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
		enterRule(_localctx, 56, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			setState(316);
			match(LPAREN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) {
				{
				{
				setState(317);
				argument();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
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
		enterRule(_localctx, 58, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypescriptFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(typescriptparser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TypescriptFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typescriptFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterTypescriptFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitTypescriptFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitTypescriptFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypescriptFileContext typescriptFile() throws RecognitionException {
		TypescriptFileContext _localctx = new TypescriptFileContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typescriptFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899906912240L) != 0)) {
				{
				{
				setState(327);
				statement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(EOF);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(typescriptparser.IMPORT, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(typescriptparser.FROM, 0); }
		public TerminalNode STRING_LIT() { return getToken(typescriptparser.STRING_LIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(typescriptparser.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IMPORT);
			setState(336);
			importSpecifier();
			setState(337);
			match(FROM);
			setState(338);
			match(STRING_LIT);
			setState(339);
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
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(typescriptparser.ID); }
		public TerminalNode ID(int i) {
			return getToken(typescriptparser.ID, i);
		}
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(typescriptparser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(typescriptparser.COMMA, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_importSpecifier);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(LBRACE);
				setState(342);
				match(ID);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(343);
					match(COMMA);
					setState(344);
					match(ID);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(350);
				match(RBRACE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(ID);
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
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(typescriptparser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(typescriptparser.RBRACE, 0); }
		public List<ClassBodyContentContext> classBodyContent() {
			return getRuleContexts(ClassBodyContentContext.class);
		}
		public ClassBodyContentContext classBodyContent(int i) {
			return getRuleContext(ClassBodyContentContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(LBRACE);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(355);
				classBodyContent();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
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
	public static class ClassBodyContentContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassBodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).enterClassBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof typescriptparserListener ) ((typescriptparserListener)listener).exitClassBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof typescriptparserVisitor ) return ((typescriptparserVisitor<? extends T>)visitor).visitClassBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContentContext classBodyContent() throws RecognitionException {
		ClassBodyContentContext _localctx = new ClassBodyContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_classBodyContent);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
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

	public static final String _serializedATN =
		"\u0004\u00016\u0170\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001R\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003^\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003"+
		"\u0003\u0003g\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0003\n\u0085\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0005\f\u0092\b\f\n\f\f\f\u0095\t\f\u0001\f\u0005"+
		"\f\u0098\b\f\n\f\f\f\u009b\t\f\u0003\f\u009d\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00a9\b\u000e\n\u000e\f\u000e\u00ac\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b9\b\u000f\n"+
		"\u000f\f\u000f\u00bc\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c2\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00c8\b\u0011\n\u0011\f\u0011\u00cb\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00d0\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00eb\b\u0014\u0001\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f7\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0105\b\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0109\b\u0017\u0005\u0017\u010b\b\u0017\n\u0017\f\u0017\u010e\t"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0112\b\u0017\u0005\u0017\u0114"+
		"\b\u0017\n\u0017\f\u0017\u0117\t\u0017\u0003\u0017\u0119\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0123\b\u0019\u0005\u0019\u0125\b\u0019"+
		"\n\u0019\f\u0019\u0128\t\u0019\u0001\u001a\u0004\u001a\u012b\b\u001a\u000b"+
		"\u001a\f\u001a\u012c\u0001\u001a\u0004\u001a\u0130\b\u001a\u000b\u001a"+
		"\f\u001a\u0131\u0003\u001a\u0134\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u013a\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u013f\b\u001c\n\u001c\f\u001c\u0142\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e\u0149\b\u001e"+
		"\n\u001e\f\u001e\u014c\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u015a\b \n \f \u015d\t \u0001 \u0001 \u0003 \u0161\b "+
		"\u0001!\u0001!\u0005!\u0165\b!\n!\f!\u0168\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0003\"\u016e\b\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BD\u0000\u0002\u0001\u0000*+\u0001\u0000\t\u000b\u0180\u0000G\u0001"+
		"\u0000\u0000\u0000\u0002Q\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000"+
		"\u0000\u0006f\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\no\u0001"+
		"\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000"+
		"\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000"+
		"\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000"+
		"\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000\u0000"+
		"\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000"+
		" \u00c1\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00d3"+
		"\u0001\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000"+
		"\u0000\u0000*\u00f6\u0001\u0000\u0000\u0000,\u0104\u0001\u0000\u0000\u0000"+
		".\u0118\u0001\u0000\u0000\u00000\u011a\u0001\u0000\u0000\u00002\u0126"+
		"\u0001\u0000\u0000\u00004\u0133\u0001\u0000\u0000\u00006\u0139\u0001\u0000"+
		"\u0000\u00008\u013b\u0001\u0000\u0000\u0000:\u0145\u0001\u0000\u0000\u0000"+
		"<\u014a\u0001\u0000\u0000\u0000>\u014f\u0001\u0000\u0000\u0000@\u0160"+
		"\u0001\u0000\u0000\u0000B\u0162\u0001\u0000\u0000\u0000D\u016d\u0001\u0000"+
		"\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\u0001\u0001\u0000\u0000\u0000KR\u0003\u0004\u0002\u0000LR\u0003\u0014"+
		"\n\u0000MR\u0003\u001e\u000f\u0000NR\u0003\"\u0011\u0000OR\u0003&\u0013"+
		"\u0000PR\u0003(\u0014\u0000QK\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000"+
		"\u0000QM\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0003\u0001\u0000\u0000\u0000"+
		"ST\u00052\u0000\u0000TU\u0005\r\u0000\u0000UV\u0005&\u0000\u0000VW\u0005"+
		"(\u0000\u0000WX\u0003\u0006\u0003\u0000XY\u0005)\u0000\u0000YZ\u0005\'"+
		"\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[]\u0003\b\u0004\u0000\\^\u0005"+
		"\u0018\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^c\u0001\u0000\u0000\u0000_`\u0005\u0018\u0000\u0000`b\u0003\b\u0004\u0000"+
		"a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000f[\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0007"+
		"\u0001\u0000\u0000\u0000hn\u0003\n\u0005\u0000in\u0003\f\u0006\u0000j"+
		"n\u0003(\u0014\u0000kn\u0003\u000e\u0007\u0000ln\u0003\u0010\b\u0000m"+
		"h\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\t\u0001\u0000"+
		"\u0000\u0000op\u0005\u000e\u0000\u0000pq\u0005\u0019\u0000\u0000qr\u0005"+
		"-\u0000\u0000r\u000b\u0001\u0000\u0000\u0000st\u0005\u000f\u0000\u0000"+
		"tu\u0005\u0019\u0000\u0000uv\u0003\u0012\t\u0000v\r\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0011\u0000\u0000xy\u0005\u0019\u0000\u0000yz\u0005-\u0000"+
		"\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\u0012\u0000\u0000|}\u0005"+
		"\u0019\u0000\u0000}~\u00055\u0000\u0000~\u007f\u0005-\u0000\u0000\u007f"+
		"\u0080\u00056\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0007\u0000\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0005\b\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0005\u0000\u0000\u0087\u0088\u0005,\u0000\u0000\u0088\u0089\u0003\u0016"+
		"\u000b\u0000\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008c\u0005(\u0000"+
		"\u0000\u008b\u008d\u0003\u0018\f\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005)\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0003\u001c\u000e\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u009d\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u001a\r\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u0093"+
		"\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u0019"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005,\u0000\u0000\u009f\u00a0\u0005"+
		"\u0019\u0000\u0000\u00a0\u00a1\u0003*\u0015\u0000\u00a1\u00a2\u0005\u001d"+
		"\u0000\u0000\u00a2\u00a3\u00034\u001a\u0000\u00a3\u00a4\u0005\u001b\u0000"+
		"\u0000\u00a4\u001b\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005,\u0000\u0000"+
		"\u00a6\u00aa\u0005&\u0000\u0000\u00a7\u00a9\u0003$\u0012\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\'\u0000\u0000\u00ae\u00b0\u0005\u0019\u0000\u0000\u00af\u00b1\u0003"+
		"*\u0015\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u001b"+
		"\u0000\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0006"+
		"\u0000\u0000\u00b5\u00b6\u0005,\u0000\u0000\u00b6\u00ba\u0005(\u0000\u0000"+
		"\u00b7\u00b9\u0003 \u0010\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005)\u0000\u0000\u00be\u001f"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003\u001a\r\u0000\u00c0\u00c2\u0003"+
		"\u001c\u000e\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004"+
		"\u0000\u0000\u00c4\u00c5\u0005,\u0000\u0000\u00c5\u00c9\u0005&\u0000\u0000"+
		"\u00c6\u00c8\u0003$\u0012\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\'\u0000\u0000\u00cd\u00cf"+
		"\u0005\u0019\u0000\u0000\u00ce\u00d0\u0003*\u0015\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005\u001b\u0000\u0000\u00d2#\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005,\u0000\u0000\u00d4\u00d5\u0005\u0019\u0000"+
		"\u0000\u00d5\u00d6\u0003*\u0015\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0007\u0001\u0000\u0000\u00d8\u00d9\u0005,\u0000\u0000\u00d9\u00da"+
		"\u0005\u0019\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db\u00dc\u0005"+
		"\u001d\u0000\u0000\u00dc\u00dd\u00036\u001b\u0000\u00dd\u00de\u0005\u001b"+
		"\u0000\u0000\u00de\'\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0007\u0000"+
		"\u0000\u00e0\u00e1\u0005(\u0000\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2"+
		"\u00e3\u0005)\u0000\u0000\u00e3\u00e4\u0005\f\u0000\u0000\u00e4\u00e5"+
		"\u0005-\u0000\u0000\u00e5\u00ee\u0005\u001b\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0010\u0000\u0000\u00e7\u00e8\u0005\u0019\u0000\u0000\u00e8\u00ea\u0005"+
		"5\u0000\u0000\u00e9\u00eb\u0005,\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u00056\u0000\u0000\u00ed\u00df\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ee)\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f7\u0005\u0013\u0000\u0000\u00f0\u00f7\u0005\u0014\u0000\u0000\u00f1"+
		"\u00f7\u0005\u0015\u0000\u0000\u00f2\u00f7\u0005\u0016\u0000\u0000\u00f3"+
		"\u00f7\u0005\u0017\u0000\u0000\u00f4\u00f7\u0005,\u0000\u0000\u00f5\u00f7"+
		"\u0003,\u0016\u0000\u00f6\u00ef\u0001\u0000\u0000\u0000\u00f6\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7+\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0005,\u0000\u0000\u00f9\u00fa\u00055\u0000\u0000"+
		"\u00fa\u0105\u00056\u0000\u0000\u00fb\u00fc\u0005,\u0000\u0000\u00fc\u00fd"+
		"\u00055\u0000\u0000\u00fd\u00fe\u00056\u0000\u0000\u00fe\u00ff\u0005\u001d"+
		"\u0000\u0000\u00ff\u0100\u00055\u0000\u0000\u0100\u0101\u0003.\u0017\u0000"+
		"\u0101\u0102\u00056\u0000\u0000\u0102\u0103\u0005\u001b\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u00f8\u0001\u0000\u0000\u0000\u0104"+
		"\u00fb\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u00030\u0018\u0000\u0107\u0109\u0005\u0018\u0000\u0000\u0108\u0107\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u0119\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0005.\u0000\u0000\u0110\u0112\u0005\u0018"+
		"\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000"+
		"\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u010c\u0001\u0000"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0119/\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005(\u0000\u0000\u011b\u011c\u00032\u0019\u0000\u011c"+
		"\u011d\u0005)\u0000\u0000\u011d1\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		",\u0000\u0000\u011f\u0120\u0005\u0019\u0000\u0000\u0120\u0122\u00034\u001a"+
		"\u0000\u0121\u0123\u0005\u0018\u0000\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000"+
		"\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u01273\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0005.\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u0134\u0001\u0000\u0000\u0000\u012e"+
		"\u0130\u0005-\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012a"+
		"\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u01345\u0001"+
		"\u0000\u0000\u0000\u0135\u013a\u0005-\u0000\u0000\u0136\u013a\u0005.\u0000"+
		"\u0000\u0137\u013a\u0005,\u0000\u0000\u0138\u013a\u00038\u001c\u0000\u0139"+
		"\u0135\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"7\u0001\u0000\u0000\u0000\u013b\u013c\u0005,\u0000\u0000\u013c\u0140\u0005"+
		"&\u0000\u0000\u013d\u013f\u0003:\u001d\u0000\u013e\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0005\'\u0000\u0000"+
		"\u01449\u0001\u0000\u0000\u0000\u0145\u0146\u00036\u001b\u0000\u0146;"+
		"\u0001\u0000\u0000\u0000\u0147\u0149\u0003\u0002\u0001\u0000\u0148\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0005\u0000\u0000\u0001\u014e=\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"\u0007\u0000\u0000\u0150\u0151\u0003@ \u0000\u0151\u0152\u0005\f\u0000"+
		"\u0000\u0152\u0153\u0005-\u0000\u0000\u0153\u0154\u0005\u001b\u0000\u0000"+
		"\u0154?\u0001\u0000\u0000\u0000\u0155\u0156\u0005(\u0000\u0000\u0156\u015b"+
		"\u0005,\u0000\u0000\u0157\u0158\u0005\u0018\u0000\u0000\u0158\u015a\u0005"+
		",\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0005)\u0000\u0000\u015f\u0161\u0005,\u0000\u0000"+
		"\u0160\u0155\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0161A\u0001\u0000\u0000\u0000\u0162\u0166\u0005(\u0000\u0000\u0163\u0165"+
		"\u0003D\"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001"+
		"\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0005)\u0000\u0000\u016aC\u0001\u0000\u0000"+
		"\u0000\u016b\u016e\u0003\u001c\u000e\u0000\u016c\u016e\u0003\u001a\r\u0000"+
		"\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016eE\u0001\u0000\u0000\u0000&IQ]cfm\u0084\u008c\u0093\u0099\u009c\u00aa"+
		"\u00b0\u00ba\u00c1\u00c9\u00cf\u00ea\u00ed\u00f6\u0104\u0108\u010c\u0111"+
		"\u0115\u0118\u0122\u0126\u012c\u0131\u0133\u0139\u0140\u014a\u015b\u0160"+
		"\u0166\u016d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}