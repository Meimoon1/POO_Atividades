package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import dao.CategoriaDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categoria;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //criando cateogira e passando requisição
        Categoria c1 = new Categoria();
        c1.setNome(req.getParameter("nome"));
        c1.setDescricao(req.getParameter("descricao"));
        CategoriaDao dao = new CategoriaDao();
        dao.insert(c1);
    

        PrintWriter out = resp.getWriter();
        out.println("Modulo Categoria");
        out.printf("Nome da categoria: %s \nDescricao: %s", c1.getNome(), c1.getDescricao());

    }  
}
