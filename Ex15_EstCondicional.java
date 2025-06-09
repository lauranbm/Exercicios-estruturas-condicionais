/* Criar um algoritmo que leia o nome, a conta e o saldo bancário total do semestre 
de uma pessoa e que calcule a tarifa bancária em que o mesmo se enquadra: 
- Básica (saldo médio mensal inferior a R$ 1.000,00) tarifa de R$ 25,00; 
- Prata (saldo médio mensal entre R$ 1.000,01 e R$ 2.000,00) tarifa de R$ 20,00; 
- Ouro (saldo médio mensal entre R$ 2.000,01 e R$ 3.500,00) tarifa de R$ 13,00; 
- VIP (saldo médio mensal superior a R$ 3.500,00) tarifa isenta.*/

import java.util.Scanner;
public class Ex15_EstCondicional {
	public static void tarifaBancaria() {
		Scanner dado = new Scanner(System.in);
		
		String nome, classConta;
		int conta;
		float saldoSem, saldoMes, tarifa;
		
		System.out.print("Tarifa bancária!\n");
		System.out.print("Qual o seu nome? ");
		nome = dado.nextLine();
		System.out.print("Qual o número da sua conta? ");
		conta = dado.nextInt();
		System.out.print("Qual o saldo bancário total do semestre? ");
		saldoSem = dado.nextFloat();
		
		saldoMes = saldoSem / 6.0f;
	
		if(saldoMes < 1000.01f) {
			tarifa = 25.0f;
			classConta = "Básica";
		} else {
			if(saldoMes <= 2000.00f) {
				tarifa = 20.0f;
				classConta = "Prata";
			} else {
				if(saldoMes <= 3500.00f) {
					tarifa = 13.0f;
					classConta = "Ouro";
				} else {
					tarifa = 0.0f;
					classConta = "VIP";
				}
			}
		}
	System.out.printf("Olá senhor(a) %s, a sua conta é %s e a tarifa é de R$%.2f", nome, classConta, tarifa);
	System.out.print("\nFim de programa!");
	}
}