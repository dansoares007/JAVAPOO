package atividade_aula3;

import java.util.Locale;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();
        double[] notas = new double[3];

        aluno.nome = sc.nextLine();

        System.out.println("Nota:");
        for(int i = 0; i <= 2; i++){
            double temp = sc.nextInt();
            notas[i] = temp;
        }

        for(int i = 0; i <= 2; i++){
            aluno.notas[i] = notas[i];
        }
        aluno.receber();

        sc.close();
    }
}
