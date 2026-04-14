package dev.java10x.CadastroDeFuncionarios.Tarefas;

import dev.java10x.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefa")
public class TarefasModel {
    // @OneToMany Uma tarefa pode ter varios funcionarios
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "tarefas")
    private List<FuncionarioModel> funcionarioModels;

    public TarefasModel() {
    }

    public TarefasModel(long id, String nome, String dificuldade, List<FuncionarioModel> funcionarioModels) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.funcionarioModels = funcionarioModels;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<FuncionarioModel> getFuncionarioModels() {
        return funcionarioModels;
    }

    public void setFuncionarioModels(List<FuncionarioModel> funcionarioModels) {
        this.funcionarioModels = funcionarioModels;
    }
}
