package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View{
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e.nome = "Capgemini";
        e.cnpj = "00000000000000";
        e.ramo = "Tecnológico";

       //convertendo de objeto para String
        try {
            FileWriter fw = new FileWriter("Empresas.csv",true);
            String empresaString = String.format("%s;%s;%s\n",e1.nome, e1.cnpj,e1.ramo);
            fw.write(empresaString);
            fw.close();    
        } 
        catch (IOException ex) {
            System.out.println("Não foi possível abrir o arquivo");
        }

        //convertendo de String para objeto
        try {
            Scanner sc = new Scanner(new File("Carros.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] empresaString = linha.split(";");

                Empresa e = new Empresa();
                e.nome = empresaString[0];
                e.cnpj = empresaString[1];
                e.ramo = empresaString[2];

            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
}