package atividade_pratica_3;
import java.util.Scanner;
public class Laço_de_Repetição_WHILE {

	public static void main(String[] args) {
		int idade, total= 0, total2=0, total3=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" entre com a idade ");
		idade = leia.nextInt();
		
		while (idade !=0) {
			System.out.println(" entre com a idade ");
			idade = leia.nextInt();
		if (idade>= 1 && idade< 21) {
			 total++;
		}else if(idade>21&& idade <= 50){
			total2++;
			 }else {
				 total3++;
				
				
		   }
		System.out.println("Total de pessoas menores de 21 anos: "+total);
		System.out.println("Total de pessoas com idade de 22 a 50 anos: "+total2);
		System.out.println("Total de pessoas maiores de 50 anos:"+total3);

		}
	}

}
