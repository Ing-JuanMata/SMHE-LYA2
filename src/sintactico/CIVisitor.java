/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintactico;

import analisis.LlaveTabla;
import codigo_intermedio.BloqueComienzo;
import codigo_intermedio.BloqueCondicion;
import codigo_intermedio.BloqueCondicional;
import codigo_intermedio.BloqueFuncion;
import codigo_intermedio.BloqueMientras;
import codigo_intermedio.BloquePrograma;
import codigo_intermedio.BloqueSiNo;
import codigo_intermedio.BloqueTripletas;
import codigo_intermedio.TablaFunciones;
import codigo_intermedio.TablaSimbolos;
import codigo_intermedio.Tripleta;
import codigo_intermedio.TripletaAbrir;
import codigo_intermedio.TripletaAdmitir;
import codigo_intermedio.TripletaAnd;
import codigo_intermedio.TripletaApagar;
import codigo_intermedio.TripletaAsignacion;
import codigo_intermedio.TripletaAux;
import codigo_intermedio.TripletaCerrar;
import codigo_intermedio.TripletaCondicion;
import codigo_intermedio.TripletaDeclaracion;
import codigo_intermedio.TripletaDecremento;
import codigo_intermedio.TripletaDiferente;
import codigo_intermedio.TripletaDispensar;
import codigo_intermedio.TripletaEncender;
import codigo_intermedio.TripletaEstado;
import codigo_intermedio.TripletaIgual;
import codigo_intermedio.TripletaIncremento;
import codigo_intermedio.TripletaMayor;
import codigo_intermedio.TripletaMayorIgual;
import codigo_intermedio.TripletaMenor;
import codigo_intermedio.TripletaMenorIgual;
import codigo_intermedio.TripletaNegacion;
import codigo_intermedio.TripletaObtener;
import codigo_intermedio.TripletaOr;
import codigo_intermedio.TripletaResta;
import codigo_intermedio.TripletaSalir;
import codigo_intermedio.TripletaSanitizar;
import codigo_intermedio.TripletaSuma;
import codigo_intermedio.TripletaTiempoCada;
import codigo_intermedio.TripletaTiempoPor;
import codigo_intermedio.TripletaUsar;
import codigo_intermedio.TripletaVentilar;
import java.util.ArrayList;

/**
 *
 * @author jujemataso
 */
public class CIVisitor extends smheBaseVisitor<Tripleta> {

    private String ambito = "";
    private int anidamiento = 0;
    private TablaSimbolos simbolos;
    private TablaFunciones funciones;
    public static BloquePrograma programa;
    private BloqueTripletas bloqueActual, bloqueAux;
    private Tripleta tripletaActual;
    private TripletaAux tAux;
    private Object aux1, aux2, aux3, aux4, valorActual, expr1, expr2;
    private boolean inicial = false;
    private ArrayList<Integer> anidamientos = new ArrayList<>();

    public CIVisitor(TablaSimbolos simbolos, TablaFunciones funciones) {
        this.simbolos = simbolos;
        this.funciones = funciones;
    }

    // <editor-fold defaultstate="collapsed" desc="Gestion de bloques y trpletas">
    private void agregarTripletaBloque(Tripleta tripleta) {
        bloqueActual.addTripleta(tripleta);
    }

    private void guardarBloque() {
        programa.addBloque(bloqueActual);
    }

    private void guardarBloqueCondicional() {
        if (bloqueActual instanceof BloqueSiNo) {
            bloqueActual = ((BloqueSiNo) bloqueActual).bloquePadre;
            return;
        }
        if (bloqueActual instanceof BloqueMientras) {
            BloqueCondicional bc = (BloqueMientras) bloqueActual;
            bc.bloquePadre.addBloqueInterno(bc);
            bloqueActual = bc.bloquePadre;
            bloqueAux = bc;
            return;
        }
        BloqueCondicional bc = (BloqueCondicion) bloqueActual;
        if (inicial) {
            bc.bloquePadre.addBloqueInterno(bc);
        }
        bloqueActual = bc.bloquePadre;
        bloqueAux = bc;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Control de anidamiento">
    private int agregarAnidamiento() {
        if (anidamiento == 0 && anidamientos.isEmpty()) {
            anidamientos.add(1);
            anidamientos.add(0);
            anidamiento++;
            return 1;
        }
        anidamientos.set(anidamiento, anidamientos.get(anidamiento) + 1);
        anidamientos.add(0);
        return anidamientos.get(anidamiento++);
    }

    private void quitarAnidamiento() {
        if (anidamiento == 0) {
            ambito = ambito.split(":")[0];
            //anidamientos.clear();
            return;
        }
        if (anidamiento == 1) {
            ambito = ambito.split(":")[0];
            anidamiento--;
            return;
        }
        anidamientos.remove(anidamiento--);
        anidamientos.remove(anidamiento--);
        String cadena = "";
        for (int i : anidamientos) {
            cadena += ":" + i;
        }
        ambito = ambito.split(":")[0] + cadena;
    }
    // </editor-fold>

    @Override
    public Tripleta visitLblInicio(smheParser.LblInicioContext ctx) {
        programa = new BloquePrograma();
        ambito = "programa";
        if (ctx.decGlobales() != null) {
            bloqueActual = new BloqueTripletas();
            visit(ctx.decGlobales());
            guardarBloque();
        }

        visit(ctx.comienzo());
        return null;
    }

    @Override
    public Tripleta visitLblDeclaracionesGlobales(smheParser.LblDeclaracionesGlobalesContext ctx) {
        TripletaDeclaracion declaracion = (TripletaDeclaracion) visit(ctx.declaracion());
        if (ctx.expresion() != null) {
            Object expresion = visit(ctx.expresion());
            expresion = expresion instanceof TripletaAux
                    ? ((TripletaAux) expresion).getOperando1()
                    : expresion;
            declaracion.setInicializacion(new TripletaAsignacion(expresion));
        }
        agregarTripletaBloque(declaracion);
        if (ctx.decGlobales() != null) {
            visit(ctx.decGlobales());
        }

        return null;
    }

    @Override
    public Tripleta visitLblDeclaraciones(smheParser.LblDeclaracionesContext ctx) {
        LlaveTabla id = new LlaveTabla(ctx.ID().getText().length() > 16
                ? ctx.ID().getText().substring(0, 16)
                : ctx.ID().getText(), ambito);
        return new TripletaDeclaracion((String) visit(ctx.tipo()).getOperando1(), id);
    }

    @Override
    public Tripleta visitLblTipo(smheParser.LblTipoContext ctx) {
        return new TripletaAux(ctx.td.getText());
    }

    //<editor-fold defaultstate="collapsed" desc="Visitar a expresion">
    @Override
    public Tripleta visitLblExpresion(smheParser.LblExpresionContext ctx) {
        Tripleta op2 = visit(ctx.op2());
        return ctx.op1() != null ? visit(ctx.op1()) : op2;
    }

    @Override
    public Tripleta visitLblOp2(smheParser.LblOp2Context ctx) {
        Tripleta op4 = visit(ctx.op4());
        return ctx.op3() != null ? visit(ctx.op3()) : op4;
    }

    @Override
    public Tripleta visitLblOp4(smheParser.LblOp4Context ctx) {
        Tripleta op6 = visit(ctx.op6());
        return ctx.op5() != null ? visit(ctx.op5()) : op6;
    }

    @Override
    public Tripleta visitLblOp6(smheParser.LblOp6Context ctx) {
        Tripleta op8 = visit(ctx.op8());
        return ctx.op7() != null ? visit(ctx.op7()) : op8;
    }

    @Override
    public Tripleta visitLblAndOr(smheParser.LblAndOrContext ctx) {
        aux1 = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = visit(ctx.op2());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = ctx.op.getType() == smheParser.AND
                ? new TripletaAnd(aux1, valorActual)
                : new TripletaOr(aux1, valorActual);
        agregarTripletaBloque((Tripleta) valorActual);
        return ctx.op1() == null ? (Tripleta) valorActual : visit(ctx.op1());
    }

    @Override
    public Tripleta visitLblRelacionales(smheParser.LblRelacionalesContext ctx) {
        aux2 = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = visit(ctx.op4());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        switch (ctx.op.getType()) {
            case smheParser.MENOR ->
                valorActual = new TripletaMenor(aux2, valorActual);
            case smheParser.MENORIGUAL ->
                valorActual = new TripletaMenorIgual(aux2, valorActual);
            case smheParser.MAYOR ->
                valorActual = new TripletaMayor(aux2, valorActual);
            case smheParser.MAYORIGUAL ->
                valorActual = new TripletaMayorIgual(aux2, valorActual);
            case smheParser.IGUAL ->
                valorActual = new TripletaIgual(aux2, valorActual);
            case smheParser.DIFERENTE ->
                valorActual = new TripletaDiferente(aux2, valorActual);
        }

        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblSumaResta(smheParser.LblSumaRestaContext ctx) {
        aux3 = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = visit(ctx.op6());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = ctx.op.getType() == smheParser.SUMA
                ? new TripletaSuma(aux3, valorActual)
                : new TripletaResta(aux3, valorActual);

        agregarTripletaBloque((Tripleta) valorActual);
        return ctx.op5() == null ? (Tripleta) valorActual : visit(ctx.op5());
    }

    @Override
    public Tripleta visitLblMultDiv(smheParser.LblMultDivContext ctx) {
        aux4 = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = visit(ctx.op8());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = ctx.op.getType() == smheParser.SUMA
                ? new TripletaSuma(aux3, valorActual)
                : new TripletaResta(aux3, valorActual);

        agregarTripletaBloque((Tripleta) valorActual);
        return ctx.op7() == null ? (Tripleta) valorActual : visit(ctx.op7());
    }

    @Override
    public Tripleta visitLblNegacionLog(smheParser.LblNegacionLogContext ctx) {
        valorActual = visit(ctx.op8());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = new TripletaNegacion(valorActual);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblNegacionAr(smheParser.LblNegacionArContext ctx) {
        valorActual = visit(ctx.op8());
        valorActual = valorActual instanceof TripletaAux
                ? ((TripletaAux) valorActual).getOperando1()
                : valorActual;
        valorActual = new TripletaResta(valorActual);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblIncDecPre(smheParser.LblIncDecPreContext ctx) {
        String idS = ctx.ID().getText();
        LlaveTabla id = new LlaveTabla(idS.length() > 16
                ? idS.substring(0, 16)
                : idS, ambito);
        valorActual = ctx.op.getType() == smheParser.INCREMENTO
                ? new TripletaIncremento(id, true)
                : new TripletaDecremento(id, true);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblIncDecPos(smheParser.LblIncDecPosContext ctx) {
        String idS = ctx.ID().getText();
        LlaveTabla id = new LlaveTabla(idS.length() > 16
                ? idS.substring(0, 16)
                : idS, ambito);
        if (ctx.op == null) {
            valorActual = new TripletaAux(id);
            return (Tripleta) valorActual;
        }
        valorActual = ctx.op.getType() == smheParser.INCREMENTO
                ? new TripletaIncremento(id, false)
                : new TripletaDecremento(id, false);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblNumero(smheParser.LblNumeroContext ctx) {
        valorActual = new TripletaAux(Integer.valueOf(ctx.NUMERO().getText()));
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblObtener(smheParser.LblObtenerContext ctx) {
        valorActual = visit(ctx.obtener());
        valorActual = ((TripletaAux) valorActual).getOperando1();
        valorActual = new TripletaObtener((String) valorActual);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblValorObtener(smheParser.LblValorObtenerContext ctx) {
        return new TripletaAux(ctx.obVal.getText());
    }

    @Override
    public Tripleta visitLblBooleano(smheParser.LblBooleanoContext ctx) {
        return new TripletaAux(ctx.val.getText());
    }

    @Override
    public Tripleta visitLblEstado(smheParser.LblEstadoContext ctx) {
        valorActual = visit(ctx.estado());
        valorActual = ((TripletaAux) valorActual).getOperando1();
        valorActual = new TripletaEstado((String) valorActual);
        agregarTripletaBloque((Tripleta) valorActual);
        return (Tripleta) valorActual;
    }

    @Override
    public Tripleta visitLblEstadoValor(smheParser.LblEstadoValorContext ctx) {
        return new TripletaAux(ctx.edo.getText());
    }

    @Override
    public Tripleta visitLblParentesis(smheParser.LblParentesisContext ctx) {
        return visit(ctx.expresion());
    }
    // </editor-fold>

    @Override
    public Tripleta visitLblComienzo(smheParser.LblComienzoContext ctx) {
        bloqueActual = new BloqueTripletas();
        TripletaTiempoCada tc = (TripletaTiempoCada) visit(ctx.tc());
        BloqueComienzo comienzo = new BloqueComienzo(tc);
        bloqueActual = comienzo;
        guardarBloque();
        ambito = "comienzo";
        if (ctx.gramas() != null) {
            visit(ctx.gramas());
        }

        funciones.setInicio("comienzo", comienzo.getInicio());

        if (ctx.decFuncion() != null) {
            ambito = "programa";
            visit(ctx.decFuncion());
        }
        return null;
    }

    @Override
    public Tripleta visitLblTiempoCada(smheParser.LblTiempoCadaContext ctx) {
        Object tiempo = visit(ctx.expresion());
        tiempo = tiempo instanceof TripletaAux
                ? ((TripletaAux) tiempo).getOperando1()
                : bloqueActual;
        String unidad = (String) ((TripletaAux) visit(ctx.ut())).getOperando1();
        return new TripletaTiempoCada(tiempo, unidad);
    }

    @Override
    public Tripleta visitLblUnidadTiempo(smheParser.LblUnidadTiempoContext ctx) {
        return new TripletaAux(ctx.unidad.getText());
    }

    @Override
    public Tripleta visitLblGramas(smheParser.LblGramasContext ctx) {
        visit(ctx.stmt());
        if (ctx.gramas() != null) {
            visit(ctx.gramas());
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="Sentencias del lenguaje">
    @Override
    public Tripleta visitLblIncDecPosGramas(smheParser.LblIncDecPosGramasContext ctx) {
        String idS = ctx.ID().getText();
        LlaveTabla id = new LlaveTabla(idS.length() > 16
                ? idS.substring(0, 16)
                : idS, ambito);
        valorActual = ctx.op.getType() == smheParser.INCREMENTO
                ? new TripletaIncremento(id, false)
                : new TripletaDecremento(id, false);
        agregarTripletaBloque((Tripleta) valorActual);
        return null;
    }

    @Override
    public Tripleta visitLblIncDecPreGramas(smheParser.LblIncDecPreGramasContext ctx) {
        String idS = ctx.ID().getText();
        LlaveTabla id = new LlaveTabla(idS.length() > 16
                ? idS.substring(0, 16)
                : idS, ambito);
        valorActual = ctx.op.getType() == smheParser.INCREMENTO
                ? new TripletaIncremento(id, true)
                : new TripletaDecremento(id, true);
        agregarTripletaBloque((Tripleta) valorActual);
        return null;
    }

    @Override
    public Tripleta visitLblDeclaracionesGramas(smheParser.LblDeclaracionesGramasContext ctx) {

        TripletaDeclaracion declaracion = (TripletaDeclaracion) visit(ctx.declaracion());
        if (ctx.expresion() != null) {
            Object expresion = visit(ctx.expresion());
            expresion = expresion instanceof TripletaAux
                    ? ((TripletaAux) expresion).getOperando1()
                    : expresion;
            declaracion.setInicializacion(new TripletaAsignacion(expresion));
        }
        agregarTripletaBloque(declaracion);
        return null;
    }

    @Override
    public Tripleta visitLblAsignacionGramas(smheParser.LblAsignacionGramasContext ctx) {
        String idS = ctx.ID().getText();
        LlaveTabla id = new LlaveTabla(idS.length() > 16
                ? idS.substring(0, 16)
                : idS, ambito);
        Object valor = visit(ctx.expresion());
        valor = valor instanceof TripletaAux
                ? ((TripletaAux) valor).getOperando1()
                : valor;

        agregarTripletaBloque(new TripletaAsignacion(id, valor));
        return null;
    }

    @Override
    public Tripleta visitLblLucesGramas(smheParser.LblLucesGramasContext ctx) {
        Tripleta t = ctx.accion.getType() == smheParser.APAGAR
                ? new TripletaApagar(ctx.actor.getText())
                : new TripletaEncender();
        agregarTripletaBloque(t);
        return null;
    }

    @Override
    public Tripleta visitLblSanitizarDispensarGramas(smheParser.LblSanitizarDispensarGramasContext ctx) {
        TripletaTiempoPor tiempo = (TripletaTiempoPor) visit(ctx.tp());
        Tripleta t = ctx.accion.getType() == smheParser.SANITIZAR
                ? new TripletaSanitizar(tiempo)
                : new TripletaDispensar(tiempo);
        agregarTripletaBloque(t);
        return null;
    }

    @Override
    public Tripleta visitLblTiempoPor(smheParser.LblTiempoPorContext ctx) {
        bloqueAux = bloqueActual;
        bloqueActual = new BloqueTripletas();
        Object tiempo = visit(ctx.expresion());
        tiempo = tiempo instanceof TripletaAux
                ? ((TripletaAux) tiempo).getOperando1()
                : bloqueActual;
        String unidad = (String) ((TripletaAux) visit(ctx.ut())).getOperando1();
        bloqueActual = bloqueAux;
        return new TripletaTiempoPor(tiempo, unidad);
    }

    @Override
    public Tripleta visitLblVentanasPuertasGramas(smheParser.LblVentanasPuertasGramasContext ctx) {
        if (ctx.tp() != null) {
            TripletaTiempoPor tiempo = (TripletaTiempoPor) visit(ctx.tp());
            Tripleta t = ctx.accion.getType() == smheParser.ABRIR
                    ? new TripletaAbrir(ctx.actor.getText(), tiempo)
                    : new TripletaCerrar(ctx.actor.getText(), tiempo);
            agregarTripletaBloque(t);
            return null;
        }

        Tripleta t = ctx.accion.getType() == smheParser.ABRIR
                ? new TripletaAbrir(ctx.actor.getText(), ctx.MANTENER().getText())
                : new TripletaCerrar(ctx.actor.getText(), ctx.MANTENER().getText());
        agregarTripletaBloque(t);
        return null;
    }

    @Override
    public Tripleta visitLblUsarGramas(smheParser.LblUsarGramasContext ctx) {
        return visit(ctx.usar());
    }

    @Override
    public Tripleta visitLblUsarFuncion(smheParser.LblUsarFuncionContext ctx) {
        String id = ctx.ID().getText();
        tripletaActual = new TripletaUsar(id.length() > 16
                ? id.substring(0, 16)
                : id, funciones);
        agregarTripletaBloque(tripletaActual);
        if (ctx.parametro() != null) {
            bloqueAux = bloqueActual;
            bloqueActual = new BloqueTripletas();
            visit(ctx.parametro());
            bloqueActual = bloqueAux;
        }
        return null;
    }

    @Override
    public Tripleta visitLblParametrosFuncion(smheParser.LblParametrosFuncionContext ctx) {
        Object e = visit(ctx.expresion());
        e = e instanceof TripletaAux
                ? ((TripletaAux) e).getOperando1()
                : bloqueActual;
        ((TripletaUsar) tripletaActual).addParametro(e);
        if (ctx.parametro() != null) {
            bloqueActual = new BloqueTripletas();
            visit(ctx.parametro());
        }
        return null;
    }

    @Override
    public Tripleta visitLblUsarAdmitir(smheParser.LblUsarAdmitirContext ctx) {
        bloqueAux = bloqueActual;
        bloqueActual = new BloqueTripletas();
        Object expresion = visit(ctx.expresion(0));
        expresion = expresion instanceof TripletaAux
                ? ((TripletaAux) expresion).getOperando1()
                : bloqueActual;
        bloqueActual = new BloqueTripletas();
        Object expresion1 = visit(ctx.expresion(0));
        expresion = expresion instanceof TripletaAux
                ? ((TripletaAux) expresion).getOperando1()
                : bloqueActual;
        bloqueActual = bloqueAux;
        TripletaTiempoPor tiempo = (TripletaTiempoPor) visit(ctx.tp());
        agregarTripletaBloque(new TripletaAdmitir(new TripletaUsar(), tiempo, expresion, expresion1, simbolos));

        return null;
    }

    @Override
    public Tripleta visitLblUsarVentilar(smheParser.LblUsarVentilarContext ctx) {
        TripletaTiempoPor tiempo = (TripletaTiempoPor) visit(ctx.tp());
        bloqueAux = bloqueActual;
        bloqueActual = new BloqueTripletas();
        expr1 = visit(ctx.expresion(0));
        expr1 = expr1 instanceof TripletaAux
                ? ((TripletaAux) expr1).getOperando1()
                : bloqueActual;
        bloqueActual = new BloqueTripletas();
        expr2 = visit(ctx.expresion(1));
        expr2 = expr2 instanceof TripletaAux
                ? ((TripletaAux) expr2).getOperando1()
                : bloqueActual;
        bloqueActual = bloqueAux;
        agregarTripletaBloque(new TripletaVentilar(new TripletaUsar(), tiempo, expr1, expr2, simbolos));
        return null;
    }

    @Override
    public Tripleta visitLblSalirGramas(smheParser.LblSalirGramasContext ctx) {
        agregarTripletaBloque(new TripletaSalir());
        return null;
    }
    // </editor-fold>

    @Override
    public Tripleta visitLblCondicionalesGramas(smheParser.LblCondicionalesGramasContext ctx) {
        visit(ctx.condicionales());
        if (ctx.gramas() != null) {
            visit(ctx.gramas());
        }
        return null;
    }

    @Override
    public Tripleta visitLblMientras(smheParser.LblMientrasContext ctx) {
        bloqueActual = new BloqueMientras(bloqueActual);
        bloqueAux = bloqueActual;
        bloqueActual = new BloqueTripletas();
        expr1 = visit(ctx.expresion());
        expr1 = expr1 instanceof TripletaAux
                ? ((TripletaAux) expr1).getOperando1()
                : bloqueActual;
        ((BloqueCondicional) bloqueAux).setCondicion(new TripletaCondicion(expr1));
        bloqueActual = bloqueAux;

        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
            guardarBloqueCondicional();
        }
        return null;
    }

    @Override
    public Tripleta visitLblCondicion(smheParser.LblCondicionContext ctx) {
        if (!(bloqueActual instanceof BloqueCondicion)) {
            bloqueActual = new BloqueCondicion(bloqueActual);
            inicial = true;
        }
        bloqueAux = bloqueActual;
        bloqueActual = new BloqueTripletas();
        expr1 = visit(ctx.expresion());
        expr1 = expr1 instanceof TripletaAux
                ? ((TripletaAux) expr1).getOperando1()
                : bloqueActual;
        ((BloqueCondicional) bloqueAux).setCondicion(new TripletaCondicion(expr1));
        bloqueActual = bloqueAux;

        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
            guardarBloqueCondicional();
        }
        if (ctx.sino() != null) {
            visit(ctx.sino());
        }
        return null;
    }

    @Override
    public Tripleta visitLblSino(smheParser.LblSinoContext ctx) {
        inicial = false;
        bloqueActual = new BloqueSiNo(bloqueActual);
        ((BloqueCondicion) bloqueAux).setSiNo((BloqueSiNo) bloqueActual);
        if (ctx.gramas() != null) {
            ambito += ":" + agregarAnidamiento();
            visit(ctx.gramas());
            quitarAnidamiento();
            guardarBloqueCondicional();
        }
        return null;
    }

    @Override
    public Tripleta visitLblSinoCondicionales(smheParser.LblSinoCondicionalesContext ctx) {
        inicial = false;
        BloqueSiNo bsn = new BloqueSiNo(bloqueActual);
        BloqueCondicion bc = new BloqueCondicion(bloqueActual);
        bsn.setCondicion(bc);
        ((BloqueCondicion) bloqueAux).setSiNo(bsn);
        bloqueActual = bc;
        visit(ctx.condicionales());

        return null;
    }

    @Override
    public Tripleta visitLblDecFuncion(smheParser.LblDecFuncionContext ctx) {
        String nombre = ctx.ID().getText();
        nombre = nombre.length() > 16 ? nombre.substring(0, 16) : nombre;
        BloqueFuncion funcion = new BloqueFuncion(nombre);
        bloqueActual = funcion;
        guardarBloque();
        ambito = nombre;
        if (ctx.dp() != null) {
            visit(ctx.dp());
        }

        visit(ctx.gramas());
        funciones.setInicio(nombre, funcion.getInicio());
        if (ctx.decFuncion() != null) {
            ambito = "programa";
            return visit(ctx.decFuncion());
        }
        return null;
    }

    @Override
    public Tripleta visitLblParametros(smheParser.LblParametrosContext ctx) {
        TripletaDeclaracion td = (TripletaDeclaracion) visit(ctx.declaracion());
        agregarTripletaBloque(td);
        if (ctx.dp() != null) {
            return visit(ctx.dp());
        }
        return null;
    }

}
