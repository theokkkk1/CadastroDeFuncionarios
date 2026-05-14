package dev.java10x.CadastroDeFuncionarios.Tarefas;

import org.springframework.stereotype.Component;

@Component
public class TarefasMapper {

    // DTO -> Model
    public TarefasModel map(TarefasDTO tarefasDTO){

        TarefasModel tarefasModel = new TarefasModel();

        tarefasModel.setId(tarefasDTO.getId());
        tarefasModel.setNome(tarefasDTO.getNome());
        tarefasModel.setDificuldade(tarefasDTO.getDificuldade());

        return tarefasModel;
    }

    // Model -> DTO
    public TarefasDTO map(TarefasModel tarefasModel){

        TarefasDTO tarefasDTO = new TarefasDTO();

        tarefasDTO.setId(tarefasModel.getId());
        tarefasDTO.setNome(tarefasModel.getNome());
        tarefasDTO.setDificuldade(tarefasModel.getDificuldade());

        return tarefasDTO;
    }
}