package co.edu.udistrital.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

	private PanelPrincipal panel;
	
	public VentanaPrincipal() {
		setTitle("Mi primera interfaz");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		panel=new PanelPrincipal();
		panel.setBounds(25, 25, 735, 510);
		getContentPane().add(panel);
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}
	
}
