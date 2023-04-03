Program compra_cliente ;
 Var
  n_cl, n_pr: string;
  prc, qte, ttl : real;
Begin
 write('CLIENTE: ');
 read(n_cl) ;
 writeln();
 write('PRODUTO: ');
 read(n_pr);
 writeln();
 write('PREÇO: ');
 read(prc);
 writeln();
 write('QUANTIDADE: ');
 read(qte);
 writeln();
 ttl:=(prc*qte);
 write('TOTAL DA COMPRA: ');
 write(ttl);
 writeln();
 writeln();
 writeln('CLIENTE: ',n_cl);
 writeln();
 writeln('PRODUTO: ',n_pr);
 writeln();
 writeln('QUANTIDADE: ',qte);
 writeln();
 writeln('TOTAL DA COMPRA: ',ttl);
 writeln();
 writeln();
 writeln('AGRADECEMOS A PREFERÊNCIA! VOLTE SEMPRE! S2');
 
 
 
  
End.