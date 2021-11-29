package com.capgemini.clientes.controller;

import java.util.List;

import com.capgemini.clientes.model.Cliente;
import com.capgemini.clientes.repository.ClienteRepository;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class ClienteController{
    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }

    @GetMapping("/cliente")
    public String Clientes(Model req){
        List<Cliente> lista = (List<Cliente>)repository.findAll();
        req.addAttribute("clientes", lista);
        return "clientes";
    }

    @GetMapping("/cliente/form")
    public String formulario(Model req){
        Cliente model = new Cliente();
        req.addAttribute("cliente", model);
        return "cadastro-cliente";
    }

    @PostMapping("/cliente/salvar")
    public String salvar(Cliente model){
        repository.save(model);
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/deletar/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);;
        return "redirect:/cliente";
    }

    @GetMapping("/cliente/editar/{id")
    public String editar(@PathVariable int id, Model req){
        Cliente model = repository.findById(id).get();
        req.addAttribute("cliente", model);
        return "cadastro-cliente";
    }
}
