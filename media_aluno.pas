Program Pzim ;
var
 aluno: string ;
 media,n1,n2,n3: real ;

Begin
  writeln('Este programa Calcula a média das notas');
  writeln();
  write('Qual o nome do aluno? ');
  readln (aluno);
  writeln();
  write('digite a Primeira nota: ');
  read (n1);
  writeln();
  write('digite a Segunda: ');
  read (n2);
  writeln();
  write('digite a Terceira nota: ');
  read (n3);
  writeln();  
  media:=(n1+n2+n3)/3 ;
  write('a média do aluno ' ,aluno,' é: ');
	write(media); 
  
  
End.