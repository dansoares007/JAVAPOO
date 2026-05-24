package application.atividade11;

import java.util.Locale;
import java.util.Scanner;
import application.atividade11.PessoaFisica;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        PessoaFisica[] vect = new PessoaFisica[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.next().charAt(0);

            vect[i] = new PessoaFisica(altura, genero);
        }

        double menor = vect[0].getAltura();
        double maior = vect[0].getAltura();
        double somaAlturaMulheres = 0.0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i = 0; i < n; i++) {
            if (vect[i].getAltura() < menor) menor = vect[i].getAltura();
            if (vect[i].getAltura() > maior) maior = vect[i].getAltura();

            if (vect[i].getGenero() == 'F' || vect[i].getGenero() == 'f') {
                somaAlturaMulheres += vect[i].getAltura();
                qtdMulheres++;
            } else if (vect[i].getGenero() == 'M' || vect[i].getGenero() == 'm') {
                qtdHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);

        if (qtdMulheres > 0) {
            double mediaMulheres = somaAlturaMulheres / qtdMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
        } else {
            System.out.println("Nao ha mulheres cadastradas.");
        }

        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }
}