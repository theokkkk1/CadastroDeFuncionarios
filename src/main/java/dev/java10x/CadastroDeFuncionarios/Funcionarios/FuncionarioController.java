package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/funcionarios"})
public class FuncionarioController{

    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo a primeira rota";
    }

    //Adicionar Funcionario(Create)
    @PostMapping("/criar")
    public FuncionarioModel criarFuncionario(@RequestBody FuncionarioModel funcionario){
        return funcionarioService.criarFuncionario(funcionario);
    }

    //Mostrar Todos Funcionarios (READ)
    @GetMapping("/listarfuncionarios")
    public List<FuncionarioModel> mostrarFuncionario(){
        return funcionarioService.listarFuncionarios();
    }

    //Mostrar Funcionarios por ID (READ)
    @GetMapping ("/listar/{id}")
    public FuncionarioModel mostrarIDFuncionario(@PathVariable Long id){
        return funcionarioService.listarFuncionarioPorId(id);

    }

    //Alterar dados do Funcionario (UPDATE)
    @PutMapping ("/alterarID")
    public String alterarFuncionarioID(){
        return "Alterar Funcionario Por ID";
    }

    //Deletar Funcionario (DELETE)
    @DeleteMapping ("/deletarID")
    public String deletarFuncionarioID(){
        return "Funcionario Deletado";
    }





}
