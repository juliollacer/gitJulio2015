package exe;

import java.awt.EventQueue;

import controlador.Controladora;



public class Ejecutable {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlador.Controladora con = new Controladora();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
