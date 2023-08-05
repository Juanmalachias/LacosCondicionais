package ExercíciosExtra2;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("\n\t\tVamos calcular a média");
		System.out.println("\nDigite a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("\nDigite a Segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = ler.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = ler.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;//8,4 7
		System.out.printf("\nMédia do aluno foi de: %.2f",media);
		if (media >= 5 && media <=8) {
			System.out.println("\nFicou de recupeção, estude mais!");
		} else if (media > 8 && media<=10) {
			System.out.println("\nFoi aprovado");
		}else {
			System.out.println("\nNão foi aprovado");
		}
		
	}

}
