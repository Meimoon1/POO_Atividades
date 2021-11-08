package ex2;

import java.io.FileWriter;
import java.io.IOException;

public class ControllerArquivo implements IController{


    public String salvar(PontosTuristicos model) {
        String retorno;
        try {
            FileWriter fw = new FileWriter("pontosturisticos.csv",true);
            fw.write(model.toString() + "\n");
            fw.close();
            retorno = String.format("Ponto turístico: % salvo com sucesso",model.nome)
        } catch (IOException e) {
            System.out.println("Erro ao salvar ponto turístico");
        }
        return retorno;
    }
    
}
