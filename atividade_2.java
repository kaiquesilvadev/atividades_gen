package atividade_java;

import java.util.Scanner;
public class atividade_2 {
	public static void main(String args[]) {
		
		/*Elabore um algoritmo em Java que leia 4 notas de um participante,
		 *  em variáveis do tipo float e exiba na tela a média final do 
		 *  participante. Veja o exemplo abaixo:*/
		
		
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" entre com a primeira nota ");
		nota1 = leia.nextFloat();
		
		System.out.println("entre com a segunda nota ");
		nota2 = leia.nextFloat();
		
		System.out.println("entre com a terceira nota ");
		nota3 = leia.nextFloat();
		
		System.out.println("entre com a quarta nota ");
		nota4 = leia.nextFloat();
		
		media = (nota1 = nota2 + nota3 + nota4)/3;
		
		
		System.out.println("sua media é "+media);
		
		
				
	}

}
