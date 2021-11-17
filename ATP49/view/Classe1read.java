package view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.ConnectionFactory;

public class Classe1read {
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()) {
            PreparedStatement prepStatement = con.prepareStatement("SELECT * FROM CATEGORIA");
            prepStatement.execute();
            ResultSet r = prepStatement.getResultSet();

            while(r.next()){
                int id = r.getInt("id");
                String nome = r.getString("nome");
                String descricao = r.getString("descricao");

                System.out.println(id+"\n"+nome+"\n"+descricao+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
