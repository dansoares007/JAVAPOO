package AeFE;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruta = new String[4];

        fruta[0] = "Maçã";
        fruta[1] = "Banana";
        fruta[2] = "Uva";
        fruta[3] = "Morango";

        for(int i = 0; i < fruta.length; i++){
            System.out.printf("Fruta %d: %s\n", i+1, fruta[i]);
        }

        System.out.println(" ");
        int i = 0;
        for(String frutaaux : fruta){
            i++;
            System.out.printf("Fruta %d: %s\n", i, frutaaux);
        }
    }
}
