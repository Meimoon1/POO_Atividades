import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Classe4 {
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = cn.createStatement();
            String sql = "DELETE FROM categoria WHERE id >= 7";
            statement.execute(sql);
            
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println("O número de linhas afetas foi:"+linhasAfetadas);
            cn.close();
            
        } catch (Exception e) {
            System.out.println("Não foi possível excluir o dado");
        }
    }
}
