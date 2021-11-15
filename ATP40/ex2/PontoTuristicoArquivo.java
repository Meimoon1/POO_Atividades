package ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PontoTuristicoArquivo implements IPontosTuristicos{
    private String filename = "ex2/pontosturisticos.csv";

    @Override
    public String salvar(PontosTuristicos model) {
        String retorno = "Salvo com sucesso!";
        try {
            FileWriter fw = new FileWriter(filename,true);
            fw.write(model.toString() + "\n");
            fw.close();
            System.out.println(retorno);
        } catch (IOException e) {
            System.out.println("Erro ao salvar ponto turístico");
        }
        return retorno;
    }

    
    @Override
    public ArrayList<PontosTuristicos> read() {
        ArrayList<PontosTuristicos>pontosTuristicos = new ArrayList<PontosTuristicos>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] dados = linha.split(";");
                PontosTuristicos pt = new PontosTuristicos();
                pt.nome = dados[0];
                pt.descricao = dados[1];
                pt.localizacao = dados[2];
                pontosTuristicos.add(pt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pontosTuristicos;
    }
    
}
