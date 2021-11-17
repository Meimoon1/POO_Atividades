package view;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Classe2Create{
    public static void main(String[] args) {
        try {
            String nome = "Doces";
            String descricao = "Doces diversos e caseiros";
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            PreparedStatement prepStatement = con.prepareStatement("INSERT INTO categoria(nome, descricao)VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();
         
            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}