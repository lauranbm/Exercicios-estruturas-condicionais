/*Escreva um algoritmo que verifique a validade de uma senha fornecida pelo 
usuário. A senha válida é o conjunto de caracteres “RSRSRS”. O algoritmo deve 
imprimir uma mensagem de permissão ou de negação de acesso. Caso a senha esteja 
correta, pergunte o nome e o sexo da pessoa e emita uma mensagem de acordo com
o sexo: "Seja bem vinda, fulana" ou “Seja bem vindo, fulano”.*/
import java.util.Scanner;
public class Ex25_EstCondicional {
	public static void senha() {
		Scanner dado = new Scanner(System.in);
		
		final String senhaCorreta = "RSRSRS";
		String senha = " ", nome = " ";
		char sexo = ' ';
		
		System.out.print("Validação de senha!\n");
		System.out.print("Digite a senha: ");
		senha = dado.nextLine();
		
		if(senha.equals("RSRSRS")) {
			System.out.print("PERMISSÃO CONCEDIDA!!\n");
			System.out.print("Digite seu nome: ");
			nome = dado.nextLine();
			System.out.print("Digite seu sexo (F ou M): ");
			sexo = dado.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			if(sexo == 'F') {
				System.out.printf("Seja bem vinda %s.", nome);
			} else {
				System.out.printf("Seja bem vindo %s.", nome);
			}
		} else {
			System.out.print("ACESSO NEGADO!!");
		}
		System.out.print("\nFIM DE PROGRAMA");	
	}
}