import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Classe3 {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = cn.createStatement();
            String sql = "UPDATE categoria set nome = 'Alimentos no geral' where id <=3";
            statement.execute(sql);

            int linhasAfetadas = statement.getUpdateCount();
            System.out.println("A quantidade de linhas afetadas foi:"+linhasAfetadas);
            cn.close();
        } catch (Exception e) {
            System.out.println("Não foi possível alterar o arquivo");
        }
    }
}
