package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

public class VentanaInicio extends JPanel {
	private	JLabel foto;
	private JButton btnLogIn;
	private JButton btnRegistrarse;
	private JComboBox eligeUser;
	private JPasswordField password;
	
	
	/**
	 * Create the panel.
	 */
	public VentanaInicio() {
		setLayout(null);
		
		
		foto = new JLabel("Pon una imagen");
		foto.setBackground(Color.PINK);
		foto.setBounds(111, 11, 110, 110);
		add(foto);
		foto.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnLogIn_1 = new JButton("LogIn");
		btnLogIn_1.setBounds(111, 222, 110, 28);
		add(btnLogIn_1);
		
		JButton btnRegistrarse_1 = new JButton("Registrarse");
		btnRegistrarse_1.setBounds(111, 261, 110, 28);
		add(btnRegistrarse_1);
		
		eligeUser = new JComboBox();
		eligeUser.setBounds(111, 144, 110, 28);
		add(eligeUser);
		
		password = new JPasswordField();
		password.setBounds(111, 183, 110, 28);
		add(password);
		

	}
}
