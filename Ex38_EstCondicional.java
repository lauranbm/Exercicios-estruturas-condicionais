/* Desenvolver um algoritmo com as opções de calcular e imprimir o volume e a área 
da superfície de um cone reto, um cilindro ou uma esfera. O algoritmo deverá ler a 
opção da figura desejada (cone / cilindro / esfera) e de acordo com a opção 
escolhida calcular o volume e a área da superfície da figura pedida. 
Fórmulas:  
• CONE: Volume = π * Raio² * altura / 3 Área = π * raio * sqrt(Raio² + Altura²) 
• CILINDRO: Volume = π * Raio² * altura Área = 2 * π * raio * altura 
• ESFERA: Volume = 4/3 * π * raio³ Área = 4 * π * raio² */
import java.util.Scanner;
public class Ex38_EstCondicional {
	public static void volumeArea() {
		Scanner dado = new Scanner(System.in);
		
		int num;
		double volume, raio, altura, area;
		final double pi = 3.1415;
		
		System.out.print("Volume da área da superfície!\n");
		System.out.print("Digite o numero correspondente à area que deseja calcular: ");
		System.out.print("\n1 - Cone\n2 - Cilindro\n3 - Esfera\n");
		num = dado.nextInt();
		System.out.print("Qual o raio? ");
		raio = dado.nextDouble();
		System.out.print("Qual a altura? ");
		altura = dado.nextDouble();
		
		
		if(num < 0 || num > 3){
			System.out.print("Opção inválida!");
		} else {
			if(num == 1) {
				volume = pi * Math.pow(raio, 2) * altura / 3;
				area = pi * raio * Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
			} else {
				if(num == 2) {
					volume = pi * Math.pow(raio, 2) * altura;
					area = 2 * pi * raio * altura;
				} else {
					volume = (4f / 3f) * pi * Math.pow(raio, 3);
					area = 4f * pi * Math.pow(raio, 2);
				}
			}
			System.out.printf("O volume é: %.2f, e a área é: %.2f.", volume, area);
		}
		System.out.print("\nFIM DE PROGRAMA!!!");	
	}
}