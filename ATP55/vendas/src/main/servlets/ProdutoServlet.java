import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        
        String nomeProduto = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroId = req.getParameter("id_categoria");
        

        //conversão pra tipos numéricos já que leitura de parâmetros retorna string
        if(parametroValor != null && parametroId != null){
            int id_categoria = Integer.parseInt(parametroId);
            double valorProduto = Double.parseDouble(parametroValor);
            out.printf("\nNome: %s \nId: %d \nValor: %.2f",nomeProduto, id_categoria, valorProduto);      
        }else{
            out.printf("Modulo Produto \nNome Produto: %s",nomeProduto);
        }
    }
}
