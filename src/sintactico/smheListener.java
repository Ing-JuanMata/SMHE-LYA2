// Generated from smhe.g4 by ANTLR 4.13.0
package sintactico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link smheParser}.
 */
public interface smheListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code lblInicio}
	 * labeled alternative in {@link smheParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterLblInicio(smheParser.LblInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblInicio}
	 * labeled alternative in {@link smheParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitLblInicio(smheParser.LblInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblDeclaracionesGlobales}
	 * labeled alternative in {@link smheParser#decGlobales}.
	 * @param ctx the parse tree
	 */
	void enterLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblDeclaracionesGlobales}
	 * labeled alternative in {@link smheParser#decGlobales}.
	 * @param ctx the parse tree
	 */
	void exitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblComienzo}
	 * labeled alternative in {@link smheParser#comienzo}.
	 * @param ctx the parse tree
	 */
	void enterLblComienzo(smheParser.LblComienzoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblComienzo}
	 * labeled alternative in {@link smheParser#comienzo}.
	 * @param ctx the parse tree
	 */
	void exitLblComienzo(smheParser.LblComienzoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblDecFuncion}
	 * labeled alternative in {@link smheParser#decFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLblDecFuncion(smheParser.LblDecFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblDecFuncion}
	 * labeled alternative in {@link smheParser#decFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLblDecFuncion(smheParser.LblDecFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblParametros}
	 * labeled alternative in {@link smheParser#dp}.
	 * @param ctx the parse tree
	 */
	void enterLblParametros(smheParser.LblParametrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblParametros}
	 * labeled alternative in {@link smheParser#dp}.
	 * @param ctx the parse tree
	 */
	void exitLblParametros(smheParser.LblParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblDeclaraciones}
	 * labeled alternative in {@link smheParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterLblDeclaraciones(smheParser.LblDeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblDeclaraciones}
	 * labeled alternative in {@link smheParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitLblDeclaraciones(smheParser.LblDeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblTipo}
	 * labeled alternative in {@link smheParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterLblTipo(smheParser.LblTipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblTipo}
	 * labeled alternative in {@link smheParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitLblTipo(smheParser.LblTipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblTiempoCada}
	 * labeled alternative in {@link smheParser#tc}.
	 * @param ctx the parse tree
	 */
	void enterLblTiempoCada(smheParser.LblTiempoCadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblTiempoCada}
	 * labeled alternative in {@link smheParser#tc}.
	 * @param ctx the parse tree
	 */
	void exitLblTiempoCada(smheParser.LblTiempoCadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUnidadTiempo}
	 * labeled alternative in {@link smheParser#ut}.
	 * @param ctx the parse tree
	 */
	void enterLblUnidadTiempo(smheParser.LblUnidadTiempoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUnidadTiempo}
	 * labeled alternative in {@link smheParser#ut}.
	 * @param ctx the parse tree
	 */
	void exitLblUnidadTiempo(smheParser.LblUnidadTiempoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblExpresion}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLblExpresion(smheParser.LblExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblExpresion}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLblExpresion(smheParser.LblExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblExpresion1}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLblExpresion1(smheParser.LblExpresion1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblExpresion1}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLblExpresion1(smheParser.LblExpresion1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblAndOr}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterLblAndOr(smheParser.LblAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblAndOr}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitLblAndOr(smheParser.LblAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblAndOr1}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterLblAndOr1(smheParser.LblAndOr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblAndOr1}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitLblAndOr1(smheParser.LblAndOr1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp2}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterLblOp2(smheParser.LblOp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp2}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitLblOp2(smheParser.LblOp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp21}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterLblOp21(smheParser.LblOp21Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp21}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitLblOp21(smheParser.LblOp21Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblRelacionales}
	 * labeled alternative in {@link smheParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterLblRelacionales(smheParser.LblRelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblRelacionales}
	 * labeled alternative in {@link smheParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitLblRelacionales(smheParser.LblRelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp4}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterLblOp4(smheParser.LblOp4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp4}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitLblOp4(smheParser.LblOp4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp41}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 */
	void enterLblOp41(smheParser.LblOp41Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp41}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 */
	void exitLblOp41(smheParser.LblOp41Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSumaResta}
	 * labeled alternative in {@link smheParser#op5}.
	 * @param ctx the parse tree
	 */
	void enterLblSumaResta(smheParser.LblSumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSumaResta}
	 * labeled alternative in {@link smheParser#op5}.
	 * @param ctx the parse tree
	 */
	void exitLblSumaResta(smheParser.LblSumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp6}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 */
	void enterLblOp6(smheParser.LblOp6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp6}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 */
	void exitLblOp6(smheParser.LblOp6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblOp61}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 */
	void enterLblOp61(smheParser.LblOp61Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblOp61}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 */
	void exitLblOp61(smheParser.LblOp61Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblMultDiv}
	 * labeled alternative in {@link smheParser#op7}.
	 * @param ctx the parse tree
	 */
	void enterLblMultDiv(smheParser.LblMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblMultDiv}
	 * labeled alternative in {@link smheParser#op7}.
	 * @param ctx the parse tree
	 */
	void exitLblMultDiv(smheParser.LblMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblNegacionLog}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblNegacionLog(smheParser.LblNegacionLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblNegacionLog}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblNegacionLog(smheParser.LblNegacionLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblNegacionAr}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblNegacionAr(smheParser.LblNegacionArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblNegacionAr}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblNegacionAr(smheParser.LblNegacionArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblIncDecPre}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblIncDecPre(smheParser.LblIncDecPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblIncDecPre}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblIncDecPre(smheParser.LblIncDecPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblIncDecPos}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblIncDecPos(smheParser.LblIncDecPosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblIncDecPos}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblIncDecPos(smheParser.LblIncDecPosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblNumero}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblNumero(smheParser.LblNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblNumero}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblNumero(smheParser.LblNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblBooleano}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblBooleano(smheParser.LblBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblBooleano}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblBooleano(smheParser.LblBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblObtener}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblObtener(smheParser.LblObtenerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblObtener}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblObtener(smheParser.LblObtenerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblObtener1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblObtener1(smheParser.LblObtener1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblObtener1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblObtener1(smheParser.LblObtener1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblEstado}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblEstado(smheParser.LblEstadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblEstado}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblEstado(smheParser.LblEstadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblEstado1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblEstado1(smheParser.LblEstado1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblEstado1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblEstado1(smheParser.LblEstado1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblParentesis}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void enterLblParentesis(smheParser.LblParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblParentesis}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 */
	void exitLblParentesis(smheParser.LblParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblEstadoValor}
	 * labeled alternative in {@link smheParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterLblEstadoValor(smheParser.LblEstadoValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblEstadoValor}
	 * labeled alternative in {@link smheParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitLblEstadoValor(smheParser.LblEstadoValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblValorObtener}
	 * labeled alternative in {@link smheParser#obtener}.
	 * @param ctx the parse tree
	 */
	void enterLblValorObtener(smheParser.LblValorObtenerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblValorObtener}
	 * labeled alternative in {@link smheParser#obtener}.
	 * @param ctx the parse tree
	 */
	void exitLblValorObtener(smheParser.LblValorObtenerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 */
	void enterLblGramas(smheParser.LblGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 */
	void exitLblGramas(smheParser.LblGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblCondicionalesGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 */
	void enterLblCondicionalesGramas(smheParser.LblCondicionalesGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblCondicionalesGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 */
	void exitLblCondicionalesGramas(smheParser.LblCondicionalesGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSalirGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblSalirGramas(smheParser.LblSalirGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSalirGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblSalirGramas(smheParser.LblSalirGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblLucesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblLucesGramas(smheParser.LblLucesGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblLucesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblLucesGramas(smheParser.LblLucesGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblLucesGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblLucesGramas1(smheParser.LblLucesGramas1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblLucesGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblLucesGramas1(smheParser.LblLucesGramas1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblVentanasPuertasGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblVentanasPuertasGramas(smheParser.LblVentanasPuertasGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblVentanasPuertasGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblVentanasPuertasGramas(smheParser.LblVentanasPuertasGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSanitizarDispensarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblSanitizarDispensarGramas(smheParser.LblSanitizarDispensarGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSanitizarDispensarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblSanitizarDispensarGramas(smheParser.LblSanitizarDispensarGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSanitizarDispensarGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblSanitizarDispensarGramas1(smheParser.LblSanitizarDispensarGramas1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSanitizarDispensarGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblSanitizarDispensarGramas1(smheParser.LblSanitizarDispensarGramas1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUsarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblUsarGramas(smheParser.LblUsarGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUsarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblUsarGramas(smheParser.LblUsarGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblIncDecPosGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblIncDecPosGramas(smheParser.LblIncDecPosGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblIncDecPosGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblIncDecPosGramas(smheParser.LblIncDecPosGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblIncDecPreGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblIncDecPreGramas(smheParser.LblIncDecPreGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblIncDecPreGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblIncDecPreGramas(smheParser.LblIncDecPreGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblDeclaracionesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblDeclaracionesGramas(smheParser.LblDeclaracionesGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblDeclaracionesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblDeclaracionesGramas(smheParser.LblDeclaracionesGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblAsignacionGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLblAsignacionGramas(smheParser.LblAsignacionGramasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblAsignacionGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLblAsignacionGramas(smheParser.LblAsignacionGramasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUsarAdmitir}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void enterLblUsarAdmitir(smheParser.LblUsarAdmitirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUsarAdmitir}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void exitLblUsarAdmitir(smheParser.LblUsarAdmitirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUsarVentilar}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void enterLblUsarVentilar(smheParser.LblUsarVentilarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUsarVentilar}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void exitLblUsarVentilar(smheParser.LblUsarVentilarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUsarFuncion}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void enterLblUsarFuncion(smheParser.LblUsarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUsarFuncion}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void exitLblUsarFuncion(smheParser.LblUsarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblUsarFuncion1}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void enterLblUsarFuncion1(smheParser.LblUsarFuncion1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lblUsarFuncion1}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 */
	void exitLblUsarFuncion1(smheParser.LblUsarFuncion1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lblParametrosFuncion}
	 * labeled alternative in {@link smheParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterLblParametrosFuncion(smheParser.LblParametrosFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblParametrosFuncion}
	 * labeled alternative in {@link smheParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitLblParametrosFuncion(smheParser.LblParametrosFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblTiempoPor}
	 * labeled alternative in {@link smheParser#tp}.
	 * @param ctx the parse tree
	 */
	void enterLblTiempoPor(smheParser.LblTiempoPorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblTiempoPor}
	 * labeled alternative in {@link smheParser#tp}.
	 * @param ctx the parse tree
	 */
	void exitLblTiempoPor(smheParser.LblTiempoPorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblCondicion}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterLblCondicion(smheParser.LblCondicionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblCondicion}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitLblCondicion(smheParser.LblCondicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblMientras}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void enterLblMientras(smheParser.LblMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblMientras}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 */
	void exitLblMientras(smheParser.LblMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSinoCondicionales}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterLblSinoCondicionales(smheParser.LblSinoCondicionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSinoCondicionales}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitLblSinoCondicionales(smheParser.LblSinoCondicionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lblSino}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 */
	void enterLblSino(smheParser.LblSinoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lblSino}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 */
	void exitLblSino(smheParser.LblSinoContext ctx);
}