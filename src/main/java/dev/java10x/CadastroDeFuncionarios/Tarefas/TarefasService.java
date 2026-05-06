package dev.java10x.CadastroDeFuncionarios.Tarefas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {

    private TarefasRepository tarefasRepository;

    public TarefasService(TarefasRepository tarefasRepository) {
        this.tarefasRepository = tarefasRepository;
    }

    // Listar todas as tarefas
    public List<TarefasModel> listarTarefas(){
        return tarefasRepository.findAll();
    }

    // Listar tarefa por id
    public TarefasModel listarTarefaPorId(Long id){
        return tarefasRepository.findById(id).orElse(null);
    }

    // Criar tarefa
    public TarefasModel criarTarefa(TarefasModel tarefa){
        return tarefasRepository.save(tarefa);
    }

    // Deletar tarefa
    public void deletarTarefaPorId(Long id){
        tarefasRepository.deleteById(id);
    }

    // Atualizar tarefa
    public TarefasModel atualizarTarefa(Long id, TarefasModel tarefa){

        if(tarefasRepository.existsById(id)){

            tarefa.setId(id);

            return tarefasRepository.save(tarefa);
        }

        return null;
    }
}