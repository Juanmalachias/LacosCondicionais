package SwitchAtividade03;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float numb1,numb2,resultado = 0;
		int Operadores;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Calculadora simples");
		System.out.println("Digite o primeiro numero: ");
		numb1 = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		numb2 = leia.nextFloat();
		System.out.println("\n\t\tOperação");
		System.out.println("\n1             Soma ");
		System.out.println("\n2        Subtração ");
		System.out.println("\n3    Multiplicação ");
		System.out.println("\n4          Divisão ");
		System.out.println("Digite o tipo de operação: ");
		Operadores = leia.nextInt();
		
		switch (Operadores) {
		case 1:
			resultado = (numb1+numb2);
			System.out.println((numb1+"+"+numb2)+"="+resultado);
			break;
		case 2:
			resultado = (numb1-numb2);
			System.out.println((numb1+"-"+numb2)+"="+resultado);
			break;
		case 3:
			resultado = (numb1*numb2);
			System.out.println((numb1+"*"+numb2)+"="+resultado);
			break;
		case 4:
			resultado = (numb1/numb2);
			System.out.println((numb1+"/"+numb2)+"="+resultado);
			break;
		default:
			System.out.println("Operação invalida");
				
		}
		
		
		
		
		
	}

}
