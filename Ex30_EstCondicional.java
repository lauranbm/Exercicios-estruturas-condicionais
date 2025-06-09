/*Deduza o que ficará armazenado nas variáveis do trecho de algoritmo a seguir, 
sabendo que as variáveis armazenam valores do tipo inteiro.  
if (a > b) { 
aux = a 
a = b 
b = aux 
} 
se (a > c) { 
aux = a 
a = c 
c = aux 
} 
se (b > c) { 
aux = b 
b = c 
c = aux 
}*/
import java.util.Scanner;
public class Ex30_EstCondicional {
	public static void deducao() {
		Scanner dado = new Scanner(System.in);
		
		int a, b, c, aux;
		
		System.out.print("Dedução do que sai do trecho do código!\n");
		System.out.print("Digite o valor de A: ");
		a = dado.nextInt();
		System.out.print("Digite o valor de B: ");
		b = dado.nextInt();
		System.out.print("Digite o valor de C: ");
		c = dado.nextInt();
		
		
		if (a > b) { 
			aux = a;
			a = b; 
			b = aux; 
		} 
		if (a > c) { 
			aux = a; 
			a = c; 
			c = aux;
		} 
		if (b > c) { 
			aux = b; 
			b = c; 
			c = aux; 
		} 
	System.out.print(a + " " + b + " " + c);
	System.out.print("\nA saída de dados é a ordem crescente dos valores inseridos!");
	System.out.print("\nFIM DE PROGRAMA!!!");
	}
}