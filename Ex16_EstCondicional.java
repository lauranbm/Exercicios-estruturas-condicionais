/* Um posto de combustível vende três tipos de combustível : álcool, diesel e 
gasolina. O preço por litro de combustível é apresentado na tabela a seguir. Faça 
um algoritmo que leia um caractere que representa o tipo de combustível comprado (A, 
D ou G) e a quantidade em litros. O programa deve imprimir o valor em reais a ser pago 
pelo combustível.  
Combustível       Preço por Litro:
A – Álcool 		  R$ 4,644 
D – Diesel 		  R$ 4,784 
G – Gasolina 	  R$ 6,328 */

import java.util.Scanner;
public class Ex16_EstCondicional {
	public static void postoCombustivel() {
		Scanner dado = new Scanner (System.in);
		
		int litros;
		double precoTotal;
		char tipo;
		
		System.out.print("Posto de combustível!\n");
		System.out.print("Qual combustivel foi comprado? \n A = Álcool\n D = Diesel\n G = Gasolina\n");
		tipo = dado.nextLine().toUpperCase().charAt(0);
		System.out.print("Quantos litros foi comprado? ");
		litros = dado.nextInt();
		
		if(tipo == 'A') {
			precoTotal = litros * 4.644;
		} else {
			if(tipo == 'D') {
				precoTotal = litros * 4.784;
			} else {
				precoTotal = litros * 6.328;
			}
		}
		System.out.printf("O valor total a pagar é de R$%.2f", precoTotal);
		System.out.print("\nFim de programa!");
	}
}