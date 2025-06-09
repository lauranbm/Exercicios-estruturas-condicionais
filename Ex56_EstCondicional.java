/*Criar um programa que leia o destino do passageiro, se a viagem inclui retorno 
(ida e volta) e a quantidade de passageiros e informe o valor de cada passagem e 
o valor a pagar 
DESTINO 						IDA					IDA E VOLTA 
Região Norte 					500,00 				900,00 
Região Nordeste 				350,00				650,00 
Região Centro-Oeste 			350,00 				600,00 
Região Sul 						300,00				550,00 */
import java.util.Scanner;
public class Ex56_EstCondicional {
	public static void passagemOnibus() {
		Scanner dado = new Scanner(System.in);
		
		String destino, passagens, ida, idaVolta;
		int qntPassageiros;
		float valorIda, valorVolta, valorPorPassagem, valorTotal;
		
		System.out.print("Valor das passagens de onibus!\n");
		System.out.print("Qual seu destino (Norte, Nordeste, Centro-Oeste ou Sul)? ");
		destino = dado.nextLine().toUpperCase();
		System.out.print("Seu destino inclui a volta? ");
		passagens = dado.nextLine().toUpperCase();
		System.out.print("Quantos passageiros? ");
		qntPassageiros = dado.nextInt();
		
		if(destino.equals("NORTE") && passagens.equals("SIM")) {
			valorPorPassagem = 900f;
			valorTotal = valorPorPassagem * qntPassageiros;
		} else {
			if(destino.equals("NORTE") && passagens.equals("NAO")) {
				valorPorPassagem = 500f;
				valorTotal = valorPorPassagem * qntPassageiros;
			} else {
				if(destino.equals("NORDESTE") && passagens.equals("SIM")) {
					valorPorPassagem = 650f;
					valorTotal = valorPorPassagem * qntPassageiros;
				} else {
					if(destino.equals("NORDESTE") && passagens.equals("NAO")) {
						valorPorPassagem = 350f;
						valorTotal = valorPorPassagem * qntPassageiros;
					} else {
						if(destino.equals("CENTRO-OESTE") && passagens.equals("SIM")) {
							valorPorPassagem = 600f;
							valorTotal = valorPorPassagem * qntPassageiros;
						} else {
							if(destino.equals("NORDESTE") && passagens.equals("NAO")) {
								valorPorPassagem = 350f;
								valorTotal = valorPorPassagem * qntPassageiros;
							} else {
								if(destino.equals("SUL") && passagens.equals("SIM")) {
									valorPorPassagem = 550f;
									valorTotal = valorPorPassagem * qntPassageiros;
								} else {
									valorPorPassagem = 350f;
									valorTotal = valorPorPassagem * qntPassageiros;
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("Cada passageiro deverá pagar R$%.2f, o total de todas as passagens é R$%.2f.", valorPorPassagem, valorTotal);
		System.out.print("\nFIM DE PROGRAMA!!!");		
	}
}