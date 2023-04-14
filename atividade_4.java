package atividade_java;
import java.util.Scanner; 
public class atividade_4 {
	public static void main(String args[]) {
		
		/*Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre 
		 * a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4.
		 *  Veja os exemplos abaixo:*/
		
		float n1,n2,n3 ,n4,calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("entre com o primeiro numero");
		n1 = leia.nextFloat();
		
		System.out.println("entre com o segundo numero");
		n2 = leia.nextFloat();
		
		System.out.println("entre com o terceiro numero");
		n3 = leia.nextFloat();
		
		System.out.println("entre com o ultimo numero");
		n4 = leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println("esse é o  valor do calculo"+calculo);
		
		
	}

}
