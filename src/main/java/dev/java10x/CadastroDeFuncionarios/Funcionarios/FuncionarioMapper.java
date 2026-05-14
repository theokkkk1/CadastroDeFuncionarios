package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import org.springframework.stereotype.Component;

@Component
public class FuncionarioMapper {
public FuncionarioModel map(FuncionarioDTO funcionarioDTO){
    FuncionarioModel funcionarioModel = new FuncionarioModel();
    funcionarioModel.setId(funcionarioDTO.getId());
    funcionarioModel.setNome(funcionarioDTO.getNome());
    funcionarioModel.setImgUrl(funcionarioDTO.getImgUrl());
    funcionarioModel.setEmail(funcionarioDTO.getEmail());
    funcionarioModel.setIdade(funcionarioDTO.getIdade());
    funcionarioModel.setTarefas(funcionarioDTO.getTarefas());
    funcionarioModel.setCpf(funcionarioDTO.getCpf());
    funcionarioModel.setTelefone(funcionarioDTO.getTelefone());

    return funcionarioModel;

}
public FuncionarioDTO map(FuncionarioModel funcionarioModel){
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
    funcionarioDTO.setId(funcionarioModel.getId());
    funcionarioDTO.setNome(funcionarioModel.getNome());
    funcionarioDTO.setImgUrl(funcionarioModel.getImgUrl());
    funcionarioDTO.setEmail(funcionarioModel.getEmail());
    funcionarioDTO.setIdade(funcionarioModel.getIdade());
    funcionarioDTO.setTarefas(funcionarioModel.getTarefas());
    funcionarioDTO.setCpf(funcionarioModel.getCpf());
    funcionarioDTO.setTelefone(funcionarioModel.getTelefone());

    return funcionarioDTO;

}


}
