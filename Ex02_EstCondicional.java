/*O número 3025 possui a seguinte característica: 30+25 = 55 e 552 = 3025.  
Fazer um algoritmo que dado um número de 4 dígitos calcule e escreva 
se ele possui ou não esta característica */
import java.util.Scanner;
public class Ex02_EstCondicional{
	public static void numeroMagico() {
		Scanner dado = new Scanner(System.in);
		
		int num = 0, soma, d1, d2, quadrado;
		
		System.out.print("NÚMERO MÁGICO! \n");
		System.out.print("Digite um número de 4 digitos: ");
		num = dado.nextInt();
		
		if ((num < 1000) || (num > 9999)) {
			System.out.print("Número inválido!!!");
		} else {
			d1 = num / 100;
			d2 = num % 100;
			soma = d1 + d2;
			quadrado = soma * soma;
			if (num == quadrado) {
				System.out.print("É um numero mágico!");
			} else {
				System.out.print("Não é um número mágico!");
			}
		}
		System.out.print("\nFim de programa!");
	}
}