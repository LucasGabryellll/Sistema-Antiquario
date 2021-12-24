package sistema.view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaAbertura extends JFrame {

	JLabel imageLabel;
	
	public TelaAbertura() {
		setSize(350, 260);
		setUndecorated(true);
//		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
	
			e1.printStackTrace();
		}
		
		try {
			imageLabel = new JLabel(new ImageIcon("img/logo.png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		add(imageLabel);
		
		setVisible(true);
	}
}
