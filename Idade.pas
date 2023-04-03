Program Pzim ;
var
 AC,AN,age : integer;

Begin
  writeln('Este progrqama Calcula a Idadede uma pessoa!');
  writeln();
  write('Digite o ano corrente: ');
  read(AC);
  writeln();
  write('Digite o ano de Nascimento: ');
	read(AN); 
	writeln();
	age:=(AC-AN);
	write('A idade é: ');
	write(age);
  
End.