package ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ControllerArquivo implements IController{


    public void salvar(String dado) {
        try {
            FileWriter fw = new FileWriter("Dados.txt",true);
            fw.write(dado);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
    
}
