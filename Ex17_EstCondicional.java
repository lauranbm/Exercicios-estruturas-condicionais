/* Desenvolver um algoritmo para calcular e imprimir o preço final de um carro. O 
valor do preço inicial de fábrica é fornecido por um meio de entrada. O usuário 
deve escolher qual adicional vai querer no seu carro e esse preço deve ser adicionado 
ao preço inicial. O carro pode ter os seguintes opcionais: 
(a) Ar Condicionado:   R$ 1750,00 
(b) Pintura Metálica:   R$ 800,00 
(c) Vidro Elétrico:    R$ 1200,00
(d) Direção Hidráulica:  R$ 2000,00 */

import java.util.Scanner;
public class Ex17_EstCondicional {
	public static void precoCarro() {
		Scanner dado = new Scanner (System.in);
		
		double precoFinal = 0.0, precoInicial = 0.0;
		char adicional;
		
		System.out.print("Preço do carro!!\n");
		System.out.print("Qual valor inicial do carro? ");
		precoInicial = dado.nextDouble();
		dado.nextLine();
		System.out.print("Qual adicional você gostaria de colocar? \n (a) Ar condicionado \n (b) Pintura metalica \n (c) Vidro eletrico \n (d) Direcao hidraulica \n");
		adicional = dado.nextLine().toUpperCase().charAt(0);
		
		if(adicional == 'A') {
			precoFinal = precoInicial + 1750.00f;
		} else {
			if(adicional == 'B') {
				precoFinal = precoInicial + 800.00f;
			} else {
				if(adicional == 'C'){
					precoFinal = precoInicial + 1200.00f;
				} else {
					if(adicional == 'D') {
						precoFinal = precoInicial + 2000.00f;
					} 
				}
			}
		}
		System.out.printf("O valor final do carro é de: R$%.2f", precoFinal);
		System.out.print("\nFim de programa!");	
	}
}