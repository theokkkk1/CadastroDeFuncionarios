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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne UM FUNCIONARIO TEM UMA UNICA TAREFA
    @ManyToOne
    @JoinColumn(name= "tarefas_id") //Foreing key ou chave estrangeira
    private TarefasModel tarefas;





}
