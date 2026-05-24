package atividade_aula3;

public class Student {
    public String nome;
    public double[] notas = new double[3];

    public void receber(){
        double total = 0;
        for(int i = 0; i <= 2; i++){
            total += notas[i];
        }

        double media = (double) 100*((double) 60 /100);
        if(total >= media){
            System.out.printf("FINAL GRADE = %.2f\nPASS", total);
        }else{
            System.out.printf("FINAL GRADE = %.2f\nFAILED\n", total);
            System.out.printf("Missing %.2f points", media - total);
        }
    }
}
