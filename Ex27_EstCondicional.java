/*Escreva um algoritmo que receba o valor do salário mínimo, o número de horas trabalhadas,
o número de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule
e mostre o salário do funcionário de acordo com as regras a seguir: 
- O valor da hora trabalhada é igual a 1/5 do salário mínimo; 
- O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada; 
- Para cada dependente acrescentar R$ 32,00;
- Para cada hora extra trabalhada, calcular
 o valor da hora trabalhada acrescida de 50%; 
- O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das 
horas extras; 
- Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir: 
IRRF 				Salário bruto 
Isento 			Inferior a R$ 2000,00 
10% 			De R$ 2000,00 até R$ 5000,00 
20% 			Superior a R$ 5000,00 
 - O salário líquido é igual ao salário bruto menos IRRF; - A gratificação segue a tabela a seguir: 
Salário Líquido 			Gratificação 
Até R$ 3500,00				 R$ 100,00 
Superior a R$ 3500,00 		 R$ 50,00
 - O salário do funcionário é igual ao salário líquido mais gratificação.*/
import java.util.Scanner;
public class Ex27_EstCondicional {
	public static void salarioMinimo() {
		Scanner dado = new Scanner(System.in);
		
		double salarioMinimo, valorHora, salarioMes, acrescimoDependente, totalHoraExtra, salarioBruto, imposto = 0f, salarioLiquido, gratificacao = 0, salarioFinal;
		int dependentes, horasTrabalhadas, horasExtras = 0;
		
		System.out.print("Salário do funcionário!\n");
		System.out.print("Qual o valor do salário mínimo? ");
		salarioMinimo = dado.nextDouble();
		System.out.print("Quantas horas você trabalhou? ");
		horasTrabalhadas = dado.nextInt();
		System.out.print("Quantos dependentes você tem? ");
		dependentes = dado.nextInt();
		System.out.print("Quantas horas extras você fez? ");
		horasExtras = dado.nextInt();
		
		valorHora = salarioMinimo / 5f;
		salarioMes = horasTrabalhadas * valorHora;
		acrescimoDependente = dependentes * 32f;
		totalHoraExtra = horasExtras * (valorHora * (150f/100f));
		salarioBruto = salarioMes + acrescimoDependente + totalHoraExtra;
		if(salarioBruto < 2000f) {
			imposto = 0f;
		} else {
			if(salarioBruto <= 5000f) {
				imposto = salarioBruto * (10f/100f);
			} else {
				if(salarioBruto > 5000f) {
					imposto = salarioBruto * (20f/100f);
				}
			}
		}
		salarioLiquido = salarioBruto - imposto;
		if(salarioLiquido <= 3500f) {
			gratificacao = 100f;
		} else {
			if(salarioLiquido > 3500f) {
				gratificacao = 50f;
			}
		}
		salarioFinal = salarioLiquido + gratificacao;
		System.out.printf("Salario do funcionário: %.2f.", salarioFinal);
		System.out.print("\nFIM DE PROGRAMA!!!");		
	}
}