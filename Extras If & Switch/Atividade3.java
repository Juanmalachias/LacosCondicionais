package ExercíciosExtra3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float salarioliq,salariobruto,adicional,horas,desconto;
		
		System.out.println("Calculo do Horelite");
		System.out.println("Digite o salario: ");
		salariobruto = ler.nextFloat();
		System.out.println("Digite o valor do adicional: ");
		adicional = ler.nextFloat();
		System.out.println("Digite quantas horas extras teve: ");
		horas = ler.nextFloat();
		System.out.println("Digite que foi descontado: ");
		desconto = ler.nextFloat();
		
		salarioliq = salariobruto+adicional+(horas*5)-desconto;
		System.out.println("O salario liquido vai ser de: "+salarioliq );
				
	}

}
