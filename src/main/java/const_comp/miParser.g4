grammar miParser;


fragment DIGITO : [0-9] ;
fragment LETRA : [A-Za-z] ;

PA : '(' ;
PC : ')' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
NUMERO : DIGITO+ ;

WS : [ \n\t\r] -> skip ;
OTRO : . ;

si : s EOF ;

s : PA s PC s
  |
  ;

//  s : ID { System.out.println("ID ->" + $ID.getText() + "<--"); } s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO { System.out.println("Otro ->" + $OTRO.getText() + "<--"); } s
//   | EOF
//   ;

