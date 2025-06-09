/*A polícia rodoviária resolveu fazer cumprir a lei e cobrar dos motoristas o DUT 
(Documento Único de Transferência). Sabe-se que o mês em que o emplacamento do carro
deve ser renovado é determinado pelo último número da placa do veículo. 
Criar um algoritmo que, a partir da leitura da placa do carro, e a data de hoje, 
informe o mês em que o emplacamento deve ser renovado.  */
import java.util.Scanner;
public class Ex22_EstCondicional {
	public static void emplacamento() {
		Scanner dado = new Scanner(System.in);
		
		int dia, mes, ano, placa, ultimoDigito, d1, d2, d3, resto;
		String emplacamento = " ";
	
		System.out.print("Emplacamento do carro!\n");
		System.out.print("Que dia é hoje? ");
		dia = dado.nextInt();
		System.out.print("Em que mês estamos (em número)? ");
		mes = dado.nextInt();
		System.out.print("Em que ano estamos? ");
		ano = dado.nextInt();
		System.out.print("Digite os 4 digitos numericos da sua placa? ");
		placa = dado.nextInt();
		
		d1 = placa / 1000;
		resto = placa % 1000;
		d2 = resto / 100;
		resto = resto % 100;
		d3 = resto / 10;
		ultimoDigito = resto % 10;
		
		switch(ultimoDigito) {
			case 1: 
				emplacamento = "Março";
				break;
			case 2: 
				emplacamento = "Abril";
				break;
			case 3: 
				emplacamento = "Maio";
				break;
			case 4: 
				emplacamento = "Junho";
				break;
			case 5: 
				emplacamento = "Julho";
				break;
			case 6: 
				emplacamento = "Agosto";
				break;
			case 7: 
				emplacamento = "Setembro";
				break;
			case 8: 
				emplacamento = "Outubro";
				break;
			case 9: 
				emplacamento = "Novembro";
				break;
			case 0: 
				emplacamento = "Dezembro";
				break;			
		}
		System.out.printf("Como o ultimo digito da sua placa é: %d. Seu emplacamento deve ser renovado em %s!", ultimoDigito, emplacamento);
		System.out.print("\nFIM DE PROGRAMA");	
	}
}