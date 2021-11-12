import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Classe1{
    public static void main(String[] args) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = cn.createStatement();
            String sql = "SELECT * FROM categoria";
            statement.execute(sql);
            ResultSet resultado = statement.getResultSet();

            while(resultado.next()){
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String descricao = resultado.getString("descricao");
                System.out.println("Id:"+id+" Nome:"+ nome+" Descricao:"+descricao+"\n");

                
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Não foi possível acessar o arquivo");
        }
    }
}