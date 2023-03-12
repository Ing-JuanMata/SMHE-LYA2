package codigo;

import compilerTools.TextColor;
import java.awt.Color;
%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }
%}
L=[A-Za-zÑñ_ÁÉÍÓÚáéíóú]+
D=[0-9]+
espacio=[ \t\r]+
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {/*Ignore*/}

/* Comillas */
( "\"" ) {/*Ignore*/}

/*PALABRAS RESERVADAS*/
Atlas | End | begin | int | char | logic | float | str | condition |
else | option | ventilate | admit | emptyRoom | dispense | distance | deviceControl |
driverLights | openDoor | registerA | exit | true | false | start | As | Declare |
while | for  {return textColor(yychar, yylength(), Color.PINK);}


/* Operador Igual */
( "=" ) {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/* Operadores Aritmeticos */
( "+" | "-" | "*" | "/" ) {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" ) {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=") {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return textColor(yychar, yylength(), Color.decode("#9400D3"));}

/* Parentesis de apertura */
( "(" ) {/*Ignore*/}

/* Parentesis de cierre */
( ")" ) {/*Ignore*/}

/* Llave de apertura */
( "{" ) {/*Ignore*/}

/* Llave de cierre */
( "}" ) {/*Ignore*/}

/* Corchete de apertura */
( "[" ) {/*Ignore*/}

/* Corchete de cierre */
( "]" ) {/*Ignore*/}

/* Punto y coma */
( ";" ) {/*Ignore*/}

/* Coma */
( "," ) {/*Ignore*/}

/* Identificador */
{L}({L}|{D})* {return textColor(yychar, yylength(), Color.green);}

/* Numero */
("(-"{D}+")")|{D}+ {return textColor(yychar, yylength(), Color.blue);}

/* Numero Decimal */
("(-"{D}+\.{D}+")")|{D}+\.{D}+ {return textColor(yychar, yylength(), Color.blue);}

/* Error Identificador */
{D}+{L}+ {return textColor(yychar, yylength(), Color.red);}

/* Texto */
\".*\" {return textColor(yychar, yylength(), Color.decode("#2ECCFA"));}

/* Caracter */
\'.\' {return textColor(yychar, yylength(), Color.decode("#2ECCFA"));}

/* Error caracter */
\'.+\' {return textColor(yychar, yylength(), Color.red);}

/* Error de analisis */
 . {return textColor(yychar, yylength(), Color.red);}
