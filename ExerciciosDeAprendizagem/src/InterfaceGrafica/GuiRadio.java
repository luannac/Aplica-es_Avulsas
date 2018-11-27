package InterfaceGrafica;

import java.awt.event.*;

import javax.swing.*;

public class GuiRadio extends JPanel{
	
	private JLabel lbsexo;
	private JButton btverif;
	private JRadioButton rbmasc, rbfem;
	private ButtonGroup buttongroup;
	
	public GuiRadio(){
		inicializarComponentes();
		definirEventos();
	}
	/***********************Metodo pa inicializar componentes ***************************************/
	private void inicializarComponentes() {
		setLayout(null);
		btverif = new JButton("Verificar");
		rbmasc = new JRadioButton("Masculino");
		lbsexo = new JLabel("Selecione um sexo");
		rbfem = new JRadioButton("Feminino");
		buttongroup = new ButtonGroup();
		
		/***********************Adicionar  componentes a tela ***************************************/	
		buttongroup.add(rbmasc);
		buttongroup.add(rbfem);
		add(btverif);
		add(rbmasc);
		add(rbfem);
		add(lbsexo);
		/*******************Define tamanho e posicionamento dos elementos *****************************/
		btverif.setBounds(55, 105, 100, 20);
		rbmasc.setBounds(55, 45, 100, 25);
		lbsexo.setBounds(55, 10, 200, 20);
		rbfem.setBounds(55, 70, 100, 25);
		rbmasc.setSelected(true);
		
		
	}
	/*******************Método que define os eventos ex.: acionar botões ******************/
	private void definirEventos() {
		btverif.addActionListener (new ActionListener(){
			public void actionPerformed (ActionEvent arg0){
				if(rbmasc.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino selecionado");
				}else if (rbfem.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino selecionado");
				}
			}
	});

}
}
