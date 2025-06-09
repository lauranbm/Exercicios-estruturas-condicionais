/*Fazer um algoritmo que leia três números inteiros quaisquer e os ordene de 
forma crescente. */

import java.util.Scanner;
public class Ex19_EstCondicional {
	public static void ordemCrescente() {
		Scanner dado = new Scanner(System.in);
		
		int a, b, c, menor = 0, meio = 0, maior = 0;
		
		System.out.print("Ordem crescente!!\n");
		System.out.print("Digite o primeiro número: ");
		a = dado.nextInt();
		System.out.print("Digite o segundo número: ");
		b = dado.nextInt();
		System.out.print("Digite o terceiro número: ");
		c = dado.nextInt();
		
		if((a > b) && (a > c)){
			maior = a;
			if(b > c){
				meio = b;
				menor = c;
			} else {
				meio = c;
				menor = b;
			}
		} else if ((b > a) && (b > c)) {
			maior = b;
			if(a > c){
				meio = a;
				menor = c;
			} else {
				meio = c;
				menor = a;
			}
		} else {
			if((c > a) && (c > b)){
				maior = c;
				if(a > b){
					meio = a;
					menor = b;
				} else {
					meio = b;
					menor = a;
				}
			}
		}
	System.out.printf("A ordem crescente é:" + menor + "," + meio + "," + maior);
	System.out.print("\nFim de programa!");
	}
}