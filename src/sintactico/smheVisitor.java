// Generated from smhe.g4 by ANTLR 4.13.0
package sintactico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link smheParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface smheVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code lblInicio}
	 * labeled alternative in {@link smheParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblInicio(smheParser.LblInicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblDeclaracionesGlobales}
	 * labeled alternative in {@link smheParser#decGlobales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblComienzo}
	 * labeled alternative in {@link smheParser#comienzo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblComienzo(smheParser.LblComienzoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblDecFuncion}
	 * labeled alternative in {@link smheParser#decFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblDecFuncion(smheParser.LblDecFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblParametros}
	 * labeled alternative in {@link smheParser#dp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblParametros(smheParser.LblParametrosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblDeclaraciones}
	 * labeled alternative in {@link smheParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblDeclaraciones(smheParser.LblDeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblTipo}
	 * labeled alternative in {@link smheParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblTipo(smheParser.LblTipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblTiempoCada}
	 * labeled alternative in {@link smheParser#tc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblTiempoCada(smheParser.LblTiempoCadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUnidadTiempo}
	 * labeled alternative in {@link smheParser#ut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUnidadTiempo(smheParser.LblUnidadTiempoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblExpresion}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblExpresion(smheParser.LblExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblExpresion1}
	 * labeled alternative in {@link smheParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblExpresion1(smheParser.LblExpresion1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblAndOr}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblAndOr(smheParser.LblAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblAndOr1}
	 * labeled alternative in {@link smheParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblAndOr1(smheParser.LblAndOr1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp2}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp2(smheParser.LblOp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp21}
	 * labeled alternative in {@link smheParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp21(smheParser.LblOp21Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblRelacionales}
	 * labeled alternative in {@link smheParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblRelacionales(smheParser.LblRelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp4}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp4(smheParser.LblOp4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp41}
	 * labeled alternative in {@link smheParser#op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp41(smheParser.LblOp41Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSumaResta}
	 * labeled alternative in {@link smheParser#op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSumaResta(smheParser.LblSumaRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp6}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp6(smheParser.LblOp6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblOp61}
	 * labeled alternative in {@link smheParser#op6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblOp61(smheParser.LblOp61Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblMultDiv}
	 * labeled alternative in {@link smheParser#op7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblMultDiv(smheParser.LblMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblNegacionLog}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblNegacionLog(smheParser.LblNegacionLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblNegacionAr}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblNegacionAr(smheParser.LblNegacionArContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblIncDecPre}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblIncDecPre(smheParser.LblIncDecPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblIncDecPos}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblIncDecPos(smheParser.LblIncDecPosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblNumero}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblNumero(smheParser.LblNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblBooleano}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblBooleano(smheParser.LblBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblObtener}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblObtener(smheParser.LblObtenerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblObtener1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblObtener1(smheParser.LblObtener1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblEstado}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblEstado(smheParser.LblEstadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblEstado1}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblEstado1(smheParser.LblEstado1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblParentesis}
	 * labeled alternative in {@link smheParser#op8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblParentesis(smheParser.LblParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblEstadoValor}
	 * labeled alternative in {@link smheParser#estado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblEstadoValor(smheParser.LblEstadoValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblValorObtener}
	 * labeled alternative in {@link smheParser#obtener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblValorObtener(smheParser.LblValorObtenerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblGramas(smheParser.LblGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblCondicionalesGramas}
	 * labeled alternative in {@link smheParser#gramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblCondicionalesGramas(smheParser.LblCondicionalesGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSalirGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSalirGramas(smheParser.LblSalirGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblLucesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblLucesGramas(smheParser.LblLucesGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblLucesGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblLucesGramas1(smheParser.LblLucesGramas1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblVentanasPuertasGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblVentanasPuertasGramas(smheParser.LblVentanasPuertasGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSanitizarDispensarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSanitizarDispensarGramas(smheParser.LblSanitizarDispensarGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSanitizarDispensarGramas1}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSanitizarDispensarGramas1(smheParser.LblSanitizarDispensarGramas1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUsarGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUsarGramas(smheParser.LblUsarGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblIncDecPosGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblIncDecPosGramas(smheParser.LblIncDecPosGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblIncDecPreGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblIncDecPreGramas(smheParser.LblIncDecPreGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblDeclaracionesGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblDeclaracionesGramas(smheParser.LblDeclaracionesGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblAsignacionGramas}
	 * labeled alternative in {@link smheParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblAsignacionGramas(smheParser.LblAsignacionGramasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUsarAdmitir}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUsarAdmitir(smheParser.LblUsarAdmitirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUsarVentilar}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUsarVentilar(smheParser.LblUsarVentilarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUsarFuncion}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUsarFuncion(smheParser.LblUsarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblUsarFuncion1}
	 * labeled alternative in {@link smheParser#usar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblUsarFuncion1(smheParser.LblUsarFuncion1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lblParametrosFuncion}
	 * labeled alternative in {@link smheParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblParametrosFuncion(smheParser.LblParametrosFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblTiempoPor}
	 * labeled alternative in {@link smheParser#tp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblTiempoPor(smheParser.LblTiempoPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblCondicion}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblCondicion(smheParser.LblCondicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblMientras}
	 * labeled alternative in {@link smheParser#condicionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblMientras(smheParser.LblMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSinoCondicionales}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSinoCondicionales(smheParser.LblSinoCondicionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lblSino}
	 * labeled alternative in {@link smheParser#sino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLblSino(smheParser.LblSinoContext ctx);
}