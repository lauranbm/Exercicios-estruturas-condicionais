/* Escreva um algoritmo que leia um número e, caso ele seja positivo, imprima seu 
inverso (1/numero). Caso contrário, imprima seu valor absoluto.*/
import java.util.Scanner;
public class Ex28_EstCondicional {
	public static void valorAbsoluto() {
		Scanner dado = new Scanner (System.in);
		
		float num, inverso = 0f, valorAbs;
		
		System.out.print("Valor inverso ou absoluto!\n");
		System.out.print("Digite um número: ");
		num = dado.nextFloat();
	
		if(num < 0) {
			valorAbs = -num;
			System.out.print("O seu valor absoluto é " + valorAbs);
		} else if(num > 0) {
				inverso = 1 / num;
				System.out.printf("O seu inverso é %.4f", inverso);
		}  else {
			System.out.print("Numero zero. Inverso não definido");
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}