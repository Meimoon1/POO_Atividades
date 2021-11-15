import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Classe4delete {
    public static void main(String[] args) {
        try {
            int idDeletado = 3;
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
    
            PreparedStatement prepStatement = con.prepareStatement("DELETE FROM categoria WHERE id = ?");
            prepStatement.setInt(1, idDeletado);
            prepStatement.execute();

            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
