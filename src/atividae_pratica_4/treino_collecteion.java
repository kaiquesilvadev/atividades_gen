package atividae_pratica_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class treino_collecteion {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("\n----------------------------------------------------");
		System.out.println("\s\s\s bém vindo ");
		System.out.println("\n----------------------------------------------------");
		
	    ArrayList<String> cores = new  ArrayList<>();
	    String cor ;
	    
	    System.out.println(" entre com a cor");
	    // entrada de dados cor
	    for(int x=0;x<5;x++) {
	    	System.out.println(x+1);
	    	cor = ler.nextLine();
	    	cores.add(cor);
	    }
	    
	    
		ler.close();
	}

}
