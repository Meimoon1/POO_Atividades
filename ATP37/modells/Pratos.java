package modells;

public class Pratos extends Base{
    public String tipo;
    public String cor;
    public double valor;

   @Override
   public String toString() {
       return "Tipo do Prato:"+this.tipo+"\nCor:"+this.cor+"\nValor:"+this.valor+"\n"+super.toString();
   }
}