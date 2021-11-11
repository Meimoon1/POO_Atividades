import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Classe1 {
   public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            Statement statement = cn.createStatement();
            statement.execute("SELECT * FROM produtos");
            ResultSet resultado = statement.getResultSet();
            
            while(resultado.next()){
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String descricao = resultado.getString("descricao");
                String

            }


        } 
        catch (SQLException e) {
            System.out.println("Não foi possível conectar");
        }
   } 
}
