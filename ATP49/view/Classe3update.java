package view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Classe3update{
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()) {
            String nome = "Cama e mesa e banho";
            int id = 11;
            String sql = "UPDATE categoria SET nome=?, descricao=? WHERE id=?";

            PreparedStatement prepStatement = con.prepareStatement(sql);

            prepStatement.setString(1,nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();  
            
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}