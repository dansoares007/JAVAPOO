package exercicio1;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pedido;
        int alcool = 0, gasolina = 0, diesel = 0;
        do{
            menu();
            System.out.print("Digite qual o tipo você gosta: ");
            pedido = sc.nextInt();
            switch (pedido) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO!");
                    break;
                default:
                    break;
            }
        }while (pedido >= 1 && pedido < 4);
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
    public static void menu(){
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - FIM");
    }
}
