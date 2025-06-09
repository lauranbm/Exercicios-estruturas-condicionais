/*Escreva um algoritmo que receba e altura e o peso de uma pessoa. De acordo 
com a tabela a seguir, verifique e mostre qual a classificação dessa pessoa. 
	Altura									Peso 
		-				Até 60 		Entre 60 e 90 		Acima de 90 
Menores que 1,20 		  A				 D					G 
De 1,20 a 1,70 			  B				 E					H 
Maiores que 1,70 		  C				 F					I			*/
import java.util.Scanner;
public class Ex33_EstCondicional {
	public static void classificacaoPessoa() {
		Scanner dado = new Scanner(System.in);
		
		float altura, peso;
		char classificacao;
		
		System.out.print("Classificação corporal!\n");
		System.out.print("Qual a sua altura? ");
		altura = dado.nextFloat();
		System.out.print("Qual seu peso? ");
		peso = dado.nextFloat();

		if(altura < 1.20) {
			if(peso < 60f) {
			classificacao = 'A';
			} else {
				if(peso < 90) {
					classificacao = 'D';
				} else {
					classificacao = 'G';
				}
			}
		} else if(altura <= 1.70) {
			if(peso < 60f) {
			classificacao = 'B';
			} else {
				if(peso < 90) {
					classificacao = 'E';
				} else {
					classificacao = 'H';
				}
			}
		} else {
			if(peso < 60f) {
			classificacao = 'C';
			} else {
				if(peso < 90) {
					classificacao = 'F';
				} else {
					classificacao = 'I';
				}
			}
		}
		System.out.printf("A sua classificação é: %c", classificacao);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}