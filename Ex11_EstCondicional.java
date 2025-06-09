/* Escreva um algoritmo que descubra se um ano lido é bissexto. Um ano é 
bissexto se ele for múltiplo de 4, exceto quando ele for múltiplo de 100. Os anos 
múltiplos de 100 somente são bissextos quando são múltiplos de 400, usado a partir de 
1752 (por exemplo 1800 não é bissexto, mas 2000 é) */

import java.util.Scanner;
public class Ex11_EstCondicional {
	public static void anoBissexto2() {
		Scanner dado = new Scanner(System.in);
		
		int ano;
		
		System.out.print("Ano bissexto!\n");
		System.out.print("Qual ano? ");
		ano = dado.nextInt();
		
		if(ano >= 1752) {
			if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
				System.out.print("É Bissexto!");
			} else {
				System.out.print("Não é bissexto!");
			}
		} else {
			System.out.print("Ano inválido");
		}
		System.out.print("\nFim de programa!");
	}
}