/*Um comerciante comprou um produto e quer vende-lo com um lucro de 45% se 
o valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. 
Entrar com o valor do produto e imprimir o valor da venda. */
import java.util.Scanner;
public class Ex50_EstCondicional {
	public static void lucroComerciante() {
		Scanner dado = new Scanner(System.in);
		
		double valorProduto, lucro, valorVenda;
		
		System.out.print("Lucro do comerciante!\n");
		System.out.print("Qual o valor do produto? ");
		valorProduto = dado.nextDouble();
		
		if(valorProduto <= 20f) {
			lucro = valorProduto * (30f/100f);
		} else {
			lucro = valorProduto * (45f/100f);
		}
		valorVenda = valorProduto + lucro;
		
		System.out.printf("O valor final do produto é de R$%.2f", valorVenda);
		System.out.print("\nFIM DE PROGRAMA!!!");	
	}
}