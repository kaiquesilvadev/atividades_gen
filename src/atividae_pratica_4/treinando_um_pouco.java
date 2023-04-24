package atividae_pratica_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class treinando_um_pouco {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int op;
		List<String> produtos =new ArrayList<>();
		
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("\s\s\s\s\s\sseja bem vindo");
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
		do {
			System.out.println("\n\t\tMenu Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja visualizar os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa de estoque?");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("qual produto deseja adicionar");
				String produto = leia.next();
				produtos.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println(" qual produto deseja remover ?");
				String produto1 = leia.next();
				if(produtos.contains(produto1)==true) {
					produtos.remove(produto1);
				 }else {
					 System.out.println("produto não encontrado !");
				 }
				break;
			case 3:
				leia.nextLine();
				System.out.println(" qual produto deseja atualizar");
				String retirar =leia.nextLine();
				if(produtos.contains(retirar)==true) {
					produtos.remove(retirar);
				System.out.println("qual o produto que irar adicionar ?");
				String novo= leia.nextLine();
				produtos.add(novo);
				}
				break;
			case 4:
				leia.nextLine();
				for(String x : produtos){
					System.out.println(x);
				}
				break;
			default :
				System.out.println("numero digitado errado");
				break;
			}
			
		}while(op != 0);
		
		leia.close();
	}
}
