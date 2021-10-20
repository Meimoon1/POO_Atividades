
public class Pessoa{
    public String nome;
    public String sobrenome;
    public int idade;

    //usado para compara o que é igual da classe
    @Override
    public boolean equals(Object obj) {
        //instance of pega qualquer variavel e verificar se foi criada como pessoa
        if(obj instanceof Pessoa){
            Pessoa outra = (Pessoa)obj;
            if(this.nome.equals(outra.nome) && this.sobrenome.equals(outra.sobrenome) && this.idade == outra.idade){
                return true;
            }
        }      
        return false;
    }

    @Override
    public String toString() {
        return "Nome: "+ this.nome + "\nSobrenome: " + this.sobrenome + "\nIdade: " + this.idade + "\n";
    }
}