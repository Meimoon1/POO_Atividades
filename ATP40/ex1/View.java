package ex1;

import java.io.FileWriter;

public class View{
    private static String fileName = "ex1/empresas.csv";
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Capgemini";
        empresa.cnpj = "00000000000000";
        empresa.ramo = "Tecnológico";

        String empresaString = String.format("%s;%s;%s", empresa.nome, empresa.cnpj, empresa.ramo);


        //escrita
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}