/*Em 1960, a cidade de Perdiz das Cruzes possuía um único posto telefônico. Por 
este posto eram feitas todas as ligações interurbanas da cidade. O valor a ser 
pago era calculado de acordo com as seguintes regras: - Taxa de R$2,00 pela ligação
 mais R$ 1,00 para os 3 primeiros minutos; - Acima dos três primeiros minutos as regras
 são de R$ 2,15 para cada intervalo de 5 minutos e R$ 0,85 para cada minuto abaixo disto.  
 - A telefonista irá fornecer o nome do usuário e o tempo da ligação em minutos. O 
algoritmo deverá calcular o valor a ser pago e escrever o nome do usuário e o valor da 
conta.*/

import java.util.Scanner;
public class Ex13_EstCondicional {
	public static void postoTelefonico() {
		Scanner dado = new Scanner (System.in);
		
		final double TAXA = 2.00;
		double acrescimo5min = 0, valorAPagar = 0, minutos, acim3min;
		String nome;
		
		System.out.print("Posto telefônico!\n");
		System.out.print("Qual seu nome? ");
		nome = dado.nextLine();
		System.out.print("Qual o tempo da ligação em minutos? ");
		minutos = dado.nextDouble();
		
		if(minutos <= 3){
			valorAPagar = (TAXA + 1.0);	
		} else {
			if(minutos > 3) {
				acrescimo5min = Math.floor(minutos / 5) * 2.15;
				acim3min = acrescimo5min + ((minutos % 5) * 0.85);				
				valorAPagar = TAXA + acim3min;
			}
		}
		System.out.printf("Senhor(a) %s, " + "o total a se pagar na sua ligação é de R$: %.2f", nome, valorAPagar);	
		System.out.print("\nFim de programa!");
	}
}