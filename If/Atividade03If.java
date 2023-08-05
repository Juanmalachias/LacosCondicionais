package Atividade03;

import java.util.Scanner;


public class Atividade03If {

	public static void main(String[] args) {
		
		String nome, resposta;
		int idade;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\tBanco de sangue");
		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nJá dour sangue antes? (true / false)");
		resposta = leia.next();
		
		
		boolean primeiradoacao = resposta.equalsIgnoreCase("true");
		boolean aptoparadoação = verificar(idade, primeiradoacao);
		
		if (aptoparadoação && idade >= 18 && idade <=69) {
			System.out.println("O doador " +nome+ " está apto para doar sangue" );
		} else if (idade < 18) {
			System.out.println("O doador " +nome+ " não está na faixa permitida de idade para doar sangue" );
		}
		else {
			System.out.println("O doador " +nome+ " não está apto para doar sangue" );
		}
		 
		leia.close();
	}
	
	public static boolean verificar(int idade, boolean primeiradoacao) {
		if (idade >= 60 && idade <= 69) {
			return !primeiradoacao;
			
		} else {
				return true;
		}
	
	}
}