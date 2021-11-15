import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Classe3update{
    public static void main(String[] args) {
        try {
            String nome = "Cama e mesa e banho";
            String descricao = "Artigos diversos";
            int id = 3;
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            PreparedStatement prepStatement = con.prepareStatement("UPDATE categoria SET nome=?, descricao=? WHERE id=?");

            prepStatement.setString(1,nome);
            prepStatement.setString(2,descricao);
            prepStatement.setInt(3, id);

            prepStatement.execute();
            con.close();      
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}