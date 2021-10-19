
public class Dados {
    private Object dados[];
    int tamanho = 5;
    int posicao = 0;


    public Dados(){
        this.dados = new Object[tamanho];
    }

    public String adicionar(Object obj){
        String mensagem ="Salvo com sucesso";
        if(posicao < dados.length){
            dados[posicao] = obj;
            posicao++;
        }else{
            tamanho = tamanho +5;
            Object[]dados2 = new Object[tamanho];

            for(int i = 0; i < dados.length; i++){
                dados2[i]= dados[i];
            }
            dados = dados2;
        }
        return mensagem;
    }

    public int lista(){
       return posicao+1;
    }

    public String remover(Object obj){
        String mensagem = "Removido com sucesso";

        for(int i = 0; i < dados.length; i++){
            if(dados[i].equals(obj)){
                posicao--;     
            }
        }
        return mensagem;
    }

    public boolean buscar(Object obj){
        for(int i =0; i< posicao; i++){
            if(dados[i].equals(obj)){
                return true;
            }
        }
        return false;
    }
}
