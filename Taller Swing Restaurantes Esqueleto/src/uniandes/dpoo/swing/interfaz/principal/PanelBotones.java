package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel implements ActionListener
{
    /**
     * El comando para el botón para crear un nuevo restaurante
     */
    private static final String NUEVO = "nuevo";

    /**
     * El comando para el botón para ver todos los restaurantes en el mapa
     */
    private static final String VER = "ver";

    private JButton butNuevo;
    private JButton butVerTodos;
    private VentanaPrincipal ventanaPrincipal;

    public PanelBotones( VentanaPrincipal ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        // Agrega el botón para crear un nuevo restaurante
        this.butNuevo = new JButton("Nuevo");
        this.butNuevo.setActionCommand(NUEVO);
        this.butNuevo.addActionListener(this);
        // Agrega el botón para ver todos los restaurantes
        this.butVerTodos = new JButton("Ver todos");
        this.butVerTodos.setActionCommand(VER);
        this.butVerTodos.addActionListener(this);
        
        
        add(butNuevo, FlowLayout.LEFT);
        add(butVerTodos, FlowLayout.CENTER);
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( NUEVO ) )
        {
            ventanaPrincipal.mostrarVetanaNuevoRestaurante( );
        }
        else if( comando.equals( VER ) )
        {
            ventanaPrincipal.mostrarVentanaMapa( );
        }
    }
    
   
}
