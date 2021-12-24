package app;

import sistema.controller.Controller;
import sistema.model.BaseDados;
import sistema.model.DVD;
import sistema.model.Estoque;
import sistema.model.Livro;
import sistema.model.Moeda;
import sistema.model.Produto;
import sistema.model.ProdutoExisteException;
import sistema.model.ProdutoNullException;
import sistema.view.AtualizarEstoque;
import sistema.view.TelaAbertura;
import sistema.view.TelaGerenciamento;

public class App {

	public static void main(String[] args) {
		BaseDados.inicializarBase();
		
		Estoque estoque;
		Livro livro1 = new Livro("CD001", 300, "9781111111111", 
								 "Mpoo na Prática", "DEmery, R.A", "UAST", 1, 2020);

		estoque = new Estoque(livro1, 10);
		try {
			BaseDados.adicionarProduto(livro1);
		} catch (ProdutoNullException | ProdutoExisteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Livro livro2 = new Livro("CD002", 150, "9782222222222", 
				 "Java para SI", "Siloé", "Prentice Hall", 1, 2018);

		estoque = new Estoque(livro2, 5);
		try {
			BaseDados.adicionarProduto(livro2);
		} catch (ProdutoNullException | ProdutoExisteException e) {
			e.printStackTrace();
		}
		
		DVD dvd = new DVD("CD003", 50, "Siloé, B.", "Gospel", 10);
		
		estoque = new Estoque(dvd, 20);
		try {
			BaseDados.adicionarProduto(dvd);
		} catch (ProdutoNullException | ProdutoExisteException e) {
			e.printStackTrace();
		}
		
		Moeda moeda1 = new Moeda("CD004", 10, "Real", 1, 1994, "Brasil", "Conservada");
		
		estoque = new Estoque(moeda1, 3);
		try {
			BaseDados.adicionarProduto(moeda1);
		} catch (ProdutoNullException | ProdutoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Moeda moeda2 = new Moeda("CD005", 5000, "Reis", 1, 1871, "Brasil", "rara");
		
		estoque = new Estoque(moeda2, 2);
		try {
			BaseDados.adicionarProduto(moeda2);
		} catch (ProdutoNullException | ProdutoExisteException e) {
			e.printStackTrace();
		}
		
		
		TelaAbertura telaAbertura = new TelaAbertura();		
		TelaGerenciamento telaGerenciamento = new TelaGerenciamento();
		
		AtualizarEstoque atualizarEstoque = new AtualizarEstoque();

		Controller controller = new Controller(telaAbertura, telaGerenciamento);
	}
}
