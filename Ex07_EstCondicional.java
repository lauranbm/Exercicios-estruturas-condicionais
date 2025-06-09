/* Calcule a conta de água para a SANEAGO. O custo da água varia dependendo do 
tipo do consumidor - residencial, comercial ou industrial. A regra para calcular a 
conta é: 
 Residencial: R$ 5,00 de taxa mais R$ 0,05 por m3 gastos; 
 Comercial: R$ 500,00 para os primeiros 80m3 gastos mais R$ 0,25 por m3 gastos 
acima dos 80 m3; 
 Industrial: R$ 800,00 para os primeiros 100m3 gastos mais R$ 0,04 por m3 gastos 
acima dos 100 m3; 
O algoritmo deverá ler a conta do cliente, seu tipo (residencial, comercial ou industrial) 
e o seu consumo de água em metros cúbicos. Como resultado imprimir a conta do 
cliente e o valor em real a ser pago por ele. */

import java.util.Scanner;
public class Ex07_EstCondicional {
public static void contaDeAgua() {
	Scanner dado = new Scanner (System.in);
	
	double conta = 0, consumo;
	int tipo;
	
	System.out.print("Conta de água!\n");
	System.out.print("Qual tipo de consumidor você é? \nDigite 1 para RESIDENCIAL\nDigite 2 para COMERCIAL\nDigite 3 para INDUSTRIAL\n");
	tipo = dado.nextInt();
	System.out.print("Qual foi o valor do seu consumo em metros cúbicos? ");
	consumo = dado.nextDouble();
	
		if((tipo < 1) || (tipo > 3)) {
			System.out.print("Consumidor inválido!");
		} else {
			switch (tipo) {
				case 1:
					conta = 5.0 + (0.05 * consumo);
				break;
				case 2:
					if (consumo <= 80) {
						conta = 500.0;
					} else {
						conta = 500.0 + (0.25 * (consumo - 80));
					}
				break;
				case 3:
					if (consumo <= 100) {
						conta = 800.0;
					} else {
						conta = 800.0 + (0.04 *(consumo - 100));
					}
				break;
			}
			System.out.printf("O valor da sua conta é de: R$%.2f", conta);
		}
		System.out.print("\nFim de programa!");
	}
}