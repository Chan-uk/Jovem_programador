Program Pzim ;
var
  A, B, soma, sub, prod,dv :integer;
Begin
   write ('informe o valor de A: ');
   read (A) ;
   writeln();
   write ('informe o valor de B: ');
   read (B) ;
   writeln();
   soma:=(A+B);
   sub:=(A-B);
   prod:=(A*B);
   dv:=(A DIV B);
   write ('O resultado da soma é: ');
   write (soma);
   writeln();
   write ('O resultado da subtração é: ');
   write (sub);
   writeln();
   write ('O resultado da multiplicação é: ');
   write (prod);
   writeln();
   write ('O resultado da divisão é: ');
   write (dv);
  
End.