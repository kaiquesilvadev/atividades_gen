package atividades_praticas_2;

import java.util.Scanner;
public class Laço_Condicional_Switch {
/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item
 *  (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, 
 *  mostre na tela o valor total da conta e o nome do produto que foi comprado.

*/
	public static void main(String[] args) {
		int escolha,quantidade;
		float valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("faça sua escolha, digitando um número \n"
				+ "1 para Cachorro Quente\r\n"
				+ "2 para X-Salada\r\n"
				+ "3 para X-Bacon\r\n"
				+ "4 para Bauru\r\n"
				+ "5 para Refrigerante\r\n"
				+ "6 para suco laranja\r\n"
				+ "\r\n"
				+ "");
		escolha = leia.nextInt();
		
		System.out.println("quantos gostaria de levar ?");
		quantidade = leia.nextInt();
		
		
		switch(escolha) {
		  case 1:
			  valor = quantidade*10.00f; 
			  System.out.println("você comprou "+quantidade+"  Cachorro Quente no valor de R$"+valor);
			  break ;
		  case 2:
			  valor = quantidade*15.00f;
			  System.out.println("você comprou "+quantidade+"  X-Salada no valor de R$"+valor);
			  break ;
		  case 3:
			  valor = quantidade*18.00f;
			  System.out.println("você comprou "+quantidade+"  X-Bacon no valor de R$"+valor);
			  break ;
		  case 4:
			  valor = quantidade*12.00f;
			  System.out.println("você comprou "+quantidade+"  Bauru no valor de R$"+valor);
			  break ;
		  case 5:
			  valor = quantidade*8.00f;
			  System.out.println("você comprou "+quantidade+"  Refrigerante no valor de R$"+valor);
			  break ;
		  case 6:
			  valor = quantidade*13.00f;
			  System.out.println("você comprou "+quantidade+"  suco de laranja no valor de R$"+valor);
			  break ;
			  default :
				  System.out.println("você colocou um valor errado ");
				  
				  break;
		}
		

	}

}
