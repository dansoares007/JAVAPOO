package trabalho_dupla;

import java.util.Locale;
import java.lang.String;
import java.util.Scanner;

public class DANIEL_SOARES_E_LUCAS_EDUARDO_POO_Casa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        //cria uma variável da classe Rectangle
        Rectangle r = new Rectangle();
        
        /*pergunta ao usuário os valores da largura e altura do retangulo 
        e adiciona aos atributos Width e Height
        que existem dentro da classe*/
        System.out.print("Largura: ");
        double w = sc.nextDouble();
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        
        r.setWidth(w);
        r.setHeight(h);

        //mostra os valores em seus respectivos atributos da classe
        System.out.println("Valores: " + r.toString());

        /*As próximas 3 saídas, são metodos existentes na classe Rectangle,
        onde é feito os calculos e retornando apenas as soluções*/

        /*mostra o calculo da área, realizado dentro do metodo area*/
        System.out.printf("ÁREA = %.2f%n", r.area());
        /*mostra o calculo do perimetro, realizado dentro do metodo perimetro*/
        System.out.printf("PERIMETRO = %.2f%n", r.perimeter());
        /*mostra o calculo da diagonal, realizado dentro do metodo diagonal*/
        System.out.printf("DIAGONAL = %.2f%n", r.diagonal());

       
        sc.close();
    }
}
