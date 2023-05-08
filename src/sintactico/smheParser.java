// Generated from smhe.g4 by ANTLR 4.12.0
package sintactico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class smheParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SALIR=1, INICIO=2, FIN=3, COMIENZO=4, ENTERO=5, LOGICO=6, FUNCION=7, USAR=8, 
		CONDICION=9, SINO=10, MIENTRAS=11, VENTILAR=12, ADMITIR=13, DISPENSAR=14, 
		SANITIZAR=15, DECLARAR=16, COMO=17, CADA=18, POR=19, SEG=20, MIN=21, HR=22, 
		ABRIR=23, CERRAR=24, VENTANAS=25, PUERTAS=26, LUCES=27, MANTENER=28, ESTADO=29, 
		OBTENER=30, TEMPERATURA=31, PERSONAS=32, APAGAR=33, ENCENDER=34, ASIGNACION=35, 
		SUMA=36, RESTA=37, MULTIPLICACION=38, DIVISION=39, NEGACION=40, AND=41, 
		OR=42, MAYOR=43, MENOR=44, MAYORIGUAL=45, MENORIGUAL=46, IGUAL=47, DIFERENTE=48, 
		INCREMENTO=49, DECREMENTO=50, VERDADERO=51, FALSO=52, PARENTESISIZQUIERDO=53, 
		PARENTESISDERECHO=54, LLAVEIZQUIERDA=55, LLAVEDERECHA=56, PUNTOYCOMA=57, 
		COMA=58, INICIOCOMENTARIO=59, ID=60, NUMERO=61, ERRNUMERO=62, ERRID=63, 
		COMENTARIO=64, ESPACIO=65;
	public static final int
		RULE_inicio = 0, RULE_decGlobales = 1, RULE_comienzo = 2, RULE_decFuncion = 3, 
		RULE_dp = 4, RULE_declaracion = 5, RULE_tipo = 6, RULE_tc = 7, RULE_ut = 8, 
		RULE_expresion = 9, RULE_op1 = 10, RULE_op2 = 11, RULE_op3 = 12, RULE_op4 = 13, 
		RULE_op5 = 14, RULE_op6 = 15, RULE_op7 = 16, RULE_op8 = 17, RULE_estado = 18, 
		RULE_obtener = 19, RULE_gramas = 20, RULE_stmt = 21, RULE_usar = 22, RULE_parametro = 23, 
		RULE_tp = 24, RULE_condicionales = 25, RULE_sino = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "decGlobales", "comienzo", "decFuncion", "dp", "declaracion", 
			"tipo", "tc", "ut", "expresion", "op1", "op2", "op3", "op4", "op5", "op6", 
			"op7", "op8", "estado", "obtener", "gramas", "stmt", "usar", "parametro", 
			"tp", "condicionales", "sino"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'salir'", "'inicio'", "'fin'", "'comienzo'", "'entero'", "'logico'", 
			"'funcion'", "'usar'", "'condicion'", "'sino'", "'mientras'", "'ventilar'", 
			"'admitir'", "'dispensar'", "'sanitizar'", "'declarar'", "'como'", "'cada'", 
			"'por'", "'seg'", "'min'", "'hr'", "'abrir'", "'cerrar'", "'ventanas'", 
			"'puertas'", "'luces'", "'mantener'", "'estado'", "'obtener'", "'temperatura'", 
			"'personas'", "'apagar'", "'encender'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'&&'", "'||'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'++'", "'--'", "'verdadero'", "'falso'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SALIR", "INICIO", "FIN", "COMIENZO", "ENTERO", "LOGICO", "FUNCION", 
			"USAR", "CONDICION", "SINO", "MIENTRAS", "VENTILAR", "ADMITIR", "DISPENSAR", 
			"SANITIZAR", "DECLARAR", "COMO", "CADA", "POR", "SEG", "MIN", "HR", "ABRIR", 
			"CERRAR", "VENTANAS", "PUERTAS", "LUCES", "MANTENER", "ESTADO", "OBTENER", 
			"TEMPERATURA", "PERSONAS", "APAGAR", "ENCENDER", "ASIGNACION", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "NEGACION", "AND", "OR", "MAYOR", 
			"MENOR", "MAYORIGUAL", "MENORIGUAL", "IGUAL", "DIFERENTE", "INCREMENTO", 
			"DECREMENTO", "VERDADERO", "FALSO", "PARENTESISIZQUIERDO", "PARENTESISDERECHO", 
			"LLAVEIZQUIERDA", "LLAVEDERECHA", "PUNTOYCOMA", "COMA", "INICIOCOMENTARIO", 
			"ID", "NUMERO", "ERRNUMERO", "ERRID", "COMENTARIO", "ESPACIO"
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
	public String getGrammarFileName() { return "smhe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		boolean condicionalValido(){
			return !this.ruleNames[this.getContext().getParent().getRuleIndex()].equals("sino");
		}

	public smheParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	 
		public InicioContext() { }
		public void copyFrom(InicioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblInicioContext extends InicioContext {
		public TerminalNode INICIO() { return getToken(smheParser.INICIO, 0); }
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public ComienzoContext comienzo() {
			return getRuleContext(ComienzoContext.class,0);
		}
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public TerminalNode FIN() { return getToken(smheParser.FIN, 0); }
		public DecGlobalesContext decGlobales() {
			return getRuleContext(DecGlobalesContext.class,0);
		}
		public LblInicioContext(InicioContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			_localctx = new LblInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INICIO);
			setState(55);
			match(ID);
			setState(56);
			match(LLAVEIZQUIERDA);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARAR || _la==ID) {
				{
				setState(57);
				decGlobales();
				}
			}

			setState(60);
			comienzo();
			setState(61);
			match(LLAVEDERECHA);
			setState(62);
			match(FIN);
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
	public static class DecGlobalesContext extends ParserRuleContext {
		public DecGlobalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decGlobales; }
	 
		public DecGlobalesContext() { }
		public void copyFrom(DecGlobalesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblDeclaracionesGlobalesContext extends DecGlobalesContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(smheParser.PUNTOYCOMA, 0); }
		public TerminalNode ASIGNACION() { return getToken(smheParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DecGlobalesContext decGlobales() {
			return getRuleContext(DecGlobalesContext.class,0);
		}
		public LblDeclaracionesGlobalesContext(DecGlobalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblDeclaracionesGlobales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblDeclaracionesGlobales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblDeclaracionesGlobales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecGlobalesContext decGlobales() throws RecognitionException {
		DecGlobalesContext _localctx = new DecGlobalesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decGlobales);
		int _la;
		try {
			_localctx = new LblDeclaracionesGlobalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			declaracion();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNACION) {
				{
				setState(65);
				match(ASIGNACION);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476217200937795584L) != 0)) {
				{
				setState(68);
				expresion();
				}
			}

			setState(71);
			match(PUNTOYCOMA);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARAR || _la==ID) {
				{
				setState(72);
				decGlobales();
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
	public static class ComienzoContext extends ParserRuleContext {
		public ComienzoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comienzo; }
	 
		public ComienzoContext() { }
		public void copyFrom(ComienzoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblComienzoContext extends ComienzoContext {
		public TerminalNode COMIENZO() { return getToken(smheParser.COMIENZO, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public TcContext tc() {
			return getRuleContext(TcContext.class,0);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public DecFuncionContext decFuncion() {
			return getRuleContext(DecFuncionContext.class,0);
		}
		public LblComienzoContext(ComienzoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblComienzo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblComienzo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblComienzo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComienzoContext comienzo() throws RecognitionException {
		ComienzoContext _localctx = new ComienzoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comienzo);
		int _la;
		try {
			_localctx = new LblComienzoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(COMIENZO);
			setState(76);
			match(PARENTESISIZQUIERDO);
			setState(77);
			tc();
			setState(78);
			match(PARENTESISDERECHO);
			setState(79);
			match(LLAVEIZQUIERDA);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(80);
				gramas();
				}
				break;
			}
			setState(83);
			match(LLAVEDERECHA);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCION) {
				{
				setState(84);
				decFuncion();
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
	public static class DecFuncionContext extends ParserRuleContext {
		public DecFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncion; }
	 
		public DecFuncionContext() { }
		public void copyFrom(DecFuncionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblDecFuncionContext extends DecFuncionContext {
		public TerminalNode FUNCION() { return getToken(smheParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public DecFuncionContext decFuncion() {
			return getRuleContext(DecFuncionContext.class,0);
		}
		public LblDecFuncionContext(DecFuncionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblDecFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblDecFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblDecFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncionContext decFuncion() throws RecognitionException {
		DecFuncionContext _localctx = new DecFuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decFuncion);
		int _la;
		try {
			_localctx = new LblDecFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FUNCION);
			setState(88);
			match(ID);
			setState(89);
			match(PARENTESISIZQUIERDO);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARAR || _la==ID) {
				{
				setState(90);
				dp();
				}
			}

			setState(93);
			match(PARENTESISDERECHO);
			setState(94);
			match(LLAVEIZQUIERDA);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(95);
				gramas();
				}
				break;
			}
			setState(98);
			match(LLAVEDERECHA);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCION) {
				{
				setState(99);
				decFuncion();
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
	public static class DpContext extends ParserRuleContext {
		public DpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dp; }
	 
		public DpContext() { }
		public void copyFrom(DpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblParametrosContext extends DpContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(smheParser.COMA, 0); }
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public LblParametrosContext(DpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DpContext dp() throws RecognitionException {
		DpContext _localctx = new DpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dp);
		int _la;
		try {
			_localctx = new LblParametrosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			declaracion();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(103);
				match(COMA);
				setState(104);
				dp();
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
	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblDeclaraciones1Context extends DeclaracionContext {
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode COMO() { return getToken(smheParser.COMO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public LblDeclaraciones1Context(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblDeclaraciones1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblDeclaraciones1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblDeclaraciones1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblDeclaracionesContext extends DeclaracionContext {
		public TerminalNode DECLARAR() { return getToken(smheParser.DECLARAR, 0); }
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode COMO() { return getToken(smheParser.COMO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public LblDeclaracionesContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARAR:
				_localctx = new LblDeclaracionesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(DECLARAR);
				setState(108);
				match(ID);
				setState(109);
				match(COMO);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTERO || _la==LOGICO) {
					{
					setState(110);
					tipo();
					}
				}

				}
				break;
			case ID:
				_localctx = new LblDeclaraciones1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ID);
				setState(114);
				match(COMO);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTERO || _la==LOGICO) {
					{
					setState(115);
					tipo();
					}
				}

				notifyErrorListeners("No se ha encontrado la cadena 'declarar'");
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblTipoContext extends TipoContext {
		public Token td;
		public TerminalNode ENTERO() { return getToken(smheParser.ENTERO, 0); }
		public TerminalNode LOGICO() { return getToken(smheParser.LOGICO, 0); }
		public LblTipoContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			_localctx = new LblTipoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((LblTipoContext)_localctx).td = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==LOGICO) ) {
				((LblTipoContext)_localctx).td = (Token)_errHandler.recoverInline(this);
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
	public static class TcContext extends ParserRuleContext {
		public TcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tc; }
	 
		public TcContext() { }
		public void copyFrom(TcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblTiempoCadaContext extends TcContext {
		public TerminalNode CADA() { return getToken(smheParser.CADA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public LblTiempoCadaContext(TcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblTiempoCada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblTiempoCada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblTiempoCada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TcContext tc() throws RecognitionException {
		TcContext _localctx = new TcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tc);
		try {
			_localctx = new LblTiempoCadaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CADA);
			setState(124);
			expresion();
			setState(125);
			ut();
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
	public static class UtContext extends ParserRuleContext {
		public UtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ut; }
	 
		public UtContext() { }
		public void copyFrom(UtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblUnidadTiempoContext extends UtContext {
		public TerminalNode SEG() { return getToken(smheParser.SEG, 0); }
		public TerminalNode MIN() { return getToken(smheParser.MIN, 0); }
		public TerminalNode HR() { return getToken(smheParser.HR, 0); }
		public LblUnidadTiempoContext(UtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblUnidadTiempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblUnidadTiempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblUnidadTiempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtContext ut() throws RecognitionException {
		UtContext _localctx = new UtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ut);
		int _la;
		try {
			_localctx = new LblUnidadTiempoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblExpresionContext extends ExpresionContext {
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public LblExpresionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		int _la;
		try {
			_localctx = new LblExpresionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			op2();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476223798007562240L) != 0)) {
				{
				setState(130);
				op1();
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
	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
	 
		public Op1Context() { }
		public void copyFrom(Op1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblAndOrContext extends Op1Context {
		public Token op;
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TerminalNode AND() { return getToken(smheParser.AND, 0); }
		public TerminalNode OR() { return getToken(smheParser.OR, 0); }
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public LblAndOrContext(Op1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblAndOr1Context extends Op1Context {
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public LblAndOr1Context(Op1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblAndOr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblAndOr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblAndOr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_op1);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				_localctx = new LblAndOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((LblAndOrContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((LblAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				op2();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476223798007562240L) != 0)) {
					{
					setState(135);
					op1();
					}
				}

				}
				break;
			case ESTADO:
			case OBTENER:
			case RESTA:
			case NEGACION:
			case INCREMENTO:
			case DECREMENTO:
			case VERDADERO:
			case FALSO:
			case PARENTESISIZQUIERDO:
			case ID:
			case NUMERO:
				_localctx = new LblAndOr1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				op2();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476223798007562240L) != 0)) {
					{
					setState(139);
					op1();
					}
				}

				notifyErrorListeners("Error de sintaxis: Se esperaba un operador");
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
	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
	 
		public Op2Context() { }
		public void copyFrom(Op2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblOp2Context extends Op2Context {
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public LblOp2Context(Op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_op2);
		int _la;
		try {
			_localctx = new LblOp2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			op4();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) {
				{
				setState(147);
				op3();
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
	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
	 
		public Op3Context() { }
		public void copyFrom(Op3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblRelacionalesContext extends Op3Context {
		public Token op;
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public TerminalNode MAYOR() { return getToken(smheParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(smheParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(smheParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(smheParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(smheParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(smheParser.DIFERENTE, 0); }
		public LblRelacionalesContext(Op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblRelacionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblRelacionales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_op3);
		int _la;
		try {
			_localctx = new LblRelacionalesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((LblRelacionalesContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) ) {
				((LblRelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			op4();
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
	public static class Op4Context extends ParserRuleContext {
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
	 
		public Op4Context() { }
		public void copyFrom(Op4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblOp4Context extends Op4Context {
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public LblOp4Context(Op4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		Op4Context _localctx = new Op4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_op4);
		try {
			_localctx = new LblOp4Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			op6();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(154);
				op5();
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
	public static class Op5Context extends ParserRuleContext {
		public Op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op5; }
	 
		public Op5Context() { }
		public void copyFrom(Op5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblSumaRestaContext extends Op5Context {
		public Token op;
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public TerminalNode SUMA() { return getToken(smheParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(smheParser.RESTA, 0); }
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public LblSumaRestaContext(Op5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblSumaResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblSumaResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblSumaResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op5Context op5() throws RecognitionException {
		Op5Context _localctx = new Op5Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_op5);
		int _la;
		try {
			_localctx = new LblSumaRestaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((LblSumaRestaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SUMA || _la==RESTA) ) {
				((LblSumaRestaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			op6();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(159);
				op5();
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
	public static class Op6Context extends ParserRuleContext {
		public Op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op6; }
	 
		public Op6Context() { }
		public void copyFrom(Op6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblOp6Context extends Op6Context {
		public Op8Context op8() {
			return getRuleContext(Op8Context.class,0);
		}
		public Op7Context op7() {
			return getRuleContext(Op7Context.class,0);
		}
		public LblOp6Context(Op6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblOp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblOp6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblOp6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op6Context op6() throws RecognitionException {
		Op6Context _localctx = new Op6Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_op6);
		int _la;
		try {
			_localctx = new LblOp6Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			op8();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACION || _la==DIVISION) {
				{
				setState(163);
				op7();
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
	public static class Op7Context extends ParserRuleContext {
		public Op7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op7; }
	 
		public Op7Context() { }
		public void copyFrom(Op7Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblMultDivContext extends Op7Context {
		public Token op;
		public Op8Context op8() {
			return getRuleContext(Op8Context.class,0);
		}
		public TerminalNode MULTIPLICACION() { return getToken(smheParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(smheParser.DIVISION, 0); }
		public Op7Context op7() {
			return getRuleContext(Op7Context.class,0);
		}
		public LblMultDivContext(Op7Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op7Context op7() throws RecognitionException {
		Op7Context _localctx = new Op7Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_op7);
		int _la;
		try {
			_localctx = new LblMultDivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((LblMultDivContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
				((LblMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			op8();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLICACION || _la==DIVISION) {
				{
				setState(168);
				op7();
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
	public static class Op8Context extends ParserRuleContext {
		public Op8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op8; }
	 
		public Op8Context() { }
		public void copyFrom(Op8Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblEstadoContext extends Op8Context {
		public TerminalNode ESTADO() { return getToken(smheParser.ESTADO, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public LblEstadoContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblEstado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblEstado(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblNumeroContext extends Op8Context {
		public TerminalNode NUMERO() { return getToken(smheParser.NUMERO, 0); }
		public LblNumeroContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblIncDecPosContext extends Op8Context {
		public Token op;
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(smheParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(smheParser.DECREMENTO, 0); }
		public LblIncDecPosContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblIncDecPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblIncDecPos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblIncDecPos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblIncDecPreContext extends Op8Context {
		public Token op;
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(smheParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(smheParser.DECREMENTO, 0); }
		public LblIncDecPreContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblIncDecPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblIncDecPre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblIncDecPre(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblObtenerContext extends Op8Context {
		public TerminalNode OBTENER() { return getToken(smheParser.OBTENER, 0); }
		public ObtenerContext obtener() {
			return getRuleContext(ObtenerContext.class,0);
		}
		public LblObtenerContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblObtener(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblObtener(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblObtener(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblNegacionArContext extends Op8Context {
		public TerminalNode RESTA() { return getToken(smheParser.RESTA, 0); }
		public Op8Context op8() {
			return getRuleContext(Op8Context.class,0);
		}
		public LblNegacionArContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblNegacionAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblNegacionAr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblNegacionAr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblBooleanoContext extends Op8Context {
		public TerminalNode VERDADERO() { return getToken(smheParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(smheParser.FALSO, 0); }
		public LblBooleanoContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblNegacionLogContext extends Op8Context {
		public TerminalNode NEGACION() { return getToken(smheParser.NEGACION, 0); }
		public Op8Context op8() {
			return getRuleContext(Op8Context.class,0);
		}
		public LblNegacionLogContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblNegacionLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblNegacionLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblNegacionLog(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblParentesisContext extends Op8Context {
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public LblParentesisContext(Op8Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op8Context op8() throws RecognitionException {
		Op8Context _localctx = new Op8Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_op8);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACION:
				_localctx = new LblNegacionLogContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(NEGACION);
				setState(172);
				op8();
				}
				break;
			case RESTA:
				_localctx = new LblNegacionArContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(RESTA);
				setState(174);
				op8();
				}
				break;
			case INCREMENTO:
			case DECREMENTO:
				_localctx = new LblIncDecPreContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				((LblIncDecPreContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
					((LblIncDecPreContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				match(ID);
				}
				break;
			case ID:
				_localctx = new LblIncDecPosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(178);
					((LblIncDecPosContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
						((LblIncDecPosContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case NUMERO:
				_localctx = new LblNumeroContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(NUMERO);
				}
				break;
			case OBTENER:
				_localctx = new LblObtenerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(OBTENER);
				setState(183);
				obtener();
				}
				break;
			case VERDADERO:
			case FALSO:
				_localctx = new LblBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==VERDADERO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ESTADO:
				_localctx = new LblEstadoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				match(ESTADO);
				setState(186);
				estado();
				}
				break;
			case PARENTESISIZQUIERDO:
				_localctx = new LblParentesisContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(187);
				match(PARENTESISIZQUIERDO);
				setState(188);
				expresion();
				setState(189);
				match(PARENTESISDERECHO);
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
	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
	 
		public EstadoContext() { }
		public void copyFrom(EstadoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblEstadoValorContext extends EstadoContext {
		public Token edo;
		public TerminalNode VENTANAS() { return getToken(smheParser.VENTANAS, 0); }
		public TerminalNode PUERTAS() { return getToken(smheParser.PUERTAS, 0); }
		public TerminalNode LUCES() { return getToken(smheParser.LUCES, 0); }
		public LblEstadoValorContext(EstadoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblEstadoValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblEstadoValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblEstadoValor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblEstadoValor1Context extends EstadoContext {
		public LblEstadoValor1Context(EstadoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblEstadoValor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblEstadoValor1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblEstadoValor1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_estado);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VENTANAS:
			case PUERTAS:
			case LUCES:
				_localctx = new LblEstadoValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((LblEstadoValorContext)_localctx).edo = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
					((LblEstadoValorContext)_localctx).edo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SEG:
			case MIN:
			case HR:
			case ESTADO:
			case OBTENER:
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
			case NEGACION:
			case AND:
			case OR:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case DIFERENTE:
			case INCREMENTO:
			case DECREMENTO:
			case VERDADERO:
			case FALSO:
			case PARENTESISIZQUIERDO:
			case PARENTESISDERECHO:
			case PUNTOYCOMA:
			case COMA:
			case ID:
			case NUMERO:
				_localctx = new LblEstadoValor1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Error de sintaxis: Se esperaba un estado");
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
	public static class ObtenerContext extends ParserRuleContext {
		public ObtenerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obtener; }
	 
		public ObtenerContext() { }
		public void copyFrom(ObtenerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblValorObtenerContext extends ObtenerContext {
		public TerminalNode PERSONAS() { return getToken(smheParser.PERSONAS, 0); }
		public TerminalNode TEMPERATURA() { return getToken(smheParser.TEMPERATURA, 0); }
		public LblValorObtenerContext(ObtenerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblValorObtener(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblValorObtener(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblValorObtener(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblValorObtener1Context extends ObtenerContext {
		public LblValorObtener1Context(ObtenerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblValorObtener1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblValorObtener1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblValorObtener1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObtenerContext obtener() throws RecognitionException {
		ObtenerContext _localctx = new ObtenerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_obtener);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPERATURA:
			case PERSONAS:
				_localctx = new LblValorObtenerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==TEMPERATURA || _la==PERSONAS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SEG:
			case MIN:
			case HR:
			case ESTADO:
			case OBTENER:
			case SUMA:
			case RESTA:
			case MULTIPLICACION:
			case DIVISION:
			case NEGACION:
			case AND:
			case OR:
			case MAYOR:
			case MENOR:
			case MAYORIGUAL:
			case MENORIGUAL:
			case IGUAL:
			case DIFERENTE:
			case INCREMENTO:
			case DECREMENTO:
			case VERDADERO:
			case FALSO:
			case PARENTESISIZQUIERDO:
			case PARENTESISDERECHO:
			case PUNTOYCOMA:
			case COMA:
			case ID:
			case NUMERO:
				_localctx = new LblValorObtener1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("Error de sintaxis: Se esperaba un valor a obtener");
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
	public static class GramasContext extends ParserRuleContext {
		public GramasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramas; }
	 
		public GramasContext() { }
		public void copyFrom(GramasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblGramasContext extends GramasContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(smheParser.PUNTOYCOMA, 0); }
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public LblGramasContext(GramasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblCondicionalesGramasContext extends GramasContext {
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public LblCondicionalesGramasContext(GramasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblCondicionalesGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblCondicionalesGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblCondicionalesGramas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramasContext gramas() throws RecognitionException {
		GramasContext _localctx = new GramasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gramas);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new LblGramasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				stmt();
				setState(202);
				match(PUNTOYCOMA);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(203);
					gramas();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new LblCondicionalesGramasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				condicionales();
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(207);
					gramas();
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblIncDecPreGramasContext extends StmtContext {
		public Token op;
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode DECREMENTO() { return getToken(smheParser.DECREMENTO, 0); }
		public TerminalNode INCREMENTO() { return getToken(smheParser.INCREMENTO, 0); }
		public LblIncDecPreGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblIncDecPreGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblIncDecPreGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblIncDecPreGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblUsarGramasContext extends StmtContext {
		public UsarContext usar() {
			return getRuleContext(UsarContext.class,0);
		}
		public LblUsarGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblUsarGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblUsarGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblUsarGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblIncDecPosGramasContext extends StmtContext {
		public Token op;
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(smheParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(smheParser.DECREMENTO, 0); }
		public LblIncDecPosGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblIncDecPosGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblIncDecPosGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblIncDecPosGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblSanitizarDispensarGramasContext extends StmtContext {
		public Token accion;
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TerminalNode SANITIZAR() { return getToken(smheParser.SANITIZAR, 0); }
		public TerminalNode DISPENSAR() { return getToken(smheParser.DISPENSAR, 0); }
		public LblSanitizarDispensarGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblSanitizarDispensarGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblSanitizarDispensarGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblSanitizarDispensarGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblSalirGramasContext extends StmtContext {
		public TerminalNode SALIR() { return getToken(smheParser.SALIR, 0); }
		public LblSalirGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblSalirGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblSalirGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblSalirGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblDeclaracionesGramasContext extends StmtContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(smheParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LblDeclaracionesGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblDeclaracionesGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblDeclaracionesGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblDeclaracionesGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblAsignacionGramasContext extends StmtContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(smheParser.ASIGNACION, 0); }
		public LblAsignacionGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblAsignacionGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblAsignacionGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblAsignacionGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblVentanasPuertasGramasContext extends StmtContext {
		public Token accion;
		public Token actor;
		public TerminalNode ABRIR() { return getToken(smheParser.ABRIR, 0); }
		public TerminalNode CERRAR() { return getToken(smheParser.CERRAR, 0); }
		public TerminalNode VENTANAS() { return getToken(smheParser.VENTANAS, 0); }
		public TerminalNode PUERTAS() { return getToken(smheParser.PUERTAS, 0); }
		public TerminalNode MANTENER() { return getToken(smheParser.MANTENER, 0); }
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public LblVentanasPuertasGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblVentanasPuertasGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblVentanasPuertasGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblVentanasPuertasGramas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblLucesGramasContext extends StmtContext {
		public Token accion;
		public TerminalNode LUCES() { return getToken(smheParser.LUCES, 0); }
		public TerminalNode APAGAR() { return getToken(smheParser.APAGAR, 0); }
		public TerminalNode ENCENDER() { return getToken(smheParser.ENCENDER, 0); }
		public LblLucesGramasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblLucesGramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblLucesGramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblLucesGramas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new LblIncDecPosGramasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ID);
				setState(213);
				((LblIncDecPosGramasContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
					((LblIncDecPosGramasContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new LblIncDecPreGramasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((LblIncDecPreGramasContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
					((LblIncDecPreGramasContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				match(ID);
				}
				break;
			case 3:
				_localctx = new LblDeclaracionesGramasContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				declaracion();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(217);
					match(ASIGNACION);
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476217200937795584L) != 0)) {
					{
					setState(220);
					expresion();
					}
				}

				}
				break;
			case 4:
				_localctx = new LblAsignacionGramasContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(223);
					match(ID);
					}
					break;
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGNACION) {
					{
					setState(226);
					match(ASIGNACION);
					}
				}

				setState(229);
				expresion();
				}
				break;
			case 5:
				_localctx = new LblLucesGramasContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				((LblLucesGramasContext)_localctx).accion = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==APAGAR || _la==ENCENDER) ) {
					((LblLucesGramasContext)_localctx).accion = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				match(LUCES);
				}
				break;
			case 6:
				_localctx = new LblVentanasPuertasGramasContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				((LblVentanasPuertasGramasContext)_localctx).accion = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ABRIR || _la==CERRAR) ) {
					((LblVentanasPuertasGramasContext)_localctx).accion = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				((LblVentanasPuertasGramasContext)_localctx).actor = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VENTANAS || _la==PUERTAS) ) {
					((LblVentanasPuertasGramasContext)_localctx).actor = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANTENER:
					{
					setState(234);
					match(MANTENER);
					}
					break;
				case POR:
					{
					setState(235);
					tp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				_localctx = new LblSanitizarDispensarGramasContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				((LblSanitizarDispensarGramasContext)_localctx).accion = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISPENSAR || _la==SANITIZAR) ) {
					((LblSanitizarDispensarGramasContext)_localctx).accion = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				tp();
				}
				break;
			case 8:
				_localctx = new LblUsarGramasContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(240);
				usar();
				}
				break;
			case 9:
				_localctx = new LblSalirGramasContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				match(SALIR);
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
	public static class UsarContext extends ParserRuleContext {
		public UsarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usar; }
	 
		public UsarContext() { }
		public void copyFrom(UsarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblUsarVentilarContext extends UsarContext {
		public TerminalNode USAR() { return getToken(smheParser.USAR, 0); }
		public TerminalNode VENTILAR() { return getToken(smheParser.VENTILAR, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(smheParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(smheParser.COMA, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public LblUsarVentilarContext(UsarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblUsarVentilar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblUsarVentilar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblUsarVentilar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblUsarFuncionContext extends UsarContext {
		public TerminalNode USAR() { return getToken(smheParser.USAR, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public TerminalNode ID() { return getToken(smheParser.ID, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public LblUsarFuncionContext(UsarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblUsarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblUsarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblUsarFuncion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblUsarAdmitirContext extends UsarContext {
		public TerminalNode USAR() { return getToken(smheParser.USAR, 0); }
		public TerminalNode ADMITIR() { return getToken(smheParser.ADMITIR, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(smheParser.COMA, 0); }
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public LblUsarAdmitirContext(UsarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblUsarAdmitir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblUsarAdmitir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblUsarAdmitir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsarContext usar() throws RecognitionException {
		UsarContext _localctx = new UsarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_usar);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new LblUsarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(USAR);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(245);
					match(ID);
					}
				}

				setState(248);
				match(PARENTESISIZQUIERDO);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3476217200937795584L) != 0)) {
					{
					setState(249);
					parametro();
					}
				}

				setState(252);
				match(PARENTESISDERECHO);
				}
				break;
			case 2:
				_localctx = new LblUsarAdmitirContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(USAR);
				setState(254);
				match(ADMITIR);
				setState(255);
				match(PARENTESISIZQUIERDO);
				setState(256);
				expresion();
				setState(257);
				match(COMA);
				setState(258);
				tp();
				setState(259);
				match(PARENTESISDERECHO);
				}
				break;
			case 3:
				_localctx = new LblUsarVentilarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(USAR);
				setState(262);
				match(VENTILAR);
				setState(263);
				match(PARENTESISIZQUIERDO);
				setState(264);
				tp();
				setState(265);
				match(COMA);
				setState(266);
				expresion();
				setState(267);
				match(COMA);
				setState(268);
				expresion();
				setState(269);
				match(PARENTESISDERECHO);
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
	public static class ParametroContext extends ParserRuleContext {
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	 
		public ParametroContext() { }
		public void copyFrom(ParametroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblParametrosFuncionContext extends ParametroContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(smheParser.COMA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public LblParametrosFuncionContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblParametrosFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblParametrosFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblParametrosFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametro);
		int _la;
		try {
			_localctx = new LblParametrosFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			expresion();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(274);
				match(COMA);
				setState(275);
				parametro();
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
	public static class TpContext extends ParserRuleContext {
		public TpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp; }
	 
		public TpContext() { }
		public void copyFrom(TpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblTiempoPorContext extends TpContext {
		public TerminalNode POR() { return getToken(smheParser.POR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UtContext ut() {
			return getRuleContext(UtContext.class,0);
		}
		public LblTiempoPorContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblTiempoPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblTiempoPor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblTiempoPor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TpContext tp() throws RecognitionException {
		TpContext _localctx = new TpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tp);
		try {
			_localctx = new LblTiempoPorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(POR);
			setState(279);
			expresion();
			setState(280);
			ut();
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
	public static class CondicionalesContext extends ParserRuleContext {
		public CondicionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionales; }
	 
		public CondicionalesContext() { }
		public void copyFrom(CondicionalesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblMientrasContext extends CondicionalesContext {
		public TerminalNode MIENTRAS() { return getToken(smheParser.MIENTRAS, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public LblMientrasContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblMientras(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblCondicionContext extends CondicionalesContext {
		public TerminalNode CONDICION() { return getToken(smheParser.CONDICION, 0); }
		public TerminalNode PARENTESISIZQUIERDO() { return getToken(smheParser.PARENTESISIZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESISDERECHO() { return getToken(smheParser.PARENTESISDERECHO, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public LblCondicionContext(CondicionalesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalesContext condicionales() throws RecognitionException {
		CondicionalesContext _localctx = new CondicionalesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condicionales);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new LblCondicionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(CONDICION);
				setState(283);
				match(PARENTESISIZQUIERDO);
				setState(284);
				expresion();
				setState(285);
				match(PARENTESISDERECHO);
				setState(286);
				match(LLAVEIZQUIERDA);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(287);
					gramas();
					}
					break;
				}
				setState(290);
				match(LLAVEDERECHA);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(291);
					sino();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new LblMientrasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				if (!( condicionalValido() )) throw new FailedPredicateException(this, " condicionalValido() ");
				setState(295);
				match(MIENTRAS);
				setState(296);
				match(PARENTESISIZQUIERDO);
				setState(297);
				expresion();
				setState(298);
				match(PARENTESISDERECHO);
				setState(299);
				match(LLAVEIZQUIERDA);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(300);
					gramas();
					}
					break;
				}
				setState(303);
				match(LLAVEDERECHA);
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
	public static class SinoContext extends ParserRuleContext {
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
	 
		public SinoContext() { }
		public void copyFrom(SinoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblSinoContext extends SinoContext {
		public TerminalNode SINO() { return getToken(smheParser.SINO, 0); }
		public TerminalNode LLAVEIZQUIERDA() { return getToken(smheParser.LLAVEIZQUIERDA, 0); }
		public TerminalNode LLAVEDERECHA() { return getToken(smheParser.LLAVEDERECHA, 0); }
		public GramasContext gramas() {
			return getRuleContext(GramasContext.class,0);
		}
		public LblSinoContext(SinoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblSino(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LblSinoCondicionalesContext extends SinoContext {
		public TerminalNode SINO() { return getToken(smheParser.SINO, 0); }
		public CondicionalesContext condicionales() {
			return getRuleContext(CondicionalesContext.class,0);
		}
		public LblSinoCondicionalesContext(SinoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).enterLblSinoCondicionales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smheListener ) ((smheListener)listener).exitLblSinoCondicionales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smheVisitor ) return ((smheVisitor<? extends T>)visitor).visitLblSinoCondicionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sino);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new LblSinoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(SINO);
				setState(308);
				match(LLAVEIZQUIERDA);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(309);
					gramas();
					}
					break;
				}
				setState(312);
				match(LLAVEDERECHA);
				}
				break;
			case 2:
				_localctx = new LblSinoCondicionalesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(SINO);
				setState(314);
				condicionales();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return condicionales_sempred((CondicionalesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicionales_sempred(CondicionalesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  condicionalValido() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"J\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002R\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"V\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\\\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005p\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005u\b\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0003\t\u0084\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n"+
		"\u0001\n\u0001\n\u0003\n\u008d\b\n\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0003\r\u009c\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00a1\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00a5\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00aa\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00b4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c0\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00c4\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00c8\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cd\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00d1\b\u0014\u0003\u0014\u00d3\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00db\b\u0015\u0001\u0015\u0003\u0015\u00de\b\u0015\u0001\u0015\u0003"+
		"\u0015\u00e1\b\u0015\u0001\u0015\u0003\u0015\u00e4\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00ed\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00f3\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00f7\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fb\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0110\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0115"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0121"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0125\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u012e\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0132\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0137\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u013c\b\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u000e\u0001\u0000\u0005\u0006"+
		"\u0001\u0000\u0014\u0016\u0001\u0000)*\u0001\u0000+0\u0001\u0000$%\u0001"+
		"\u0000&\'\u0001\u000012\u0001\u000034\u0001\u0000\u0019\u001b\u0001\u0000"+
		"\u001f \u0001\u0000!\"\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a"+
		"\u0001\u0000\u000e\u000f\u015e\u00006\u0001\u0000\u0000\u0000\u0002@\u0001"+
		"\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000"+
		"\u0000\bf\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\fy\u0001"+
		"\u0000\u0000\u0000\u000e{\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000"+
		"\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000"+
		"\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u0096\u0001\u0000"+
		"\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000"+
		"\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000"+
		"\u0000\"\u00bf\u0001\u0000\u0000\u0000$\u00c3\u0001\u0000\u0000\u0000"+
		"&\u00c7\u0001\u0000\u0000\u0000(\u00d2\u0001\u0000\u0000\u0000*\u00f2"+
		"\u0001\u0000\u0000\u0000,\u010f\u0001\u0000\u0000\u0000.\u0111\u0001\u0000"+
		"\u0000\u00000\u0116\u0001\u0000\u0000\u00002\u0131\u0001\u0000\u0000\u0000"+
		"4\u013b\u0001\u0000\u0000\u000067\u0005\u0002\u0000\u000078\u0005<\u0000"+
		"\u00008:\u00057\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0003\u0004"+
		"\u0002\u0000=>\u00058\u0000\u0000>?\u0005\u0003\u0000\u0000?\u0001\u0001"+
		"\u0000\u0000\u0000@B\u0003\n\u0005\u0000AC\u0005#\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DF\u0003\u0012\t\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GI\u00059\u0000\u0000HJ\u0003\u0002\u0001\u0000"+
		"IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0003\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u00055\u0000\u0000MN\u0003\u000e"+
		"\u0007\u0000NO\u00056\u0000\u0000OQ\u00057\u0000\u0000PR\u0003(\u0014"+
		"\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SU\u00058\u0000\u0000TV\u0003\u0006\u0003\u0000UT\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0007\u0000\u0000XY\u0005<\u0000\u0000Y[\u00055\u0000\u0000Z"+
		"\\\u0003\b\u0004\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u00056\u0000\u0000^`\u00057\u0000"+
		"\u0000_a\u0003(\u0014\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u00058\u0000\u0000ce\u0003\u0006\u0003"+
		"\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0007\u0001"+
		"\u0000\u0000\u0000fi\u0003\n\u0005\u0000gh\u0005:\u0000\u0000hj\u0003"+
		"\b\u0004\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\t"+
		"\u0001\u0000\u0000\u0000kl\u0005\u0010\u0000\u0000lm\u0005<\u0000\u0000"+
		"mo\u0005\u0011\u0000\u0000np\u0003\f\u0006\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000px\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000"+
		"rt\u0005\u0011\u0000\u0000su\u0003\f\u0006\u0000ts\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0006\u0005\uffff"+
		"\uffff\u0000wk\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000x\u000b"+
		"\u0001\u0000\u0000\u0000yz\u0007\u0000\u0000\u0000z\r\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0012\u0000\u0000|}\u0003\u0012\t\u0000}~\u0003\u0010\b"+
		"\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0001\u0000\u0000"+
		"\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0016\u000b\u0000"+
		"\u0082\u0084\u0003\u0014\n\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0007\u0002\u0000\u0000\u0086\u0088\u0003\u0016\u000b\u0000\u0087"+
		"\u0089\u0003\u0014\n\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0091\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0003\u0016\u000b\u0000\u008b\u008d\u0003\u0014\n\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0006\n\uffff\uffff\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u0085\u0001\u0000\u0000\u0000\u0090\u008a\u0001"+
		"\u0000\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000\u0092\u0094\u0003"+
		"\u001a\r\u0000\u0093\u0095\u0003\u0018\f\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0017\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0007\u0003\u0000\u0000\u0097\u0098\u0003\u001a"+
		"\r\u0000\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u001e\u000f"+
		"\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u001b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u00a0\u0003\u001e\u000f"+
		"\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u001d\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0003\"\u0011\u0000\u00a3\u00a5\u0003 \u0010\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\u0005\u0000\u0000"+
		"\u00a7\u00a9\u0003\"\u0011\u0000\u00a8\u00aa\u0003 \u0010\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"!\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005(\u0000\u0000\u00ac\u00c0\u0003"+
		"\"\u0011\u0000\u00ad\u00ae\u0005%\u0000\u0000\u00ae\u00c0\u0003\"\u0011"+
		"\u0000\u00af\u00b0\u0007\u0006\u0000\u0000\u00b0\u00c0\u0005<\u0000\u0000"+
		"\u00b1\u00b3\u0005<\u0000\u0000\u00b2\u00b4\u0007\u0006\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00c0\u0001\u0000\u0000\u0000\u00b5\u00c0\u0005=\u0000\u0000\u00b6\u00b7"+
		"\u0005\u001e\u0000\u0000\u00b7\u00c0\u0003&\u0013\u0000\u00b8\u00c0\u0007"+
		"\u0007\u0000\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000\u00ba\u00c0\u0003"+
		"$\u0012\u0000\u00bb\u00bc\u00055\u0000\u0000\u00bc\u00bd\u0003\u0012\t"+
		"\u0000\u00bd\u00be\u00056\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000"+
		"\u00bf\u00ab\u0001\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000"+
		"\u00bf\u00af\u0001\u0000\u0000\u0000\u00bf\u00b1\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b5\u0001\u0000\u0000\u0000\u00bf\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bb\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0007\b\u0000\u0000\u00c2\u00c4\u0006\u0012\uffff\uffff\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"%\u0001\u0000\u0000\u0000\u00c5\u00c8\u0007\t\u0000\u0000\u00c6\u00c8"+
		"\u0006\u0013\uffff\uffff\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0003*\u0015\u0000\u00ca\u00cc\u00059\u0000\u0000\u00cb\u00cd\u0003("+
		"\u0014\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000\u00ce\u00d0\u00032\u0019"+
		"\u0000\u00cf\u00d1\u0003(\u0014\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005<\u0000\u0000\u00d5\u00f3"+
		"\u0007\u0006\u0000\u0000\u00d6\u00d7\u0007\u0006\u0000\u0000\u00d7\u00f3"+
		"\u0005<\u0000\u0000\u00d8\u00da\u0003\n\u0005\u0000\u00d9\u00db\u0005"+
		"#\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0012"+
		"\t\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00f3\u0001\u0000\u0000\u0000\u00df\u00e1\u0005<\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005#\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00f3\u0003\u0012\t\u0000\u00e6\u00e7"+
		"\u0007\n\u0000\u0000\u00e7\u00f3\u0005\u001b\u0000\u0000\u00e8\u00e9\u0007"+
		"\u000b\u0000\u0000\u00e9\u00ec\u0007\f\u0000\u0000\u00ea\u00ed\u0005\u001c"+
		"\u0000\u0000\u00eb\u00ed\u00030\u0018\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f3\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0007\r\u0000\u0000\u00ef\u00f3\u00030\u0018\u0000"+
		"\u00f0\u00f3\u0003,\u0016\u0000\u00f1\u00f3\u0005\u0001\u0000\u0000\u00f2"+
		"\u00d4\u0001\u0000\u0000\u0000\u00f2\u00d6\u0001\u0000\u0000\u0000\u00f2"+
		"\u00d8\u0001\u0000\u0000\u0000\u00f2\u00e0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e6\u0001\u0000\u0000\u0000\u00f2\u00e8\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3+\u0001\u0000\u0000\u0000\u00f4\u00f6"+
		"\u0005\b\u0000\u0000\u00f5\u00f7\u0005<\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u00055\u0000\u0000\u00f9\u00fb\u0003.\u0017"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0110\u00056\u0000\u0000"+
		"\u00fd\u00fe\u0005\b\u0000\u0000\u00fe\u00ff\u0005\r\u0000\u0000\u00ff"+
		"\u0100\u00055\u0000\u0000\u0100\u0101\u0003\u0012\t\u0000\u0101\u0102"+
		"\u0005:\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103\u0104\u00056"+
		"\u0000\u0000\u0104\u0110\u0001\u0000\u0000\u0000\u0105\u0106\u0005\b\u0000"+
		"\u0000\u0106\u0107\u0005\f\u0000\u0000\u0107\u0108\u00055\u0000\u0000"+
		"\u0108\u0109\u00030\u0018\u0000\u0109\u010a\u0005:\u0000\u0000\u010a\u010b"+
		"\u0003\u0012\t\u0000\u010b\u010c\u0005:\u0000\u0000\u010c\u010d\u0003"+
		"\u0012\t\u0000\u010d\u010e\u00056\u0000\u0000\u010e\u0110\u0001\u0000"+
		"\u0000\u0000\u010f\u00f4\u0001\u0000\u0000\u0000\u010f\u00fd\u0001\u0000"+
		"\u0000\u0000\u010f\u0105\u0001\u0000\u0000\u0000\u0110-\u0001\u0000\u0000"+
		"\u0000\u0111\u0114\u0003\u0012\t\u0000\u0112\u0113\u0005:\u0000\u0000"+
		"\u0113\u0115\u0003.\u0017\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115/\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0005\u0013\u0000\u0000\u0117\u0118\u0003\u0012\t\u0000\u0118\u0119\u0003"+
		"\u0010\b\u0000\u01191\u0001\u0000\u0000\u0000\u011a\u011b\u0005\t\u0000"+
		"\u0000\u011b\u011c\u00055\u0000\u0000\u011c\u011d\u0003\u0012\t\u0000"+
		"\u011d\u011e\u00056\u0000\u0000\u011e\u0120\u00057\u0000\u0000\u011f\u0121"+
		"\u0003(\u0014\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0005"+
		"8\u0000\u0000\u0123\u0125\u00034\u001a\u0000\u0124\u0123\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0132\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0004\u0019\u0000\u0000\u0127\u0128\u0005\u000b\u0000"+
		"\u0000\u0128\u0129\u00055\u0000\u0000\u0129\u012a\u0003\u0012\t\u0000"+
		"\u012a\u012b\u00056\u0000\u0000\u012b\u012d\u00057\u0000\u0000\u012c\u012e"+
		"\u0003(\u0014\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"8\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u011a\u0001\u0000"+
		"\u0000\u0000\u0131\u0126\u0001\u0000\u0000\u0000\u01323\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\n\u0000\u0000\u0134\u0136\u00057\u0000\u0000"+
		"\u0135\u0137\u0003(\u0014\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013c\u00058\u0000\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013c"+
		"\u00032\u0019\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u0139\u0001"+
		"\u0000\u0000\u0000\u013c5\u0001\u0000\u0000\u0000-:BEIQU[`diotw\u0083"+
		"\u0088\u008c\u0090\u0094\u009b\u00a0\u00a4\u00a9\u00b3\u00bf\u00c3\u00c7"+
		"\u00cc\u00d0\u00d2\u00da\u00dd\u00e0\u00e3\u00ec\u00f2\u00f6\u00fa\u010f"+
		"\u0114\u0120\u0124\u012d\u0131\u0136\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}