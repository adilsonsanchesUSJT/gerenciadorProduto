package service;

import java.util.ArrayList;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService {
	private ProdutoDAO produtoDao;

	public ProdutoService() {
		this.produtoDao = new ProdutoDAO();
	}
	
	public void cadastrar(Produto professor) {
		this.produtoDao.cadastrar(professor);
	}
	
	public void alterar(Produto professor) {
		this.produtoDao.alterar(professor);
	}
	
	public void excluir(Produto professor) {
		this.produtoDao.excluir(professor);
	}
	
	public Produto consultar(Produto professor) {
		return this.produtoDao.consultar(professor.getCodigo());
	}
	
	public ArrayList<Produto> listar() {
		return this.produtoDao.listarProdutos();
	}
}
