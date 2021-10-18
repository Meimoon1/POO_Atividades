package model;
public class Livros{
    private int id;
    private String nome;
    private String autor;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    
    @Override
    public String toString() {
        return " Id: "+id+"\n Nome:"+ nome+ "\n Autor:"+autor;
    }
    
}