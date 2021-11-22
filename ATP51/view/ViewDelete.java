package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import dao.ConnectionFactory;

public class ViewDelete {
public static void main(String[] args) {
    try(Connection con = new ConnectionFactory().getConnection()){
        CategoriaDao dao = new CategoriaDao(con);

        dao.delete(12);
    }
    catch(SQLException e){
        System.out.println("Não foi possível conectar!");
    }
  } 
}

