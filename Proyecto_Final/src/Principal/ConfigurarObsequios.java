package Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField txtUnidad;
	private JTextField txtDosAcinco;
	private JTextField txtSeisAmas;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblSeisAmas;
	private JLabel lblDosAcinco;
	private JLabel lblUnidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfigurarObsequios dialog = new ConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfigurarObsequios() {
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 450, 165);
		getContentPane().setLayout(null);
		{
			lblUnidad = new JLabel("1 Unidad");
			lblUnidad.setBounds(20, 31, 102, 13);
			getContentPane().add(lblUnidad);
		}
		{
			lblDosAcinco = new JLabel("2 a 5 unidades");
			lblDosAcinco.setBounds(20, 54, 102, 13);
			getContentPane().add(lblDosAcinco);
		}
		{
			lblSeisAmas = new JLabel("6 a m\u00E1s unidades");
			lblSeisAmas.setBounds(20, 77, 102, 13);
			getContentPane().add(lblSeisAmas);
		}
		{
			txtUnidad = new JTextField();
			txtUnidad.setBounds(147, 28, 96, 19);
			getContentPane().add(txtUnidad);
			txtUnidad.setColumns(10);
		}
		{
			txtDosAcinco = new JTextField();
			txtDosAcinco.setBounds(147, 51, 96, 19);
			getContentPane().add(txtDosAcinco);
			txtDosAcinco.setColumns(10);
		}
		{
			txtSeisAmas = new JTextField();
			txtSeisAmas.setBounds(147, 74, 96, 19);
			getContentPane().add(txtSeisAmas);
			txtSeisAmas.setColumns(10);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(341, 27, 85, 21);
			getContentPane().add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(341, 50, 85, 21);
			getContentPane().add(btnCancelar);
		}
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
