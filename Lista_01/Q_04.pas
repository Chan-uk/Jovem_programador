Program Pzim ;
var
  alt,lar,pro,vol:real;
Begin
  writeln('Este programa Calcula o volume de uma caixa d,agua!');
  writeln();
   write('Digite a altura em cm: ');
  		read(alt);
  	writeln();
   write('Digite a largura em cm: ');
  		read(lar);
  	writeln();
   write('Digite a profundidadeem cm: ');
  		read(pro);
  	vol:=(alt*lar*pro);
  	writeln();
  	writeln();
  	writeln('O volume desta caixa d,agua é : ',vol,' cm3');
  	writeln('FIM');
  	
End.