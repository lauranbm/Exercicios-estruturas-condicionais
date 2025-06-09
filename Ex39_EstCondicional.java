/* Faça um algoritmo para implementar o jogo Hi-Lo. Existe um número de 1 a 100 
que é o segredo. Em seguida, o jogo vai pedir a primeira jogada ao usuário, que 
também deve ser um número entre 1 e 100. Se o número for menor que o segredo, o 
jogo responderá “High”, ou seja: o segredo é maior que a jogada, se for maior que o 
segredo, o jogo responderá “Low”, ou seja: o segredo é menor que a jogada. Em 
seguida, se não tiver acertado, pede mais duas jogadas. Se o usuário acertar o segredo, 
deverá aparecer a mensagem “Você Ganhou com ... pontos”. Se ele acertar na primeira 
jogada, terá 100 pontos. Se acertar na segunda jogada, terá 75 pontos. Se acertar na 
terceira jogada, alcançará 50 pontos.*/
import java.util.Scanner;
public class Ex39_EstCondicional {
	public static void highLow() {
		Scanner dado = new Scanner(System.in);
		
		final int segredo = 68;
		int num, pontos;
		
		System.out.print("HI-LO!!!\n");
		System.out.print("Digite um número de 1 a 100: ");
		num = dado.nextInt();
		
		if(num == segredo) {
			pontos = 100;
			System.out.printf("Você aanhou com %d pontos!", pontos);
		} else {
			if(num < segredo) {
				System.out.print("HIGH");
			} else {
				System.out.print("LOW");
			}
			System.out.print("\nTente de novo: ");
			num = dado.nextInt();
			if(num == segredo) {
			pontos = 75;
			System.out.printf("Você ganhou com %d pontos!", pontos);
			} else {
				if(num < segredo) {
					System.out.print("HIGH");
				} else {
					System.out.print("LOW");
				}
				System.out.print("\nTente de novo: ");
				num = dado.nextInt();
				
				if(num == segredo) {
						pontos = 50;
						System.out.printf("Você ganhou com %d pontos!", pontos);
				} else {
					System.out.println("\nTentativas esgotadas!!!");
				}
			}
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}
