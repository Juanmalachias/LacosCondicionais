package SwitchAtividade04;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Opção;
		float saldo = (1000.00f), saque, deposito;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\tBem vindo ao caixa");
		System.out.println("\n1         Saldo");
		System.out.println("\n2         Saque");
		System.out.println("\n3         Depósito");
		System.out.println("\nEscolhar uma das operações: ");
		Opção = leia.nextInt();
		
		switch (Opção) {
		case 1:
			System.out.println("O seu saldo é de: "+saldo);
			break;
		case 2:
			System.out.println("\nQuanto desejar sacar? ");
			saque = leia.nextFloat();
			saldo = (saldo - saque);
			System.out.println("\nSaque feito com sucesso!\nSeu novo saldo é de: "+saldo);
			break;
		case 3:
			System.out.println("\nQuanto desejar depósitar? ");
			deposito = leia.nextFloat();
			saldo = (saldo + deposito);
			System.out.println("\nDepósito feito com sucesso!\nSeu novo saldo é de: "+saldo);
			break;
		default:
			System.out.println("\nOpção invalida");
				
		}
		
		
		
		
		
		
		
		
		
	}

}
