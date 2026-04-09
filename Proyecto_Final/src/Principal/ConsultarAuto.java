package Principal;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class ConsultarAuto extends JDialog implements ActionListener {

	private static final long serialVersionUID = 32705407359759178L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblMarca;
	private JTextField txtMarca;
	private JButton btnCerrar;
	private JLabel lblModelo;
	private JComboBox<String> cboModelo;
	private JLabel lblTorque;
	private JTextField txtTorque;
	private JLabel lblStock;
	private JTextField txtStock;
	private JLabel lblGarantia;
	private JTextField txtGarantia;
	private JLabel lblFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			ConsultarAuto dialog = new ConsultarAuto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarAuto() {
		setTitle("Consultar Autos");
		setResizable(false);
		setBounds(100, 100, 500,250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 46, 14);
		contentPanel.add(lblModelo);

		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 35, 46, 14);
		contentPanel.add(lblMarca);

		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 60, 46, 14);
		contentPanel.add(lblPrecio);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Toyota Corolla", "Honda Civic", "Hyundai Elantra", "Kia Cerato", "Mazda 3"}));
		cboModelo.setBounds(66, 8, 218, 20);
		contentPanel.add(cboModelo);

		txtMarca = new JTextField();
		txtMarca.setBackground(SystemColor.control);
		txtMarca.setEditable(false);
		txtMarca.setBounds(65, 32, 219, 20);
		contentPanel.add(txtMarca);
		txtMarca.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setBackground(SystemColor.control);
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(66, 57, 89, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(345, 7, 89, 23);
		contentPanel.add(btnCerrar);
		
		lblTorque = new JLabel("Torque");
		lblTorque.setBounds(10, 91, 46, 14);
		contentPanel.add(lblTorque);
		
		txtTorque = new JTextField();
		txtTorque.setEditable(false);
		txtTorque.setColumns(10);
		txtTorque.setBackground(SystemColor.control);
		txtTorque.setBounds(66, 88, 89, 20);
		contentPanel.add(txtTorque);
		
		lblStock = new JLabel("Stock");
		lblStock.setBounds(10, 122, 46, 14);
		contentPanel.add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setEditable(false);
		txtStock.setColumns(10);
		txtStock.setBackground(SystemColor.control);
		txtStock.setBounds(66, 119, 89, 20);
		contentPanel.add(txtStock);
		
		lblGarantia = new JLabel("Garantia");
		lblGarantia.setBounds(10, 153, 46, 14);
		contentPanel.add(lblGarantia);
		
		txtGarantia = new JTextField();
		txtGarantia.setEditable(false);
		txtGarantia.setColumns(10);
		txtGarantia.setBackground(SystemColor.control);
		txtGarantia.setBounds(66, 150, 89, 20);
		contentPanel.add(txtGarantia);
		
		lblFoto = new JLabel(" ");
		lblFoto.setBounds(229, 60, 207, 116);
		contentPanel.add(lblFoto);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboCodigo(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedCboCodigo(ActionEvent e) {

	    List<Auto> autos = new ArrayList<>();

	    autos.add(new Auto("TOYOTA", "Toyota Corolla", 10000.00, 205, 10, 3, "/imagenes/corolla1.png"));
	    autos.add(new Auto("KIA", "Kia Cerato", 10000.00, 205, 10, 3, "/imagenes/elantra.png"));
	    autos.add(new Auto("HONDA", "Honda Civic", 10000.00, 205, 10, 3, "/imagenes/honda.png"));
	    
	    //Toyota Corolla
			//Honda Civic
			//Hyundai Elantra
			//Kia Cerato
			//Mazda 3

	    String valorCombo = (String) cboModelo.getSelectedItem();

	    for (Auto auto : autos) {
	        if (auto.getModelo().equalsIgnoreCase(valorCombo)) {
	            lblFoto.setIcon(new ImageIcon(
	                getClass().getResource(auto.getImagen())
	            ));

	            // datos
	            txtMarca.setText(auto.getMarca());

	            break;
	        }
	    }
	}
	//Aqui se a�adieron imagenes por tipo
	public class Auto {
		private String marca;
	    private String modelo;
	    private double precio;
	    private double torque;
	    private int stock;
	    private int garantia;
	    private String imagen;
	    
	    public Auto(String marca, String modelo, double precio, double torque, int stock, int garantia, String imagen) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.precio = precio;
	        this.torque = torque;
	        this.stock = stock;
	        this.garantia = garantia;
	        this.imagen=imagen;
	    }
	    public String getMarca() { return marca; }
	    public String getModelo() { return modelo; }
	    public double getPrecio() { return precio; }
	    public double getTorque() { return torque; }
	    public int getStock() { return stock; }
	    public int getGarantia() { return garantia; }
	    public String getImagen(){ return imagen; };
	}
}
	
