package atividae_pratica_4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection_ArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x;
		
		ArrayList<String> cores = new ArrayList<>();
	
		for(x =0 ;x<5;x++) {
		System.out.println("entre com uma cor");
		String cor = leia.nextLine();
		cores.add(cor);
		}
		System.out.println("cores adicionadas ");
		    Collections.sort(cores);
			System.out.println(cores);
		
	leia.close();
	}

}
