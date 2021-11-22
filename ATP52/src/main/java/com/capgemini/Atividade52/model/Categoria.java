package com.capgemini.Atividade52.model;

public class Categoria {
	private int id;
	private String nome;
	private String descricao;
	
	@Override
    public String toString() {
        return "ID:"+this.id+"\nNome:"+this.nome+"\nDescrição:"+this.descricao+"\n";
    }
	
	 public Categoria() {
	    }

    public Categoria(String nome){
        this.nome = nome;
    }

    public Categoria(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Categoria(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id; 
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome; 
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao; 
    }
}
