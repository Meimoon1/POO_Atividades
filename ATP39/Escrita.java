import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Escrita {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("dados/terminal.txt");
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);


            OutputStream fos = System.out;
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);


            String dados = br.readLine();
            while(dados != null && !dados.equals("sair")){
                dados = br.readLine();
                bw.write(dados+"\n");
            }
            br.close();
            bw.close();

        }catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }catch(IOException exp){
            System.out.println("Arquivo não encontrado");
        }
    }
}
