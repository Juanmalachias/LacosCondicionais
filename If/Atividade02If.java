package Atividade02;

import java.util.Scanner;

public class Atividade02If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tIndetificador de Numeros pares e impas");
		System.out.println("\n Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero%2==0) 
			if (numero >=0) {
			System.out.println("Esse numero é par e positivo");
		}
			else {
				System.out.println("Esse numero é par e negativo");
			}
		else if (numero%2==1){
			System.out.println("Esse numero é impar e positivo ");
		} else if (numero <=0){
			System.out.println("Esse numero é impar e negativo");
		}
				
	}

}
