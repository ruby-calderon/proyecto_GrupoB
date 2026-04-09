package Principal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPrincipal extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuProyecto;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmModificarAutos;
	private JMenuItem mntmListarAutos;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmAcercaTienda;
	private JMenuItem mntmConsultaAutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuProyecto = new JMenuBar();
		setJMenuBar(menuProyecto);
		
		mnArchivo = new JMenu("Archivo");
		menuProyecto.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuProyecto.add(mnMantenimiento);
		
		mntmConsultaAutos = new JMenuItem("Consultar Autos");
		mntmConsultaAutos.addActionListener(this);
		mnMantenimiento.add(mntmConsultaAutos);
		
		mntmModificarAutos = new JMenuItem("Modificar Autos");
		mntmModificarAutos.addActionListener(this);
		mnMantenimiento.add(mntmModificarAutos);
		
		mntmListarAutos = new JMenuItem("Listar Autos");
		mntmListarAutos.addActionListener(this);
		mnMantenimiento.add(mntmListarAutos);
		
		mnVentas = new JMenu("Ventas");
		menuProyecto.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuProyecto.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mnAyuda = new JMenu("Ayuda");
		menuProyecto.add(mnAyuda);
		
		mntmAcercaTienda = new JMenuItem("Acerca De Tienda");
		mntmAcercaTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaTienda);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmModificarAutos) {
			actionPerformedMntmModificarAutos(e);
		}
		if (e.getSource() == mntmConsultaAutos) {
			actionPerformedMntmConsultaAutos(e);
		}
		if (e.getSource() == mntmListarAutos) {
			actionPerformedMntmListarAutos(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if (e.getSource() == mntmAcercaTienda) {
			actionPerformedMntmAcercaTienda(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}

	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}

	protected void actionPerformedMntmAcercaTienda(ActionEvent e) {
		AcercaDeTienda ventanaAcercaDeTienda= new AcercaDeTienda();
		ventanaAcercaDeTienda.setLocationRelativeTo(this);
		ventanaAcercaDeTienda.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		ConfigurarDescuento ventanaConfigurarDescuento=new ConfigurarDescuento();
		ventanaConfigurarDescuento.setLocationRelativeTo(this);
		ventanaConfigurarDescuento.setVisible(true);
	}

	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		ConfigurarObsequios ventanaConfigurarObsequios=new ConfigurarObsequios();
		ventanaConfigurarObsequios.setLocationRelativeTo(this);
		ventanaConfigurarObsequios.setVisible(true);
	}

	protected void actionPerformedMntmListarAutos(ActionEvent e) {
		ListarAutos ventanaDialogoListar=new ListarAutos();
		ventanaDialogoListar.setLocationRelativeTo(this);
		ventanaDialogoListar.setVisible(true);
	}

	protected void actionPerformedMntmConsultaAutos(ActionEvent e) {
		ConsultarAuto ventanaConsultarAuto=new ConsultarAuto();
		ventanaConsultarAuto.setLocationRelativeTo(this);
		ventanaConsultarAuto.setVisible(true);
	}

	protected void actionPerformedMntmModificarAutos(ActionEvent e) {
		ModificarAuto ventanaModificarAuto=new ModificarAuto();
		ventanaModificarAuto.setLocationRelativeTo(this);
		ventanaModificarAuto.setVisible(true);
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		VenderAutos ventanaDialogoVenta=new VenderAutos();
		ventanaDialogoVenta.setLocationRelativeTo(this);
		ventanaDialogoVenta.setVisible(true);
	}
	
}
