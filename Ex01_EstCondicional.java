/*Faça um programa que leia 3 números inteiros e que mostre o maior 
deles, supondo que todos sejam distintos. */
import java.util.Scanner;
public class Ex01_EstCondicional {
	public static void maiorNumero() {
		Scanner dado = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		System.out.print("MAIOR NÚMERO! \n");
		System.out.print("Digite o primeiro número: ");
		a = dado.nextInt();
		System.out.print("Digite o segundo número: ");
		b = dado.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = dado.nextInt();
		
		if ((a > b) && (a > c)) {
			System.out.print("O maior número é o primeiro : " + a);
		} else {
			if ((b > a) && (b > c)) {
				System.out.print("O maior número é o segundo: " + b);		
			} else {
				System.out.print("O maior número é o terceiro: " + c);
			}
		}
		System.out.print("\nFim de programa");
	}
}