package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import jakarta.persistence.Id;
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

    //Listar Funcionario por Id
    public FuncionarioModel listarFuncionarioPorId(Long id){
        return funcionarioRepository.findById(id).orElse(null);
    }

    // Criar todos os meus Funcionarios
    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);
    }
    //


}
