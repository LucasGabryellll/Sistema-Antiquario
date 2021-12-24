package sistema.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sistema.model.BaseDados;
import sistema.model.Produto;

public class AtualizarEstoque extends JFrame {

	private JLabel produtoLabel, atualizarQuantidadeEstoque;
	private JTextField produtoField, atualizarQuantidadeEstoqueField;
	
	private JButton atualizarButton;
	
	public AtualizarEstoque() {
		setName("Atualizar Estoque");
		setSize(180, 200);
		setLayout(new FlowLayout());
		setLocation(400, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		produtoLabel = new JLabel("Produto");
		produtoField = new JTextField(10);
		
		atualizarQuantidadeEstoque = new JLabel("Atualizar Quant: ");
		atualizarQuantidadeEstoqueField = new JTextField(10);
		
		atualizarButton = new JButton("Atualizar");
		atualizarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					atualizarItemEstoque();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(BaseDados.buscarProduto(produtoField.getText()));
			}
		});
		
		add(produtoLabel);
		add(produtoField);
		
		add(atualizarQuantidadeEstoque);
		add(atualizarQuantidadeEstoqueField);
		
		add(atualizarButton);
		
		setVisible(true);
		
	}

	public void atualizarItemEstoque() {
		Produto produto = BaseDados.buscarProduto(produtoField.getText());

		try {
			BaseDados.atualizarEstoque(produto.getEstoque());
			produto.getEstoque().setQuantidade(Integer.parseInt(atualizarQuantidadeEstoqueField.getText()));
		} catch (Exception e) {
			e.printStackTrace();
			Mensagem.exibirMensagem(e.getMessage());
		}
	}
	
	public JLabel getProdutoLabel() {
		return produtoLabel;
	}

	public JLabel getAtualizarQuantidadeEstoque() {
		return atualizarQuantidadeEstoque;
	}

	public JTextField getProdutoField() {
		return produtoField;
	}

	public JTextField getAtualizarQuantidadeEstoqueField() {
		return atualizarQuantidadeEstoqueField;
	}

	public JButton getAtualizarButton() {
		return atualizarButton;
	}

}
