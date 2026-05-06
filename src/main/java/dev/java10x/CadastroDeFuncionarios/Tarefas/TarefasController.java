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
    public List<TarefasModel> listarTarefas(){
        return tarefasService.listarTarefas();
    }

    // Listar tarefa por id
    @GetMapping("/listar/{id}")
    public TarefasModel listarTarefaPorId(@PathVariable Long id){
        return tarefasService.listarTarefaPorId(id);
    }

    // Criar tarefa
    @PostMapping("/criar")
    public TarefasModel criarTarefa(@RequestBody TarefasModel tarefa){
        return tarefasService.criarTarefa(tarefa);
    }

    // Atualizar tarefa
    @PutMapping("/alterar/{id}")
    public TarefasModel atualizarTarefa(
            @PathVariable Long id,
            @RequestBody TarefasModel tarefa){

        return tarefasService.atualizarTarefa(id, tarefa);
    }

    // Deletar tarefa
    @DeleteMapping("/deletar/{id}")
    public void deletarTarefa(@PathVariable Long id){
        tarefasService.deletarTarefaPorId(id);
    }
}