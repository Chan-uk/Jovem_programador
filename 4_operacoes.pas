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
   write ('O resultado da soma �: ');
   write (soma);
   writeln();
   write ('O resultado da subtra��o �: ');
   write (sub);
   writeln();
   write ('O resultado da multiplica��o �: ');
   write (prod);
   writeln();
   write ('O resultado da divis�o �: ');
   write (dv);
  
End.