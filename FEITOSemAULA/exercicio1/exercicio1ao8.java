package exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class exercicio1ao8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a atividade que deseja executar(1 ao 8): ");
        int decisao = sc.nextInt();
        int numero = 0, letra = 0;

        switch (decisao) {
            case 1:
                System.out.print("Digite um número para saber se é positivo ou negativo: ");
                numero = sc.nextInt();
                atividade1(numero);
                break;
            case 2:
                System.out.print("Digite um número para saber se é par ou ímpar: ");
                numero = sc.nextInt();
                atividade2(numero);
                break;
            case 3:
                System.out.println("Digite dois números para saber se são múltiplos ou não: ");
                numero = sc.nextInt();
                letra = sc.nextInt();
                atividade3(numero, letra);
                break;
            case 4:
                System.out.println("Qual a hora inicial do seu game?");
                int inicial = sc.nextInt();
                System.out.println("Qual a hora final do seu game?");
                int finale = sc.nextInt();
                atividade4(inicial, finale);
                break;
            case 5:
                menu();
                System.out.println("Qual o seu pedido?");
                int pedido = sc.nextInt();
                System.out.println("Quantos quer?");
                int qtd = sc.nextInt();
                atividade5(pedido, qtd);
                break;
            case 6:
                System.out.print("Escolha um número: ");
                double Nnumero = sc.nextDouble();
                atividade6(Nnumero);
                break;
            case 7:
                System.out.print("Escolha um número para x: ");
                double x = sc.nextDouble();
                System.out.print("Escolha um número para y: ");
                double y = sc.nextDouble();
                atividade7(x, y);
                break;
            case 8:
                System.out.println("Digite o seu salário fixo: ");
                double salario = sc.nextDouble();
                atividade8(salario);
                break;
            default:
                break;
        }
    }static void atividade1(int numero) {
        if (numero == 0) {
            System.out.println("NEM POSITIVO, NEM NEGATIVO");
        } else if (numero > 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }static void atividade2(int numero){
        if (numero == 0) {
            System.out.println("PAR");
        }else if(numero%2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("ÍMPAR");
        }
    }static void atividade3(int numero, int letra){
        int x;
        if(letra > numero){
            x = numero;
            numero = letra;
            letra = x;
        }
        if(numero%letra == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }static void atividade4(int inicial, int finale){
        if(inicial == finale){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(inicial == 0 && finale < 24){
            System.out.printf("O JOGO DUROU %d HORA(S)", finale);
        }else if(inicial > 0 && finale < 24 && finale > inicial){
            System.out.printf("O JOGO DUROU %d HORA(S)", finale - inicial);
        }else if(inicial > 0 && finale < inicial){
            System.out.printf("O JOGO DUROU %d HORA(S)", (24 - inicial) + finale);
        }
    }static void atividade5(int pedido, int qtd) {
        switch(pedido){
            case 1:
                System.out.printf("Seu pedido ficou R$%d.00\n", 4*qtd);
                break;
            case 2:
                System.out.printf("Seu pedido ficou R$%.2f\n", 4.50*qtd);
                break;
            case 3:
                System.out.printf("Seu pedido ficou R$%d.00\n", 5*qtd);
                break;
            case 4:
                System.out.printf("Seu pedido ficou R$%d.00\n", 2*qtd);
                break;
            case 5:
                System.out.printf("Seu pedido ficou R$%.2f\n", 1.50*qtd);
                break;
            default:
                break;
        }
    }static void atividade6(double Nnumero) {
        if(Nnumero < 0){
            System.out.println("Fora do intervalo");
        }else if (Nnumero >= 0 && Nnumero <= 25) {
            System.out.println("Faz parte do seguinte intervalo: [0, 25]");
        }else if (Nnumero < 50) {
            System.out.println("Faz parte do seguinte intervalo: [25, 50]");
        }else if (Nnumero < 75) {
            System.out.println("Faz parte do seguinte intervalo: [50, 75]");
        }else if (Nnumero <= 100) {
            System.out.println("Faz parte do seguinte intervalo: [75, 100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }static void atividade7(double x, double y){
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
    }static void atividade8(Double salario){
        Double imp8 = (salario - 2000) * 0.08;
        Double imp18 = (1000 * 0.08) + ((salario - 3000)*0.18);
        Double imp28 = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
        if(salario >= 0 && salario < 2000){
            System.out.println("Você é isento do imposto!");
        }else if(salario < 3000){
            System.out.printf("Você vai pagar R$ %.2f!\n", imp8);
        }else if(salario < 4500){
            System.out.printf("Você vai pagar R$ %.2f!\n", imp18);
        }else{
            System.out.printf("Você vai pagar R$ %.2f!\n", imp28);
        }
    }static void menu(){
        System.out.println("1 - CACHORRO-QUENTE");
        System.out.println("2 - X-SALADA");
        System.out.println("3 - X-BACON");
        System.out.println("4 - TORRADA SIMPLES");
        System.out.println("REFRIGERANTE");
    }
}


