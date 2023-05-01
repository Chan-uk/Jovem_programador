import java.util.Scanner;
public class QuestaCinco {
    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        Boolean repetir = true;
        while(repetir) {
            System.out.print(" Preço do produto: ");
            double preçoEtiqueta = entre.nextDouble();
            double preçoFinal = 0.0;
            
                System.out.println("Informe a condiçao de pagamento:");
                System.out.println();
                System.out.println("1.À vista em dinheiro, débito ou pix: 15% de desconto.");
                System.out.println("2.À vista no cartão de crédito: 10% de desconto.");
                System.out.println("3.Em 2x, preço normal sem juros. ");
                System.out.println("4.Em 3x, preço da etiqueta mais 10% de juros. ");
                int condiçaoPagamento = entre.nextInt();
                if(condiçaoPagamento == 1) {
                    preçoFinal = preçoEtiqueta -(preçoEtiqueta*0.15);
                    System.out.println(" Total a pagar: R$ "+preçoFinal);
                }else if(condiçaoPagamento == 2){
                    preçoFinal = preçoEtiqueta -(preçoEtiqueta*0.1);
                    System.out.println(" Total a Pagar: R$ "+preçoFinal);
                }else if(condiçaoPagamento == 3){
                    preçoFinal = preçoEtiqueta;
                    System.out.println("Total a pagar: R$ "+preçoFinal);
                    System.out.println("Parcelas 2x de R$ "+(preçoFinal/2));
                }else if(condiçaoPagamento == 4){
                    preçoFinal = preçoEtiqueta + (preçoEtiqueta*0.1);
                    System.out.println("Total a pagar: "+preçoFinal);
                    System.out.println("Parcelas 3x de R$ "+(preçoFinal/3));
                }else{
                    System.out.println("Condição de pagamento inválida!");                               
                } 
              
        }
        entre.close();
    }
    
}
