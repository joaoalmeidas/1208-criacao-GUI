import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AlignFrame extends JFrame {
	
	private final JButton botaoOk;
	private final JButton botaoCancelar;
	private final JButton botaoAjuda;
	
	private final JPanel botoes;
	
	private final JCheckBox checkSnap;
	private final JCheckBox checkShow;
	
	private final JPanel checks;
	
	/*
	
	private final JTextField textoX;
	private final JTextField textoY;
	*/
	
	public AlignFrame() {
		
		super("AlignFrame");
		setLayout(new FlowLayout());
		
		checks = new JPanel();
		checkSnap = new JCheckBox("Snap to Grid");
		checkShow = new JCheckBox("Snap to Show");
		
		checks.setLayout(new GridLayout(2, 1, 5, 5));
		
		checks.add(checkSnap);
		checks.add(checkShow);
		
		add(checks);
		
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
