/*Escreva um algoritmo que receba a altura e o sexo de uma pessoa, calcule e 
mostre o seu peso ideal, usando as seguintes fórmulas: 
para homens: (72,7 * h) – 58; 
para mulheres: (62,1 * h) – 44,7. */
import java.util.Scanner;
public class Ex34_EstCondicional {
	public static void pesoIdeal() {
		Scanner dado = new Scanner(System.in);
		
		double altura, pesoIdeal;
		char sexo;
	
		System.out.print("PESO IDEAL!\n");
		System.out.print("Digite sua altura: ");
		altura = dado.nextDouble();
		System.out.print("Digite seu gênero (F ou M): ");
		sexo = dado.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
		
		if(sexo == 'F') {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			pesoIdeal = (72.7 * altura) - 58f;
		}
	
		System.out.printf("Seu peso ideal é de: %.2f", pesoIdeal);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}