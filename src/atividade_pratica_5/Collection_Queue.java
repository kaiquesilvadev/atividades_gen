package atividade_pratica_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collection_Queue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op ;
		Queue<String> cliente = new LinkedList<>();
		
		do {
			System.out.println("\n\s\s\s\sescolha a opção a baixo ");
			System.out.println("\n-------------------------------------");
			System.out.println("1: Adicionar cliente na fila");
			System.out.println("2: Listar todos os clientes");
			System.out.println("3: Retirar cliente da fila");
			System.out.println("0: sair do programa");
			System.out.println("\n-------------------------------------");
			op = leia.nextInt();
			leia.nextLine();
			
			switch(op) {
			case 1:
			
				// Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.

				System.out.println("qual o nome do cliente que deseja adicionar ?");
				String adicionar = leia.nextLine();
				cliente.add(adicionar);
				for(String i :cliente ){
					System.out.println(i);
				}
				break;
			case 2:
				
				//Listar todos os Clientes na fila

				System.out.println("Lista de Clientes na Fila");
				for(String i :cliente ){
					System.out.println(i);
				}
				break;
			case 3:
				//Chamar (retirar) uma pessoa da fila 
				
				if (cliente.isEmpty()== false) {
					System.out.println("O Cliente foi Chamado!"); 
					cliente.remove();
					for(String i :cliente ){
						System.out.println(i);
					}
				 }else {
					 System.out.println("A Fila está vazia!");
				 }
				break;
			default :
				if(op != 0 )
				System.out.println("opção invalida ");
				break;
		}
			//0: O programa deve ser finalizado. 

		}while(op != 0);
		
		
		leia.close();
	}

}
