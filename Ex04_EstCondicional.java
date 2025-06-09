/*Desenvolver um algoritmo que leia o mês e o ano de uma data e que exiba a 
quantidade de dias que aquele mês possui. Lembre-se que em anos bissextos, o 
mês de fevereiro possui 29 dias. Um ano é bissexto se ele for múltiplo de 4, exceto 
quando ele for múltiplo de 100. Os anos múltiplos de 100 somente são bissextos 
quando são múltiplos de 400, usado a partir de 1752 (por exemplo 1800 não é bissexto, 
mas 2000 é)*/
import java.util.Scanner;
public class Ex04_EstCondicional {
	public static void diasDoMes() {
		Scanner dado = new Scanner (System.in);
		int mes, ano, dias = 0;
		String bissexto = " ";
		
		System.out.print("Número de dias no mês!\n");
		System.out.print("Qual o mês? ");
		mes = dado.nextInt();
		System.out.print("Qual o ano? ");
		ano = dado.nextInt();
		
		if(mes < 1 || mes > 12) {
			System.out.print("Mês invalido!");			
		} else {
			switch (mes){
			case 1: case 3: case 5: case 7: case 9: case 11:
				dias = 31;
			break;
			case 4: case 6: case 8: case 10: case 12:
				dias = 30;
			break;
			case 2: 
				if(ano % 4 == 0) {
					if(ano % 100 == 0) {
						if(ano % 400 == 0) {
							bissexto = "É um ano bissexto! ";
							dias = 29;
						} else {
							bissexto = "Não é um ano bissexto! ";
							dias = 28;
						}
					System.out.print(bissexto);
				break;
					}
				}
			
			}
		System.out.printf("Ele contem %d dias", dias);
		}
		System.out.print("\nFim de programa!");
	}
}