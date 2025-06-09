/*Um certo aço é classificado de acordo com o resultado de três testes abaixo, que 
devem determinar se o mesmo satisfaz as especificações:  
1. Conteúdo de Carbono abaixo de 7%;  
2. Dureza Rockwell maior do que 50%;  
3. Resistência á tração maior do que 80.000 psi;  
Ao aço é atribuído o grau “10” se passar por todos os testes; grau “9” se passar somente 
nos testes 1 e 2; grau “8” se passar no teste 1; grau “7” se não passar em nenhum dos 
testes.  
Desenvolver um algoritmo/programa que leia o conteúdo do carbono (CC), a dureza 
Rockwell (DR) e a resistência à tração (RT) e forneça a classificação do aço.*/
import java.util.Scanner;
public class Ex26_EstCondicional {
	public static void classificacaoAco() {
		Scanner dado = new Scanner(System.in);
		
		int carbono, dureza, tracao; 
		String grau;
		
		System.out.print("Classificação de carbono!\n");
		System.out.print("Qual o conteúdo de carbono (em porcentagem) ? ");
		carbono = dado.nextInt();		
		System.out.print("Qual a dureza Rockwell(DR) (em porcentagem) ? ");
		dureza = dado.nextInt();
		System.out.print("Qual a resistência à tração?? ");
		tracao = dado.nextInt();
		
		if(carbono <= 7 && dureza >= 50 && tracao >= 80000) {
			grau = "10";
		} else {
			if(carbono <= 7 && dureza >= 50) {
				grau = "8";
			} else {
				if(carbono > 7 && dureza < 50 && tracao < 80000) {
					grau = "7";
				} else {
					grau = "Sem classificação";
				}
			}
		}
		System.out.printf("Classificação do aço: %s", grau);
		System.out.print("\nFIM DE PROGRAMA!!");
	}
}