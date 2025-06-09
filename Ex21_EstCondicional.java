/*Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem 
de determinado medicamento e imprima a receita informando quantas gotas do 
medicamento o paciente deve tomar por dose. Considere que o medicamento em 
questão possui 500 mg por ml, e que cada ml corresponde a 20 gotas. 
Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 
quilos devem tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg. 
Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso 
corpóreo conforme a tabela a seguir:
Peso 				dosagem 
5 kg a 9 kg 		125 mg 
9.1 kg a 16 kg 		250 mg 
16.1 kg a 24 kg 	375 mg 
24.1 kg a 30 kg 	500 mg 
acima de 30 kg 		750 mg */
import java.util.Scanner;
public class Ex21_EstCondicional {
	public static void dosagemRemedio() {
		Scanner dado = new Scanner(System.in);
		int idade; 
		int gotas, dosagem = 0, ml;
		float peso;
	
		System.out.print("Dose de medicação!\n");
		System.out.print("Qual sua idade? ");
		idade = dado.nextInt();
		System.out.print("Qual seu peso? ");
		peso = dado.nextFloat();
		
		if(idade >= 12) {
			if(peso >= 60) {
				dosagem = 1000;
			} else {
				dosagem = 875;
			}
		} else {		
			if(idade < 12) {
				if(peso >= 5 && peso <= 9){
					dosagem = 125;
				} else {
					if(peso <= 16) {
						dosagem = 250;
					} else {
						if(peso <= 24) {
							dosagem = 375;
						} else {
							if(peso <= 30) {
								dosagem = 500;
							} else {
								dosagem = 750;
							}
						}
					}
				}
			}
		}
		ml = dosagem / 500;
		gotas = 20 * ml;
		System.out.printf("Você precisa tomar %d mg, o que corresponde a %d gotas", dosagem, gotas);
		System.out.print("\nFim de programa!");
	}
}