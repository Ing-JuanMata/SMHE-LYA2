/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo_intermedio;

/**
 *
 * @author jujemataso
 */
public class TripletaFin extends Tripleta {

    public TripletaFin() {
        super("fin");
    }

    @Override
    public String codigoObjeto() {
        return """
               INTS_CTRL
                   MOVWF	TW
                   MOVFW		STATUS
                   MOVWF		TS
                   MOVFW		PORTA
                   MOVWF		TA
                   BTFSS		INTCON, T0IF
                   GOTO		$+3
                   CALL		TMR2
                   GOTO		FINIC
                   BTFSS		INTCON, INTF
                   GOTO		$+3
                   CALL		ON_VENT
                   GOTO		FINIA
                   BTFSS		INTCON, RBIF
                   GOTO		FINI
                   BTFSS		EPUERTAS
                   GOTO		ITEMP
               IACCA	    BTFSS	ACCA
                   GOTO		IACCB
                   BTFSS		ACCBF
                   GOTO		$+4
                   DECF		PERSONAS,F
                   CLRF		PROGF
                   GOTO		ITEMP
                   BSF			ACCAF
                   GOTO		ITEMP
               IACCB	    BTFSS	ACCB
                   GOTO		ITEMP
                   BTFSS		ACCAF
                   GOTO		$+7
                   INCF		PERSONAS,F
                   CLRF		PROGF
                   BTFSS		ADMICP
                   GOTO		$+2
                   CALL		CPUERTA
                   GOTO		ITEMP
                   BSF			ACCBF
               ITEMP	    BTFSS	VERIFT
                   GOTO		$+3
                   BSF			TF
                   GOTO		$+3
                   BTFSS		TF
                   GOTO		FINIB
                   BTFSS		VERIFGEL
                   GOTO		FINIB
                   BTFSS		ADMIP
                   GOTO		FINIB
                   CALL		APUERTA
               FINIB	    BCF		INTCON, RBIF
                   GOTO		FINI
               FINIA	    BCF		INTCON, INTF
                   GOTO		FINI
               FINIC	    BCF		INTCON, T0IF
               FINI	    MOVFW	TS
                   MOVWF		STATUS
                   MOVFW		TA
                   MOVWF		PORTA
                   MOVFW		TW
                   RETFIE
               
               VENTILAR    CALL	ON_VENT
                   BTFSS		VENTP
                   GOTO		$+3
                   CALL		APUERTA
                   GOTO		$+2
                   CALL		CPUERTA
                   BTFSS		VENTV
                   GOTO		$+3
                   CALL		AVENTANA
                   GOTO		$+2
                   CALL		CVENTANA
                   MOVLW		0X0C
                   MOVWF		PORTA
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BSF			INTCON, T0IE
                   BTFSC		INTCON, T0IE
                   GOTO		$-1
                   CLRF		PORTA
                   RETURN
               
               ADMITIR    CALL		CPUERTA
                   BSF			ADMICP
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BSF			INTCON, T0IE
                   BTFSC		INTCON, T0IE
                   GOTO		$+3
                   BCF			INTCON, RBIE
                   RETURN
                   MOVFW		PERSONAS
                   SUBWF		LIMITE, W
                   BTFSS		STATUS, Z
                   GOTO		$-7
                   CALL		CPUERTA
                   BCF			ADMIP
                   BTFSC		INTCON, T0IE
                   GOTO		$-1
                   BCF			ADMICP
                   RETURN
               
               ON_VENT	    BTFSC	VENTILACION
                   RETURN
               SW_VENT	    MOVLW	0X0B
                   MOVWF		PORTA
                   CLRF		PORTA
                   RETURN
               
               OFF_VENT    BTFSS	VENTILACION
                   RETURN
                   GOTO		SW_VENT
               
               ON_LUCES    BTFSC	ELUCES
                   RETURN
               SW_LUCES    MOVLW	0X07
                   MOVWF		PORTA
                   NOP
                   CLRF		PORTA
                   RETURN
               
               OFF_LUCES   BTFSS	ELUCES
                   RETURN
                   GOTO		SW_LUCES
               
               AC_SANIT   MOVLW	0X0C
                   MOVWF		PORTA
                   CALL		TIMER
                   CLRF		PORTA
                   RETURN
               
               APUERTA	    BTFSC	EPUERTAS
                   RETURN
                   MOVLW		0X05
                   MOVWF		PORTA
                   BTFSS		EPUERTAS
                   GOTO		$-1
                   CLRF		PORTA
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BTFSS		INTCON, T0IF
                   GOTO		$-1
                   RETURN
               
               CPUERTA	    BTFSS	EPUERTAS
                   RETURN
                   MOVFW		SEGUNDOS
                   MOVWF		TSEG
                   MOVFW		MINUTOS
                   MOVWF		TMIN
                   MOVFW		HORAS
                   MOVWF		THR
                   MOVFW		CONTADOR
                   MOVWF		TCON
                   MOVLW		0X01
                   MOVWF		MINUTOS
                   MOVWF		HORAS
                   MOVLW		0X09
                   MOVWF		PORTA
                   MOVLW		0X03
                   MOVWF		SEGUNDOS
                   CALL		TIMER
                   CLRF		PORTA
               
                   MOVFW		TSEG
                   MOVWF		SEGUNDOS
                   MOVFW		TMIN
                   MOVWF		MINUTOS
                   MOVFW		THR
                   MOVWF		HORAS
                   MOVFW		TCON
                   MOVWF		CONTADOR
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BTFSS		INTCON, T0IF
                   GOTO		$-1
                   RETURN
               
               AVENTANA    BTFSC	EVENTANAS
                   RETURN
                   MOVLW		0X06
                   MOVWF		PORTA
                   BTFSS		EVENTANAS
                   GOTO		$-1
                   CLRF		PORTA
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BTFSS		INTCON, T0IF
                   GOTO		$-1
                   RETURN
               
               CVENTANA    BTFSS	EVENTANAS
                   RETURN
                   MOVFW		SEGUNDOS
                   MOVWF		TSEG
                   MOVFW		MINUTOS
                   MOVWF		TMIN
                   MOVFW		HORAS
                   MOVWF		THR
                   MOVFW		CONTADOR
                   MOVWF		TCON
                   MOVLW		0X01
                   MOVWF		MINUTOS
                   MOVWF		HORAS
                   MOVLW		0X0A
                   MOVWF		PORTA
                   MOVLW		0X07
                   MOVWF		SEGUNDOS
                   CALL		TIMER
                   CLRF		PORTA
                   MOVFW		TSEG
                   MOVWF		SEGUNDOS
                   MOVFW		TMIN
                   MOVWF		MINUTOS
                   MOVFW		THR
                   MOVWF		HORAS
                   MOVFW		TCON
                   MOVWF		CONTADOR
                   CLRF		TMR0
                   BCF			INTCON, T0IF
                   BTFSS		INTCON, T0IF
                   GOTO		$-1
                   RETURN
               
               TIMER
                   BCF		INTCON,T0IF ;RESETEAR LA BANDERA DE DESBORDAMIENTO
               TIMER_DESBORDAMIENTO
                   BTFSS	INTCON,T0IF
                   GOTO	TIMER_DESBORDAMIENTO
                   DECFSZ	CONTADOR,F
                   GOTO	TIMER
                   MOVLW	0X0F
                   MOVWF	CONTADOR
                   DECFSZ	SEGUNDOS,F
                   GOTO	TIMER
                   DECFSZ	MINUTOS,F
                   CALL	AGREGAR_SEGUNDOS
                   ANDWF	SEGUNDOS,W
                   BTFSS	STATUS,Z
                   GOTO	TIMER
                   DECFSZ	HORAS,F
                   CALL	AGREGAR_MINUTOS
                   ANDWF	MINUTOS,W
                   BTFSS	STATUS,Z
                   GOTO	TIMER
                   MOVLW	0X01
                   MOVWF	SEGUNDOS
                   MOVWF	MINUTOS
                   MOVWF	HORAS
                   MOVWF	CONTADOR
                   RETURN
               
               AGREGAR_SEGUNDOS
                   MOVLW	0X3C	    ;AGREGAMOS 60 SEGUNDOS AL REGISTRO
                   MOVWF	SEGUNDOS    ;LO GUARDAMOS EN REGISTROS
                   RETLW	0XFF	    ;
               
               AGREGAR_MINUTOS
                   MOVLW	0X3B
                   MOVWF	MINUTOS
                   CALL	AGREGAR_SEGUNDOS
                   RETLW	0XFF
               
               TMR2	    DECFSZ	CONTADOR, F
                   RETURN
                   MOVLW		0X0F
                   MOVWF		CONTADOR
                   DECFSZ		SEGUNDOS,F
                   RETURN
                   DECFSZ		MINUTOS,F
                   CALL		AGREGAR_SEGUNDOS
                   ANDWF		SEGUNDOS,W
                   BTFSS		STATUS,Z
                   RETURN
                   DECFSZ		HORAS,F
                   CALL		AGREGAR_MINUTOS
                   ANDWF		MINUTOS,W
                   BTFSS		STATUS,Z
                   RETURN
                   MOVLW		0X01
                   MOVWF		SEGUNDOS
                   MOVWF		MINUTOS
                   MOVWF		HORAS
                   MOVWF		CONTADOR
                   BCF			INTCON,T0IE
                   RETURN
               
                   MUL	    BTFSS	MA,7
                   GOTO		$+5
                   BTFSS		MB,7
                   GOTO		$+5
                   BCF			SF
                   GOTO		$+4
                   BTFSS		MB,7
                   GOTO		$-3
                   BSF			SF
                   BTFSS		MA,7
                   GOTO		$+3
                   COMF		MA,F
                   INCF		MA,F
                   BTFSS		MB,7
                   GOTO		$+3
                   COMF		MB,F
                   INCF		MB,F
                   CLRW
                   ADDWF		MA,W
                   DECFSZ		MB,F
                   GOTO		$-2
                   BTFSS		SF
                   GOTO		$+2
                   SUBLW		0X0
                   BTFSS		FF
                   RETURN
                   MOVWF		INDF
                   INCF		FSR,F
                   RETURN
               
                   DIV	    BTFSS	MA,7
                   GOTO		$+5
                   BTFSS		MB,7
                   GOTO		$+5
                   BCF			SF
                   GOTO		$+4
                   BTFSS		MB,7
                   GOTO		$-3
                   BSF			SF
                   BTFSS		MA,7
                   GOTO		$+3
                   COMF		MA,F
                   INCF		MA,F
                   BTFSS		MB,7
                   GOTO		$+3
                   COMF		MB,F
                   INCF		MB,F
                   MOVFW		MB
                   CLRF		MB
                   SUBWF		MA,F
                   BTFSS		STATUS,C
                   GOTO		$+3
                   INCF		MB,F
                   GOTO		$-4
                   MOVFW		MB
                   BTFSS		SF
                   GOTO		$+2
                   SUBLW		0X0
                   BTFSS		FF
                   RETURN
                   MOVWF		INDF
                   INCF		FSR,F
                   RETURN
               END
               """;
    }

    @Override
    public void optimizar(BloqueTripletas padre) {

    }

}
