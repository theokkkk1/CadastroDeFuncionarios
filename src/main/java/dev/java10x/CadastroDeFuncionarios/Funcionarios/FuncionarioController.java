package dev.java10x.CadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/funcionarios"})
public class FuncionarioController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo a primeira rota";
    }

    //Adicionar Funcionario(Create)
    @PostMapping("/criar")
    public String criarFuncionario(){
        return "Funcionario Criado";
    }

    //Mostrar Todos Funcionarios (READ)
    @GetMapping ("/listar")
    public String mostrarFuncionario(){
        return "Mostrar Funcionario";
    }

    //Mostrar Funcionarios por ID (READ)
    @GetMapping ("/listarid")
    public String mostrarIDFuncionario(){
        return "Mostrar Funcionario por ID";
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
