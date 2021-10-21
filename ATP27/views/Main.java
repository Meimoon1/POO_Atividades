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

        filmeController.create(f2);

        System.out.println(filmeController.existe(f2));

      
       Filme f3 = new Filme();
       f3.id = 12039;
       f3.nome = "A sociedade do Anel";
       f3.genero = "Fantasia";


       Serie s2 = new Serie();
       s2.id = 2939;
       s2.nome = "Greys Anatomy";
       s2.genero = "Sofrencia";
       s2.numTemporadas = 18;

       serieController.create(s2);

       filmeController.delete(f2);

       for (Filme f : filmeController.read()) {
        System.out.println(f);
    }

    for (Serie s : serieController.read()) {
        System.out.println(s);
    }
    
   

        

    }
}
