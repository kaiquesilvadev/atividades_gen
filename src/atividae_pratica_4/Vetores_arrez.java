package atividae_pratica_4;

import java.util.Scanner;

public class Vetores_arrez {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] vetor = new int[10];
		float media;
		int valor = 0, soma = 0, i;

		// entrada de dados

		for (i = 0; i < vetor.length; i++) {
			System.out.println("digite um valor posição " + i);
			vetor[i] = leia.nextInt();
			soma += vetor[i];
		}
		media = soma / vetor.length;

		System.out.println(" valores pares ");
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i] + " ");
			}
		}
		System.out.println("valores impar ");
		for (i = 0; i < vetor.length; i++) {
			if (i % 2 == 1) {
				System.out.println(vetor[i] + " ");
			}
		}

		System.out.println("a soma de todos os números! " + soma);
		System.out.println(" a media de todos os números! " + media);
		leia.close();

	}
}
