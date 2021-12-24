package sistema.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaGerenciamento extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu, menuCadastrar, menuPromocao, menuSair;
	private JMenuItem itemCadastrarMenu, itemPromocao, itemSair;
	
	private CadastroProdutoPanel cadastroProdutoPanel;
	
	public TelaGerenciamento() {
		setTitle("Antiquarios");
		setSize(350, 300);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		
		menuBar = new JMenuBar();
		
		menu = new JMenu("Gerenciar");
		menuPromocao = new JMenu("Promoçao");
		menuSair = new JMenu("Sair");
		menuCadastrar = new JMenu("Produto");
		
		itemCadastrarMenu = new JMenuItem("Cadastrar");
		itemPromocao = new JMenuItem("Promoção");
		itemSair = new JMenuItem("Sair");
		itemSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showOptionDialog(null, "Sim", null, null, null, icon, options, initialValue)
				System.exit(0);
				
			}
		});
		
		cadastroProdutoPanel = new CadastroProdutoPanel();
		
		
		
		menuBar.add(menu);
		menuBar.add(menuPromocao);
		menuBar.add(menuSair);
		
		menu.add(menuCadastrar);
		menuPromocao.add(itemPromocao);
		menuSair.add(itemSair);
		
		menuCadastrar.add(itemCadastrarMenu);
		
		setJMenuBar(menuBar);
		
		
		add(cadastroProdutoPanel);
		
		setVisible(false);
	}

	public JMenuItem getItemCadastrarMenu() {
		return itemCadastrarMenu;
	}

	public CadastroProdutoPanel getCadastroProdutoPanel() {
		return cadastroProdutoPanel;
	}

	public JMenuItem getItemPromocao() {
		return itemPromocao;
	}

	public JMenuItem getItemSair() {
		return itemSair;
	}

}
