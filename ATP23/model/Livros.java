package model;
public class Livros{
    public int id;
    public String nome;
    public String autor;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Livros){
            Livros outro =(Livros)obj;
            if(this.id == outro.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return " Id: "+this.id+"\n Nome:"+ this.nome+ "\n Autor:"+ this.autor;
    }
    
}