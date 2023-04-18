package atividade_pratica_3;

/*Uma empresa desenvolveu uma pesquisa interna para conhecer os 
 * colaboradores da área de Desenvolvimento e precisam de um
 * sistema para analisar os dados. Escreva um algoritmo em 
 * Java, que leia via teclado as seguintes informações de cada
 * colaborador:
 *   
 *   O número de pessoas desenvolvedoras Backend
     O número de mulheres desenvolvedoras Frontend
	 O número de homens desenvolvedores Mobile maiores de 40 anos
	 O número de mulheres desenvolvedoras FullStack menores de 30 anos

*/
import java.util.Scanner;

public class atividade_9 {

	public static void main(String[] args) {
		int idade, categoria , sexo ,somaCategoria = 0, somaMulheres =0,categoriaEidade=0,sexoEidade=0;
		String escolha = "s";
		Scanner leia = new Scanner (System.in);
		
		while(escolha.equalsIgnoreCase("s")){
			System.out.println("entre com sua idade ?");
			idade = leia.nextInt();
			
			System.out.println(" digite o numero a aqual você se denomina\n " 
					+ "1 – Masculino\r\n"
					+ "2 – Feminino\r\n"
					+ "3 – Outros\r\n"
					+ "");
			sexo = leia.nextInt();
			System.out.println("digite o nùmero da sua categoria\n"
					+ ""
					+ "1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n"
					+ "");
			categoria = leia.nextInt();
			
			System.out.println("deseja continuar ? S para sim ! N para não! ");
			escolha = leia.next();
			
			if(categoria == 1) {
				somaCategoria++; 
			}	
			if(sexo == 2 && categoria ==2) {
				somaMulheres++;
							}
			if(categoria == 3 && idade >= 40) {
				categoriaEidade++;
				
			}
			if(sexo == 2 && idade >= 30) {
				sexoEidade++;
				
			}
		}
		System.out.println(somaCategoria+" -O número de pessoas desenvolvedoras Backend");
		System.out.println(somaMulheres+" -O número de mulheres desenvolvedoras Frontend");
		System.out.println(categoriaEidade+" -O número de homens desenvolvedores Mobile maiores de 40 anos\r\n"
				+ "");
		System.out.println(sexoEidade+" -O número de mulheres desenvolvedoras FullStack menores de 30 anos\r\n"
				+ "");
		leia.close();

	}

}
