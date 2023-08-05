package ExercíciosExtra4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float numero1,numero2,numero3,numero4,diferença;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextFloat();
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextFloat();
		System.out.println("Digite o terceiro numero: ");
		numero3 = ler.nextFloat();
		System.out.println("Digite o quarto numero: ");
		numero4 = ler.nextFloat();
		
		diferença = (numero1*numero2)-(numero3*numero4);
		System.out.println("\nDiferença: "+diferença);
		
	}

}
