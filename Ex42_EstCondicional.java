/*Escreva um algoritmo que receba a medida de um ângulo em graus (número inteiro). 
Calcule e mostre o quadrante em que se localiza esse ângulo. Considere os quadrantes
 da trigonometria e para ângulos maiores que 360º ou menores que 360º, reduzi-los,
mostrando também o número de voltas e o sentido da volta (horário ou anti-horário). */
import java.util.Scanner;
public class Ex42_EstCondicional {
	public static void quadrantesTrigonometria() {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Esse exercício não é de Deus!\nDesculpe, mas ele foi feito pelo chatGpt! kkk\n");
		System.out.print("Quadrantes de um triângulo!\n");
		int angulo, anguloReducao, voltas;
        String sentido = "";

        System.out.print("Digite o ângulo (em graus): ");
        angulo = dado.nextInt();

        // Definindo o sentido e reduzindo o ângulo
        if (angulo >= 0) {
            sentido = "horário";
            voltas = angulo / 360;
            anguloReducao = angulo % 360;
        } else {
            sentido = "anti-horário";
            voltas = (-angulo) / 360;
            anguloReducao = 360 - ((-angulo) % 360);
            if (anguloReducao == 360) {
                anguloReducao = 0;
            }
        }

        // Mostrando o número de voltas e sentido
        System.out.println("Número de voltas completas: " + voltas);
        System.out.println("Sentido: " + sentido);

        // Agora determinamos o quadrante
        if (anguloReducao == 0 || anguloReducao == 360) {
            System.out.println("O ângulo está sobre o eixo positivo (0° ou 360°).");
        } else {
            if (anguloReducao > 0 && anguloReducao < 90) {
                System.out.println("O ângulo está no 1º quadrante.");
            } else {
                if (anguloReducao == 90) {
                    System.out.println("O ângulo está sobre o eixo (90°).");
                } else {
                    if (anguloReducao > 90 && anguloReducao < 180) {
                        System.out.println("O ângulo está no 2º quadrante.");
                    } else {
                        if (anguloReducao == 180) {
                            System.out.println("O ângulo está sobre o eixo (180°).");
                        } else {
                            if (anguloReducao > 180 && anguloReducao < 270) {
                                System.out.println("O ângulo está no 3º quadrante.");
                            } else {
                                if (anguloReducao == 270) {
                                    System.out.println("O ângulo está sobre o eixo (270°).");
                                } else {
                                    if (anguloReducao > 270 && anguloReducao < 360) {
                                        System.out.println("O ângulo está no 4º quadrante.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\nFIM DE PROGRAMA!!!");		
	}
}