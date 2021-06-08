package es.alvaroCDN1.actividad4.acciones;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Accion utilizada en la clase Actividad6.
 * Recoge el boton que se ha pulsado y lo muestra
 */
public class PulsarBotonNumero extends MouseAdapter {

    /**
     * Constructor de la clase PulsarBotonNumero
     */
    public PulsarBotonNumero() {

    }

    /**
     * Comprueba el boton que se ha pulsado y anade al campo de texto el texto del boton en cuestion
     *
     * @param boton     El boton que se ha pulsado
     * @param textField El campo de texto donde queremos mostrar el boton pulsado
     * @return La accion de pulsar el boton
     */
    public MouseAdapter pulsarBoton(Button boton, TextField textField) {
        MouseAdapter botonPulsado = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                textField.setText(textField.getText() + boton.getLabel());
            }
        };
        return botonPulsado;
    }
}