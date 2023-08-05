package Atividade01;

import java.util.Scanner;

public class Atividade01If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2, numero3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o 1° numero: ");
		numero1 = leia.nextInt();
		System.out.println("Insira o 2° numero: ");
		numero2 = leia.nextInt();
		System.out.println("Insira o 3° numero: ");
		numero3 = leia.nextInt();
		
		if (numero1+numero2 > numero3) {
			System.out.println("O resultado da soma do A e B é maior que o numero C");
		}
		else if (numero1+numero2 < numero3) {
			System.out.println("O resultado entre A e B é menor que o numero C");
		}
		else {
			System.out.println("O resultado da somar entre A e B é igual ao numero C");
		}
	}

}
