import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AlignFrame extends JFrame {
	
	private final JButton botaoOk;
	private final JButton botaoCancelar;
	private final JButton botaoAjuda;
	
	private final JPanel botoes;
	/*
	
	private final JCheckBox checkSnap;
	private final JCheckBox checkShow;
	
	private final JTextField textoX;
	private final JTextField textoY;
	*/
	
	public AlignFrame() {
		
		super("AlignFrame");
		setLayout(new FlowLayout());
		
		botoes = new JPanel();
		botaoOk = new JButton("Ok");
		botaoCancelar = new JButton("Cancelar");
		botaoAjuda = new JButton("Ajuda");
		
		botoes.setLayout(new GridLayout(3, 1, 5, 5));
		
		botoes.add(botaoOk);
		botoes.add(botaoCancelar);
		botoes.add(botaoAjuda);
		
		add(botoes);
		
		
		
	}
	

}
