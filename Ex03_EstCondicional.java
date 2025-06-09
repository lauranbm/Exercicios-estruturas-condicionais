/* Dado três valores A, B, e C, verifique se eles formam um triângulo. Formando um 
triângulo, dizer se ele é equilátero, isósceles ou escaleno. 
Obs 1) para ser um triângulo, cada lado deve ser menor que a soma dos outros dois. 
Obs 2) equilátero: todos os lados iguais 
Obs 3) isósceles: dois lados iguais 
Obs4) escaleno: todos os lados diferentes */
import java.util.Scanner;
public class Ex03_EstCondicional {
	public static void triangulo() {
		Scanner dado = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Triângulo!\n");
		System.out.print("Digite o valor de A: ");
		a = dado.nextInt();
		System.out.print("Digite o valor de B: ");
		b = dado.nextInt();
		System.out.print("Digite o valor de C: ");
		c = dado.nextInt();
		
		if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
			System.out.print("Não é um triangulo!!");
		} else {
			if ((a == b) && (a == c)) {
				System.out.print("É um triangulo Equilátero!");
			} else {
				if ((a == b) || (a == c) || (b == c)) {
					System.out.print("É um triangulo Isóceles!");
				} else {
					if ((a != b) || (a != c) || (b != c)) {
						System.out.print("É um triangulo Escaleno!");
					}
				}
			}
		}
		System.out.print("\nFim de programa!");
	}
}