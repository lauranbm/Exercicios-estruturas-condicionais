/*Fazer um algoritmo que leia os dados de um usuário de telefonia de uma 
empresa de telecomunicações: bairro e número completo do telefone e 
verifique se o número do telefone (Exemplo:32121212) está correto, ou seja, se o 
prefixo (4 primeiros dígitos) é correspondente ao bairro especificado. Sabendo-se que 
os prefixos existem nos bairros conforme a tabela a seguir: 
Bairro				 Prefixos 
Oeste 				3223, 3225, 3212,  
Centro 				3223, 3224, 3212,  
Sul 				3241, 3242, 3243, 3281 
Bueno				3251, 3285 
Campinas 			3233, 3291*/
import java.util.Scanner;
public class Ex12_EstCondicional {
	public static void prefixoBairro() {
		Scanner dado = new Scanner(System.in);
		String bairro, correspondencia = " ";
		int telefone, prefixo = 0;
		
		System.out.print("Prefixo / bairro\n");
		System.out.print("Qual seu bairro(Oeste, centro, sul, bueno ou campinas)? ");
		bairro = dado.nextLine().toUpperCase();
		System.out.print("Qual seu telefone? ");
		telefone = dado.nextInt();
		dado.nextLine();
		
		
		if(!bairro.equals("OESTE") && !bairro.equals("CENTRO") && !bairro.equals("BUENO") && !bairro.equals("CAMPINAS") && !bairro.equals("SUL")) {
			correspondencia = "Bairro inexistente";
		} else if(telefone < 1000000 || telefone > 99999999) {
				correspondencia = "Telefone inválido!";
			} else {	
				prefixo = telefone / 10000;			
				if(bairro.equals("OESTE")) {
					if(prefixo == 3223 || prefixo == 3225 || prefixo == 3212) {
						correspondencia = "É correspondente!";
					} else {
						correspondencia = "Não é correspondente!";
					}
				} else {
					if(bairro.equals("CENTRO")) {
						if(prefixo == 3223 || prefixo == 3224 || prefixo == 3212) {
							correspondencia = "É correspondente!";
						} else {
							correspondencia = "Não é correspondente!";
						}
					} else {
						if(bairro.equals("BUENO")){
							if(prefixo == 3251 || prefixo == 3285){
								correspondencia = "É correspondente!";
							} else {
								correspondencia = "Não é correspondente!";
							}
						} else {
							if(bairro.equals("CAMPINAS")) {
								if(prefixo == 3233 || prefixo == 3291) {
									correspondencia = "É correspondente!";
								} else {
									correspondencia = "Não é correspondente!";
								}
							} else {
								if(bairro.equals("SUL")) {
									if(prefixo == 3241 || prefixo == 3243 || prefixo == 3281) {
										correspondencia = "É correspondente!";
									} else {
										correspondencia = "Não é correspondente!";
									}
								}
							}
						}
					}
				}
			}
		System.out.print(correspondencia);
		System.out.print("\nFim de programa");		
	}
}