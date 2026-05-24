package course;

import java.util.Scanner;

public class Menororigual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Vericando o menor...");
        if(n1 <= n2 && n1 <= n3){
            System.out.printf("O menor número é: %d\n", n1);
        }else if(n2 <= n1 && n2 <= n3){
            System.out.printf("O menor número é: %d\n", n2);
        }else{
            System.out.printf("O menor número é: %d\n", n3);
        }

        if(n1 == n2 || n1 == n3){
            System.out.printf("O número igual: %d\n", n1);
        }else if(n2 == n3){
            System.out.printf("O número igual: %d\n", n2);
        }else {
            System.out.println("Não tem números iguais.");
        }
    }
}
