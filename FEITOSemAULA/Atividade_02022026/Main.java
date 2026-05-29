package Atividade_02022026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite quantos produtos deseja digitar: ");
        int N = sc.nextInt();

        for(int i  = 1; i <= N; i++){
            System.out.printf("Product #%d data: \n", i);
            System.out.print("Common, used or imported (c/u/i)? ");
            sc.nextLine();
            char tipo = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            switch(tipo) {
                case 'c':
                    Produto p = new Produto(name, price);
                    produtos.add(p);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dataEnter = sc.next();
                    LocalDate data = LocalDate.parse(dataEnter,formatar);
                    produtos.add(new UsedProduct(name, price, data));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customFee = sc.nextDouble();
                    produtos.add(new ImportedProduct(name, price, customFee));
                    break;
                default:
                    System.out.println("Sabe ler não? C OU U OU I\n");
                    break;
            }

            System.out.println();
        }

        for(Produto cont : produtos){
            System.out.print(cont.priceTag());
        }

        sc.close();
    }
}
