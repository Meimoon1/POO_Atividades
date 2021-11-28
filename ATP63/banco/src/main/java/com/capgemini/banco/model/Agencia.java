package com.capgemini.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "agencia")
public class Agencia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String localizacao;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getLocalizacao() {
        return localizacao;
    }

}