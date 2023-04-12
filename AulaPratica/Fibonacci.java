public class Fibonacci {

    public static void main(String[] args){
        int limite = 50;
        int anterior = 0;
        int atual = 1;
        System.out.println(anterior);
        System.out.println(atual);
        while (atual < limite) {
            int proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
    }


    
}
