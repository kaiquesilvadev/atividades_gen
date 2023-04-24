package atividade_pratica_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class treino_de_atividade_1 {

	/*Escreva um programa Java para criar uma Collection ArrayList de 
	 *Objetos da Classe Wrapper Integer, inicializada com 10 valores
	 *inteiros. O programa deverá solicitar ao usuário, que ele digite 
	 *via teclado 1 número inteiro e caso ele seja encontrado no ArrayList,
	 *exiba na tela a posição deste número na Collection. Caso o número não
	 *seja encontrado, ele deverá exibir na tela a mensagem: O número NN não 
	 *foi encontrado!
*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Integer> numero = new ArrayList<>();
		
		System.out.println("entre com o numero");
		for(int x=0 ; x<10; x++) {
			
			int num=leia.nextInt();
			numero.add(num);
		}
		
		// encontre seu número 
		System.out.println("qual nùmero deseja acha?");
		int num = leia.nextInt();
		
		//se número for diferente de falço faça
		if (numero.contains(num)!=false) {
			System.out.println("O número "+num+" está localizado na posição:"+numero.indexOf(num));
		}else {
			System.out.println("O número "+num+" não foi encontrado!");
		}
		leia.close();
	}
}
