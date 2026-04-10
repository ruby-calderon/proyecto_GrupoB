package Proyecto;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Color;
import java.awt.SystemColor;

public class ConfigurarDescuento extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblUnoAcinco;
	private JLabel lblSeisAdiez;
	private JLabel lblOnceAquince;
	private JLabel lblMasDeQuince;
	private JTextField txtDscto1;
	private JTextField txtDscto2;
	private JTextField txtDscto4;
	private JTextField txtDscto3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblPorcentaje_1;
	private JLabel lblPorcentaje_2;
	private JLabel lblPorcentaje_3;
	private JLabel lblPorcentaje_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarDescuento dialog = new ConfigurarDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarDescuento() {
		setForeground(new Color(255, 255, 255));
		getContentPane().setBackground(Color.WHITE);
		setTitle("Configurar Porcentaje Descuento");
		setBounds(100, 100, 510, 340);
		getContentPane().setLayout(null);

		lblUnoAcinco = new JLabel("1 a 5 unidades");
		lblUnoAcinco.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblUnoAcinco.setBounds(38, 35, 153, 19);
		getContentPane().add(lblUnoAcinco);

		lblSeisAdiez = new JLabel("6 a 10 unidades");
		lblSeisAdiez.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblSeisAdiez.setBounds(38, 85, 153, 19);
		getContentPane().add(lblSeisAdiez);

		lblOnceAquince = new JLabel("11 a 15 unidades");
		lblOnceAquince.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblOnceAquince.setBounds(38, 135, 153, 19);
		getContentPane().add(lblOnceAquince);

		lblMasDeQuince = new JLabel("M\u00E1s de 15 unidades");
		lblMasDeQuince.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblMasDeQuince.setBounds(38, 185, 153, 19);
		getContentPane().add(lblMasDeQuince);

		txtDscto1 = new JTextField();
		txtDscto1.setBackground(new Color(240, 248, 255));
		txtDscto1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDscto1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtDscto1.setBounds(214, 30, 198, 30);
		getContentPane().add(txtDscto1);
		txtDscto1.setColumns(10);

		txtDscto2 = new JTextField();
		txtDscto2.setBackground(new Color(240, 248, 255));
		txtDscto2.setHorizontalAlignment(SwingConstants.CENTER);
		txtDscto2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtDscto2.setBounds(214, 80, 198, 30);
		getContentPane().add(txtDscto2);
		txtDscto2.setColumns(10);

		txtDscto4 = new JTextField();
		txtDscto4.setBackground(new Color(240, 248, 255));
		txtDscto4.setHorizontalAlignment(SwingConstants.CENTER);
		txtDscto4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtDscto4.setBounds(214, 180, 198, 30);
		getContentPane().add(txtDscto4);
		txtDscto4.setColumns(10);

		txtDscto3 = new JTextField();
		txtDscto3.setBackground(new Color(240, 248, 255));
		txtDscto3.setHorizontalAlignment(SwingConstants.CENTER);
		txtDscto3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		txtDscto3.setBounds(214, 130, 198, 30);
		getContentPane().add(txtDscto3);
		txtDscto3.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBackground(new Color(65, 105, 225));
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setVerticalAlignment(SwingConstants.TOP);
		btnAceptar.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		btnAceptar.setBounds(369, 250, 100, 30);
		getContentPane().add(btnAceptar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setVerticalAlignment(SwingConstants.TOP);
		btnCancelar.setBackground(new Color(255, 255, 255));
		btnCancelar.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(231, 250, 100, 30);
		getContentPane().add(btnCancelar);

		lblPorcentaje_1 = new JLabel("%");
		lblPorcentaje_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPorcentaje_1.setBounds(422, 35, 27, 20);
		getContentPane().add(lblPorcentaje_1);

		lblPorcentaje_2 = new JLabel("%");
		lblPorcentaje_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPorcentaje_2.setBounds(422, 85, 27, 20);
		getContentPane().add(lblPorcentaje_2);

		lblPorcentaje_3 = new JLabel("%");
		lblPorcentaje_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPorcentaje_3.setBounds(422, 135, 27, 20);
		getContentPane().add(lblPorcentaje_3);

		lblPorcentaje_4 = new JLabel("%");
		lblPorcentaje_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		lblPorcentaje_4.setBounds(422, 185, 27, 20);
		getContentPane().add(lblPorcentaje_4);
		
		txtDscto1.setText(MenuPrincipal.porcentaje1 + "");
		txtDscto2.setText(MenuPrincipal.porcentaje2 + "");
		txtDscto3.setText(MenuPrincipal.porcentaje3 + "");
		txtDscto4.setText(MenuPrincipal.porcentaje4 + "");
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
