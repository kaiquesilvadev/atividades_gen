package atividade_pratica_3;

/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero
 *  seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos
 *   de 3. Veja o exemplo abaixo:*/

import java.util.Scanner;

public class atividade_10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int  x ,y=0;
		float media = 0, soma=0 ;
		do {
			System.out.println("entre com um valor");
			x = leia.nextInt();
			if( x % 3 == 0 && x !=0) {
		    System.out.println(x+" é multiplode 3 ");
			y++;
			soma += x ;
			media = soma /y ;
			}else {
				System.out.println(x+" não é multiplo de 3 ");
			}
		}while(x != 0);
	System.out.println("a media é :"+media );
	
	}

}
