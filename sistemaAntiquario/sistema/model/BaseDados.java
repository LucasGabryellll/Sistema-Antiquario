package sistema.model;

import java.util.ArrayList;

import sistema.view.AtualizarEstoque;
import sistema.view.Mensagem;

public class BaseDados {
	
	private static ArrayList<Produto> produtos;
	
	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();
		
	}

	public static Produto buscarProduto(Produto produto) {
		
		for (Produto produtoCurrent : produtos) {
			if (produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras())) {
				return produtoCurrent;
			
			}
		}
		
		return null;
	}
	
	public static Produto buscarProduto(String codBarras)  {
		
		for (Produto produtoCurrent : produtos) {
			if (produtoCurrent.getCodBarras().equalsIgnoreCase(codBarras)) {
				return produtoCurrent;
			
			} 
		}
		
		return null;
	}
	
	public static boolean isProduto(Produto produto) throws ProdutoNullException {
		return produtos.contains(buscarProduto(produto));
	}
	
	public static boolean adicionarProduto(Produto produto) throws ProdutoNullException, ProdutoExisteException {
		
		if (produto != null) {
			if (!isProduto(produto)) {
				return produtos.add(produto);
			
			} else {
				throw new ProdutoExisteException(TipoErro.EXISTE_PRODUTO);
			}
		
		} else {
			throw new ProdutoNullException(TipoErro.NULL_PRODUTO);
		}

	}
	
	public static boolean atualizarEstoque(Estoque estoque) throws Exception {
		
//		buscarProduto()
		
		if (estoque.getQuantidade() > 0) {
			return true;
		
		} else {
			throw new Exception(TipoErro.QUANTIDADE_ITEM_ERROR);			
		}
	}

	
	
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
		
}
