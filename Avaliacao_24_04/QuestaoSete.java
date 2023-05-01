import java.util.Scanner;
import java.util.Arrays;

public class QuestaoSete {

    public static void main(String[] args) {
        
        Scanner entre = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] elementosPares = new int[numeros.length];
        int menorNumero = Integer.MAX_VALUE;
        int maiorNumero = Integer.MIN_VALUE;
        
        System.out.println("Digite 10 numeros inteiros: ");
        for (int i = 0; i < 4; i++ ) {
            numeros[i] = entre.nextInt(); 
        }
        System.out.println("Vetor Original:"+Arrays.toString(numeros));
        int contador = 0;
        for(int j = 0; j < numeros.length; j++){            
            if(numeros[j] % 2==0) {                
               elementosPares[contador] = numeros[j]; 
               contador++;            
            }           
        }        
        
        System.out.println("Elementos Pares:"+Arrays.toString(elementosPares));
        for(int k =0; k < numeros.length; k++){
            if(numeros[k] < menorNumero){
                menorNumero = numeros[k];
            }
            if(numeros[k] > maiorNumero){
               maiorNumero = numeros[k]; 
            }
        } 
        System.out.println("O menor número do Vetor é: "+menorNumero); 
        System.out.println(" O maior numero do vetor é: "+maiorNumero);
        
    }
}