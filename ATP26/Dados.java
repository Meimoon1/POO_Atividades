
public class Dados {
    private Object dados[];
    int tamanho = 5;
    int posicao = 0;


    public Dados(){
        this.dados = new Object[tamanho];
    }

    public void Adicionar(Object obj){
        if(posicao < dados.length){
            dados[posicao]=obj;
            posicao++;
        }else{
            Object[]dados2 = new Object[dados.length+5];
            dados = dados2;
        }
    }

    public int lista(){
       return posicao+1;
    }

    public void remover(Object obj){
        
    }
}
