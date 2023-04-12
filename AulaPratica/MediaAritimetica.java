public class MediaAritimetica {
	
	public static void main(String[] args) {
		
		double[] numeros = {2.5, 3.0, 4.5, 5.5};
		double soma = 0;
		for (double numero : numeros) {
			soma += numero;
		}
		double media = soma /numeros.length;
		System.out.println("A média é: "+media);
}
	
			
}


