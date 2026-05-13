package dev.java10x.CadastroDeFuncionarios.Tarefas;

import dev.java10x.CadastroDeFuncionarios.Funcionarios.FuncionarioModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarefasDTO {
    private Long id;
    private String nome;
    private String dificuldade;


}
