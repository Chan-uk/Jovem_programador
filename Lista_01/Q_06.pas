Program Pzim ;
var
 V,VMS,T: real;
 DRSP: integer;
Begin
  writeln('Este programa converte KM/h em M/s!');
  writeln();
  write('digite a velocidade em Km/h: ');
  read(V);
  writeln();
  VMS:=(V/3.6);
  DRSP:=435;
  T:=(DRSP/V);
  writeln('A velocidade em M/s �: ',VMS);
  
  writeln();
  writeln('a dis�ncia entre Rio de Janeiro e S�o Paulo � ',DRSP,' Km');
  writeln();
  writeln(' o tempo gasto nessa viagem � de : ',T,' horas');
  writeln();
  write('Boa viagem!');
End.