/* Faça um programa que determine a data cronologicamente maior entre duas 
datas fornecidas pelo usuário. Cada data deve ser composta por três valores 
inteiros, em que o primeiro representa o dia, o segundo o mês e o terceiro o ano.  
OBS: Não utilize bibliotecas para o tipo “Data”. */
import java.util.Scanner;
public class Ex43_EstCondicional {
	public static void maiorData() {
		Scanner dado = new Scanner(System.in);
		
		String maior;
		int dia1, mes1, ano1, dia2, mes2, ano2; 
	
		System.out.print("Maior entre duas datas!\n");
		System.out.print("Digite o dia da primeira data: ");
		dia1 = dado.nextInt();
		System.out.print("Digite o mês da primeira data: ");
		mes1 = dado.nextInt();
		System.out.print("Digite o ano da primeira data: ");
		ano1 = dado.nextInt();
		System.out.print("-----------------------------------\n");
		System.out.print("Digite o dia da segunda data: ");
		dia2 = dado.nextInt();
		System.out.print("Digite o mês da segunda data: ");
		mes2 = dado.nextInt();
		System.out.print("Digite o ano da segunda data: ");
		ano2 = dado.nextInt();
		
		if(ano1 == ano2 && mes1 == mes2) {
			if(dia2 > dia1) {
				maior = "primeira data";
			} else {
				maior = "segunda data";
			}
		} else {
			if(ano1 == ano2) {
				if(mes2 > mes1) {
					maior = "primeira data";
				} else {
					maior = "segunda data";
				}
			} else {
				if(ano2 > ano1) {
					maior = "primeira data";
				} else {
					maior = "segunda data";
				}
			}
		}
		System.out.printf("Cronologicamente a %s vem antes.", maior);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}