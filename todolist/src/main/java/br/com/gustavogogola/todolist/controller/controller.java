package br.com.gustavogogola.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/primeiraRota")
//http://localhost:8080/primeiraRota
public class controller {
    
    /**
     * Métodos de acesso do HTTP
     * GET - Buscar informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar uma informação	
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da informação/dado
     */

    //Método (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
