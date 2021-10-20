package modells;
public class Filme{
    public int id;
    public String nome;
    public String genero;
    
    @Override
    public String toString() {
        return "ID:"+this.id+"Nome: "+ this.nome + "Gênero: "+this.genero;
    }
}