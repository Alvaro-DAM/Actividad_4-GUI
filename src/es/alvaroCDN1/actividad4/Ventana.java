package es.alvaroCDN1.actividad4;

import es.alvaroCDN1.actividad4.acciones.CerrarVentana;

import java.awt.*;

public class Ventana extends Frame {

    public Ventana(String titulo) {
        setTitle(titulo);
        setLocationRelativeTo(null); // Asi conseguimos que se alinee al "centro" de la pantalla
        addWindowListener(new CerrarVentana().cerrar(this));
        setVisible(true);
    }
}
