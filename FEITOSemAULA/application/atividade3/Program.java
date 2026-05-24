package application.atividade3;

import java.util.Locale;
import java.util.Scanner;
import application.atividade3.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // Consumir quebra de linha
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0.0;
        int menoresDe16 = 0;

        for (int i = 0; i < vect.length; i++) {
            somaAlturas += vect[i].getAltura();
            if (vect[i].getIdade() < 16) {
                menoresDe16++;
            }
        }

        double mediaAlturas = somaAlturas / n;
        double percentualMenores = ((double) menoresDe16 / n) * 100.0;

        System.out.printf("\nAltura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}