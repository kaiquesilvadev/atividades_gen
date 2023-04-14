package atividade_java;

import java.util.Scanner;

public class main {
public static void main(String args[]){
		
		float salario,abono,novo;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("quanto você ganha ? ");
		salario = leia.nextFloat();
		
		System.out.println("quanto é o abono ? ");
		abono = leia.nextFloat();
		
		novo = salario+abono;
		
		System.out.println("seu novo salario é de "+novo);
	}
}

