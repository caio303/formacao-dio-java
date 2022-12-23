package main;

import java.util.Scanner;

import models.Conta;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();

		while(true) {
			try {
				System.out.print("Por favor, digite o n�mero da conta (somente d�gitos): ");
				conta.setNumero(sc.nextInt());
				break;
			} catch (Exception e) {}
			finally { sc.nextLine(); }
		}
		
		while(true) {
			try {
				System.out.print("Agora, digite o n�mero da Ag�ncia: ");
				conta.setAgencia(sc.nextLine());
				break;
			}catch (Exception e) {}
		}
		
		while(true) {
			try {
				System.out.print("Agora, digite o nome do dono da conta: ");
				conta.setNomeCliente(sc.nextLine());
				break;
			} catch (Exception e) {}
		}
		
		conta.setSaldo((Math.random()*100));
		System.out.println(conta.getEmailMarketingCadastro());
		
		sc.close();
	}
}
