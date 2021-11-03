import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("dados/estados.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("Bahia\n");
            bw.write("São Paulo\n");
            bw.write("Paraná\n");
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }catch(IOException e){
            System.out.println("Arquivo não encontrado");
        }
    }
}
