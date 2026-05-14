package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;
    private FuncionarioMapper funcionarioMapper;

    public FuncionarioService(FuncionarioRepository funcionarioRepository, FuncionarioMapper funcionarioMapper) {
        this.funcionarioRepository = funcionarioRepository;
        this.funcionarioMapper = funcionarioMapper;
    }


    public List<FuncionarioDTO> listarFuncionarios(){
        List<FuncionarioModel> funcionario = funcionarioRepository.findAll();
        return funcionario.stream()
                .map(funcionarioMapper::map)
                .collect(Collectors.toList());

    }


    public FuncionarioDTO listarFuncionarioPorId(Long id){
        Optional<FuncionarioModel> funcionarioID = funcionarioRepository.findById(id);
        return funcionarioID.map(funcionarioMapper::map).orElse(null);

    }


    public FuncionarioDTO criarFuncionario(FuncionarioDTO funcionarioDTO){
        FuncionarioModel funcionario = funcionarioMapper.map(funcionarioDTO);
        funcionario = funcionarioRepository.save(funcionario);
        return funcionarioMapper.map(funcionario);

    }

    //Deletar o funcionario por id -- tem que ser um metodo void
    public void deletarFuncionarioPorId(Long id){
        funcionarioRepository.deleteById(id);
    }

        //atualizar o funcionario
        public FuncionarioDTO atualizarFuncioncionario(Long id,FuncionarioDTO funcionarioDTO){
            Optional<FuncionarioModel> funcionarioExistente = funcionarioRepository.findById(id);
            if(funcionarioExistente.isPresent()){
                FuncionarioModel funcionarioAtualizado = funcionarioMapper.map(funcionarioDTO);
                funcionarioAtualizado.setId(id);
                FuncionarioModel funcionariosalvo = funcionarioRepository.save(funcionarioAtualizado);
                return funcionarioMapper.map(funcionariosalvo);
            }
            return null;


        }



}
