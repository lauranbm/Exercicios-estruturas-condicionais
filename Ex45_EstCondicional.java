/* Faça um programa que receba: 
- O código da região de origem da carga de um caminhão, supondo que a digitação do código da
 região seja sempre válida, ou seja: um número entre 1 e 5 
 - O peso da carga do caminhão em toneladas - O código da carga, supondo que a digitação do
 código seja sempre válida, ou seja, um número inteiro entre 10 e 40.
 Codigo do estado			Imposto					codigo da carga			preço por kg
 1					35%					10 a 20					100
 2					25%					21 a 30					250
 3					15%					31 a 40					340
 4					5%
 5					isento
Calcule e mostre:    
a) O peso da carga do caminhão convertido em quilos 
b) O preço da carga do caminhão 
c) O valor do imposto, sabendo-se que o imposto é cobrado sobre o preço da carga do 
caminhão e dependente da região de origem 
d) O valor total transportado pelo caminhão: preço da carga mais o imposto */
import java.util.Scanner;
public class Ex45_EstCondicional {
	public static void cargaCaminhao() {
		Scanner dado = new Scanner(System.in);
	
		int codigoEst, pesoCarga, codigoCarga, pesoEmKg, imposto;
		double impostoDaCarga = 0f, valorTotal, precoCarga;
	
		System.out.print("Carga de caminhão!\n");
		System.out.print("Digite o código de origem da carga(1 a 5): ");
		codigoEst = dado.nextInt();
		System.out.print("Qual o peso da carga (Em toneladas)? ");
		pesoCarga = dado.nextInt();
		System.out.print("Qual o codigo da carga (10 a 40)? ");
		codigoCarga = dado.nextInt();
		
		pesoEmKg = pesoCarga * 1000;
		
		if(codigoCarga <= 20) {
			precoCarga = pesoEmKg * 100;
		} else if (codigoCarga <= 30) {
			precoCarga = pesoEmKg * 250;
		} else {
			precoCarga = pesoEmKg * 340;
		}
		
		switch (codigoEst) {
			case 1: 
				impostoDaCarga = precoCarga * (35f / 100f);
				break;
			case 2:
				impostoDaCarga = precoCarga * (25f / 100f);
				break;
			case 3:
				impostoDaCarga = precoCarga * (15f / 100f);
				break;
			case 4:
				impostoDaCarga = precoCarga * (05f / 100f);
				break;
			case 5:
				impostoDaCarga = 0f;
				break;
		}
		
		valorTotal = precoCarga + impostoDaCarga;		
		
		System.out.printf("A) O peso da carga do caminhão convertidos em kg é de %d kg\n", pesoEmKg);
		System.out.printf("B) O preço da carga do caminhão é de R$%.2f\n", precoCarga);
		System.out.printf("C) O valor do imposto da carga do caminhão é de R$%.2f.\n", impostoDaCarga);
		System.out.printf("D) O valor total transportado pelo caminhão é de R$%.2f.\n", valorTotal);
	}
}
