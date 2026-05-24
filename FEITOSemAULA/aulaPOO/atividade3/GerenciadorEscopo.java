package aulaPOO.atividade3;

public class GerenciadorEscopo {

    String status = "Ativo";

    public void executarTeste(int parametro) {

        String status = "Ativado.local";
        // impresso a variável local (ela sobrepõe a variável da classe)
        System.out.println("Status atual: " + status);
        // para acessa-la, é preciso usar "this.status" para que seja impresso a variável da classe:
        System.out.println("Status atual: " + this.status);

        int somaLocal = parametro + 10;

        if (somaLocal > 15) {
            String mensagem = "Valor acima do limite!";
            System.out.println(mensagem);
            System.out.println("Status atual: " + status);
        }

        for(int i = 0; i < 5; i++){
            System.out.printf("I = %d\n", i);
        }

        // como o i é criado dentro/para do/o for, não é possível usar o mesmo fora, o código dá erro
        // Descomentar a próxima linha para verificar:
        //System.out.printf("I = %d", i);

        System.out.println("Soma local ainda existe: " + somaLocal);
    }

    public static void main(String[] args) {
        GerenciadorEscopo exemplo = new GerenciadorEscopo();
        exemplo.executarTeste(20);
    }
}