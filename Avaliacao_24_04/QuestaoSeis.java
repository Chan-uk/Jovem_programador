import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);
        System.out.print(" Numero de Registros: ");        
        Integer numeroPessoas = entre.nextInt();
        entre.nextLine();
        String[] nome = new String[numeroPessoas];
        String[] sexo = new String[numeroPessoas];
        int[] idade = new int[numeroPessoas]; 
        for(int i = 0; i < numeroPessoas; i++) {
            System.out.print(" Nome: ");
            nome[i] = entre.nextLine();            
            System.out.print("Sexo: ");
            sexo[i] = entre.nextLine();            
            System.out.print(" idade: ");
            idade[i] = entre.nextInt();
            entre.nextLine();
        }
        for(int j = 0; j < numeroPessoas; j++) {
            if(idade[j] > idade[0]){
                System.out.println(nome[j]+" tem "+idade[j]+" anos, é do sexo "+sexo[j]+", é mais velho(a) que "+nome[0]);
            }
        }
        System.out.println("Mulheres: ");
        for(int k = 0; k < numeroPessoas; k++){
                if(sexo[k].equals("F")) {
                   
                    System.out.println(" "+nome[k]+" tem "+ idade[k]+" anos.");
                }
        }
        System.out.println("Homens com menos de 21 anos :");
        for(int z = 0; z < numeroPessoas; z++) {
            if(sexo[z].equals("M")) {
                if(idade[z] < 21){
                    System.out.println(" "+nome[z]);
                }
            }      
        }

    }    
}
