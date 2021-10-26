package modells;
public class Produto extends Base{
    public String nome;
    public String categoria;
    public double valor;
   
    @Override
    public String toString() {
        return super.toString()+ "Nome:"+this.nome+"\nCategoria:"+this.categoria+"\nValor:"+this.valor+"\n";
    }
    
}