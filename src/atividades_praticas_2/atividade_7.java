package atividades_praticas_2;
/*Escreva um algoritmo em Java, que leia um número inteiro via
 *  teclado e mostre na tela uma mensagem indicando se este 
 *  número é par ou ímpar e se o número é positivo ou negativo.
 *   Veja os exemplos abaixo:*/
import java.util.Scanner;
public class atividade_7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println(" entre com um valor ");
		numero = leia.nextInt();
		
		if(numero %2 == 0) {
			if(numero>0) {
				System.out.println(numero+"  é par e é positivo  ");
			}else if(numero<0){
				System.out.println(numero+"  é par e é negatigo");
			}else {
				 System.out.println(" esse numero é zero ");
			 }
		}else if(numero%2==1){
			if(numero>0){
				System.out.println(numero+"  é impar e é positivo  ");
			  }else if(numero<=-1){
				System.out.println(numero+"  é impar e é negatigo");
			  }else {
				 System.out.println(" esse numero é zero ");
			 }
		    }else {
				System.out.println("seu numero de zero ");
			}

	}

}
