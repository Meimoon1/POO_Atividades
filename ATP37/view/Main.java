package view;
import controllers.PratoController;
import modells.Pratos;

public class Main {
    public static void main(String[] args) {
        Pratos p1 = new Pratos();
        PratoController pc = new PratoController();

        p1.id = 1;
        p1.tipo = "Raso";
        p1.cor = "Vermelho";
        p1.valor = 5.34;
        pc.create(p1);

        Pratos p2 = new Pratos();
        p2.id = 2;
        p2.tipo = "Raso";
        p2.cor = "Branco";
        p2.valor = 4.24;
        pc.create(p2);

        for (Pratos p : pc.read()) {
            System.out.println(p);
        }


    }
}
