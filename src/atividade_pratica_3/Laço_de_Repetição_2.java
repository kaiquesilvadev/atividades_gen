package atividade_pratica_3;

import java.util.Scanner;
public class Laço_de_Repetição_2 {

	public static void main(String[] args) {
		int num1,num2, x;
		
		Scanner leia = new Scanner (System.in);
		System.out.println(" entre com um número");
		num1 = leia.nextInt();
		System.out.println(" entre com outro número ");
		num2 = leia.nextInt();
		for(x = num1; x <= num2; x++ ) {
			if(num1 < num2) {
				if (x % 3 == 0 && x % 5 == 0)
				System.out.println(x+"é multipla de 5 e 3" );}
			 
					
				
 	  }
		 
				System.out.println("opção invalida ");
	}
}
