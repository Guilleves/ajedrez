package presentacion;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;

import java.awt.List;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import entidades.Trebejo;

import java.awt.Font;

import negocio.ControladorAjedrez;

public class Principal extends JFrame {

	private JPanel contentPane;
	private List listaBlanco;
	private List listaNegro;
	private JTextField txtInicialX;
	private JTextField txtInicialY;
	private JTextField txtFinalX;
	private JTextField txtFinalY;
	private JLabel lblFinal;
	private JLabel label_1;
	private JLabel lblInicial;
	private JLabel lblBlanco;
	private JLabel lblNegro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listaBlanco = new List();
		listaBlanco.setBounds(10, 67, 191, 215);
		contentPane.add(listaBlanco);

		actualizaListas();

		
		
		
		listaNegro = new List();
		listaNegro.setBounds(211, 67, 191, 215);
		contentPane.add(listaNegro);
		
		txtInicialX = new JTextField();
		txtInicialX.setBounds(111, 293, 40, 40);
		contentPane.add(txtInicialX);
		txtInicialX.setColumns(10);
		
		txtInicialY = new JTextField();
		txtInicialY.setColumns(10);
		txtInicialY.setBounds(161, 293, 40, 40);
		contentPane.add(txtInicialY);
		
		txtFinalX = new JTextField();
		txtFinalX.setColumns(10);
		txtFinalX.setBounds(362, 293, 40, 40);
		contentPane.add(txtFinalX);
		
		txtFinalY = new JTextField();
		txtFinalY.setColumns(10);
		txtFinalY.setBounds(312, 293, 40, 40);
		contentPane.add(txtFinalY);
		
		JLabel lblNewLabel_1 = new JLabel("Posici\u00F3n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(211, 293, 76, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnMover = new JButton("Mover");
		btnMover.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMover.setBounds(10, 357, 392, 31);
		contentPane.add(btnMover);
		
		lblFinal = new JLabel("Final");
		lblFinal.setVerticalAlignment(SwingConstants.TOP);
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFinal.setBounds(211, 313, 76, 20);
		contentPane.add(lblFinal);
		
		label_1 = new JLabel("Posici\u00F3n");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(10, 293, 76, 20);
		contentPane.add(label_1);
		
		lblInicial = new JLabel("Inicial");
		lblInicial.setVerticalAlignment(SwingConstants.TOP);
		lblInicial.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInicial.setBounds(10, 313, 76, 20);
		contentPane.add(lblInicial);
		
		lblBlanco = new JLabel("BLANCO");
		lblBlanco.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlanco.setForeground(Color.WHITE);
		lblBlanco.setVerticalAlignment(SwingConstants.TOP);
		lblBlanco.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBlanco.setBounds(10, 36, 191, 20);
		contentPane.add(lblBlanco);
		
		lblNegro = new JLabel("NEGRO");
		lblNegro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNegro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNegro.setBounds(211, 36, 191, 20);
		contentPane.add(lblNegro);
	}
	
	
	//actualizar piezas cuando se inicia y cuando se presiona mover
	private void actualizaListas()
	{
		ControladorAjedrez cj = new ControladorAjedrez();
		for(int i = 0; i < cj.mandarJugadorPrueba().getTrebejos().size(); i++)
		{
			String piezasEnLista = cj.mandarJugadorPrueba().getTrebejos().get(i).getTipo() +" "+Integer.toString(cj.mandarJugadorPrueba().getTrebejos().get(i).getPosX())+" "+Integer.toString(cj.mandarJugadorPrueba().getTrebejos().get(i).getPosY());
			listaBlanco.add(piezasEnLista, i);
		}
		
		//cj.mandarJugadorPrueba().getTrebejos().get(listaBlanco.getSelectedIndex());
	}
}
