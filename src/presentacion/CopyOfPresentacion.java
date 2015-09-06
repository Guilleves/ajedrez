package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;

public class CopyOfPresentacion extends JFrame {

	private JPanel contentPane;
	private JTextField posX;
	private JTextField posY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyOfPresentacion frame = new CopyOfPresentacion();
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
	public CopyOfPresentacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 5, 424, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFichas1 = new JLabel("Fichas Blancas");
		lblFichas1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblFichas1.setBounds(23, 11, 135, 44);
		panel_2.add(lblFichas1);
		
		JLabel lblUsuario = new JLabel("Fichas Negras");
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 16));
		lblUsuario.setBounds(242, 11, 167, 44);
		panel_2.add(lblUsuario);
		
		JList listBlancas = new JList();
		listBlancas.setBounds(23, 50, 135, 120);
		panel_2.add(listBlancas);
		
		JList listNegras = new JList();
		listNegras.setBounds(242, 50, 135, 120);
		panel_2.add(listNegras);
		
		posX = new JTextField();
		posX.setBounds(124, 181, 53, 20);
		panel_2.add(posX);
		posX.setColumns(10);
		
		posY = new JTextField();
		posY.setColumns(10);
		posY.setBounds(187, 181, 53, 20);
		panel_2.add(posY);
		
		JLabel lblPosicionFinal = new JLabel("Posicion Final: ");
		lblPosicionFinal.setBounds(23, 181, 104, 20);
		panel_2.add(lblPosicionFinal);
		
		JButton btnMover = new JButton("Mover");
		btnMover.setBounds(277, 181, 89, 23);
		panel_2.add(btnMover);
	}
}
