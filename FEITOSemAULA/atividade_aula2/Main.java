package atividade_aula2;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee dados = new Employee();

        System.out.println("Name: ");
        dados.nome = sc.nextLine();
        System.out.println("GrossSalary: ");
        dados.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        dados.tax = sc.nextDouble();

        System.out.println("Employee: " + dados.nome + ", $ " + dados.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        dados.IncreaseSalary(percentage);

        sc.close();
    }
}
