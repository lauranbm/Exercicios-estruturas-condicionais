/*Escreva um programa que calcule o número de notas que deve ser dado de troco para um pagamento efetuado.
O programa deve ler o valor a ser pago e o valor efetivamente pago. Suponha que o troco seja dado em notas
de 50, 20, 10, 5, 2 e 1 real. Mostre apenas as notas que efetivamente serão usadas no troco. */
import java.util.Scanner;
public class Ex35_EstCondicional {
	public static void numeroDeNotas() {
		Scanner dado = new Scanner(System.in);
	
		double valorConta, valorPago, troco, notas50, notas20, notas10, notas5, notas2, notas1;
		
		System.out.print("NÚMERO DE NOTAS!\n");
		System.out.print("Qual o valor da conta a ser paga? ");
		valorConta = dado.nextDouble();
		System.out.print("Qual o valor efetivamente pago? ");
		valorPago = dado.nextDouble();
		
		troco = valorPago - valorConta;
		
		notas50 = (int)(troco / 50);
		troco = troco % 50;
		notas20 = (int)(troco / 20);
		troco = troco % 20;
		notas10 = (int)(troco / 10);
		troco = troco % 10;
		notas5 = (int)(troco / 5);
		troco = troco % 5;
		notas2 = (int)(troco / 2);
		troco = troco % 2;
		notas1 = troco;
		
		System.out.printf("Notas de 50: %.0f, notas de 20: %.0f, notas de 10: %.0f, notas de 5: %.0f, notas de 2: %.0f, notas de 1: %.0f.", notas50, notas20, notas10, notas5, notas2, notas1);
		System.out.print("\nFIM DE PROGRAMA!!!");	
	}
}