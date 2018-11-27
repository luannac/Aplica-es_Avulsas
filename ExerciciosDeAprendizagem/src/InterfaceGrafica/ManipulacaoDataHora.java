package InterfaceGrafica;

import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class ManipulacaoDataHora extends JPanel {

	private JTextArea taTexto;
    private JButton btMostrar;
    private Date agora;
    final long MILI_SEGUNDOS_POR_DIA = 1000 * 60 * 60 * 24;

    
    
    public ManipulacaoDataHora(String titulo){
    	setVisible(true);
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
    	
        
        setBounds(100,100,300,200);
        taTexto = new JTextArea();
        btMostrar = new JButton("Mostrar");
        add(taTexto,"Center");
        add(btMostrar,"North");
        agora = new Date();
    }

    public void definirEventos() {
       btMostrar.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   String formato = "hh:mm:ss";
               DateFormat dateFormat =  new SimpleDateFormat(formato);
               taTexto.setText("Data Normal: " + agora +
                 "\nData Formatada: "  + dateFormat.format(agora));
            }
       });
    }
}
