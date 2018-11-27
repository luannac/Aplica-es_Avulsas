package scrollBar;

import java.awt.event.*;
import javax.swing.*;

	
	
	public class GuiLista extends JPanel {
	    private JButton btCalcular;
	    private JLabel lbValor;
	    private JTextField tfValor, tfValorDesconto;
	    private JList liDesconto;
	    private JScrollPane spLista;

	    public GuiLista() {
	        inicializarComponentes();
	        definirEventos();
	    }

	    private void inicializarComponentes() {
	    	setVisible(true);
	        setLayout(null);
	        setSize(600,600);
	        String[] liDescontoItems = {"10%", "20%", "30%", "40%", "50%"};
	        btCalcular = new JButton("Calcular");
	        lbValor = new JLabel("Valor");
	        tfValor = new JTextField(5);
	        liDesconto = new JList(liDescontoItems); // adicionando array no objeto JList
	        tfValorDesconto = new JTextField(5);
	        spLista = new JScrollPane(liDesconto);// barra de rolagem 
	        btCalcular.setToolTipText("Faz o cálculo"); // criando um texto auxiliar no botão
	        btCalcular.setMnemonic(KeyEvent.VK_C); // cria tecla de atalho para o botão "alt c"
	        lbValor.setBounds(35, 05, 100, 25);
	        tfValor.setBounds(35, 30, 100, 25);
	        spLista.setBounds(35, 60, 100, 55);
	        btCalcular.setBounds(35, 120, 90, 25);
	        tfValorDesconto.setBounds(35, 150, 100, 25);
	        add(btCalcular);
	        add(lbValor);
	        add(tfValor);
	        add(spLista);
	        add(tfValorDesconto);
	    }

	    private void definirEventos() {
	        btCalcular.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	            	
	                if (tfValor.getText().equals("")) {
	                    tfValor.requestFocus();// prompt pisca no campo selecionado 
	                    return;
	                }
	                try {
	                    float valor = Float.parseFloat(tfValor.getText());
	                    System.out.println(liDesconto.getSelectedValue());
	                    if (liDesconto.getSelectedIndex() == -1) { //list retorna -1 um caso não foi nada selecionado
	                    	
	                        JOptionPane.showMessageDialog(null, "Selecione um item da lista");
	                        return;
	                    }
	                    float desconto = 0.9f;// se indice da lista for  0 de desconto de 10%
	                    if (liDesconto.getSelectedIndex() == 1) {// se indice da lista for  1 de desconto de 20%
	                        desconto = 0.8f;
	                    } else if (liDesconto.getSelectedIndex() == 2) {
	                        desconto = 0.7f;
	                    } else if (liDesconto.getSelectedIndex() == 3) {
	                        desconto = 0.6f;
	                    } else if (liDesconto.getSelectedIndex() == 4) {
	                        desconto = 0.5f;
	                    }
	                    tfValorDesconto.setText("" + valor * desconto);
	                }
	                catch (NumberFormatException erro) {
	                    JOptionPane.showMessageDialog(null, "Forneça apenas valores numéricos\n" +
	                            erro.toString());
	                    tfValor.requestFocus();
	                }
	            }
	        });
	    }
	   
	}


