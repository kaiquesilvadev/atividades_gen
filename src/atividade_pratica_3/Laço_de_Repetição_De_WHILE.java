package atividade_pratica_3;
import java.util.Scanner;
public class Laço_de_Repetição_De_WHILE {

	public static void main(String[] args) {
int soma = 0,x,resultado;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("\nEntre com um número :");
			x = leia.nextInt();
			if(x>=1) {
				soma += x;
				
			}
			
		}while(x!= 0);
		System.out.println("A soma dos números positivos é:"+soma);
	}

}
