/*Números quadrados perfeitos são aqueles cuja raiz quadrada é um número 
inteiro. Exemplo 144. Fazer um algoritmo que dado um número inteiro positivo, 
calcule e escreva se este é ou não quadrado perfeito. */
import java.util.Scanner;
public class Ex06_EstCondicional {
	public static void quadradoPerfeito() {
		Scanner dado = new Scanner(System.in);
		
		int num;
		double raiz;
		
		System.out.print("Quadrado perfeito!\n");
		System.out.print("Digite um número inteiro positivo: ");
		num = dado.nextInt();
		
		raiz = Math.sqrt(num);

		if(raiz == (int) raiz) {
			System.out.print("É um quadrado perfeito!!!");
		} else {
			System.out.print("Não é um quadrado perfeito!");
		}
		System.out.print("\nFim de programa!");
	}
}