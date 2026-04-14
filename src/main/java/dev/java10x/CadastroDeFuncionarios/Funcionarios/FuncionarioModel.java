package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import dev.java10x.CadastroDeFuncionarios.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table (name = "tb_cadatro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionarioModel {
    //@ManyToOne UM FUNCIONARIO TEM UMA UNICA TAREFA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name= "tarefas_id") //Foreing key ou chave estrangeira
    private TarefasModel tarefas;





}
