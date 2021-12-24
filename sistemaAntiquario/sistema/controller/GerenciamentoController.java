package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import sistema.model.BaseDados;
import sistema.view.TelaGerenciamento;

public class GerenciamentoController implements ActionListener {

	TelaGerenciamento telaGerenciamento;
	
	public GerenciamentoController(TelaGerenciamento telaGerenciamento) {
		this.telaGerenciamento = telaGerenciamento;
		
		telaGerenciamento.getItemCadastrarMenu().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		
		controll();
	}

	public void controll() {
		telaGerenciamento.getItemCadastrarMenu().addActionListener(this);
		telaGerenciamento.getItemPromocao().addActionListener(this);
		
		telaGerenciamento.getCadastroProdutoPanel().getLivroRadio().addActionListener(this);
		telaGerenciamento.getCadastroProdutoPanel().getDvdRadio().addActionListener(this);
		telaGerenciamento.getCadastroProdutoPanel().getMoedaRadio().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaGerenciamento.getItemCadastrarMenu()) {
			telaGerenciamento.getCadastroProdutoPanel().setVisible(true);
		}
		
		if (telaGerenciamento.getCadastroProdutoPanel().getLivroRadio().isSelected() == true) {
			telaGerenciamento.getCadastroProdutoPanel().getLivroPanel().setVisible(true);
		
		} else {
			telaGerenciamento.getCadastroProdutoPanel().getLivroPanel().setVisible(false);
		}
		
		if (telaGerenciamento.getCadastroProdutoPanel().getDvdRadio().isSelected() == true) {
			telaGerenciamento.getCadastroProdutoPanel().getDvdPanel().setVisible(true);
		} else {
			telaGerenciamento.getCadastroProdutoPanel().getDvdPanel().setVisible(false);
		}
		
		if (telaGerenciamento.getCadastroProdutoPanel().getMoedaRadio().isSelected() == true) {
			telaGerenciamento.getCadastroProdutoPanel().getMoedaPanel().setVisible(true);
		
		} else {
			telaGerenciamento.getCadastroProdutoPanel().getMoedaPanel().setVisible(false);
		}
		
	}
}
