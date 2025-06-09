/*Criar um algoritmo que leia a idade de uma pessoa e que mostre a sua classe 
eleitoral: - Não-eleitor (abaixo de 16 anos); - Eleitor Obrigatório (entre 18 e 
65 anos); - Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos). */

import java.util.Scanner;
public class Ex14_EstCondicional {
	public static void classeEleitoral() {
		Scanner dado = new Scanner(System.in);
		
		int idade;
		String classe;
		
		System.out.print("Classe eleitoral!\n");
		System.out.print("Qual sua idade? ");
		idade = dado.nextInt();
		
		if(idade < 16) {
			classe = "Não eleitor";
		} else {
			if((idade < 18) || (idade > 65)) {
				classe = "Eleitor facultativo";
			} else {
				classe = "Eleitor obrigatório!!!";
			}
		}
		System.out.print(classe);
		System.out.print("\nFim de programa!");
	}
}