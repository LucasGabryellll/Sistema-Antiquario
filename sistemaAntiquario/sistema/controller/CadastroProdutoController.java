package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import sistema.model.BaseDados;
import sistema.model.DVD;
import sistema.model.Estoque;
import sistema.model.Livro;
import sistema.model.Moeda;
import sistema.model.ProdutoExisteException;
import sistema.model.ProdutoNullException;
import sistema.view.Mensagem;
import sistema.view.TelaGerenciamento;

public class CadastroProdutoController implements CaretListener, ActionListener{

	TelaGerenciamento telaGerenciamento;
	Mensagem mensagem;
	
	public CadastroProdutoController(TelaGerenciamento telaGerenciamento) {
		this.telaGerenciamento = telaGerenciamento;
		
		controll();
	}

	public void controll() {
		telaGerenciamento.getCadastroProdutoPanel().getCadastrarButton().addActionListener(this);
	}
	
	public void validarCaracter() {
//		KeyEvent event = new CadastroProdutoController(telaGerenciamento);
//		
//		if (!Character.isDigit(event.getKeyChar())) {
//			event.consume();
//		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == telaGerenciamento.getCadastroProdutoPanel().getCadastrarButton()) {
			if (telaGerenciamento.getCadastroProdutoPanel().getLivroPanel().isFocusable()) {
				
				Livro livroTemp = new Livro(telaGerenciamento.getCadastroProdutoPanel().getCodBarrasField().getText(), 
											Double.parseDouble(telaGerenciamento.getCadastroProdutoPanel().getPrecoField().getText()), 
											telaGerenciamento.getCadastroProdutoPanel().getIsbnLivroField().getText(), 
											telaGerenciamento.getCadastroProdutoPanel().getTituloLivroField().getText(),
											telaGerenciamento.getCadastroProdutoPanel().getAutorLivroField().getText(), 
											telaGerenciamento.getCadastroProdutoPanel().getEditoraLivroField().getText(), 
											Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getVolumeLivroField().getText()), 
											Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getVolumeLivroField().getText()));
				Estoque estoque = new Estoque(livroTemp, Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getQuantidadeEstoqueField().getText()));
				
				try {
					BaseDados.adicionarProduto(livroTemp);
				} catch (NumberFormatException | ProdutoNullException | ProdutoExisteException e1) {
					Mensagem.exibirMensagem(e1.getMessage());
					e1.printStackTrace();
				}
			}
			
			if (telaGerenciamento.getCadastroProdutoPanel().getDvdPanel().isFocusable()) {
				DVD dvd = new DVD(telaGerenciamento.getCadastroProdutoPanel().getCodBarrasField().getText(),
								  Double.parseDouble(telaGerenciamento.getCadastroProdutoPanel().getPrecoField().getText()), 
								  telaGerenciamento.getCadastroProdutoPanel().getAutorDVDField().getText(), 
								  telaGerenciamento.getCadastroProdutoPanel().getGeneroDVDField().getText(), 
								  Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getNumFaixasDVDField().getText()));
			
				Estoque estoqueTemp = new Estoque(dvd, Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getQuantidadeEstoqueField().getText()));
				
				try {
					BaseDados.adicionarProduto(dvd);
				} catch (ProdutoNullException | ProdutoExisteException e1) {
					Mensagem.exibirMensagem(e1.getMessage());
					e1.printStackTrace();
				}
			}
			
			if (telaGerenciamento.getCadastroProdutoPanel().getMoedaPanel().isFocusable()) {
				Moeda moeda = new Moeda(telaGerenciamento.getCadastroProdutoPanel().getCodBarrasField().getText(), 
										Double.parseDouble(telaGerenciamento.getCadastroProdutoPanel().getPrecoField().getText()), 
										telaGerenciamento.getCadastroProdutoPanel().getTipoMoedaField().getText(), 
										Double.parseDouble(telaGerenciamento.getCadastroProdutoPanel().getValorMoedaField().getText()), 
										Integer.parseInt(telaGerenciamento.getCadastroProdutoPanel().getAnoLancamentoMoedaField().getText()), 
										telaGerenciamento.getCadastroProdutoPanel().getPaisMoedaField().getText(), 
										telaGerenciamento.getCadastroProdutoPanel().getEstadoMoedaField().getText());
			}
		}
		
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		// TODO Auto-generated method stub
		
	}
}
