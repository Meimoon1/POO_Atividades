package modells;

public class Endereco extends Base{
    public String rua;
    public String bairro;
    public String numero;
    public String cep;
    
    @Override
    public String toString() {
        return "Rua: "+this.rua+"\nBairro: "+bairro+"\nNúmero: "+numero+"\nCEP: "+cep+"\n";
    }
}
