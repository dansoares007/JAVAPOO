package atividade;

import java.util.Scanner;
import java.util.Locale;

public class atividade1a7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;

        System.out.println("Qual atividade deseja ver? 1 a 7.");
        op = sc.nextInt();
        switch (op){
            case 1:
                System.out.print("Digite um número de 1 a 1000 para ver os impares: ");
                int x = sc.nextInt();
                for(int i = 0; i <= x; i++){
                    if(i%2 == 1){
                        System.out.printf("%d\n", i);
                    }
                }
                break;
            case 2:
                System.out.print("Quantos números deseja verificar se está no intervalo? ");
                int n = sc.nextInt();
                int in = 0, out = 0;
                for(int i = 1; i <= n; i++){
                    int numero = sc.nextInt();
                    if(numero >=10 && numero <=20){
                        in++;
                    }else{
                        out++;
                    }
                }
                System.out.printf("%d in\n%d out", in, out);
                break;
            case 3:
                System.out.print("Quantos conjuntos tera? ");
                n = sc.nextInt();
                double n1, n2, n3;
                double media;
                for(int i = 0; i < n; i++){
                    n1 = sc.nextDouble();
                    n2 = sc.nextDouble();
                    n3 = sc.nextDouble();
                    media = ((n1*2) + (n2*3) + (n3*5))/(2+3+5);
                    System.out.printf("%.1f\n", media);
                }
                break;
            case 4:
                System.out.print("Quantas vezes repetira? ");
                n = sc.nextInt();
                int num, d1;
                for(int i = 0; i < n; i++){
                    num = sc.nextInt();
                    d1 = sc.nextInt();
                    if(d1 == 0){
                        System.out.println("divisao impossivel\n");
                    }else{
                        System.out.printf("%.1f\n", (double)num/d1);
                    }
                }
                break;
            case 5:
                System.out.print("Numero para fatorial: ");
                int f = sc.nextInt();
                int fatorial = 0;
                if(f == 1 || f == 0){
                    System.out.println("1");
                }else {
                    fatorial = f;
                    for (int i = f - 1; i > 0; i--) {
                        fatorial *= i;
                    }
                    System.out.printf("%d\n", fatorial);
                }
                break;
            case 6:
                System.out.print("Digite um número para saber os seus divisores: ");
                f = sc.nextInt();
                for(int i = 1; i <= f; i++){
                    if(f%i == 0){
                        System.out.printf("%d\n", i);
                    }
                }
                break;
            case 7:
                System.out.print("Digite o número de linhas: ");
                int linhas = sc.nextInt();
                for(int i = 1; i <= linhas; i++){
                    System.out.printf("%d %d %d\n", i, i*i, i*i*i);
                }
                break;
            default:
                break;
        }
        sc.close();
    }
}
