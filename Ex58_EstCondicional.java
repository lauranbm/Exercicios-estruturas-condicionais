/* Faça um programa que leia o valor de x e imprima o valor de y = f(x): 
1, se x <= 1 
2, se 1 < x <= 2 
x2, se 2 < x < 3 
X3, se x > 3 */
import java.util.Scanner;
public class Ex58_EstCondicional {
	public static void funcaoX() {
		Scanner dado = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Função de x!\n");
		System.out.print("Digite o valor de x: ");
        x = dado.nextDouble();
		
		if (x <= 1) {
            y = 1;
        } else {
			if (x <= 2) {
				y = 2;
			} else {
				if (x < 3) {
					y = Math.pow(x, 2);
				} else {
					y = Math.pow(x, 3); 
				}
			}
        }
		System.out.printf("O valor de y é: %.2f", y);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}