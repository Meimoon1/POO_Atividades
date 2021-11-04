import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("dados/nomes.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            while(br.ready()){
                String nomes = br.readLine();
                System.out.println(nomes);
            }
            br.close();
            } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            }catch(IOException e){
                System.out.println("Arquivo não encontrado");
            }
    }
}