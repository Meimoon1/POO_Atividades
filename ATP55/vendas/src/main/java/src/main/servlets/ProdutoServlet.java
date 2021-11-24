package src.main.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Produto;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Produto p1 = new Produto();
        
        
        String nomeProduto = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroId = req.getParameter("id_categoria");
        p1.setNome(nomeProduto);
        out.print("Modulo Produto");

        //conversão pra tipos numéricos já que leitura de parâmetros retorna string
        if(parametroValor != null && parametroId != null){
            p1.setIdCategoria(Integer.parseInt(parametroId));
            p1.setValor(Float.parseFloat(parametroValor));
            out.printf("\nNome: %s \nId: %d \nValor: %.2f",p1.getNome(),p1.getIdCategoria(),p1.getValor());      
        }else{
            out.printf("Nome Produto: %s",p1.getNome());
        }
    }
}
