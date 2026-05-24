package exercicio1;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);

        ///System.out.println("2002");///
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha incorreta");
            System.out.print("Digite uma nova senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta");
        System.out.println("FIM!");
    }
}
