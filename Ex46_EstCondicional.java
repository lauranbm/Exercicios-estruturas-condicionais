/*Faça um programa que receba um limite inferior, um limite superior e um 
número qualquer. Inicialmente, seu programa deve reportar que o limite inferior 
deve ser menor que o superior. Se não for, emita uma mensagem. Se for, escreva onde 
esse número se encontra: entre os limites, no limite superior, no limite inferior, antes 
do limite inferior ou depois do limite superior. */
import java.util.Scanner;
public class Ex46_EstCondicional {
	public static void limites() {
		Scanner dado = new Scanner(System.in);
			
		double limiteInferior, limiteSuperior, numero;
		
		System.out.print("Limites!\n");
        System.out.print("Digite o limite inferior: ");
        limiteInferior = dado.nextDouble();
        System.out.print("Digite o limite superior: ");
        limiteSuperior = dado.nextDouble();
        System.out.print("Digite um número: ");
        numero = dado.nextDouble();

        if (limiteInferior >= limiteSuperior) {
            System.out.println("ERRO: O limite inferior deve ser menor que o limite superior.");
        } else {
            if (numero == limiteInferior) {
                System.out.println("O número está no limite inferior.");
			} else {
				if (numero == limiteSuperior) {
					System.out.println("O número está no limite superior.");
				} else {
					if (numero > limiteInferior && numero < limiteSuperior) {
						System.out.println("O número está entre os limites.");
					} else {
						if (numero < limiteInferior) {
							System.out.println("O número está antes do limite inferior.");
						} else {
							System.out.println("O número está depois do limite superior.");
						}
					}
				}
			}
		}
		System.out.print("\nFIM DE PROGRAMA!!!");	
	}
}