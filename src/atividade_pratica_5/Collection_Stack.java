package atividade_pratica_5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Collection_Stack {
	
	/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String,
	 *para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as
	 *opções 0, 1, 2 e 3:*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op ;
		Stack<String> livros = new Stack<>();
		
		do {
			System.out.println("\n\s\s\s\sescolha a opção a baixo ");
			System.out.println("\n-------------------------------------");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da Pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: O programa deve ser finalizado");
			System.out.println("\n-------------------------------------");
			op = leia.nextInt();
			leia.nextLine();
			switch(op) {
				case 1:
					System.out.println("qual o nome do livra que deseja adicionar ?");
					String adicionar = leia.nextLine();
					livros.push(adicionar);
					for(String i :livros ){
						System.out.println(i);
					}
					break;
				case 2:
					System.out.println("lista de todos livros da blibioteca");
					for(String i :livros ){
						System.out.println(i);
					}
					break;
				case 3:
					if (livros.isEmpty()== false) {
						System.out.println("o ultimo livro foi retirado "); 
						livros.pop();
						for(String i :livros ){
							System.out.println(i);
						}
					 }else {
						 System.out.println("A Pilha está vazia!");
					 }
					break;
				default :
					if(op != 0 )
					System.out.println("opção invalida ");
					break;
			}
		}while(op != 0);
		System.out.println("\n-------------------------------------");
		System.out.println("\s\s\s\sbiblioteca encerrada ");
		System.out.println("\n-------------------------------------");
		leia.close();

	}

}
