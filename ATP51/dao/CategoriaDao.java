package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;

public class CategoriaDao {
    private Connection con;

    public CategoriaDao(){
        this.con = con;
    }

    //métodos crud
    public void create(Categoria model)throws SQLException{
        String sql = "INSERT INTO categoria(nome,descricao)values(?,?)";
        PreparedStatement prepStatement = this.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        prepStatement.setString(1,model.getNome());
        prepStatement.setString(2,model.getDescricao());
        prepStatement.execute();
        ResultSet ids = prepStatement.getGeneratedKeys();

        while(ids.next()){
            int id = ids.getInt(1);
            System.out.println(id);
        }      
    }

    public ArrayList<Categoria> read() throws SQLException{
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        String sql = "SELECT * FROM categoria";
        PreparedStatement prepStatement= con.prepareStatement(sql);
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();

        while(result.next()){
            Categoria c1  = new Categoria(result.getInt("id"), result.getString("nome"), result.getString("descricao"));
            lista.add(c1);
        }
        return lista;
    }

    public int update(Categoria model) throws SQLException{
        String sql = "UPDATE categoria SET nome = ? where id = ?";
        PreparedStatement prepStatement = con.prepareStatement(sql);
        prepStatement.setString(1,model.getNome());
        prepStatement.setInt(2,model.getId());
        prepStatement.execute();

        int linhasAfetadas = prepStatement.getUpdateCount();
        return linhasAfetadas;
    }   
    
    public int delete(int id) throws SQLException{
        String sql = "DELETE FROM categoria WHERE id = ?";
        PreparedStatement prepStatement = con.prepareStatement(sql);
        prepStatement.setInt(1,id);
        prepStatement.execute();

        int linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);

        return linhasAfetadas;
    } 
}
