package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import dev.java10x.CadastroDeFuncionarios.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String imgUrl;
    private String email;
    private int idade;
    private TarefasModel tarefas;
    private String cpf;
    private String telefone;

}
