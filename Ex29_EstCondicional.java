/*Escreva um algoritmo para resolver equações do 2º grau: ax2 + bx + c = 0. 
A variável a deve ser diferente de zero.  
 ∆ < 0 → não existe raiz real 
 ∆ = 0 → existe uma raiz real x = -b/(2*a) 
 ∆ > 0 → existem duas raízes reais: x1 = (-b + √∆) / (2*a) e x2 = (-b - √∆) / (2*a) */
import java.util.Scanner;
public class Ex29_EstCondicional {
	public static void eqSegGrau() {
		Scanner dado = new Scanner (System.in);
		float a, b, c;
		double delta, x1, x2;
		
		System.out.print("Equação de segundo grau!\n");
		System.out.print("Qual o valor de A? ");
		a = dado.nextFloat();
		if (a != 0) {
			System.out.print("Qual o valor de B? ");
			b = dado.nextFloat();
			System.out.print("Qual o valor de C? ");
			c = dado.nextFloat();
			delta = (b * b) - 4 * a * c;
		
			if (delta < 0) {
				System.out.print("Não existe raiz!");
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				if(delta == 0) {
					x2 = x1;
				} else {
					x2 = (-b - Math.sqrt(delta))/ (2 * a);
				}
				
				System.out.print("x1 = " + x1 + ", x2 = " + x2);
			}
		} else {
			System.out.println("Não é equação de segundo grau!");
		}
		System.out.println("\nFIM DE PROGRAMA!!!");
	}
}