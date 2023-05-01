

import java.util.Scanner;

public class QuestaoTres {

    public static void main(String[] args) {
       Boolean repetir = true;
       Scanner s = new Scanner(System.in);
       Double numero, raizQuadrada;
       int opcao;
       
       while (repetir) {
             System.out.println("Escolha uma opção:");
             System.out.println(" 1 - Fim ");
             System.out.println(" 2 -Raiz:");
             System.out.print(" Opção escolhida: ");
             opcao = s.nextInt();
            if (opcao == 1){
                System.out.println("Fim do Programa");
                break;

            } else if (opcao == 2){
                    System.out.print("Digite um numero real: ");
                    numero = s.nextDouble();
                    if (numero >= 0) {
                        raizQuadrada = Math.sqrt(numero);
                        System.out.println("A raiz quadrada de "+numero+" é:"+raizQuadrada );               
                    } else {
                        System.out.println(" Erro: número negativo!");
                }              
            } else {
                System.out.println("Opção Inválida!");
            }
        }
        s.close();
    }
}





