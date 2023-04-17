
package atividades_praticas_2;

import java.util.Scanner;

public class atividade_8 {

	public static void main(String[] args) {
		float salario, novoSalario, reajuste;
		String nome;
		int cargo;
		 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual seu nome ?");
		nome = leia.nextLine();
		
		System.out.println("eu gostaria de saber qual o seu cargo ? \ndigite o numero corespondente a ele por favor ");
		System.out.println("1 gerente");
		System.out.println("2 vendedor");
		System.out.println("3 supervisor");
		System.out.println("4 motorista");
		System.out.println("5 estoquista");
		System.out.println("6 técnico de TI");
		cargo = leia.nextInt();
		
		System.out.println("quanto você ganha ?");
		salario = leia.nextFloat();
		
		leia.close();
		switch (cargo) {
		case 1:
			reajuste = 10* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+" \ne agora é R$"+novoSalario+ "\n com um reajudte de "+reajuste);
			break;
		case 2:
			reajuste = 7* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+" \ne agora é R$"+novoSalario+ " \ncom um reajudte de "+reajuste);
			break;
		case 3:
			reajuste = 9* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+"\ne agora é R$"+novoSalario+ "\n com um reajudte de "+reajuste);
			break;
		
		case 4:
			reajuste = 6* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+"\n e agora é R$"+novoSalario+ " \ncom um reajudte de "+reajuste);
			break;
		case 5:
			reajuste = 5* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+"\n e agora é R$"+novoSalario+ " \ncom um reajudte de "+reajuste);
			break;
		case 6:
			reajuste = 8* salario / 100 ;
			novoSalario=salario+reajuste;
			System.out.println(" olar "+nome+" seu salario era de R$"+salario+"\n e agora é R$"+novoSalario+ "\n com um reajudte de "+reajuste);
			break;
		}
		
	}

}
