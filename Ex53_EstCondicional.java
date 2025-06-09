/*Em um campeonato nacional de LOL, tem-se equipes de três jogadores para 
cada estado. Sabendo-se que os jogadores de uma equipe não obtiveram o 
mesmo número de pontos, criar um programa que informe se uma equipe foi 
classificada, de acordo com a seguinte especificação: - ler os nomes e os pontos obtidos por cada jogador da equipe - mostrar a classificação dos jogadores, com primeiro, segundo e terceiro lugar - se a soma dos pontos for maior do que 100, mostre a média aritmética entre eles; 
senão, imprimir a mensagem: “Equipe Desclassificada”*/
import java.util.Scanner;
public class Ex53_EstCondicional {
	public static void campeonatoLOL() {
		Scanner dado = new Scanner(System.in);
		
		String nome1, nome2, nome3, primeiro, segundo, terceiro;
		int pontos1, pontos2, pontos3, soma;
		double media;
		
		System.out.print("Campeonato de LOL!\n");
		System.out.print("Dados dos jogadores:\nJogador 1\n");
		System.out.print("Nome: ");
		nome1 = dado.nextLine();
		System.out.print("Pontos obtidos: ");
		pontos1 = dado.nextInt();
		dado.nextLine();
		System.out.print("---------------------------------\n");
		System.out.print("Jogador 2\n");
		System.out.print("Nome: ");
		nome2 = dado.nextLine();
		System.out.print("Pontos obtidos: ");
		pontos2 = dado.nextInt();
		dado.nextLine();
		System.out.print("---------------------------------\n");
		System.out.print("Jogador 3\n");
		System.out.print("Nome: ");
		nome3 = dado.nextLine();
		System.out.print("Pontos obtidos: ");
		pontos3 = dado.nextInt();
		System.out.print("---------------------------------\n");
		
		if(pontos1 > pontos2 && pontos1 > pontos3) {
			primeiro = nome1;
			if(pontos2 > pontos3) {
				segundo = nome2;
				terceiro = nome3;
			} else {
				terceiro = nome2;
				segundo = nome3;
			}
		} else {
			if(pontos2 > pontos1 && pontos2 > pontos3) {
				primeiro = nome2;
				if(pontos1 > pontos3) {
					segundo = nome1;
					terceiro = nome3;
				} else {
					segundo = nome3;
					terceiro = nome1;
				}
			} else {
				primeiro = nome3;
				if(pontos1 > pontos2) {
					segundo = nome1;
					terceiro = nome2;
				} else {
					segundo = nome2;
					terceiro = nome1;
				}
			}
		}
		soma = pontos1 + pontos2 + pontos3;
		System.out.printf("Classificação dos jogadores:\n1º - %s\n2º - %s\n3º - %s", primeiro, segundo, terceiro);
		
		if(soma > 100) {
			media = soma / 3.0;
			System.out.printf("\nA média aritmética entre os jogadores foi de: %.2f", media);
		} else {
			System.out.print("\nEquipe desclassificada!!!");
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}