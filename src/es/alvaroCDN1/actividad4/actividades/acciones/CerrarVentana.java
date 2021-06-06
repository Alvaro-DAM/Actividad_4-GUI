package es.alvaroCDN1.actividad4.actividades.acciones;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Clase utilizada para cerrar las ventanas
 */
public class CerrarVentana extends WindowAdapter {

    /**
     * Constructor de la clase CerrarVentana
     */
    public CerrarVentana() {
    }

    /**
     * Metodo usado para cerrar una ventana sin necesidad de parar el programa
     *
     * @param ventana La ventana que deseamos cerrar
     * @return Un <code>WindowAdapter</code> con la 'accion' de 'cerrar'
     */
    public WindowAdapter cerrar(Frame ventana) {
        WindowAdapter cerrarVent = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
            }
        };

        return cerrarVent;
    }
}
