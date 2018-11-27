package scrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.text.NumberFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class GuiBarraRolagem extends JPanel {
	private JScrollBar scrollBar;
	private JLabel lbCentimetros,lbPolegadas;
	
	public GuiBarraRolagem(){
		inicializarComponentes();
		definirEventos();
	}
	private void inicializarComponentes(){
		setLayout(null);
		scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 105);
		lbPolegadas= new JLabel("0 Polegadas", JLabel.CENTER);
		lbCentimetros = new JLabel("0 Centimetros", JLabel.CENTER);
		scrollBar.setBounds(25, 20, 180, 25);
		lbPolegadas.setBounds(35, 50, 150, 25);
		lbCentimetros.setBounds(35, 80, 150, 25);
		add(scrollBar);
		add(lbPolegadas);
		add(lbCentimetros);
	}
	private void definirEventos(){
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				lbPolegadas.setText(scrollBar.getValue()+" Polegadas");
				NumberFormat nf = NumberFormat.getNumberInstance();
				nf.setMaximumFractionDigits(2);
				nf.setMaximumFractionDigits(2);
				double cm = scrollBar.getValue()*2.54;
				lbCentimetros.setText(nf.format(cm)+" Centimetros");
			}
		});
	}
}
