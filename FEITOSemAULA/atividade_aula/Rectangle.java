package atividade_aula;

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
        sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
*/

public class Rectangle {
    double width;
    double height;

    public void area(){
        System.out.printf("Area = %.2f\n", width * height);
    }

    public void perimetro(){
        System.out.printf("Perímetro = %.2f\n", 2*(width + height));
    }

    public void diagonal(){
        System.out.printf("Diagonal = %.2f\n", Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
    }

}
