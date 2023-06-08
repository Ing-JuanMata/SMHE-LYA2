/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaInicio extends Tripleta {

    public TripletaInicio() {
        super("inicio");
    }

    @Override
    public String codigoObjeto() {
        return """
               #include "p16f84a.inc"
               
               ; CONFIG
               ; __config 0x3FF1
                   __CONFIG _FOSC_XT & _WDTE_OFF & _PWRTE_ON & _CP_OFF
               CBLOCK 0X0C
                   PROGF, PERSONAS, TS, TW, TA, MA, MB
                   CONTADOR, SEGUNDOS, MINUTOS, HORAS
                   VENTF, ADMF, LIMITE
                   TSEG, TMIN, THR, TCON
               ENDC
               #DEFINE SEL0 PORTA,RA0
               #DEFINE SEL1 PORTA,RA1
               #DEFINE S0 PORTA,RA2
               #DEFINE S1 PORTA,RA3
               #DEFINE VENTILACION PORTA,RA4
               #DEFINE TALTA PORTB,RB0
               #DEFINE EPUERTAS PORTB,RB1
               #DEFINE EVENTANAS PORTB,RB2
               #DEFINE ELUCES PORTB,RB3
               #DEFINE ACCA PORTB,RB4
               #DEFINE ACCB PORTB,RB5
               #DEFINE VERIFT PORTB,RB6
               #DEFINE VERIFGEL PORTB,RB7
               #DEFINE TALTAI	INTCON,INTF
               #DEFINE VERIFSI	INTCON,RBIF
               #DEFINE ACCAF	PROGF,0
               #DEFINE ACCBF	PROGF,1
               #DEFINE TF	PROGF,2
               #DEFINE SF	PROGF,3
               #DEFINE FF	PROGF,4
               #DEFINE	VENTP	VENTF,0
               #DEFINE	VENTV	VENTF,1
               #DEFINE ADMIP	ADMF, 0
               #DEFINE ADMICP	ADMF, 1
               ORG 0X00
                   GOTO CNFG
               ORG 0X04
                   GOTO INTS_CTRL
               CNFG	    BSF		STATUS,RP0
                   MOVLW		0XFF
                   MOVWF		TRISB
                   MOVLW		0X10
                   MOVWF		TRISA
                   MOVLW		0XC7
                   MOVWF		OPTION_REG
                   MOVLW		0X98
                   MOVWF		INTCON
                   BCF			STATUS, RP0
                   MOVLW		0X01
                   MOVWF		SEGUNDOS
                   MOVWF		MINUTOS
                   MOVWF		HORAS
                   MOVWF		CONTADOR
                   CLRF		PERSONAS
                   CLRF		PROGF
                   CLRF		PORTA
                   CLRF		ADMF
                   CLRF		VENTF
               """;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
