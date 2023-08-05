package ExercíciosExtra1;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novosalario;
		
		System.out.println("\n\t\tVamos calcular o salario com o reajuste");
		System.out.println("Digite seu salario atual: ");
		salario = leia.nextFloat();
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		
		if	(salario >=0 && abono >=0) {
			novosalario= (salario+abono);
			System.out.println("O seu novo salario mais o abono é de: %.2f"+novosalario);
			
			
		}else {
			System.out.println("Valores invalidos");
		}
		
		
		
		
		
	}

}
