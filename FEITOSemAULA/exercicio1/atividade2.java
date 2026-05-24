package exercicio1;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.print("Escolha um número para x: ");
            double x = sc.nextDouble();
            System.out.print("Escolha um número para y: ");
            double y = sc.nextDouble();
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }else if(x > 0 && y < 0){
                System.out.println("Q4");
            }else if(x < 0 && y < 0) {
                System.out.println("Q3");
            }else if(x < 0 && y > 0) {
                System.out.println("Q2");
            }else if(x == 0 && y == 0) {
                System.out.println("ORIGEM");
            }
            System.out.print("Para continuar, digite qualquer número inteiro diferente de 1: ");
            op = sc.nextInt();
        }while(op != 1);
        System.out.println("FIM!");
    }
}
