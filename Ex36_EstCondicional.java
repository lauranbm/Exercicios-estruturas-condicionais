/* O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar
uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / (altura)2.
Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição. 
IMC em adultos  			Condição
abaixo de 18.5 			abaixo do peso 
entre 18.5 e 25 		peso normal 
entre 25 e 30 			acima do peso 
acima de 30 			obeso			*/
import java.util.Scanner;
public class Ex36_EstCondicional {
	public static void imc() {
		Scanner dado = new Scanner(System.in);
		
		double imc, peso, altura;
		String condicao;
		
		System.out.print("ÍNDICE DE MASSA CORPORAL\n");
		System.out.print("Qual seu peso? ");
		peso = dado.nextDouble();
		System.out.print("Qual a sua altura? ");
		altura = dado.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
	
		if(imc < 18.5) {
			condicao = "Abaixo do peso!";
		} else {
			if(imc < 25.0) {
			condicao = "Peso normal!";
			} else {
				if(imc < 30) {
					condicao = "Acima do peso!";
				} else {
					condicao = "Obeso!";
				}
			}
		}	
		System.out.printf("Classificação: %s", condicao);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}