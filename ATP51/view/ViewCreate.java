package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class ViewCreate {
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(con);
            Categoria c1 = new Categoria(14,"Entretenimento","Jogos e ítens de entretenimento");

            dao.create(c1);
        }
        catch(SQLException e){
            System.out.println("Não foi possível conectar!");
        }
    }
}
