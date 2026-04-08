package dev.java10x.CadastroDeFuncionarios.Tarefas;

import dev.java10x.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa")
public class TarefasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    @ManyToMany
    private FuncionarioModel funcionarioModel;



}
