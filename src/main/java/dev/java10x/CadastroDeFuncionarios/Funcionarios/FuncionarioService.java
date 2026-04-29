package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // Listar todos os meus Funcionarios
    public List<FuncionarioModel> listarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    // Criar todos os meus Funcionarios
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);
    }
    //


}
