package application.atividade9;

import java.util.Scanner;
import application.atividade9.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consumir quebra
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = vect[0].getIdade();
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (vect[i].getIdade() > maiorIdade) {
                maiorIdade = vect[i].getIdade();
                posicaoMaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + vect[posicaoMaior].getNome());

        sc.close();
    }
}