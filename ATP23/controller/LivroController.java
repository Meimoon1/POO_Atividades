package controller;
import java.util.ArrayList;
import model.Livros;

public class LivroController {
    private ArrayList<Livros> livros;

    public LivroController(){
        this.livros = new ArrayList<Livros>();
    }

    public void create(Livros l){
        this.livros.add(l);
    }
    
    public ArrayList<Livros>read(){
        return this.livros;
    }

    public void update(Livros l){
        if(this.livros.contains(l)){
            this.delete(l);
            this.create(l);
        }
    }

    public void delete(Livros l){
        this.livros.remove(l);
    }


    
}
