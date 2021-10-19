public class Pessoa{
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        Pessoa p = (Pessoa)obj;
        return (this.nome == p.nome && this.sobrenome == p.sobrenome && this.idade == p.idade);
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\n";
    }
}