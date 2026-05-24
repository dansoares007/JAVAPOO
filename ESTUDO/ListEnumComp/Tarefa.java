package ListEnumComp;

public class Tarefa {
    private String descricao;
    private NivelPrioridade prioridade;

    public Tarefa(String descricao, NivelPrioridade prioridade){
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public Tarefa(){
        this.descricao = "ZERADO";
        this.prioridade = NivelPrioridade.INEXISTENTE;
    }

    public String getDescricao() {
        return descricao;
    }

    public NivelPrioridade getPrioridade(){
        return prioridade;
    }
}
