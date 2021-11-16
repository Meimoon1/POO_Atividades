import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Classe1read {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            PreparedStatement prepStatement = con.prepareStatement("SELECT * FROM CATEGORIA");
            prepStatement.execute();
            ResultSet r = prepStatement.getResultSet();

            while(r.next()){
                int id = r.getInt("id");
                String nome = r.getString("nome");
                String descricao = r.getString("descricao");

                System.out.println(id+"\n"+nome+"\n"+descricao+"\n");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
