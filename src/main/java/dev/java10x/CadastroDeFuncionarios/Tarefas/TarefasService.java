package dev.java10x.CadastroDeFuncionarios.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TarefasService {

    private TarefasRepository tarefasRepository;
    private TarefasMapper tarefasMapper;

    public TarefasService(
            TarefasRepository tarefasRepository,
            TarefasMapper tarefasMapper) {

        this.tarefasRepository = tarefasRepository;
        this.tarefasMapper = tarefasMapper;
    }

    // Listar todas as tarefas
    public List<TarefasDTO> listarTarefas(){

        List<TarefasModel> tarefas = tarefasRepository.findAll();

        return tarefas.stream()
                .map(tarefasMapper::map)
                .collect(Collectors.toList());
    }

    // Listar tarefa por id
    public TarefasDTO listarTarefaPorId(Long id){

        Optional<TarefasModel> tarefaId =
                tarefasRepository.findById(id);

        return tarefaId
                .map(tarefasMapper::map)
                .orElse(null);
    }

    // Criar tarefa
    public TarefasDTO criarTarefa(TarefasDTO tarefasDTO){

        TarefasModel tarefa =
                tarefasMapper.map(tarefasDTO);

        tarefa = tarefasRepository.save(tarefa);

        return tarefasMapper.map(tarefa);
    }

    // Deletar tarefa
    public void deletarTarefaPorId(Long id){
        tarefasRepository.deleteById(id);
    }

    // Atualizar tarefa
    public TarefasDTO atualizarTarefa(
            Long id,
            TarefasDTO tarefasDTO){

        Optional<TarefasModel> tarefaExistente =
                tarefasRepository.findById(id);

        if(tarefaExistente.isPresent()){

            TarefasModel tarefaAtualizada =
                    tarefasMapper.map(tarefasDTO);

            tarefaAtualizada.setId(id);

            TarefasModel tarefaSalva =
                    tarefasRepository.save(tarefaAtualizada);

            return tarefasMapper.map(tarefaSalva);
        }

        return null;
    }
}