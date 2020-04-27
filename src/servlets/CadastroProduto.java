package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;
import service.ProdutoService;

/**
 * Servlet implementation class CadastroProfessor
 */
@WebServlet("/CadastroProduto.do")
public class CadastroProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        Double valor = Double.parseDouble(request.getParameter("valor"));
        int estoque = Integer.parseInt(request.getParameter("estoque"));
        
        Produto p = new Produto(codigo, nome, descricao, valor, estoque);
			
		ProdutoService service = new ProdutoService();
		
		service.cadastrar(p);
	}

}
