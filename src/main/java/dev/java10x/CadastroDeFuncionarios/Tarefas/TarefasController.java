package dev.java10x.CadastroDeFuncionarios.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController //Diz pro Spring: “essa classe responde requisições HTTP”
@RequestMapping("tarefas") // Indica que tudo vai ser mapeado aqui. Define caminho base ou rota
public class TarefasController {

    // GET -- Mandar uma requisicao para mostrar as tarefas
    @GetMapping("/listar")
    public String listarTarefa(){
        return "Tarefas listadas com sucesso";
    }
    // POST -- Mandar uma requisicao para criar as tarefas
    @PostMapping("/criar")
    public String criarTarefa(){
        return "Tarefa criada com sucesso";
    }

    // PUT -- Mandar uma requisicao para alterar as tarefas
    @PutMapping("/alterar")
    public String alterarTarefa(){
        return "Tarefa alterada com sucesso";
    }

    // DELETE -- Mandar uma requisicao para deletar as tarefas
    @DeleteMapping("/Deletar")
    public String deletarTarefa(){
        return "tarefa deletada com sucesso";
    }




}
