Program precoautomovel ;
 var
  precof,precor:real; 
  carro: string;
  const percentual=40;
  
  
  
Begin
write('calcular pre�o de um carro');
writeln();
write('Digite o nome do carro: ');
read(carro);
writeln();
write('digite o pre�o de fabrica: ');
read(precof);
writeln();
precor:=(precof*(percentual/100)+precof);
write('o pre�o de venda do ',carro,' �: ',precor);



  
End.