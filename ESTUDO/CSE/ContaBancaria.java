package CSE;

public class ContaBancaria {

    //Encapsulamento
    private String nomeTitular;
    private int id;
    private double saldo;


    //retorno das variáveis protegidas
    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    //adição de uma das variáveis protegidas
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    //usando construtores sem deposito
    public ContaBancaria(String nomeTitular, int id){
        this.nomeTitular = nomeTitular;
        this.id = id;
        this.saldo = 0.00;
    }

    //usando constutores com deposito
    public ContaBancaria(String nomeTitular, int id, double depositoInicial){
        this.nomeTitular = nomeTitular;
        this.id = id;
        this.saldo = depositoInicial;
    }
}

