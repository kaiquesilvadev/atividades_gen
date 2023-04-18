package atividae_pratica_4;

import java.util.Scanner;

public class matriz_e_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha, coluna, num;
		float media = 0;
		String[] nome = new String[10];
		
         
		System.out.println("quantos alunos tem na sala ?");
		linha = leia.nextInt();
		
		System.out.println("quantas notas você deseja somar para obter a media ?");
		coluna = leia.nextInt();
		
		float[][] matriz = new float[linha][coluna];
		float[] vetor = new float[linha];
		for (int x = 0; x < matriz.length; x++) {
			System.out.println("qual o primeiro nome do aluno  ?");
			nome[x] = leia.next();
			for (int i = 0; i <matriz.length; i++) {
				
				System.out.println("entre com nota na linha " + x + " da " + i + " coluna ");
				matriz[x][i] = leia.nextFloat();
				
				media = matriz[x][i]/i;
				vetor[x] = media;
				
			}
		}
		for(int x =0 ; x <vetor.length;x++) {
			System.out.println("a meida de "+nome[x]+" é :"+vetor[x]);
		
		}
		leia.close();
	}

}
