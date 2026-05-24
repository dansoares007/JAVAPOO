package atividade_aula;

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
*/

import java.util.Scanner;
import java.util.Locale;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retan = new Rectangle();

        System.out.println("Largura");
        retan.width = sc.nextDouble();
        System.out.println("Altura");
        retan.height = sc.nextDouble();

        retan.area();
        retan.perimetro();
        retan.diagonal();

        sc.close();
    }
}
