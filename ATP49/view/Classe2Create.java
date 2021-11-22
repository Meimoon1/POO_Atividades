package view;
import java.sql.Statement;
import utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Classe2Create{
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()) {
            String nome = "Acessórios e Moda";
            String descricao = "Acessórios em geral";
            
            PreparedStatement prepStatement = con.prepareStatement("INSERT INTO categoria(nome, descricao)VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            prepStatement.execute();

            ResultSet ids = prepStatement.getGeneratedKeys();
         
            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}