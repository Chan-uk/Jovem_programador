public class Palindromo {

    public static void main(String[] args){

        String palavra = "arara";
        boolean palindromo = true;

        for (int i = 0; i < palavra.length()/2; i++){
            if (palavra.charAt(i) != palavra.charAt(palavra.length()-1-i)) {
                System.out.println("passou");
                palindromo = false;
                break;
            }
        }
        if (palindromo){
            System.out.println("A palavra é um palindromo!");
        }else {
            System.out.println("A palavra não é um palindromo!");
          }
        }
    }

    

