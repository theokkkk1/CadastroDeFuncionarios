package dev.java10x.CadastroDeFuncionarios.Tarefas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    private TarefasService tarefasService;

    public TarefasController(TarefasService tarefasService) {
        this.tarefasService = tarefasService;
    }

    // Listar todas tarefas
    @GetMapping("/listar")
    public List<TarefasDTO> listarTarefas(){
        return tarefasService.listarTarefas();
    }

    // Listar tarefa por id
    @GetMapping("/listar/{id}")
    public TarefasDTO listarTarefaPorId(@PathVariable Long id){
        return tarefasService.listarTarefaPorId(id);
    }

    // Criar tarefa
    @PostMapping("/criar")
    public TarefasDTO criarTarefa(@RequestBody TarefasDTO tarefa){
        return tarefasService.criarTarefa(tarefa);
    }

    // Atualizar tarefa
    @PutMapping("/alterar/{id}")
    public TarefasDTO atualizarTarefa(
            @PathVariable Long id,
            @RequestBody TarefasDTO tarefa){

        return tarefasService.atualizarTarefa(id, tarefa);
    }

    // Deletar tarefa
    @DeleteMapping("/deletar/{id}")
    public void deletarTarefa(@PathVariable Long id){
        tarefasService.deletarTarefaPorId(id);
    }
}