package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import dev.java10x.CadastroDeFuncionarios.Tarefas.TarefasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_cadatro")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne UM FUNCIONARIO TEM UMA UNICA TAREFA
    @ManyToOne
    @JoinColumn(name= "tarefas_id") //Foreing key ou chave estrangeira
    private TarefasModel tarefasModel;


    public FuncionarioModel() {
    }

    public FuncionarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
