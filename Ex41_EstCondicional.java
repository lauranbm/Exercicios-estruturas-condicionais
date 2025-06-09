/* Escreva um programa que leia valores inteiros em duas variáveis distintas.  
a) Se o resto da divisão da primeira pela segunda for 1 mostre a soma dessas 
variáveis mais o resto da divisão;  
b) Se for 2 escreva se o primeiro e o segundo valor são pares ou ímpares;  
c) Se for igual a 3 multiplique a soma dos valores lidos pelo primeiro;  
d) Se for igual a 4 divida a soma dos números lidos pelo segundo, se este for diferente 
de zero;  
e) Em qualquer outra situação mostre o quadrado dos números lidos. */
import java.util.Scanner;
public class Ex41_EstCondicional {
	public static void calculosMatematicos() {
		Scanner dado = new Scanner (System.in);
		
		double num1, num2, soma, restoDiv, multiplicacao, divisao, raiz1 = 0.0, raiz2 = 0.0;
		final String par = "Par", impar = "Ímpar";
		String parOuImpar1, parOuImpar2;
		
		System.out.print("Cálculos matemáticos!\n");
		System.out.print("Digite o primeiro número: ");
		num1 = dado.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = dado.nextDouble();
		
		if(num1 % num2 == 1) {
			soma = num1 + num2;
			restoDiv = num1 % num2;
			System.out.printf("A - A soma dos dois é: %.2f e o resto da divisão é: %.2f", soma, restoDiv);
		} else {
			if(num1 % num2 == 2) {
				if(num1 % 2 == 0) { 
					parOuImpar1 = par;
				} else {
					parOuImpar1 = impar;
				}
				if(num2 % 2 == 0) {
					parOuImpar2 = par;
				} else {
					parOuImpar2 = impar;
				}
			System.out.printf("B - O primeiro número é : %s e o segundo é: %s", parOuImpar1, parOuImpar2);
			} else {
				if(num1 % num2 == 3) {
					multiplicacao = (num1 + num2) * num1;
					System.out.print("\n C - A soma dos dois, multiplicado pelo numero 1 é: " + multiplicacao);
				} else {
					if(num1 % num2 == 4) {
						if(num2 != 0) {
						divisao = (num1 + num2) / num2;
						System.out.print("\n D - A soma dos dois, dividido pelo segundo é: " + divisao);
						}
					} else {
						raiz1 = Math.sqrt(num1);
						raiz2 = Math.sqrt(num2);
						System.out.printf("E - raiz: %.2f e %.2f", raiz1, raiz2);
					}
				}
				
			}
		}
		System.out.println("\nFIM DE PROGRAMA");
	}
}