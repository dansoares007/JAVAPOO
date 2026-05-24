package ListEnumComp;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> tarefa = new ArrayList<>();

    public void adicionarTarefa(Tarefa t){
        tarefa.add(t);
    }

    public void mostrarTarefas(){
        int i = 1;
        for(Tarefa t : tarefa){
            System.out.printf("Tarefa (%d):\n-----------------\n%s, Nível de prioridade: %s\n", i++, t.getDescricao(), t.getPrioridade());
            System.out.println(" ");
        }
    }
}
