/*Fazer um algoritmo que leia uma data, dia/mes/ano, no formato inteiro e 
escreva a seguinte mensagem: “Goiania, dia de (mês por extenso) de ano. */
import java.util.Scanner;
public class Ex20_EstCondicional {
	public static void dataFormatada() {
		Scanner dado = new Scanner (System.in);
		
		int dia, mes, ano;
		String mesExtenso = "";
		
		System.out.print("Data!!\n");
		System.out.print("Que dia é hoje? ");
		dia = dado.nextInt();
		System.out.print("Em qual mes estamos (em numeros)? ");
		mes = dado.nextInt();
		System.out.print("Em que ano estamos? ");
		ano = dado.nextInt();
		
		switch (mes) {
			case 1:
				mesExtenso = "Janeiro";
			break;
			case 2:
				mesExtenso = "Fevereiro";
			break;
			case 3:
				mesExtenso = "Março";
			break;	
			case 4:
				mesExtenso = "Abril";
			break;
			case 5:
				mesExtenso = "Maio";
			break;
			case 6:
				mesExtenso = "Junho";
			break;
			case 7:
				mesExtenso = "Julho";
			break;
			case 8:
				mesExtenso = "Agosto";
			break;
			case 9:
				mesExtenso = "Setembro";
			break;
			case 10:
				mesExtenso = "Outubro";
			break;
			case 11:
				mesExtenso = "Novembro";
			break;
			case 12:
				mesExtenso = "Dezembro";
			break;
			default:
			System.out.print("Mês inválido!");
		}
		System.out.print("Goiania, dia " + dia + " de " + mesExtenso + " de " + ano);
		System.out.print("\nFim de programa!");
	}
}