package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View{
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.nome = "Capgemini";
        e1.cnpj = "00000000000000";
        e1.ramo = "Tecnológico";

       //convertendo de objeto para String
        try {
            FileWriter fw = new FileWriter("ex1/Empresas.csv",true);
            String empresaString = String.format("%s;%s;%s\n",e1.nome, e1.cnpj,e1.ramo);
            fw.write(empresaString);
            fw.close();    
        } 
        catch (IOException ex) {
            System.out.println("Não foi possível abrir o arquivo");
        }

        //convertendo de String para objeto
        try {
            Scanner sc = new Scanner(new File("ex1/Empresas.csv"));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                String[] empresaString = linha.split(";");

                Empresa e = new Empresa();
                e.nome = empresaString[0];
                e.cnpj = empresaString[1];
                e.ramo = empresaString[2];
                System.out.printf("%s - %s - %s", e.nome, e.cnpj, e.ramo);

            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
}