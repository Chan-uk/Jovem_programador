Program precoautomovel ;
 var
  precof,precor:real; 
  carro: string;
  const percentual=40;
  
  
  
Begin
write('calcular preço de um carro');
writeln();
write('Digite o nome do carro: ');
read(carro);
writeln();
write('digite o preço de fabrica: ');
read(precof);
writeln();
precor:=(precof*(percentual/100)+precof);
write('o preço de venda do ',carro,' é: ',precor);



  
End.