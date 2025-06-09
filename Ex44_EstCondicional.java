/*Faça um programa que receba a hora do início e a hora do final de um jogo (cada 
hora é composta por duas variáveis inteiras: hora e minuto). Calcule e mostre a 
duração do jogo (em horas e minutos), sabendo-se que o tempo máximo de duração do 
jogo é de 24 horas e que ele pode iniciar-se em um dia e terminar no dia seguinte. OBS: 
Não utilize bibliotecas para o tipo “Hora”. */
import java.util.Scanner;
public class Ex44_EstCondicional {
	public static void duracaoJogo() {
		Scanner dado = new Scanner(System.in);
		
		int horaInicio, minutosInicio, horaFim, minutosFim, duracaoHoras, duracaoMinutos, inicioEmMinutos, fimEmMinutos, totalMinutos;
		
		System.out.print("Duração do jogo!\n");
		System.out.print("Digite a hora que o jogo iniciou: ");
		horaInicio = dado.nextInt();
		System.out.print("Digite os minutos que o jogo iniciou: ");
		minutosInicio = dado.nextInt();
		System.out.print("Digite a hora que o jogo terminou: ");
		horaFim = dado.nextInt();
		System.out.print("Digite os minutos que o jogo terminou: ");
		minutosFim = dado.nextInt();
	
		if (horaInicio == horaFim && minutosInicio == minutosFim) {
            duracaoHoras = 24;
            duracaoMinutos = 0;
        } else {
            if (horaFim < horaInicio || (horaFim == horaInicio && minutosFim < minutosInicio)) {
                horaFim += 24;
            }
            inicioEmMinutos = horaInicio * 60 + minutosInicio;
            fimEmMinutos = horaFim * 60 + minutosFim;
            totalMinutos = fimEmMinutos - inicioEmMinutos;
            duracaoHoras = totalMinutos / 60;
            duracaoMinutos = totalMinutos % 60;
        }
        System.out.print("\nA duração do jogo foi de " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s).");
		System.out.print("\nFIM DE PROGRAMA!!!");
	}
}