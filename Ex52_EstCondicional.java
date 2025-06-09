/*Sabendo que somente os municípios que possuem mais de 20.000 eleitores 
aptos tem o segundo turno nas eleições para prefeito caso o primeiro colocado 
não tenha mais do que 50% dos votos, fazer um algoritmo que leia o nome do 
município, a quantidade de eleitores aptos, o número de votos do candidato mais 
votado e informar se ele terá ou não segundo turno em sua eleição municipal. */
import java.util.Scanner;
public class Ex52_EstCondicional {
	public static void eleitoresAptos() {
		Scanner dado = new Scanner(System.in);
		
		String municipio, status;
		int eleitoresAptos, numVotos;
		double	porcentagemVotos;
		
		System.out.print("Eleição municipal(Segundo turno?)!\n");
		System.out.print("Qual o nome do município? ");
		municipio = dado.nextLine();
		System.out.print("Qual a quantidade de eleitores aptos? ");
		eleitoresAptos = dado.nextInt();
		
		if(eleitoresAptos <= 20000) {
			status = "não terá segundo turno";
		} else {
			System.out.print("Qual a quantidade de votos do candidato mais votado? ");
			numVotos = dado.nextInt();
			porcentagemVotos = (numVotos * 100f) / eleitoresAptos;
			if(porcentagemVotos > 50) {
				status = "não terá segundo turno";
			} else {
				status = "terá segundo turno";
			}
		}
		System.out.printf("O municipio %s %s.", municipio, status);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}