package aulaPOO;

import java.util.Scanner;

/////Problema exemplo
////Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
/////a 100 minutos de telefone. Tem o Plano Plus que cobra R$ 100,00 e dá direito
/////a 300 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos do plano
/////básico custa R$ 2.00, e cada minuto que exceder o Plano Plus de 300 minutos
////custa R$ 1,00. Fazer um programa para ler a quantidade de minutos que uma
/// pessoa consumiu, daí mostrar o valor a ser pago.
////Entrada Plano Básico
////Entrada 22
////Saída Valor a pagar: R$ 50.00
////Entrada Plano Básico
////Entrada 103
////Saída Valor a pagar: R$ 56.00
////Entrada Plano Plus
////Entrada 303
////Saída Valor a pagar: R$ 103.00
////Entrada Plano Plus
////Entrada 299
////Saída Valor a pagar: R$ 100.00

public class Atividade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char plano;
        double precoB = 50.0, precoP  = 100.0;

        System.out.println("Qual o plano que você usa? P - Plus, B - Básico ");
        plano = sc.next().charAt(0);

        System.out.println("Quantos minutos você utilizou? ");
        int minutos = sc.nextInt();

        if(plano != 'P' && plano != 'B'){
            System.out.println("Não pode, não");
            return;
        }else if(plano == 'B'){
            if(minutos > 100){
                precoB += (minutos - 100) * 2;
                System.out.printf("Você irá pagar o valor de %.2f reais", precoB);
            }else{
                System.out.printf("Você irá pagar o valor de %.2f reais", precoB);
            }
        }else{
            if(minutos > 300){
                precoP += (minutos - 300);
                System.out.printf("Você irá pagar o valor de %.2f reais", precoP);
            }else{
                System.out.printf("Você irá pagar o valor de %.2f reais", precoP);
            }
        }
    }
}
