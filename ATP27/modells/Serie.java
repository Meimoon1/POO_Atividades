package modells;
public class Serie {
    public int id;
    public String nome;
    public String genero;
    public int numTemporadas;

    @Override
    public String toString() {
        return "ID:"+this.id+"Nome:"+this.nome+ "Gênero: "+this.genero+"Número de Temporadas: "+this.numTemporadas+"\n";
    }
}
