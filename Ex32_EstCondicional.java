/*Faça um algoritmo que leia a velocidade máxima em uma avenida e a velocidade 
com que o motorista estava dirigindo nela e calcule a multa que uma pessoa vai 
receber, considerando que são pagos 5 reais por cada Km/h que estiver acima da 
velocidade permitida. */
import java.util.Scanner;
public class Ex32_EstCondicional {
	public static void multa() {
		Scanner dado = new Scanner(System.in);
		
		int velocidadeMax, velocidadeCarro, diferenca;
		float multa;
		
		System.out.print("MULTA POR EXCESSO DE VELOCIDADE!\n");
		System.out.print("Qual a velocidade máxima permitida da via? ");
		velocidadeMax = dado.nextInt();
		System.out.print("Qual a velocidade que o condutor estava dirigindo? ");
		velocidadeCarro = dado.nextInt();
		
		diferenca = velocidadeCarro - velocidadeMax;
		multa = diferenca * 5.0f;
		
		System.out.printf("A multa será de: %.2f", multa);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}