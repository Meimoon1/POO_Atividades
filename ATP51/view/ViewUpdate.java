package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(con);
            Categoria model = new Categoria(1, "Update de categoria");
            System.out.println(dao.update(model));
            
        }
        catch(SQLException e){
            System.out.println("Não foi possível conectar!");
        } 
    }
}
