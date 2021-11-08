package ex2;

public class View {
    public static void main(String[] args) {
        PontosTuristicos pt1 = new PontosTuristicos();
        IController c = new ControllerArquivo();
        pt1.nome = "Cristo Redentor";
        pt1.descricao = "Uma das sete maravilhas do mundo moderno";
        pt1.localizacao = "Rio de Janeiro";
        c.salvar(pt1);

        
        
    }
}
