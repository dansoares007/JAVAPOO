package application.atividade10;

import java.util.Locale;
import java.util.Scanner;
import application.atividade10.Aluno;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Aluno[] vect = new Aluno[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Limpar buffer
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String nome = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            vect[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (vect[i].media() >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}