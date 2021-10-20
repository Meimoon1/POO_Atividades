package views;
import modells.Filme;
import modells.Serie;
import controllers.FilmeController;
import controllers.SerieController;

public class Main {
    public static void main(String[] args) {
        FilmeController filmeController = new FilmeController();
        SerieController serieController = new SerieController();

        Filme f1 = new Filme();
        f1.id = 10090;
        f1.nome = "Invocação do mal 2";
        f1.genero = "Terror";

        Serie s1 = new Serie();
        s1.id = 2112;
        s1.nome = "The Haunted of Hill House";
        s1.genero = "Terror";
        s1.numTemporadas = 1;

        filmeController.create(f1);
        serieController.create(s1);

        Filme f2 = new Filme();
        f1.id = 10090;
        f1.nome = "Invocação do mal 2";
        f1.genero = "Terror";

        System.out.println(filmeController.existe(f2));

        serieController.delete(s1);

    }
}
