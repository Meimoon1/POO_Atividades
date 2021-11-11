import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Classe2{
   public static void main(String[] args) {
       try {
        Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        Statement statement = cn.createStatement();
        String sql = "INSERT INTO produto(nome,descricao,preco,id_categoria)values('Doritos','Salgadinho de queijo nacho',8.90,3)"; 

        statement.execute(sql,statement.RETURN_GENERATED_KEYS);
        ResultSet ids = statement.getGeneratedKeys();

        while(ids.next()){
            int id = ids.getInt(1);
            System.out.println(id);
        }   
    } 
    catch (SQLException e) {
        e.printStackTrace();
    }
   } 
}