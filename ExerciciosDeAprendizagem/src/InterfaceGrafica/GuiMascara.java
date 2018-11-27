package InterfaceGrafica;

import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class GuiMascara extends JPanel {
	private JLabel lbCpf, lbCnpj, lbTel, lbCep;
	private JFormattedTextField tfCpf, tfCnpj, tfTel, tfCep;
	private MaskFormatter msCpf, msCnpj, msTel, msCep;
	private JButton btMostrar;

	public GuiMascara() {
		inicializarComponentes();
		definirEventos();
	}
	/***********************Metodo pa inicializar componentes ***************************************/
	public void inicializarComponentes() {
		try {
			msCpf = new MaskFormatter("###.###.###-##");
			msCnpj = new MaskFormatter("##.###.###/####-##");
			msTel = new MaskFormatter("(##)####-####");
			msCep = new MaskFormatter("##.###-###");
			lbCpf = new JLabel("CPF:");
			tfCpf = new JFormattedTextField(msCpf);
			lbCnpj = new JLabel("CNPJ:");
			tfCnpj = new JFormattedTextField(msCnpj);
			lbTel = new JLabel("TEL:");
			tfTel = new JFormattedTextField(msTel);
			lbCep = new JLabel("CEP:");
			tfCep = new JFormattedTextField(msCep);
			btMostrar = new JButton("Mostrar");

			/*******************Define tamanho e posicionamento dos elementos *****************************/
			setBounds(0, 0, 250, 220);
			setLayout(null);
			lbCpf.setBounds(15, 20, 100, 20);
			tfCpf.setBounds(50, 20, 100, 20);
			lbCnpj.setBounds(15, 50, 100, 20);
			tfCnpj.setBounds(50, 50, 150, 20);
			lbTel.setBounds(15, 80, 100, 20);
			tfTel.setBounds(50, 80, 100, 20);
			lbCep.setBounds(15, 110, 100, 20);
			tfCep.setBounds(50, 110, 100, 20);
			btMostrar.setBounds(15, 140, 100, 22);
	/*********Adiciona elementos à Label  **************/
			add(lbCnpj);
			add(lbTel);
			add(lbCep);
			add(tfCnpj);
			add(tfTel);
			add(tfCep);
			add(lbCpf);
			add(tfCpf);
			add(btMostrar);
		} catch (ParseException erro) {
			erro.printStackTrace();
		}
	}
	/**Método que define os eventos ex.: acionar botões */
	public void definirEventos() {
		btMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent E) {
				JOptionPane.showMessageDialog(null,
						tfCpf.getText() + "\n" + tfCnpj.getText() + "\n" +
								tfTel.getText() + "\n" + tfCep.getText());
				JOptionPane.showMessageDialog(null, tfCpf.getValue());
				String cnpjSoNumeros = tfCnpj.getText();
				cnpjSoNumeros = cnpjSoNumeros.replace(".", ""); // retira os caracteres especiais 
				cnpjSoNumeros = cnpjSoNumeros.replace("/", "");
				cnpjSoNumeros = cnpjSoNumeros.replace("-", "");
				JOptionPane.showMessageDialog(null, cnpjSoNumeros);
			}
		});
	}
}
