package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3,2,10,5));
        // Crea el campo para el nombre con una etiqueta al frente

    	 JLabel etiquetaNombre = new JLabel("Nombre:");
 
    	 txtNombre = new JTextField(20);
    	
        // Crea el selector para la calificación con una etiqueta al frente

    	 JLabel etiquetaCalif = new JLabel("Calificación:");

    	 cbbCalificacion = new JComboBox<>(new String[]{"0","1", "2","3","4","5"});
    	 
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente

    	 JLabel etiquetaVisitado = new JLabel("Visitado:");
    	
    	cbbVisitado = new JComboBox<>(new String[]{"Si", "No"});
    	 
        // Agregar todos los elementos al panel
  
    	 
    	add(etiquetaNombre);
    	add(txtNombre);
    	add(etiquetaCalif);
    	add(cbbCalificacion);
    	add(etiquetaVisitado);
    	add(cbbVisitado);
    	
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {	
    	boolean respuesta = false;
    	String visitado = ( String )cbbVisitado.getSelectedItem( );
    	if(visitado.equals("Si")) {
    		respuesta = true;
    	}
        return respuesta;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	String nombre = txtNombre.getText();
        return nombre;
    }
}
