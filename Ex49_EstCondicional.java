/*Faça um programa que leia um número de 4 casas e imprima se o número 
formado pelos algarismos que estão na casa das unidades de milhar e das 
centenas é múltiplo de quatro. Antes disso, verifique que o número deve estar entre 
1000 e 9999. */
import java.util.Scanner;
public class Ex49_EstCondicional {
	public static void centenasMilhares() {
		Scanner dado = new Scanner(System.in);
		
		String status;
		int num, centena, milhar, resto, numFinal;
		
		System.out.print("Dezenas e milhares!\n");
		System.out.print("Digite um número de 4 digitos: ");
		num = dado.nextInt();
		
		if(num < 1000 || num > 9999) {
			System.out.print("Número inválido!");
		} else {
			milhar = num / 1000;
			resto = num % 1000;
			centena = resto / 100;
			
			numFinal = milhar * 10 + centena;
			
			if(numFinal % 4 == 0) {
				status = "O número formado pela unidade de milhar e centena É múltiplo de 4.";
			} else {
				status = "O número formado pela unidade de milhar e centena NÃO é múltiplo de 4.";
			}
			System.out.print(status);
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}