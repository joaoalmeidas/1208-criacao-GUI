import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlignFrame extends JFrame {
	
	private final JButton botaoOk;
	private final JButton botaoCancelar;
	private final JButton botaoAjuda;
	private final JPanel botoes;
	
	private final JLabel labelX;
	private final JLabel labelY;
	private final JCheckBox checkSnap;
	private final JCheckBox checkShow;
	private final JPanel checks;
	
	private final JTextField textoX;
	private final JTextField textoY;
	private final JPanel textos;
	
	public AlignFrame() {
		
		super("AlignFrame");
		setLayout(new FlowLayout());
		
		checks = new JPanel();
		checkSnap = new JCheckBox("Snap to Grid");
		checkShow = new JCheckBox("Snap to Show");
		
		checks.setLayout(new GridLayout(2, 1, 5, 0));
		
		checks.add(checkSnap);
		checks.add(checkShow);
		
		add(checks);
		
		textos = new JPanel();
		textoX = new JTextField();
		textoX.setColumns(3);
		textoY = new JTextField();
		textoY.setColumns(3);
		labelX = new JLabel("X: ");
		labelY = new JLabel("Y: ");
		
		textos.setLayout(new GridLayout(2, 2, 0, 15));
		
		textos.add(labelX);
		textos.add(textoX);
		textos.add(labelY);
		textos.add(textoY);
		
		add(textos);
		
		
		botoes = new JPanel();
		botaoOk = new JButton("Ok");
		botaoCancelar = new JButton("Cancelar");
		botaoAjuda = new JButton("Ajuda");
		
		botoes.setLayout(new GridLayout(3, 1, 1, 10));
		
		botoes.add(botaoOk);
		botoes.add(botaoCancelar);
		botoes.add(botaoAjuda);
		
		add(botoes);
		
		
		
	}
	

}
