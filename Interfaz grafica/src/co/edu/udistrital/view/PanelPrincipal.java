package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel{

	private JLabel etitulo;
	private JLabel enumero;
	private JLabel eresultado;
	private JLabel emostrar;
	private JTextField cnumero;
	private JButton botonValidar;
	
	public PanelPrincipal() {
		setLayout(null);
		setBackground(Color.BLACK);
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		etitulo= new JLabel("PARES O IMPARES :D");
		Font fuenteNueva= new Font("arial", Font.BOLD, 20);
		etitulo.setFont(fuenteNueva);
		etitulo.setForeground(Color.RED);
		etitulo.setBounds(60, 20, 670, 30);
		add(etitulo);
		
		enumero=new JLabel("Ingrese un numero entero: ");
		enumero.setBounds(100, 200, 200, 30);
		add(enumero);
		
		eresultado=new JLabel("Resultado: ");
		eresultado.setBounds(100, 300, 200, 30);
		add(eresultado);
		
		emostrar=new JLabel();
		emostrar.setBounds(100, 400, 200, 30);
		add(emostrar);
		
		cnumero= new JTextField();
		cnumero.setBounds(300, 200, 100, 30);
		cnumero.setHorizontalAlignment(JTextField.CENTER);
		add(cnumero);
		
		botonValidar=new JButton("Validar");
		botonValidar.setBackground(Color.GREEN);
		botonValidar.setForeground(Color.BLACK);
		botonValidar.setBounds(480, 200, 100, 30);
		botonValidar.setActionCommand("VALIDAR");
		add(botonValidar);
	}

	public JLabel getEtitulo() {
		return etitulo;
	}

	public void setEtitulo(JLabel etitulo) {
		this.etitulo = etitulo;
	}

	public JLabel getEnumero() {
		return enumero;
	}

	public void setEnumero(JLabel enumero) {
		this.enumero = enumero;
	}

	public JLabel getEresultado() {
		return eresultado;
	}

	public void setEresultado(JLabel eresultado) {
		this.eresultado = eresultado;
	}

	public JLabel getEmostrar() {
		return emostrar;
	}

	public void setEmostrar(JLabel emostrar) {
		this.emostrar = emostrar;
	}

	public JTextField getCnumero() {
		return cnumero;
	}

	public void setCnumero(JTextField cnumero) {
		this.cnumero = cnumero;
	}

	public JButton getBotonValidar() {
		return botonValidar;
	}

	public void setBotonValidar(JButton botonValidar) {
		this.botonValidar = botonValidar;
	}
	
}
