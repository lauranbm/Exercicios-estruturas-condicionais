/*5 Criar um programa que informe a quantidade de calorias de uma refeição a 
partir da escolha do usuário que deverá informar: o tipo de prato, a sobremesa e 
a bebida (obs: os valores são fictícios) 
	PRATO 						SOBREMESA 						BEBIDA 
Vegetariano (180Kcal) 		Abacaxi (75Kcal) 				Chá (20Kcal) 
Peixe (230Kcal) 			Sorvete (110Kcal) 				Suco de laranja (70Kcal) 
Frango (250Kcal) 			Mousse diet (170Kcal) 			Suco de melão (100Kcal) 
Carne (350Kcal) 			Mousse (200Kcal) 				Refrigerante diet (65Kcal) */
import java.util.Scanner;
public class Ex55_EstCondicional {
	public static void calorias() {
		Scanner dado = new Scanner(System.in);
		
		int refeicao, calorias;		
		
		System.out.print("Escolha qual sua refeição(1 a 4): \n");
		System.out.print("Refeição 1 - Prato: Vegetariano / Sobremesa: Abacaxi / Bebida: Chá\n");
		System.out.print("Refeição 2 - Prato: Peixe / Sobremesa: Sorvete / Bebida: Suco de laranja\n");
		System.out.print("Refeição 3 - Prato: Frango / Sobremesa: Mousse diet / Bebida: Suco de melão\n");
		System.out.print("Refeição 4 - Prato: Carne / Sobremesa: Mousse / Bebida: Refrigerante diet\n");
		refeicao = dado.nextInt();
		
		if(refeicao < 1 || refeicao > 4) {
			System.out.print("Opção inexistente!");
		} else {
			if(refeicao == 1) {
				calorias = 180 + 75 + 20;
			} else if(refeicao == 2) {
				calorias = 230 + 110 + 70;
			} else if(refeicao == 3) {
				calorias = 250 + 170 + 100;
			} else {
				calorias = 350 + 200 + 65;
			}
			System.out.printf("O total de calorias da sua refeição é de: %dKcal", calorias);
		}
		System.out.print("\nFIM DE PROGRAMA");	
	}
}