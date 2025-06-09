/*Depois da liberação do governo para as mensalidades dos planos de saúde, as 
pessoas começaram a fazer pesquisas para descobrir um bom plano. Um 
vendedor da Unimed apresentou a tabela a seguir. Criar um programa que entre com o 
nome e a idade de uma pessoa e imprimir o nome e o valor que ela deverá pagar. 
Idade 									Valor (R$) 
Até 10 anos 								30,00 
Acima de 10 até 29 anos 					60,00 
Acima de 29 até 45 anos 					120,00 
Acima de 45 até 59 anos 					150,00 
Acima de 59 até 65 anos 					250,00 
Maior que 65 anos 							400,00*/
import java.util.Scanner;
public class Ex51_EstCondicional {
	public static void planoUnimed() {
		Scanner dado = new Scanner(System.in);
		
		String nome;
		int idade;
		float valor;
		
		System.out.print("Planos de saúde da unimed!\n");
		System.out.print("Digite seu nome: ");
		nome = dado.nextLine();
		System.out.print("Qual a sua idade? ");
		idade = dado.nextInt();
		
		if(idade <= 10) {
			valor = 30f;
		} else if (idade <= 29) {
			valor = 60f;
		} else if (idade <= 45) {
			valor = 120f;
		} else if (idade <= 59) {
			valor = 150f;
		} else if (idade <= 65) {
			valor = 250f;
		} else {
			valor = 400f;
		}
		
		System.out.printf("Sr(a) %s(%d anos), o valor do seu plano de saúde fica em R$%.2f.", nome, idade, valor);
		System.out.print("\nFIM DE PROGRAMA!!!");		
	}
}