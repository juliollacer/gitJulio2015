package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controladora;

public class ventanaPrueba extends JFrame {

	private JPanel contentPane;

	//variables
	private VentanaInicio venI;
	private VentanaJuegos venJ;
	private VentanaPerfil venP;
	private JMenuBar menuBar;
	private Controladora con;
	private JPanel panel;
	private CardLayout c1;
	

	private JPanel panelContenedor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrueba frame = new ventanaPrueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 363);
		venI=new VentanaInicio();
		venJ=new VentanaJuegos();
		venP=new VentanaPerfil();
		venI.setBounds(0,0,330,300);
		venJ.setBounds(0,0,330,300);
		venP.setBounds(0,0,330,300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmInicio = new JMenuItem("Inicio");
		mntmInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				 c1 = (CardLayout)(panel.getLayout());
			      c1.show(panel,"Inicio");
				
				
			
			}
		});
		mntmInicio.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmInicio);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mntmJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 c1 = (CardLayout)(panel.getLayout());
			      c1.show(panel,"Juegos");

			}
		});
		mntmJuegos.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmJuegos);
		
		
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				 c1 = (CardLayout)(panel.getLayout());
			      c1.show(panel,"Perfil");

			}
		});
		mntmPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmPerfil);
		
		
		panel = new JPanel(new CardLayout());
		
		panel.add(venI,"Inicio");
		panel.add(venJ,"Juegos");
		panel.add(venP,"Perfil");
		
	}

}
