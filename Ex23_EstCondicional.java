/*A nota final de um estudante é calculada a partir de três notas atribuídas 
respectivamente a um trabalho de laboratório, a uma avaliação semestral e a 
um exame final. A média das três notas mencionadas anteriormente obedece aos pesos 
a seguir:  
Nota   								 Peso 
Trabalho de laboratório 			 2 
Avaliação semestral  				 3 
Exame final   						 5 
Faça um algoritmo que receba as três notas, calcule e mostre a média ponderada e o 
conceito segundo mostrado abaixo: 
Média Ponderada  Conceito 
8,0 ●---● 10,0   A 
7,0 ●---○ 8,0   B 
6,0 ●---○ 7,0   C 
5,0 ●---○ 6,0   D 
0,0 ●---○ 5,0   E*/
import java.util.Scanner;
public class Ex23_EstCondicional {
	public static void mediaPonderada() {
		Scanner dado = new Scanner(System.in);
		
		final int peso1 = 2, peso2 = 3, peso3 = 5;
		double nota1, nota2, nota3, mediaPonderada;
		char conceito;
		
		System.out.print("Média ponderada\n");
		System.out.print("Qual foi a nota do seu Trabalho de laboratório ? ");
		nota1 = dado.nextDouble();
		System.out.print("Qual foi a nota da sua Avaliação semestral ? ");
		nota2 = dado.nextDouble();
		System.out.print("Qual foi a nota da sua Avaliação final ? ");
		nota3 = dado.nextDouble();
		
		mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
				
		if(mediaPonderada >= 8) {
			conceito = 'A';
		} else {
			if(mediaPonderada >= 7) {
				conceito = 'B';
			} else {
				if(mediaPonderada >= 6) {
					conceito = 'C';
				} else {
					if(mediaPonderada >= 5) {
						conceito = 'D';
					} else {
						conceito = 'E';
					}
				}
			}
		}
		System.out.printf("Sua média ponderada foi de %.2f e o conceito é : %c", mediaPonderada, conceito);
		System.out.print("\nFIM DE PROGRAMA");
	}
}