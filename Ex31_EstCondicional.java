/*Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério:
o produto poderá ter seu preço aumentado ou diminuído. Para alterar o preço, o produto 
deve preencher pelo menos um dos requisitos a seguir: 
Requisitos 									Reajustes 
Venda Média Mensal 			Preço Atual 			% de Aumento	 % de Diminuição 
< 500 					< R$ 30,00 						10 					- 
>= 500 e < 1200			>= R$ 30,00 e < R$ 60,00 		15					- 
>= 1200 				>= R$ 80,00						-					20 
Faça um algoritmo que receba o preço atual e a venda mensal média do produto, 
calcule e mostre o novo preço.*/
import java.util.Scanner;
public class Ex31_EstCondicional {
	public static void supermercado() {
		Scanner dado = new Scanner(System.in);
		
		double precoAtual, vendaMensalMedia, precoNovo = 0f;
		
		System.out.print("AJUSTE DOS PREÇOS!!\n");
		System.out.print("Qual o preço atual do produto? ");
		precoAtual = dado.nextDouble();
		System.out.print("Qual a venda mensal média do produto? ");
		vendaMensalMedia = dado.nextDouble();
		
		if(vendaMensalMedia < 500f && precoAtual < 30f) {
			precoNovo = precoAtual + (precoAtual * (10.0/100.0));
		} else {
			if(vendaMensalMedia < 1200f && precoAtual < 60f) {
				precoNovo = precoAtual + (precoAtual * (15.0/100.0));
			} else {
				if(vendaMensalMedia >= 1200 && precoAtual >= 80) {
					precoNovo = precoAtual - (precoAtual * (20.0/100.0));
				} else {
					precoNovo = precoAtual;
				}
			}
		}
		System.out.printf("O novo preço do produto é R$%.2f", precoNovo);
		System.out.print("\nFIM DE PROGRAMA");
	}
}