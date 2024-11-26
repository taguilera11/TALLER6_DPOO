package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar
        this.panelMapa = new PanelMapaAgregar();

        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar
        this.panelDetalles = new PanelEditarRestaurante();

        this.panelBotones = new PanelBotonesAgregar(this);
        
        // Termina de configurar la ventana
        add(panelMapa,BorderLayout.NORTH);
        add(panelDetalles,BorderLayout.CENTER);
        add(panelBotones,BorderLayout.PAGE_END);
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setSize(400, 700);
        setResizable( false );
        
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        String nombre = this.panelDetalles.getNombre();
        int calificacion = this.panelDetalles.getCalificacion();
        boolean visitado = this.panelDetalles.getVisitado();
        int[] coords = this.panelMapa.getCoordenadas();
        
        this.ventanaPrincipal.agregarRestaurante(nombre, calificacion, coords[0], coords[1], visitado);
        cerrarVentana();
    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
