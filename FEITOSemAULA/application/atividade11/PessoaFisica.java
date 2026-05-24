package application.atividade11;

public class PessoaFisica {
    private double altura;
    private char genero;

    public PessoaFisica(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() { return altura; }
    public char getGenero() { return genero; }
}