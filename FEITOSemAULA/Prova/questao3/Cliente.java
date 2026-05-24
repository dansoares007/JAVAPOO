package Prova.questao3;

public class Cliente {
    private int minutos;

    void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public int getMinutos(){
        return this.minutos;
    }

    double valorPagar(int minutos){
        if(minutos <= 100){
            return 50.00;
        }else{
            return 50 + (minutos - 100) * 2;
        }
    }
}
