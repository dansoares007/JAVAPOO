package Prova.questao3;

import Prova.questao3.Cliente;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos clientes serão processados: ");
        int N = sc.nextInt();
        Cliente[] vet = new Cliente[N];
        int minutos;
        double valor;
        double soma = 0;

        for(int i = 0; i< vet.length; i++){
            System.out.printf("Quantos minutos o cliente %d ficou em ligação: ", i+1);
            minutos = sc.nextInt();
            vet[i] = new Cliente();
            valor = vet[i].valorPagar(minutos);
            System.out.printf("Cliente %d pagará: %.2f\n", i+1, valor);
            soma += valor;
        }

        double media = soma/N;
        System.out.printf("Media das contas: %.2f", media);
    }
}
