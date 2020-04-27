package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.ProdutoService;

/**
 * Servlet implementation class ListagemProfessor
 */
@WebServlet("/ListagemProduto.do")
public class ListagemProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
		ProdutoService service = new ProdutoService();
		
		ArrayList<Produto> listaDeProdutos = service.listar();
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			out.println("Produto:" + listaDeProdutos.get(i));
			
		}
	}
}
