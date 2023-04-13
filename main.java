package atividade_java;

import java.util.Scanner;

public class main {
public static void main(String args[]){
		
		double salario,abono,novo;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("quanto você ganha ? ");
		salario = leia.nextDouble();
		
		System.out.println("quanto é o abono ? ");
		abono = leia.nextDouble();
		
		novo = salario+abono;
		
		System.out.println("seu novo salario é de "+novo);
	}
}

