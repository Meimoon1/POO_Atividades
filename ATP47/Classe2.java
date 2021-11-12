import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Classe2 {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = cn.createStatement();
            String sql = "INSERT INTO categoria(nome, descricao)values('Beleza e higiene pessoal','ìtens de higiene e beleza')";
            statement.execute(sql);
            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }
            cn.close();

        } catch (Exception e) {
            System.out.println("Não foi possível adicionar ao arquivo");
        }
    }
}
