package exercicio1;

import java.util.Scanner;

public class exercicios1a3 {
    public static void main(String[] args0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a atividade que quer ver de 1 a 3: ");
        int atividade = sc.nextInt();
        switch(atividade){
            case 1:
                atividade1(sc);
                break;
            case 2:
                atividade2(sc);
                break;
            case 3:
                atividade3(sc);
                break;
            default:
                System.out.println("Escolhe de novo!");
                break;
        }
        sc.close();
    }
    public static void atividade1(Scanner sc){
        System.out.print("Digite uma senha de 4 dígitos: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha incorreta");
            System.out.print("Digite uma nova senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");
        System.out.println("FIM!");
    }
    public static void atividade2(Scanner sc){
        int op;
        do {
            System.out.print("Escolha um número para x: ");
            double x = sc.nextDouble();
            System.out.print("Escolha um número para y: ");
            double y = sc.nextDouble();
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(x > 0 && y < 0){
                System.out.println("quarto");
            }else if(x < 0 && y < 0) {
                System.out.println("terceiro");
            }else if(x < 0 && y > 0) {
                System.out.println("segundo");
            }else if(x == 0 && y == 0) {
                System.out.println("   ");
            }
            System.out.print("Para continuar, digite qualquer número inteiro diferente de 1: ");
            op = sc.nextInt();
        }while(op != 1);
        System.out.println("FIM!");
    }
    public static void atividade3 (Scanner sc){
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
