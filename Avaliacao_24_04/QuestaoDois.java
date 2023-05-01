package Avaliacao_24_04;

import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o Salario nominal do empregado: ");
        Double valorNominal = s.nextDouble();
        System.out.print("Informe quantas horas extras o empregado realizou: ");
        Double horasExtras = s.nextDouble();
        Double valorHorasExtras = (valorNominal / 176)*horasExtras*1.5;
        System.out.println("O valor de total de horas extras é: "+ valorHorasExtras);
        Double salarioComHExtras = valorNominal+valorHorasExtras;
        System.out.println(" Salário bruto:"+salarioComHExtras);
        Double descontoInss = 0.0;
        if (salarioComHExtras <=1500){
            descontoInss = salarioComHExtras*10/100;
            System.out.println("Desconto INSS: "+descontoInss);

         }else if(salarioComHExtras>1500){
            descontoInss = 150.0;
            System.out.println("Desconto INSS: "+descontoInss);
        
         }
         Double salarioLiquido = salarioComHExtras - descontoInss;
         System.out.println("O salário líquido é de:"+salarioLiquido);
    }

    
}
