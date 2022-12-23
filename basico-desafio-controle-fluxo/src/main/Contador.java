package main;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Deseja que a contagem ocorra a partir de que numero? ");
		int n1 = sc.nextInt();
		System.out.print("Até que numero? ");
		int n2 = sc.nextInt();
		
		try {
			contar(n1,n2);
		}catch (ParametrosInvalidosException e) {
			System.err.println("\n"+e.getMessage());
			return;
		}finally {
			sc.close();			
		}
	}
	
	private static void contar(int n1, int n2) throws ParametrosInvalidosException {
		if(n2<n1)
			throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
		int iteracoes=n2-n1;
		for(int i=0;i<=iteracoes;i++) {
			System.out.println(n1+i);
		}
	}
}
