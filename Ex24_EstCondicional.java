/*Escreva um algoritmo que receba três números obrigatoriamente em ordem crescente 
e um quarto número que não siga esta regra. Mostre, em seguida, os quatro números 
em ordem decrescente. */
import java.util.Scanner;
public class Ex24_EstCondicional {
	public static void ordemDecrescente() {
		Scanner dado = new Scanner(System.in);
		
		int num1, num2, num3, num4, a, b, c, d, temp;
		
		System.out.print("Ordem decrescente!\n");
		System.out.print("Digite um número: ");
		num1 = dado.nextInt();
		System.out.print("Digite um número maior que o anterior: ");
		num2 = dado.nextInt();
		System.out.print("Digite outro número maior que o anterior: ");
		num3 = dado.nextInt();
		System.out.print("Digite qualquer número: ");
		num4 = dado.nextInt();
		
		a = num1;
		b = num2;
		c = num3;
		d = num4;
		
		if(a < b) { 
			temp = a; 
			a = b; 
			b = temp; 
		}
		if(a < c) {
			temp = a; 
			a = c; 
			c = temp;
		}
		if(a < d) { 
			temp = a; 
			a = d; 
			d = temp;
		}
		if(b < c) {
			temp = b; 
			b = c; 
			c = temp;
		}
		if (b < d) {
			temp = b; 
			b = d; 
			d = temp;
		}
		if(c < d) { 
			temp = c; 
			c = d; 
			d = temp;
		}
		System.out.print("Ordem decrescente: " + a + " " + b + " " + c + " " + d);
		System.out.print("\nFIM DE PROGRAMA!!!");
    }
}