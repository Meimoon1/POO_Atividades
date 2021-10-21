package modells;
public class Serie {
    public int id;
    public String nome;
    public String genero;
    public int numTemporadas;

    @Override
    public String toString() {
        return "ID:"+this.id+"\nNome:"+this.nome+ "\nGênero: "+this.genero+"\nNúmero de Temporadas: "+this.numTemporadas+"\n";
    }
}
