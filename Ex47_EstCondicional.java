/*Faça um programa que leia um número e informe se ele é divisível por 10, por 5, 
por 2 ou se não é divisível por nenhum deles. Se não for divisível por esses, 
verifique se o número é divisível por 2 e por 3. */
import java.util.Scanner;
public class Ex47_EstCondicional {
	public static void divisiveis() {
		Scanner dado = new Scanner(System.in);
		
		int num;
	
		System.out.print("Divisões!\n");
		System.out.print("Digite um número positivo: ");
		num = dado.nextInt();
		
		if(num % 10 == 0 || num % 5 == 0 || num % 2 == 0) {
			if(num % 10 == 0) {
				System.out.print("É divisivel por 10.\n");
			}
			if(num % 5 == 0) {
				System.out.print("É divisivel por 5.\n");
			}
			if(num % 2 == 0) {
				System.out.print("É divisivel por 2.\n");
			}
		} else {
			if(num % 3 == 0) {
				System.out.print("É divisivel por 3.\n");
			} else {
				System.out.print("Não é divisivel por nenhuma das opções.\n");
			}
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}