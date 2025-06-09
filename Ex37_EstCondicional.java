/* Escreva um algoritmo que receba a idade de um nadador e imprima a sua 
categoria seguindo as regras: 
Categoria 			Idade
Infantil A 		 5 – 7 anos 
Infantil B 		 8 – 10 anos 
Juvenil A 		 11 – 13 anos 
Juvenil B 		 14 – 17 anos
Sênior 			 maiores de 18 anos */
import java.util.Scanner;
public class Ex37_EstCondicional {
	public static void categoriaNatacao() {
		Scanner dado = new Scanner(System.in);
		int idade;
		String categoria;
		
		System.out.print("Categoria do nadadador!\n");
		System.out.print("Qual a sua idade? ");
		idade = dado.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			categoria = "Infantil A";
		} else { 
			if (idade <= 10) {
				categoria = "Infantil B";			
			} else {
				if(idade <= 13) {
					categoria = "Juvenil A";
				} else {
					if(idade <= 17) {
						categoria = "Juvenil B";
					} else {
						categoria = "Sênior";
					}
				}
			}
		}
		System.out.print("Sua categoria é : " + categoria);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}