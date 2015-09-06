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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Presentacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JTextField txtDni2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentacion frame = new Presentacion();
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
	public Presentacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 424, 251);
		contentPane.add(panel_2);
		panel_2.setVisible(false);
		
		
		
		JLabel label = new JLabel("Fichas Blancas");
		label.setFont(new Font("Verdana", Font.BOLD, 16));
		label.setBounds(38, 22, 135, 44);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Fichas Negras");
		label_1.setFont(new Font("Verdana", Font.BOLD, 16));
		label_1.setBounds(257, 22, 167, 44);
		panel_2.add(label_1);
		
		JList list_1 = new JList();
		list_1.setBounds(38, 61, 135, 120);
		panel_2.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(257, 61, 135, 120);
		panel_2.add(list_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(139, 192, 53, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 192, 53, 20);
		panel_2.add(textField_1);
		
		JPanel panel_inicial = new JPanel();
		panel_inicial.setBounds(5, 5, 424, 251);
		contentPane.add(panel_inicial);
		panel_inicial.setLayout(null);
		
		JLabel label_2 = new JLabel("Posicion Final: ");
		label_2.setBounds(38, 192, 104, 20);
		panel_2.add(label_2);
		
		JButton button = new JButton("Mover");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_inicial.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		button.setBounds(292, 192, 89, 23);
		panel_2.add(button);
		
		
		
		txtDni = new JTextField();
		txtDni.setBounds(124, 32, 271, 20);
		panel_inicial.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblIngreseSuDni = new JLabel("Ingrese DNI: ");
		lblIngreseSuDni.setBounds(36, 35, 79, 14);
		panel_inicial.add(lblIngreseSuDni);
		
		JList list = new JList();
		list.setBounds(36, 62, 359, 80);
		panel_inicial.add(list);
		
		txtDni2 = new JTextField();
		txtDni2.setBounds(36, 152, 262, 20);
		panel_inicial.add(txtDni2);
		txtDni2.setColumns(10);
		
		JLabel lblDniOponente = new JLabel(": DNI Oponente");
		lblDniOponente.setBounds(308, 153, 87, 14);
		panel_inicial.add(lblDniOponente);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addMouseListener(new MouseAdapter() {
			@Override
		
			public void mouseClicked(MouseEvent arg0) {
				panel_inicial.setVisible(false);
				panel_2.setVisible(true);
			}
		});
		btnJugar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnJugar.setBounds(36, 178, 359, 34);
		panel_inicial.add(btnJugar);
	}
}
