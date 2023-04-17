package atividades_praticas_2;

/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for
 *  a sua primeira doação. Escreva um Algoritmo em Java que 
 *  obtenha via teclado o nome do doador (String), a idade 
 *  (inteiro) do doador e se é a primeira doação (boolean). 
 *  De acordo com as Regras para a doação, mostre na tela se o
 *   doador está Apto ou Não Apto para doar sangue. Veja os 
 *   exemplos abaixo:
*/
import java.util.Scanner;

public class avitidade_8 {

	public static void main(String[] args) {
		String nome;
		int idade, numero;

		Scanner leia = new Scanner(System.in);

		System.out.println(" alar, gostaria de saber o nome do nosso futuro doador ?");
		nome = leia.nextLine();

		System.out.println(" qual sua idade ? ");
		idade = leia.nextInt();

		if (idade >= 18 && idade <= 59) {
			System.out.println(" \nparabéns " + nome + " foi aprovado ");
			System.out.println(nome + " você está apto  ");
			System.out.println(idade + " idade");

		} else {
			if (idade >= 60 && idade <= 69) {
				System.out.println(" eitá você tem mais que 59 ne !, você ja doou sangue alguma vez  ? ");
				System.out.println("\n se sim aperte 1");
				System.out.println("\n se não aperte 2");
				numero = leia.nextInt();
				if (numero == 1) {
					System.out.println(" \nufa que bom , " + nome + " você pode doar");
					System.out.println(nome + "você está apto  ");
					System.out.println(idade + "\n idade");
				} else if (numero == 2) {
					System.out.println("que pena , você não pode doar ");
					System.out.println(nome + " você não está apto ");
					System.out.println(idade + " idade");
				} else {
					System.out.println(" número invalido ");
				}
					
				}
			}
			System.out.println(nome + " que pena você não esta aptor ");
			System.out.println(idade + " idade");
		}

	}


