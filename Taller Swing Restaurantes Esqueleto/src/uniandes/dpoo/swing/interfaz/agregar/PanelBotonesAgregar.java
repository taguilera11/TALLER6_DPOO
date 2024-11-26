package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel implements ActionListener
{
    /**
     * El comando utilizado para el botón que sirve para crear un nuevo restaurante
     */
    private static final String CREAR = "nuevo";

    /**
     * El comando utilizado para el botón que sirve para cerrar la ventana sin crear un restaurante
     */
    private static final String CERRAR = "ver";

    private JButton butNuevo;
    private JButton butCerrar;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaAgregarRestaurante ventanaPrincipal;

    public PanelBotonesAgregar( VentanaAgregarRestaurante ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        // Agrega el botón para crear el restaurante
        this.butNuevo = new JButton("Crear restaurante");
        this.butNuevo.setActionCommand(CREAR);
        this.butNuevo.addActionListener(this);
        // Agrega el botón para ver todos los restaurantes
        this.butCerrar = new JButton("Cerrar");
        this.butCerrar.setActionCommand(CERRAR);
        this.butCerrar.addActionListener(this);
        
        
        add(butNuevo, FlowLayout.LEFT);
        add(butCerrar, FlowLayout.CENTER);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( CREAR ) )
        {
            ventanaPrincipal.agregarRestaurante( );
        }
        else if( comando.equals( CERRAR ) )
        {
            ventanaPrincipal.cerrarVentana( );
        }
    }
}
