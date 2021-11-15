package ex2;

public class ViewLista {
    public static void main(String[] args) {
        PontosTuristicos pt1 = new PontosTuristicos();
       PontoTuristicoLista controller = new PontoTuristicoLista();
        pt1.nome = "Muralhas da China";
        pt1.descricao = "Muralha antiga e famosa na china, aparece no filme da mulan";
        pt1.localizacao = "China";
        controller.salvar(pt1);

        for (PontosTuristicos pt : controller.read()) {
            System.out.println(pt);
        }

      
    }
}
