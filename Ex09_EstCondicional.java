/*Uma locadora de jogos tem as seguintes regras para aluguel: 
- Às segundas, terças e quintas (2,3 e 5): desconto de 40% em relação ao preço normal;   
- Às quartas, sextas, sábados e domingos (4,6 ,7 e 1): preço normal; 
- Aluguel de jogos comuns: preço normal; 
- Aluguel de lançamentos: acréscimo de 15% em relação ao preço normal. 
Desenvolver um programa para ler o preço normal do jogo alugado (em R$), sua 
categoria (comum ou lançamento) e o dia da semana (1 para domingo... 7 para sábado). 
Calcular e imprimir o preço final que será pago pela locação.  */

import java.util.Scanner;
public class Ex09_EstCondicional {
	public static void locacaoDeJogos() {
		Scanner dado = new Scanner (System.in);

		int diaDaSemana;
		float precoNormal, precoFinal = 0; 
		String categoria;

		System.out.print("Locadora de jogos!\n");
		System.out.print("Qual o preco normal do jogo? ");
		precoNormal = dado.nextFloat();
		dado.nextLine();
		System.out.print("É um jogo comum ou lancamento? ");
		categoria = dado.nextLine();
		System.out.print("DIA DA SEMANA\n");
		System.out.print("1 - Domingo\n");
		System.out.print("2 - Segunda\n");
		System.out.print("3 - Terça\n");
		System.out.print("4 - Quarta\n");
		System.out.print("5 - Quinta\n");
		System.out.print("6 - Sexta\n");
		System.out.print("7 - Sabado\n");
		System.out.print("Digite o número correspondente de acordo com o dia de hoje:\n");
		diaDaSemana = dado.nextInt();

		if (!categoria.equals("comum") && !categoria.equals("lancamento")) {
			System.out.print("Categoria invalida!");
		} else {
			if (categoria.equals("comum")) {
				if(diaDaSemana == 4 || diaDaSemana == 6 || diaDaSemana == 7 || diaDaSemana == 1) {
					precoFinal = precoNormal;
				} else {
					precoFinal = precoNormal - (precoNormal * (40.0f/100.0f));
				}
			} else {
				if (categoria.equals("lancamento")){
					if(diaDaSemana == 4 || diaDaSemana == 6 || diaDaSemana == 7 || diaDaSemana == 1) {
						precoFinal = precoNormal + (precoNormal * (15.0f/100.0f));
					} else {
						precoNormal = precoNormal + (precoNormal * (15.0f/100.0f));
						precoFinal = precoNormal - (precoNormal * (40.0f/100.0f));
					}
				}
			} 
		}
	System.out.printf("\nO preço final à ser pago é: R$%.2f", precoFinal);
	System.out.print("\nFim de programa!");
	}
}