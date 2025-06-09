/* A biblioteca da PUC te contratou para fazer um programa para controle de 
multas que leia o nome do livro, o tipo de usuário (professor ou aluno), a 
quantidade de dias que o livro está emprestado e possa imprimir um recibo conforme a 
seguir. Considere que o professor possa ficar com o livro por dez dias e o aluno três dias. 
O valor da multa é R$ 1,50 por dia de atraso. 
XXXXXXX P U C XXXXXXXX 
NOME DO LIVRO........: 
TIPO DE USUÁRIO......: 
DIAS EM ATRASO.......: 
VALOR DA MULTA.......: */
import java.util.Scanner;
public class Ex54_EstCondicional {
	public static void bibliotecaPuc() {
		Scanner dado = new Scanner(System.in);
		
		String nomeLivro, tipoUsuario;
		int dias, diasExtras;
		double multa = 0.0;
		
		System.out.print("Multa biblioteca!\n");
		System.out.print("Qual o nome do livro? ");
		nomeLivro = dado.nextLine();
		System.out.print("Usuário (professor ou aluno)? ");
		tipoUsuario = dado.nextLine().toUpperCase();
		System.out.print("Quantos dias você ficou com o livro? ");
		dias = dado.nextInt();
		
		if(tipoUsuario.equals("ALUNO")) {
			diasExtras = dias - 3;
		} else {
			diasExtras = dias - 10;
		}
		
		if(diasExtras > 0) {
			multa = diasExtras * 1.5;
		}
		
		System.out.print("XXXXXXX P U C XXXXXXXX\n");
		System.out.printf("NOME DO LIVRO........: %s\n", nomeLivro);
		System.out.printf("TIPO DE USUÁRIO......: %s\n", tipoUsuario);
		System.out.printf("DIAS EM ATRASO.......: %d\n", diasExtras);
		System.out.printf("VALOR DA MULTA.......: R$%.2f\n", multa);
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}