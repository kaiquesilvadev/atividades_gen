package atividade_java;
 

import java.util.Scanner;
public class atividade_3 {
	public static void main(String args[]) {
		/*Elabore um algoritmo em Java, que leia o Salário Bruto,
		 *  o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador,
		 *   em variáveis do tipo float e exiba na tela o Salário Líquido. Veja
		 *    o exemplo abaixo:*/
		
		float bruto,noturno,extra,descontos,salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("entre com o salário brutu");
		bruto = leia.nextFloat();
		
		System.out.println("quanto é seu adicional noturno ? ");
		noturno = leia.nextFloat();
		
		System.out.println("quanto você faz de extra por mês ?");
		extra = leia.nextFloat();
		
		System.out.println("tem algum desconto no salário ? ");
		descontos =leia.nextFloat();
		
		salario = bruto+noturno+extra-descontos ;
		
		System.out.println("você em no final do mês o total de R$"+salario);
		
	}

}
