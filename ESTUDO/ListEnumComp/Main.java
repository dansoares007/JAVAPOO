package ListEnumComp;

import java.util.Scanner;

public class Main {
    public static void main() {
        ListaDeTarefas gerenciador = new ListaDeTarefas();

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja inserir uma tarefa? s ou n: ");
        char resposta = sc.next().charAt(0);


        while(resposta == 's'){
            sc.nextLine();
            System.out.println("Descreva a tarefa: ");
            String descricao = sc.nextLine();

            System.out.println("Qual a prioridade dela? \n1 - BAIXO\n2 - MEDIO\n3 - ALTO");
            int r = sc.nextInt();

            String resposta1;
            Tarefa t = new Tarefa();
            switch (r){
                case 1:
                    t = new Tarefa(descricao, NivelPrioridade.BAIXO);
                    break;
                case 2:
                    t = new Tarefa(descricao, NivelPrioridade.MEDIO);
                    break;
                case 3:
                    t = new Tarefa(descricao, NivelPrioridade.ALTO);
                    break;
                default:
                    System.out.println("Não tem essa opção\n");
                    break;
            }
            gerenciador.adicionarTarefa(t);

            System.out.println("Deseja adicionar mais uma tarefa? s ou n: ");
            resposta = sc.next().charAt(0);
            System.out.println(" ");
        }
        gerenciador.mostrarTarefas();
    }
}
