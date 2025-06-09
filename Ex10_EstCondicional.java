/*A distribuidora de combustíveis “Shelf” irá aumentar o combustível em função 
da quantidade comprada anualmente por seus clientes. Os postos que 
consomem em média até 50.000 litros de combustível por mês, terão aumento de 20%. 
Os postos que consomem acima desta média, 12% de aumento. A distribuidora irá 
fornecer o nome do posto e seu consumo anual. Calcule e escreva qual será o preço do 
litro de combustível para o posto, considerando-se que hoje a distribuidora cobra 
R$5,40 por litro */

import java.util.Scanner;
public class Ex10_EstCondicional {
	public static void combustivel() {
		Scanner dado = new Scanner(System.in);

		String posto;
		double consumoAnual, consumoMes, aumento, precoNormal, litroFinal;

		System.out.print("Distribuidora de combustíveis!\n");
		System.out.print("Qual o nome do posto? ");
		posto = dado.nextLine();
		System.out.print("Qual consumo anual de gasolina(litros)? ");
		consumoAnual = dado.nextDouble();
		
		consumoMes = consumoAnual / 12.0f;
		precoNormal = consumoMes * 5.4;
		
		if(consumoMes <= 50000) {
			aumento = precoNormal + (precoNormal * (20.0f/100.0f));
			litroFinal = aumento / consumoMes;
		} else {
			aumento = precoNormal + (precoNormal * (12.0f/100.0f));
			litroFinal = aumento / consumoMes;
		}
		System.out.printf("O preço final do litro de gasolina vai ser de: R$%.2f", litroFinal);
		System.out.print("\nFim de programa!");
	}
}