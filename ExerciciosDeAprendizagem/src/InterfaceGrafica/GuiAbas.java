package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GuiAbas extends JPanel {
    private JTabbedPane tpAbas;
    private JButton[] botoes = new JButton[15];
private JButton botaoAux,teste;
    public GuiAbas() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
    	botaoAux = new JButton("Aux");
    	teste = new JButton("teste");
        setLayout(null);
        for(int i=0;i<15;i++)
           botoes[i] = new JButton("Botao " + (i+1));
        JPanel panel1 = new JPanel(new GridLayout(5,1));
        for(int i=0;i<5;i++)
           panel1.add(botoes[i]);
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for(int i=1;i<10;i++)
           panel2.add(botoes[i]);
        panel2.add(botaoAux);
        panel2.add(teste);
        JPanel panel3 = new JPanel(new BorderLayout());
        panel3.add(botoes[10],"North");
        panel3.add(botoes[11],"West");
        panel3.add(botoes[12],"Center");
        panel3.add(botoes[13],"East");
        panel3.add(botoes[14],"South");
       
        tpAbas = new JTabbedPane();
        tpAbas.addTab("GridLayout", panel1);
        tpAbas.addTab("FlowLayout", panel2);
        tpAbas.addTab("BorderLayout", panel3);
        tpAbas.setBounds(0,0,300,200);
        add(tpAbas);
    }
}

