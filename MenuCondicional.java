import java.io.IOException;
import java.util.Scanner;
public class MenuCondicional {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner dado = new Scanner(System.in);
		int num;
		do {
			System.out.println();
			new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\n\n><><>< EXERCÍCIOS CONDICIONAIS ><><><\n");
			System.out.println("> Escolha um exercício do 1 ao 58: <");
			num = dado.nextInt();
			switch(num) {
				case 1:
					Ex01_EstCondicional.maiorNumero();
					break;
				case 2:
					Ex02_EstCondicional.numeroMagico();
					break;
				case 3:
					Ex03_EstCondicional.triangulo();
					break;
				case 4:
					Ex04_EstCondicional.diasDoMes();
					break;
				case 5:
					Ex05_EstCondicional.numerosPalindromos();
					break;
				case 6:
					Ex06_EstCondicional.quadradoPerfeito();
					break;
				case 7:
					Ex07_EstCondicional.contaDeAgua();
					break;
				case 8:
					Ex08_EstCondicional.anoBissexto();
					break;
				case 9:
					Ex09_EstCondicional.locacaoDeJogos();
					break;
				case 10:
					Ex10_EstCondicional.combustivel();
					break;
				case 11:
					Ex11_EstCondicional.anoBissexto2();
					break;
				case 12:
					Ex12_EstCondicional.prefixoBairro();
					break;
				case 13:
					Ex13_EstCondicional.postoTelefonico();
					break;
				case 14:
					Ex14_EstCondicional.classeEleitoral();
					break;
				case 15:
					Ex15_EstCondicional.tarifaBancaria();
					break;
				case 16:
					Ex16_EstCondicional.postoCombustivel();
					break;
				case 17:
					Ex17_EstCondicional.precoCarro();
					break;
				case 18:
					Ex18_EstCondicional.pulverizacao();
					break;
				case 19:
					Ex19_EstCondicional.ordemCrescente();
					break;
				case 20:
					Ex20_EstCondicional.dataFormatada();
					break;
				case 21:
					Ex21_EstCondicional.dosagemRemedio();
					break;
				case 22:
					Ex22_EstCondicional.emplacamento();
					break;
				case 23:
					Ex23_EstCondicional.mediaPonderada();
					break;
				case 24:
					Ex24_EstCondicional.ordemDecrescente();
					break;
				case 25:
					Ex25_EstCondicional.senha();
					break;
				case 26:
					Ex26_EstCondicional.classificacaoAco();
					break;
				case 27:
					Ex27_EstCondicional.salarioMinimo();
					break;
				case 28:
					Ex28_EstCondicional.valorAbsoluto();
					break;
				case 29:
					Ex29_EstCondicional.eqSegGrau();
					break;
				case 30:
					Ex30_EstCondicional.deducao();
					break;
				case 31:
					Ex31_EstCondicional.supermercado();
					break;
				case 32:
					Ex32_EstCondicional.multa();
					break;
				case 33:
					Ex33_EstCondicional.classificacaoPessoa();
					break;
				case 34:
					Ex34_EstCondicional.pesoIdeal();
					break;
				case 35:
					Ex35_EstCondicional.numeroDeNotas();
					break;
				case 36:
					Ex36_EstCondicional.imc();
					break;
				case 37:
					Ex37_EstCondicional.categoriaNatacao();
					break;
				case 38:
					Ex38_EstCondicional.volumeArea();
					break;					
				case 39:
					Ex39_EstCondicional.highLow();
					break;
				case 40:
					Ex40_EstCondicional.fazerUmMenu();
					break;
				case 41:
					Ex41_EstCondicional.calculosMatematicos();
					break;
				case 42:
					Ex42_EstCondicional.quadrantesTrigonometria();
					break;
				case 43:
					Ex43_EstCondicional.maiorData();
					break;
				case 44:
					Ex44_EstCondicional.duracaoJogo();
					break;
				case 45:
					Ex45_EstCondicional.cargaCaminhao();
					break;
				case 46:
					Ex46_EstCondicional.limites();
					break;
				case 47:
					Ex47_EstCondicional.divisiveis();
					break;
				case 48:
					Ex48_EstCondicional.linhaDeCredito();
					break;
				case 49:
					Ex49_EstCondicional.centenasMilhares();
					break;
				case 50:
					Ex50_EstCondicional.lucroComerciante();
					break;
				case 51:
					Ex51_EstCondicional.planoUnimed();
					break;
				case 52:
					Ex52_EstCondicional.eleitoresAptos();
					break;
				case 53:
					Ex53_EstCondicional.campeonatoLOL();
					break;
				case 54:
					Ex54_EstCondicional.bibliotecaPuc();
					break;
				case 55:
					Ex55_EstCondicional.calorias();
					break;
				case 56:
					Ex56_EstCondicional.passagemOnibus();
					break;
				case 57:
					Ex57_EstCondicional.niveisDePoluicao();
					break;
				case 58:
					Ex58_EstCondicional.funcaoX();
					break;
				default:
					System.out.println("Opcao Inválida");
			}
		} while (num <= 58);
	}
}