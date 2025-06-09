/*A prefeitura de Goiânia abriu uma linha de crédito para os funcionários 
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do 
salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da 
prestação e informar se o empréstimo pode ou não ser concedido. */
import java.util.Scanner;
public class Ex48_EstCondicional {
	public static void linhaDeCredito() {
		Scanner dado = new Scanner(System.in);
		
		String status;
		double salarioBruto, prestacao, prestacaoMax;
		
		System.out.print("Linha de crédito!\n");
		System.out.print("Qual o valor do seu salário bruto? ");
		salarioBruto = dado.nextDouble();
		System.out.print("Qual o valor que deseja pagar por prestação? ");
		prestacao = dado.nextDouble();
		
		prestacaoMax = salarioBruto * (30f/100f);
		
		if(prestacao > prestacaoMax) {
			status = "Emprestimo negado!";
		} else {
			status = "Empréstimo aceito";
		} 
		
		System.out.print(status);		
		System.out.print("\nFIM DE PROGRAMA!!!");	
	}
}