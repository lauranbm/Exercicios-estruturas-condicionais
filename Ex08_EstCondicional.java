/*Desenvolver um algoritmo para receber uma data e consisti-la. Consistir uma 
data significa verificar se esta é válida. Lembre-se que em anos bissextos, o mês 
de fevereiro possui 29 dias. Um ano é bissexto se ele for múltiplo de 4, exceto quando 
ele for múltiplo de 100. Os anos múltiplos de 100 somente são bissextos quando são 
múltiplos de 400, usado a partir de 1752 (por exemplo 1800 não é bissexto, mas 2000 é)*/
import java.util.Scanner;
public class Ex08_EstCondicional {
    public static void anoBissexto() {
        Scanner dado = new Scanner(System.in);

        int dia, mes, ano, diasMax = 0;
		
		System.out.print("Ano bissexto?\n");
        System.out.print("Digite o dia: ");
        dia = dado.nextInt();
        System.out.print("Digite o mês: ");
        mes = dado.nextInt();
        System.out.print("Digite o ano: ");
        ano = dado.nextInt();

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido!");
        } else {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    diasMax = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    diasMax = 30;
                    break;
                case 2:
                    diasMax = ehBissexto ? 29 : 28;
                    break;
            }

            if (dia < 1 || dia > diasMax) {
                System.out.println("Dia inválido!");
            } else {
                System.out.printf("Data válida! %s\n", ehBissexto ? "Ano bissexto!" : "Ano não bissexto!");
            }
        }
        System.out.println("Fim de programa");
    }
}