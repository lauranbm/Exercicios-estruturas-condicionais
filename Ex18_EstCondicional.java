/*A Companhia de Pulverização Faz Tudo Ltda utiliza aviões para pulverizar lavouras. Os custos de pulverização dependem 
do tipo de praga e da área contratada conforme o esquema: 
- Tipo 1: pulverização contra ervas daninhas, R$ 5,00 por acre; 
- Tipo 2: pulverização contra gafanhotos, R$ 10,00 por acre; 
- Tipo 3: pulverização contra broca, R$ 15,00 por acre; 
- Tipo 4: pulverização contra tudo acima, R$ 25,00 por acre. 
Se a área a ser pulverizada é maior que 300 acres, o fazendeiro recebe um desconto de 5%. Em adição, qualquer fazendeiro
 cujo custo total, sem desconto, ultrapasse R$1.750,00 recebe um desconto de 10% sobre o valor que ultrapassar os R$ 1.750,00. 
Se ambos os descontos se aplicam, aquele relacionado a área é calculado em primeiro lugar. No entanto, se o fazendeiro
 utilizar agrotóxicos, além de não ter descontos, ainda receberá um ônus de 13%. 
Preparar um algoritmo que leia as seguintes informações: - Nome do fazendeiro; - Tipo de pulverização (de 1 a 4);
 - Área a ser pulverizada; - Utiliza agrotóxicos? O algoritmo deve ainda calcular o custo final da pulverização e escrever 
 o nome do fazendeiro e o valor a ser pago.*/
import java.util.Scanner;
public class Ex18_EstCondicional {
	public static void pulverizacao() {
		Scanner dado = new Scanner(System.in);
		
		String nome, agrotoxico;
		int tipo;
		double precoPorAcre = 0f, acres, precoCheio = 0f, desconto1, desconto2, precoFinal;
		
		System.out.print("Companhia de pulverizacao\n");
		System.out.print("Qual o seu nome? ");
		nome = dado.nextLine();
		System.out.println("Qual o tipo de pulverização você precisa? \n- Tipo 1: pulverização contra ervas daninhas.\n- Tipo 2: pulverização contra gafanhotos.\n- Tipo 3: pulverização contra broca.\n- Tipo 4: pulverização contra tudo acima.");
		tipo = dado.nextInt();
		System.out.print("Qual a área a ser pulverizada (em acres)? ");
		acres = dado.nextDouble();
		dado.nextLine();
		System.out.print("Você usa agrotoxico? ");
		agrotoxico = dado.nextLine();
		
		if(tipo < 1 || tipo > 4) {
			System.out.print("Opção inválida!");
		} else {
			if(tipo == 1) {
			precoPorAcre = 5f;
			} else {
				if (tipo == 2) {
					precoPorAcre = 10f;
				} else {
					if(tipo == 3) {
						precoPorAcre = 15f;
					} else { 
						if (tipo == 4) {
							precoPorAcre = 25f;
						}
					}
				}
			}
			precoCheio = acres * precoPorAcre;
			precoFinal = precoCheio;
		}
		
		if(acres > 300f && agrotoxico.trim().toLowerCase().equals("nao")) {
			desconto1 = precoCheio * 5f/100f;
			precoFinal = precoCheio - desconto1;
			if(precoCheio > 1750f) {
				desconto2 = (precoCheio - 1750f) * (10f/100f);
				precoFinal = precoCheio - desconto2;
			} 
		} else {
			if(agrotoxico.trim().toLowerCase().equals("sim")) {
				precoFinal = precoCheio + (precoCheio * 13f/100f);
			} else {
				precoFinal = precoCheio;
			}
		}
		System.out.printf("Sr(a) %s, o valor total do serviço ficará em R$%.2f", nome, precoFinal);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}