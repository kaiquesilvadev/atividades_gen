package atividae_pratica_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class atividade_extra_2 {
	
    /*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
     *inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite
     *via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 
     *00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN
     *não foi encontrado!
*/
	
	
	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();
		
		System.out.println("entre com 10 números ");
		for(int x=0; x<10;x++) {
			int num =leia.nextInt();
			numeros.add(num);
		}
	   System.out.println("qual numero deseja procura?");
	   int num1 = leia.nextInt();
	    if(numeros.contains(num1)==true) {
	    	System.out.println("O número "+num1+" foi encontrado!");
	    }else {
	    	System.out.println("O número "+num1+" não foi encontrado!");
	    }
	    
		leia.close();
	}

}
