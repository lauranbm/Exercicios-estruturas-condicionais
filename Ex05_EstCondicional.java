/*Números palíndromos são aqueles que escritos da direita para esquerda ou da 
esquerda para direita tem o mesmo valor. Exemplo 929, 44, 97379. Fazer um 
algoritmo que dado um número de 5 dígitos, calcule e escreva se este é ou não 
palíndromo. */

import java.util.Scanner;
public class Ex05_EstCondicional {
	public static void numerosPalindromos() {
		Scanner dado = new Scanner (System.in);
		
		int numero, d1, d2, d3, d4, d5, resto;
		
		System.out.print("Números palíndromos!\n");
		System.out.print("Digite um número de 5 dígitos: ");
		numero = dado.nextInt();
			
		if ((numero < 10000) || (numero > 99999)) {
			System.out.print("Número inválido!");
		} else {
			d1 = numero / 10000;
			resto = (numero % 10000);
			d2 = (numero % 10000) / 1000;
			resto = (resto % 1000);
			d3 = resto / 100;
			resto = (resto % 100);
			d4 = resto / 10;
			resto = (resto % 10);
			d5 = resto;
			
			if ((d1 == d5) && (d2 == d4)) {
				System.out.print("É um número Palíndromo!");
			} else {
				System.out.print("Não é um número Palídromo!");
			}
		}
		System.out.print("\nFim de programa!!!");
	}
}