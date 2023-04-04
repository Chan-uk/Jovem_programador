Program temperatura ;
var 
 C,F,K: real;

Begin
write('digite a temperatura em graus Celsius: ');
read(C);
F:=((9 * C )/5)+32;
K:= (C + 273);
writeln();
write('FAHRENHEITE: ',F);
writeln();
writeln('KELVIN: ', K);


  
End.