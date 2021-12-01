package com.capgemini.clientes.api;

import java.util.List;

import com.capgemini.clientes.model.Cliente;
import com.capgemini.clientes.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteApi {
    //invejação de dependencia, não precisa de construtor,
    @Autowired
    private ClienteRepository repository;

    @GetMapping("/api/cliente")
    public List<Cliente> clientes(){
        List<Cliente> lista = (List<Cliente>)repository.findAll();
        return lista;
    }

    @PostMapping("/api/cliente")
    public String salvar(@RequestBody Cliente model){
        repository.save(model);
        return "salvo com sucesso";
    }

    @DeleteMapping("/api/cliente/{id}")
    public String deletar(@PathVariable int id){
        repository.deleteById(id);
        return "deletado com sucesso";
    }

    @PutMapping("/api/cliente/{id}")
    public String update(@RequestBody Cliente model, @PathVariable int id){
        if(model.getId() == id){
            repository.save(model);
            return "alterado com sucesso";
        }
        return "id não identificado";
    }




}
