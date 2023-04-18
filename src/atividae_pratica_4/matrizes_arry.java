package atividae_pratica_4;

import java.util.Scanner;

/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
  Todos os elementos da Diagonal Principal
  Todos os elementos da Diagonal Secundária
  A Soma de todos os elementos da Diagonal Principal
  A Soma de todos os elementos da Diagonal Secundária
*/

public class matrizes_arry {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int coluna = 0, linha,edp=0,eds=0;
		String  principal ="" ,secundaria = "" ;
		//eds == Elementos da Diagonal secundaria
		//edp == Elementos da Diagonal principal
		
		
		
		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("entre com o valor");
				matriz[linha][coluna] = leia.nextInt();
				if (coluna - linha == 0) {
                  edp+= matriz[linha][coluna];
                  principal += matriz[linha][coluna]+" ";
                  
				}
				if (coluna + linha == 2) {
					eds+= matriz[linha][coluna];
					secundaria += matriz[linha][coluna]+" ";
				}
			}
			
		}
		System.out.println("Elementos da Diagonal Principal:"+principal);
		System.out.println("Elementos da Diagonal Secundária:"+secundaria);
		System.out.println("Soma dos Elementos da Diagonal Principal:"+edp);
		System.out.println("Soma dos Elementos da Diagonal Secundária:"+eds);
		leia.close();
	}

}
