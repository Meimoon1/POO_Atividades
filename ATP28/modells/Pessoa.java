package modells;

public abstract class Pessoa extends Base {
    public String nome;
    public String sobrenome;

    @Override
    public String toString() {
        return "Nome: "+this.nome + "\nSobrenome: "+sobrenome +"\n";
    }
}
