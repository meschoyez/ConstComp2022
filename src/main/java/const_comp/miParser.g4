grammar miParser;

@header{
package const_comp;    
}

fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
SUMA : '+' ;
MULT : '*' ;

INT : 'int' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : DIGITO+ ;

WS : [ \n\t\r] -> skip ;
OTRO : . ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;
            

instruccion : bloque
            | declaracion
            // | asignacion
            // | ireturn
            // | inst_if
            // | inst_for
            // | inst_while
            ;

bloque : LLA instrucciones LLC ;

declaracion : INT ID PYC ;

opar : exp opar
     | EOF
     ;

exp : term t ;

term : factor f ;

t : SUMA term t
  |
  ;

factor : NUMERO
       | ID
       | PA exp PC
       ;

f : MULT factor f
  |
  ;

// si : s EOF ;

// s : PA s PC s
//   |
//   ;

//  s : ID { System.out.println("ID ->" + $ID.getText() + "<--"); } s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO { System.out.println("Otro ->" + $OTRO.getText() + "<--"); } s
//   | EOF
//   ;

