package CSE;

import java.util.Scanner;

// Exercicio feito para que eu pratique a utilização de construtores, sobrecarga e encapsulamento


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Digite o id: ");
        int id = sc.nextInt();

        //limpar buff do teclado
        sc.nextLine();

        //conta sem deposito
        ContaBancaria conta = new ContaBancaria(nomeTitular, id);

        System.out.println("Digite o nome do titular: ");
        nomeTitular = sc.nextLine();

        System.out.println("Digite o id: ");
        id = sc.nextInt();

        System.out.println("Digite o deposito: ");
        double depositoInicial = sc.nextDouble();

        //conta com deposito
        ContaBancaria conta2 = new ContaBancaria(nomeTitular, id, depositoInicial);

        System.out.printf("Nome: %s, id: %d, saldo: %.2f\n", conta.getNomeTitular(), conta.getId(), conta.getSaldo());
        System.out.printf("Nome: %s, id: %d, saldo: %.2f\n", conta2.getNomeTitular(), conta2.getId(), conta2.getSaldo());
    }
}


