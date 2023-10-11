package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.udistrital.model.Numero;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	
	
	public Controller() {
		vista= new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPanel().getBotonValidar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando=e.getActionCommand();
		if(comando.equals("VALIDAR")) {
			String aux1= vista.getPanel().getCnumero().getText();
			int aux2= Integer.parseInt(aux1);
			Numero num= new Numero(aux2);
			if (num.esPar()) {
				vista.getPanel().getEmostrar().setText("Numero ingresado es PAR");
			}
			else {
				vista.getPanel().getEmostrar().setText("Numero ingresado es IMPAR");
			}
		}
	}
	
	
	
}
