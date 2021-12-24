package sistema.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import sistema.util.SpringUtilities;

public class CadastroProdutoPanel extends JPanel {

	private JPanel panelPrincipal, produtoPanel, radioButtonPanel, livroPanel, dvdPanel, moedaPanel, scrollPanel, buttonPanel;
	
	private JLabel quantidadeEstoqueLabel, codBarrasLabel, precoLabel, precoPromocionalLabel;
	private JTextField quantidadeEstoqueField, codBarrasField, precoField, precoPromocionalField;

	private JLabel isbnLivroLabel, tituloLivroLabel, autorLivroLabel, editoraLivroLabel, volumeLivroLabel, anoLivroLabel;
	private JTextField isbnLivroField, tituloLivroField, autorLivroField, editoraLivroField, volumeLivroField, anoLivroField;
	
	private JLabel autorDVDLabel, generoDVDLabel, numFaixasDVDLabel;
	private JTextField autorDVDField, generoDVDField, numFaixasDVDField;
	
	private JLabel tipoMoedaLabel, valorMoedaLabel, anoLancamentoMoedaLabel, paisMoedaLabel, estadoMoedaLabel;
	private JTextField tipoMoedaField, valorMoedaField, anoLancamentoMoedaField, paisMoedaField, estadoMoedaField;

	private JLabel tipoProdutoLabel;
	private JRadioButton livroRadio, dvdRadio, moedaRadio;
	private ButtonGroup groupOpcaoCadastro;
	
	private JButton cadastrarButton;
	
	private JScrollPane scrollPaneEstado, scrollPane;
	
	public CadastroProdutoPanel() {
		setSize(new Dimension(350, 300));
		setLayout(new FlowLayout(FlowLayout.CENTER));
		

		produtoPanel = new JPanel(new SpringLayout());
		radioButtonPanel = new JPanel();
		livroPanel = new JPanel(new SpringLayout());
		dvdPanel = new JPanel(new SpringLayout());
		moedaPanel = new JPanel(new SpringLayout());
		scrollPanel = new JPanel(new SpringLayout());
		buttonPanel = new JPanel();
		scrollPane = new JScrollPane();
		
		quantidadeEstoqueLabel = new JLabel("Quantidade Estoque: ");
		codBarrasLabel = new JLabel("CodBarras: ");
		precoLabel = new JLabel("Preço (R$): ");
//		precoPromocionalLabel = new JLabel("Promocional (R$): ");
		
		quantidadeEstoqueField = new JTextField(10);
		codBarrasField = new JTextField(10);
		precoField = new JTextField(10);
//		precoPromocionalField = new JTextField(10);		
	
		
		produtoPanel.add(quantidadeEstoqueLabel);
		produtoPanel.add(quantidadeEstoqueField);
		produtoPanel.add(codBarrasLabel);
		produtoPanel.add(codBarrasField);
		produtoPanel.add(precoLabel);
		produtoPanel.add(precoField);
//		produtoPanel.add(precoPromocionalLabel);
//		produtoPanel.add(precoPromocionalField);
		
		tipoProdutoLabel = new JLabel("Produto: ");
		
		groupOpcaoCadastro = new ButtonGroup();
		livroRadio = new JRadioButton("Livro", true);
		dvdRadio = new JRadioButton("DVD");
		moedaRadio = new JRadioButton("Moeda");
		
		groupOpcaoCadastro.add(livroRadio);
		groupOpcaoCadastro.add(dvdRadio);
		groupOpcaoCadastro.add(moedaRadio);
				
		radioButtonPanel.add(tipoProdutoLabel);
		radioButtonPanel.add(livroRadio);
		radioButtonPanel.add(dvdRadio);
		radioButtonPanel.add(moedaRadio);
		
		
		livroPanel();
		dvdPanel();
		moedaPanel();
		
		cadastrarButton = new JButton("Cadastrar");
		buttonPanel.add(cadastrarButton);
		
		
		panelPrincipal = new JPanel(new SpringLayout());
		panelPrincipal.add(produtoPanel);
		panelPrincipal.add(radioButtonPanel);
		panelPrincipal.add(livroPanel).setVisible(false);
		panelPrincipal.add(dvdPanel).setVisible(false);
		panelPrincipal.add(moedaPanel).setVisible(false);
		panelPrincipal.add(cadastrarButton);
		
		scrollPanel.add(panelPrincipal);
		
		scrollPane.setPreferredSize(new Dimension(300, 200));
		
		add(scrollPanel);
		add(scrollPane);
		
		scrollPane.setViewportView(scrollPanel);
		
		SpringUtilities.makeCompactGrid(produtoPanel, 3, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(livroPanel, 6, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(dvdPanel, 3, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(moedaPanel, 5, 2, 1, 1, 1, 1);
		
		SpringUtilities.makeCompactGrid(panelPrincipal, 6, 1, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(scrollPanel, 1, 1, 1, 1, 1, 1);
		
		
		setVisible(false);
	}
	
	public void livroPanel() {
		isbnLivroLabel = new JLabel("ISBN: ");
		isbnLivroField = new JTextField(10);
		
		tituloLivroLabel = new JLabel("Titulo livro: ");
		tituloLivroField = new JTextField(10);
		
		autorLivroLabel = new JLabel("Autor: ");
		autorLivroField = new JTextField(10);
		
		editoraLivroLabel = new JLabel("Editora: ");
		editoraLivroField = new JTextField(10);
		
		volumeLivroLabel = new JLabel("Vol: ");
		volumeLivroField = new JTextField(10);
		
		anoLivroLabel = new JLabel("Ano: ");
		anoLivroField = new JTextField(10);
		
		livroPanel.add(isbnLivroLabel);
		livroPanel.add(isbnLivroField);
		
		livroPanel.add(tituloLivroLabel);
		livroPanel.add(tituloLivroField);
		
		livroPanel.add(autorLivroLabel);
		livroPanel.add(autorLivroField);
		
		livroPanel.add(editoraLivroLabel);
		livroPanel.add(editoraLivroField);
		
		livroPanel.add(volumeLivroLabel);
		livroPanel.add(volumeLivroField);
		
		livroPanel.add(anoLivroLabel);
		livroPanel.add(anoLivroField);
		
//		setVisible(false);
	}

	public void dvdPanel() {
		autorDVDLabel = new JLabel("Autor: ");
		autorDVDField = new JTextField(10);
		
		generoDVDLabel = new JLabel("Gênero: ");
		generoDVDField = new JTextField(10);
		
		numFaixasDVDLabel = new JLabel("Num.Faixas: ");
		numFaixasDVDField = new JTextField(10);
		
		dvdPanel.add(autorDVDLabel);
		dvdPanel.add(autorDVDField);
		
		dvdPanel.add(generoDVDLabel);
		dvdPanel.add(generoDVDField);
		
		dvdPanel.add(numFaixasDVDLabel);
		dvdPanel.add(numFaixasDVDField);
		
//		setVisible(false);
	}
	
	public void moedaPanel() {
		tipoMoedaLabel = new JLabel("Tipo");
		tipoMoedaField = new JTextField(10);
		
		valorMoedaLabel = new JLabel("Valor");
		valorMoedaField = new JTextField(10);
		
		anoLancamentoMoedaLabel = new JLabel("Ano.Lançamento: ");
		anoLancamentoMoedaField = new JTextField(10);
		
		paisMoedaLabel = new JLabel("País: ");
		paisMoedaField = new JTextField(10);
		
		estadoMoedaLabel = new JLabel("Estado");
		estadoMoedaField = new JTextField(10);
		
		moedaPanel.add(tipoMoedaLabel);
		moedaPanel.add(tipoMoedaField);
		
		moedaPanel.add(valorMoedaLabel);
		moedaPanel.add(valorMoedaField);
		
		moedaPanel.add(anoLancamentoMoedaLabel);
		moedaPanel.add(anoLancamentoMoedaField);
		
		moedaPanel.add(paisMoedaLabel);
		moedaPanel.add(paisMoedaField);
		
		moedaPanel.add(estadoMoedaLabel);
		moedaPanel.add(estadoMoedaField);
	}
	
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public JPanel getProdutoPanel() {
		return produtoPanel;
	}

	public JPanel getRadioButtonPanel() {
		return radioButtonPanel;
	}

	public JPanel getLivroPanel() {
		return livroPanel;
	}

	public JPanel getDvdPanel() {
		return dvdPanel;
	}

	public JPanel getMoedaPanel() {
		return moedaPanel;
	}

	public JPanel getScrollPanel() {
		return scrollPanel;
	}

	public JLabel getQuantidadeEstoqueLabel() {
		return quantidadeEstoqueLabel;
	}

	public JLabel getCodBarrasLabel() {
		return codBarrasLabel;
	}

	public JLabel getPrecoLabel() {
		return precoLabel;
	}

	public JLabel getPrecoPromocionalLabel() {
		return precoPromocionalLabel;
	}

	public JTextField getQuantidadeEstoqueField() {
		return quantidadeEstoqueField;
	}

	public JTextField getCodBarrasField() {
		return codBarrasField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JTextField getPrecoPromocionalField() {
		return precoPromocionalField;
	}

	public JLabel getIsbnLivroLabel() {
		return isbnLivroLabel;
	}

	public JLabel getTituloLivroLabel() {
		return tituloLivroLabel;
	}

	public JLabel getAutorLivroLabel() {
		return autorLivroLabel;
	}

	public JLabel getEditoraLivroLabel() {
		return editoraLivroLabel;
	}

	public JLabel getVolumeLivroLabel() {
		return volumeLivroLabel;
	}

	public JLabel getAnoLivroLabel() {
		return anoLivroLabel;
	}

	public JTextField getIsbnLivroField() {
		return isbnLivroField;
	}

	public JTextField getTituloLivroField() {
		return tituloLivroField;
	}

	public JTextField getAutorLivroField() {
		return autorLivroField;
	}

	public JTextField getEditoraLivroField() {
		return editoraLivroField;
	}

	public JTextField getVolumeLivroField() {
		return volumeLivroField;
	}

	public JTextField getAnoLivroField() {
		return anoLivroField;
	}

	public JLabel getAutorDVDLabel() {
		return autorDVDLabel;
	}

	public JLabel getGeneroDVDLabel() {
		return generoDVDLabel;
	}

	public JLabel getNumFaixasDVDLabel() {
		return numFaixasDVDLabel;
	}

	public JTextField getAutorDVDField() {
		return autorDVDField;
	}

	public JTextField getGeneroDVDField() {
		return generoDVDField;
	}

	public JTextField getNumFaixasDVDField() {
		return numFaixasDVDField;
	}

	public JLabel getTipoMoedaLabel() {
		return tipoMoedaLabel;
	}

	public JLabel getValorMoedaLabel() {
		return valorMoedaLabel;
	}

	public JLabel getAnoLancamentoMoedaLabel() {
		return anoLancamentoMoedaLabel;
	}

	public JLabel getPaisMoedaLabel() {
		return paisMoedaLabel;
	}

	public JLabel getEstadoMoedaLabel() {
		return estadoMoedaLabel;
	}

	public JTextField getEstadoMoedaField() {
		return estadoMoedaField;
	}

	public void setEstadoMoedaField(JTextField estadoMoedaField) {
		this.estadoMoedaField = estadoMoedaField;
	}

	public JTextField getTipoMoedaField() {
		return tipoMoedaField;
	}

	public JTextField getValorMoedaField() {
		return valorMoedaField;
	}

	public JTextField getAnoLancamentoMoedaField() {
		return anoLancamentoMoedaField;
	}

	public JTextField getPaisMoedaField() {
		return paisMoedaField;
	}

	public JLabel getTipoProdutoLabel() {
		return tipoProdutoLabel;
	}

	public JRadioButton getLivroRadio() {
		return livroRadio;
	}

	public JRadioButton getDvdRadio() {
		return dvdRadio;
	}

	public JRadioButton getMoedaRadio() {
		return moedaRadio;
	}

	public ButtonGroup getGroupOpcaoCadastro() {
		return groupOpcaoCadastro;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JScrollPane getScrollPaneEstado() {
		return scrollPaneEstado;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JPanel getButtonPanel() {
		return buttonPanel;
	}
	
 }
