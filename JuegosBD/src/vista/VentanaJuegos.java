package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class VentanaJuegos extends JPanel {
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public VentanaJuegos() {
		setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.LIGHT_GRAY);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(10, 46, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(108, 46, 86, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(204, 46, 86, 20);
		add(comboBox_1);
		
		JLabel lblFiltros = new JLabel("Filtros:");
		lblFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		lblFiltros.setBounds(10, 11, 70, 20);
		add(lblFiltros);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(10, 27, 86, 20);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setHorizontalAlignment(SwingConstants.CENTER);
		lblGenero.setBounds(108, 27, 86, 20);
		add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlataforma.setBounds(204, 27, 86, 20);
		add(lblPlataforma);

	}
}
