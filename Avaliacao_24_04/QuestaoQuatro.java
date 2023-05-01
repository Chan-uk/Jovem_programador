import java.util.Scanner;


public class QuestaoQuatro { 
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double maiorAltura = Double.MIN_VALUE;
	double menorAltura = Double.MAX_VALUE;
	double altura = 0.0;
		
		for (int i = 1; i <= 15; i++) {
			System.out.print("Informe a altura da "+i+ "ª pessoa: ");
			altura = scanner.nextDouble();
			if(altura < menorAltura) {
				menorAltura = altura;
			}
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
		}
		
		System.out.println("A pessoa mais baixa mede "+menorAltura+" metros.");

		System.out.println("A pessoa mais alta mede "+maiorAltura+" metros.");
		
	}
}


