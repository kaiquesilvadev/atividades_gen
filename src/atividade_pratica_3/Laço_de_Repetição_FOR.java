package atividade_pratica_3;

import java.util.Scanner;
public class Laço_de_Repetição_FOR {
/*Escreva um algoritmo em Java, que leia 10 números inteiros 
 * via teclado e mostre na tela quantos números são pares e 
 * quantos número são ímpares. Veja o exemplo abaixo:

*/
	public static void main(String[] args) {
		int num1 = 0,x , total=0 ,total2=0;
	
	    Scanner leia = new Scanner(System.in);
		
	    for(x=1;x<=10;x++) {
	    	System.out.println("entre com um numero ");
	    	num1 = leia.nextInt();
	    	
	    	if(num1%2==0){
	    		total = num1++;
	    	}else {
	    		total2 = num1++;
	    	}
	    	
	    	
	    }
	    System.out.println("soma de números pares "+total);
    	System.out.println("soma de números inpar "+total2);
    
	}

}
