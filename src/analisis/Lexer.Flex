package analisis;

import java_cup.runtime.*;
%%
%class Lexer
%public
%int
%cup
%line
%column
L=[A-Za-z_]+
D= 0 | [1-9][0-9]*
espacio=[ \t\r]+
%{
    private Symbol symbol(int type){
        Symbol s = new Symbol(type, yyline, yycolumn);
        codigo.FrmPrincipal.tokens.add(s);
        return s;
    }
    private Symbol symbol(int type, Object value){
        Symbol s = new Symbol(type, yyline, yycolumn, value);
        codigo.FrmPrincipal.tokens.add(s);
        return s;
    }

    private void reportarError(String error, String cuerpo, int linea){
        codigo.FrmPrincipal.errores.agregarErrorLexico(error, linea, cuerpo);
        //System.out.println(cuerpo);
    }
%}
%%


    /* Espacios en blanco */
{espacio}    {/*Ignore*/}

    /* Comentarios */
"//"[^\n]*"\n" {/*Ignore*/}

    /* Salto de linea */
"\n"     {/*Ignore*/}
/* PALABRAS RESERVADAS */
<YYINITIAL> {
    "a"     {return symbol(sym.A);}
    "b"     {return symbol(sym.B);}
    /* inicio, fin y terminacion de programa  */
    "salir" {return symbol(sym.SALIR);}
    "inicio" {return symbol(sym.INICIO);}
    "fin"      {return symbol(sym.FIN);}
    "comienzo" {return symbol(sym.COMIENZO);}

    /* Datos y funciones */
    "entero"    {return symbol(sym.ENTERO);}
    "logico"    {return symbol(sym.LOGICO);}
    "funcion"   {return symbol(sym.FUNCION);}
    "usar"      {return symbol(sym.USAR);}
    /* Estructuras de control */
    "condicion" {return symbol(sym.CONDICION);}
    "sino" {return symbol(sym.SINO);}

    /* funciones propias del lenguaje */
    "ventilar"  {return symbol(sym.VENTILAR);}
    "admitir"   {return symbol(sym.ADMITIR);}
    "dispensar" {return symbol(sym.DISPENSAR);}
    "sanitizar" {return symbol(sym.SANITIZAR);}

    /* Declaracion de variables */
    "declarar"  {return symbol(sym.DECLARAR);}
    "como"      {return symbol(sym.COMO);}
    
    /* Estructura de tiempo */
    "cada"   {return symbol(sym.CADA);}
    "por"   {return symbol(sym.POR);}
    "seg"   {return symbol(sym.SEG);}
    "min"   {return symbol(sym.MIN);}
    "hr"    {return symbol(sym.HR);}

    /* Control de puertas y ventanas */
    "abrir"     {return symbol(sym.ABRIR);}
    "cerrar"    {return symbol(sym.CERRAR);}
    "ventanas"  {return symbol(sym.VENTANAS);}
    "puertas"   {return symbol(sym.PUERTAS);}
    "luces"     {return symbol(sym.LUCES);}
    "mantener"  {return symbol(sym.MANTENER);}
    "estado"    {return symbol(sym.ESTADO);}
    

    /* Control de temperatura y capacidad */
    "obtener"       {return symbol(sym.OBTENER);}
    "temperatura"    {return symbol(sym.TEMPERATURA);}
    "personas"      {return symbol(sym.PERSONAS);}

    /* Control de luces */
    "apagar"    {return symbol(sym.APAGAR);}
    "encender"  {return symbol(sym.ENCENDER);}
}

/* Operador de asignacion */
<YYINITIAL> "=" {return symbol(sym.ASIGNACION);}

/* Operadores Aritmeticos */
<YYINITIAL> {
    "+" {return symbol(sym.AR_SUMA);}
    "-" {return symbol(sym.AR_RESTA);}
    "*" {return symbol(sym.AR_MULTIPLICACION);}
    "/" {return symbol(sym.AR_DIVISION);}
}

/* Operadores logicos */
<YYINITIAL> {
    "!"     {return symbol(sym.NEGACION);}
    "&&"    {return symbol(sym.LOGICO_AND);}
    "||"    {return symbol(sym.LOGICO_OR);}
}

/*Operadores Relacionales */
<YYINITIAL> {
    "<"     {return symbol(sym.REL_MENOR);}
    ">"     {return symbol(sym.REL_MAYOR);}
    "<="    {return symbol(sym.REL_MENOR_IGUAL);}
    ">="    {return symbol(sym.REL_MAYOR_IGUAL);}    
    "!="    {return symbol(sym.REL_DIFERENTE);}
    "=="    {return symbol(sym.REL_IGUAL);}
}

/* Operadores Incremento y decremento */
<YYINITIAL> {
    "++"    {return symbol(sym.INC);}
    "--"    {return symbol(sym.DEC);}
}

/*Operadores Booleanos*/
<YYINITIAL> {
    "verdadero"     {return symbol(sym.OP_BOOLEANO, true);}
    "falso"         {return symbol(sym.OP_BOOLEANO, false);}
}
/* Simbolos de agrupacion */
<YYINITIAL> {
    "(" {return symbol(sym.PARENTESIS_ABIERTO);}
    ")" {return symbol(sym.PARENTESIS_CERRADO);}
    "{" {return symbol(sym.LLAVE_ABIERTA);}
    "}" {return symbol(sym.LLAVE_CERRADA);}
    "[" {return symbol(sym.CORCHETE_ABIERTO);}
    "]" {return symbol(sym.CORCHETE_CERRADO);}
}

/* Signos de puntuacion */
<YYINITIAL> {
    ";" {return symbol(sym.PUNTO_COMA);}
    "," {return symbol(sym.COMA);}
}
/* Identificador */
{L}({L}|{D})*   {return symbol(sym.IDENTIFICADOR, yytext());}

/* Numero */
{D}+ {return symbol(sym.NUMERO, Integer.parseInt(yytext()));}

/* Error general */
[^ ;,{}\[\]()/<>=!&\+\-\*\n\t\|]+       {reportarError("EL1", yytext(), yyline + 1);return symbol(sym.error);}