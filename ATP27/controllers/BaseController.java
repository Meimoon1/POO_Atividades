package controllers;
import java.util.ArrayList;

public class BaseController<T>{
    private ArrayList<T> informacoes;

    public BaseController(){
        this.informacoes = new ArrayList<T>();
    }

    public void create(T obj){
        this.informacoes.add(obj);
    }

    public ArrayList<T> read(){
        return this.informacoes;
    }

    public void update(T obj){
        if(this.informacoes.contains(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.informacoes.remove(obj);
    }

   
}