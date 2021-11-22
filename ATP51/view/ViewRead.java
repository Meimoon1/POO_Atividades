package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class ViewRead {
    public static void main(String[] args) {
        try(Connection con = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(con);
           
            for(Categoria c: dao.read()){
                System.out.println(c);
            }
        }
        catch(SQLException e){
            System.out.println("Não foi possível conectar!");
        } 
    }
}
