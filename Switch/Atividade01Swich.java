package SwichAtividade01;

import java.util.Scanner;

public class Atividade01Swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int produtos, quantidade;
        double Conta = 00.00;
        String nomedoproduto = "";
        
        Scanner leia = new Scanner(System.in);
		
        System.out.println("\n\t\tcardápio");
        System.out.println("\n1 Cachorro Quente - R$10,00");
        System.out.println("\n2 X-Salada - R$15,00");
        System.out.println("\n3 X-Bacon - R$18,00");
        System.out.println("\n4 Bauru - R$12,00");
        System.out.println("\n5 Refrigerante - R$8,00");
        System.out.println("\n6 Suco de Laranja - R$13,00");
        System.out.println("\nFique a vontade para escolher uma das opções:");
        produtos = leia.nextInt();
        System.out.println("\nQuantos unidades você vai querer? ");
        quantidade = leia.nextInt();
        
        switch(produtos) {
        case 1:
            nomedoproduto = ("Cachorro Quente");
            Conta = quantidade * 10.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        case 2:
        	nomedoproduto = ("X-Salada");
            Conta = quantidade * 15.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        case 3:
            nomedoproduto = ("X-Bacon");
            Conta = quantidade * 18.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        case 4:
        	nomedoproduto = ("Bauru");
            Conta = quantidade * 12.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        case 5:
        	nomedoproduto = ("Refrigerante");
            Conta = quantidade * 8.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        case 6:
        	nomedoproduto = ("Suco de Laranja");
            Conta = quantidade * 13.00;
            System.out.println("Você escolheu "+quantidade+ " unidades de " +nomedoproduto+ " e sua conta ficou no valor de: " +Conta);
            break;
        default:
            System.out.println("Opção inválida!");
            break;
	}
	}

}
