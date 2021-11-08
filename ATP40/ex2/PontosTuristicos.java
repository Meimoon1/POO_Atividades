package ex2;
public class PontosTuristicos{
    public String nome;
    public String descricao;
    public String localizacao;

    @Override
    public String toString() {
        return "Nome: " + this.nome + "Descrição: " + this.descricao + "Localização: ";
    }
}