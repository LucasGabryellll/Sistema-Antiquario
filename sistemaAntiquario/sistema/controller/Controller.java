package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sistema.model.BaseDados;
import sistema.view.AtualizarEstoque;
import sistema.view.TelaAbertura;
import sistema.view.TelaGerenciamento;

public class Controller {

	private TelaAbertura telaAbertura;
	private AberturaController aberturaController;
	
	private TelaGerenciamento telaGerenciamento;
	private GerenciamentoController gerenciamentoController;
	
	private CadastroProdutoController cadastroProdutoController;
	
	public Controller(TelaAbertura telaAbertura, TelaGerenciamento telaGerenciamento) {
		this.telaAbertura = telaAbertura;
		this.telaGerenciamento = telaGerenciamento;
		
		aberturaController = new AberturaController(telaAbertura, telaGerenciamento);
		gerenciamentoController = new GerenciamentoController(telaGerenciamento);
		cadastroProdutoController = new CadastroProdutoController(telaGerenciamento);
		
	}

}
