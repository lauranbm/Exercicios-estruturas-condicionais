/*O prefeito de Goiânia contratou uma firma especializada para manter os níveis 
de poluição considerados ideais para um país do 1º mundo. As indústrias, 
maiores responsáveis pela poluição, foram classificadas em três grupos. Sabendo-se que 
a escala utilizada varia de 0,5 e que o índice de poluição aceitável é até 0,25, fazer um 
programa que possa imprimir intimações para suspender atividades, de acordo com o 
índice e a tabela a seguir: 
ÍNDICE				GRUPOS QUE RECEBERÃO INTIMAÇÃO 
0,3 					1º grupo 
0,4 					1º e 2º grupos
0,5 					1º, 2º e 3º grupos */
import java.util.Scanner;
public class Ex57_EstCondicional {
	public static void niveisDePoluicao() {
		Scanner dado = new Scanner(System.in);
		
		double indice;
		
		System.out.print("Niveis de poluição de empresas!\n");
		System.out.print("Digite o índice de poluição: ");
        indice = dado.nextDouble();
        
        if (indice >= 0.5) {
            System.out.print("ÍNDICE MUITO ALTO!\n");
            System.out.print("Intimar 1º, 2º e 3º grupos de indústrias.\n");
        } else {
			if (indice >= 0.4) {
				System.out.println("ÍNDICE ALTO!");
				System.out.println("Intimar 1º e 2º grupos de indústrias.");
			} else {
				if (indice >= 0.3) {
					System.out.print("ÍNDICE MODERADO!\n");
					System.out.print("Intimar 1º grupo de indústrias.\n");
				} else {
					if (indice >= 0 && indice <= 0.25) {
						System.out.print("ÍNDICE ACEITÁVEL.\n");
						System.out.print("Nenhuma intimação necessária.\n");
					} else {
						System.out.println("ÍNDICE ENTRE 0,25 E 0,3 - Monitoramento recomendado, sem intimações.");
					}
				}
			}
		}
		System.out.print("\nFIM DE PROGRAMA!!!");
    }
}