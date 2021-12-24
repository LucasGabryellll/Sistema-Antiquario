package sistema.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import sistema.view.TelaAbertura;
import sistema.view.TelaGerenciamento;

public class AberturaController {
	
	TelaAbertura telaAbertura;
	TelaGerenciamento telaGerenciamento;
	
	KeyHandler keyHandler;
	
	public AberturaController(TelaAbertura telaAbertura, TelaGerenciamento telaGerenciamento) {
		this.telaAbertura = telaAbertura;
		this.telaGerenciamento = telaGerenciamento;
	
		keyHandler = new KeyHandler();
		
		controll();
	}
	
	public void controll() {
		telaAbertura.addKeyListener(keyHandler);
	}
	
	private class KeyHandler extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == e.VK_ENTER) {
				telaAbertura.setVisible(false);
				telaGerenciamento.setVisible(true);
			}
			
			if (e.getKeyCode() == e.VK_ESCAPE) {
				System.exit(0);
			}
			
		}
	}

}
