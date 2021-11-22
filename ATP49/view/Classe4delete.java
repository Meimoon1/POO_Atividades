package view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Classe4delete {
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()) {
            int idDeletado = 3;
            String sql = "DELETE FROM categoria WHERE id = ?";

            try(PreparedStatement prepStatement = con.prepareStatement(sql);) {    
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute();

                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
