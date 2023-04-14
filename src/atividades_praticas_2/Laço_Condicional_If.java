package atividades_praticas_2;

import java.util.Scanner;
public class Laço_Condicional_If { 
	/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e
	 *  imprima na tela se a soma de A + B é maior, menor ou igual a C.
*/

	public static void main(String[] args) {
		int a,b,c,total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("entre com o primeiro valor");
		a = leia.nextInt();
		
		System.out.println("entre com o segundo valor");
		b = leia.nextInt();
		
		System.out.println("entre com o terceiro valor");
		c = leia.nextInt();
	if(a+b>c ){
		System.out.println("a soma do primeiro valor e do segundo é maior do que terceiro");
	} 
	else if (a+b<c){
		System.out.println("a soma do primeiro valor e do segundo é menor do que terceiro"); 
	}
	else if(a+b==c){
		System.out.println("a soma do primeiro valor e do segundo é igual a do terceiro");
	}else {
		System.out.println("desculpa os valores estão errados ");
	}
	}

}
