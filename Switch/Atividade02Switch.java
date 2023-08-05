package SwitchAtividade02;

import java.util.Scanner;

public class Atividade02Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String NomedoFuncionario;
		int codcargo;
		float salario, novosalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n\t\tReajuste Salarial");
		System.out.println("\nDigite seu nome: ");
		NomedoFuncionario = leia.nextLine();
		System.out.println("\n1      Gerente    10% ");
		System.out.println("\n2      Vendedor   07% ");
		System.out.println("\n3     Supervisor  09% ");
		System.out.println("\n4     Motorista   06% ");
		System.out.println("\n5     Estoquista  05% ");
		System.out.println("\n6  Técnico de TI  08% ");
		System.out.println("\nDigite seu Cargo: ");
		codcargo = leia.nextInt();
		System.out.println("\nDigite seu Salario atual: ");
		salario = leia.nextFloat();
		
		switch (codcargo) {
		case 1:
			novosalario = (float) salario + (salario * 0.10f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
		case 2:
			novosalario = (float) salario +(salario * 0.07f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
		case 3:
			novosalario = (float) salario +(salario * 0.09f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
		case 4:
			novosalario = (float) salario + (salario * 0.06f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
		case 5:
			novosalario = (float) salario +(salario * 0.05f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
		case 6:
			novosalario = (float) salario + (salario * 0.08f);
			System.out.println(NomedoFuncionario+ " seu novo salario é de: " +novosalario);
			break;
			default:
				System.out.println("Cargo invalido");
		
		
		}
		
		
		
		
		
	}

}
