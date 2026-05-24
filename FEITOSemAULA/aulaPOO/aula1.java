package aulaPOO;

import java.util.Locale;

public class aula1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30, codigo = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is %.2f%n", product1, price1);
        System.out.printf("%s, wich price is %.2f%n", product2, price2);

        System.out.print("\n");

        System.out.printf("Record: %d years old, code %d and gender: %c", age, codigo, gender);

        System.out.print("\n");

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        System.out.print("\n");

        System.out.printf("US decimal point: 53.235: %.3f", measure);

    }

}