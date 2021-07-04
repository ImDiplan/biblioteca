package biblioteca;

import java.awt.BorderLayout;
import biblioteca.libros;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class biblioteca extends JFrame implements ActionListener {

	private JPanel contentPane;
	libros lb1;
	libros lb2;
	JComboBox lista;
	JLabel lbl;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biblioteca frame = new biblioteca();
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
	public biblioteca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIBLIOTECA");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 21, 666, 49);
		contentPane.add(lblNewLabel);
		
		lb1 = new libros();
		lb2 = new libros();
		lb1.setTitulo("Cosas Añejas");
		lb2.setTitulo("Barriga Verde");
		lb1.setOriginal(true);
		lb2.setOriginal(false);
		lb1.setPrestable(false);
		lb2.setPrestable(true);
		
		lista = new JComboBox();
		lista.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		lista.setBounds(146, 100, 412, 34);
		contentPane.add(lista);
		lista.addItem(lb1.getTitulo());
		lista.addItem(lb2.getTitulo());
		
		JButton soli = new JButton("Solicitar");
		soli.setFont(new Font("Calibri Light", Font.PLAIN, 14));
		soli.setBounds(285, 208, 135, 34);
		contentPane.add(soli);
		
		lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		lbl.setBounds(20, 275, 656, 34);
		contentPane.add(lbl);
		soli.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(lista.getSelectedItem() == lb1.getTitulo()) {
			lbl.setText(("El libro "+lb1.esOriginal()+" y"+lb1.sePresta()).toUpperCase());
			lbl.setForeground(Color.RED);
			
		}else if(lista.getSelectedItem() == lb2.getTitulo()) {
			lbl.setText(("El libro "+lb2.esOriginal()+" y"+lb2.sePresta()).toUpperCase());
			lbl.setForeground(new Color(0, 255, 102));
		}
		
	}

}
