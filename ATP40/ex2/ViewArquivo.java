package ex2;
public class ViewArquivo {
   public static void main(String[] args) {
       PontosTuristicos pt1 = new PontosTuristicos();
       PontoTuristicoArquivo controller = new PontoTuristicoArquivo();
        pt1.nome = "Cristo Redentor";
        pt1.descricao = "Uma das sete maravilhas do mundo moderno";
        pt1.localizacao = "Rio de Janeiro";
        controller.salvar(pt1);

        for (PontosTuristicos p : controller.read()) {
           System.out.println(p);
        }
   } 
}
