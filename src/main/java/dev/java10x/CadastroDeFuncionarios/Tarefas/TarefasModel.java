package dev.java10x.CadastroDeFuncionarios.Tarefas;

import dev.java10x.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_tarefa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarefasModel {
    // @OneToMany Uma tarefa pode ter varios funcionarios
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;
    @OneToMany(mappedBy = "tarefas")
    private List<FuncionarioModel> funcionarioModels;




}

