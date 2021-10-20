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
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public void delete(T obj){
        this.informacoes.remove(obj);
    }
    public boolean existe(T obj){
        return this.informacoes.contains(obj);
    }

   
}