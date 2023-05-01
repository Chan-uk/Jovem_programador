

import java.util.Scanner;

public class QuestaoUm {

    public static void main(String[] args) {
        System.out.println("Menu Principal");
        System.out.println(" 1 - Fim");
        System.out.println(" 2 - Cadastro");
        System.out.println(" 3 - consulta");
        System.out.println(" Digite a opção desejada: ");
        Scanner s = new Scanner(System.in);
        String opcaoEscolhida = s.nextLine();
        if (opcaoEscolhida.equals("1")){
            System.out.println("Opção Escolhida: Fim");

        } else if (opcaoEscolhida.equals("2")){
            System.out.println("Opção Escolhida: Cadastro ");
        
        }else if (opcaoEscolhida.equals("3")){
            System.out.println("Opção escolhida: Consulta");
        }else{
            System.out.println("Opção incorreta!");
        }
        s.close();
    }
    
}
