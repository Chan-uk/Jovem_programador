public class NumeroMaximo {

    public static void main(String[] args){

        int[] numeros = {2, 5, 7, 1, 9, 3};
        int maximo = numeros [0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > maximo) {
                System.out.prinln("alterei de "+maximo);
                maximo = numeros[i];
                System.out.println('')
            }
        }
    }
    
}
