package modells;
public class PessoaFisica extends Pessoa{
    public String cpf;
    public Endereco enderecoPessoal;

    @Override
    public String toString() {
        return super.toString()+ "Cpf: "+cpf +"Endereço Pessoal: "+enderecoPessoal+"\n";
    }
}
