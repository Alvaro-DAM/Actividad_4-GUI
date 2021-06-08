package es.alvaroCDN1.actividad4.actividades.actividad6;

import es.alvaroCDN1.actividad4.Ventana;
import es.alvaroCDN1.actividad4.acciones.PulsarBotonNumero;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Crea una ventana que replique un teléfono.
 */
public class Actividad6 {

    private Ventana ventana;
    private boolean llamando;

    /**
     * Constructor de la clase Actividad6
     */
    public Actividad6() {
        this.ventana = new Ventana("Actividad 6");
        this.ventana.setSize(380, 460);

        this.llamando = false;
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void inciarActividad() {
        Panel panelPrincipal = new Panel(new GridLayout(2, 1));
        Panel panelTexto = new Panel(new GridLayout(1, 1));
        Panel panelBotones = new Panel(new GridLayout(4, 3));

        panelPrincipal.add(panelTexto);
        panelPrincipal.add(panelBotones);

        TextField textFieldNumTelf = new TextField();
        textFieldNumTelf.setPreferredSize(new Dimension(100, 25));
        panelTexto.add(textFieldNumTelf);

        Button[] listaBotones = new Button[12];

        Button boton0 = new Button("0");
        boton0.addMouseListener(new PulsarBotonNumero().pulsarBoton(boton0, textFieldNumTelf));

        Button botonClear = new Button("CLEAR");
        botonClear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                borrarTexto(textFieldNumTelf);
            }
        });

        Button botonCall = new Button("CALL");
        botonCall.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (getEstadoLLamado()) {
                    botonCall.setLabel("HANG UP");
                    setEstadoLlamado(false);
                } else {
                    botonCall.setLabel("CALL");
                    setEstadoLlamado(true);
                }
            }
        });

        int j = 1;
        for (int i = 0; i < listaBotones.length; i++) {
            listaBotones[i] = new Button("" + j);
            listaBotones[i].addMouseListener(new PulsarBotonNumero().pulsarBoton(listaBotones[i], textFieldNumTelf));
            j++;
        }

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 9:
                    panelBotones.add(botonClear);
                    break;

                case 10:
                    panelBotones.add(boton0);
                    break;

                case 11:
                    panelBotones.add(botonCall);
                    break;

                default:
                    panelBotones.add(listaBotones[i]);
                    break;
            }
        }


        this.ventana.add(panelPrincipal);
    }

    /**
     * Devuelve el estado de la "llamada"
     *
     * @return <code>true</code> si se esta llamando y <code>false</code> si no
     */
    private boolean getEstadoLLamado() {
        return this.llamando;
    }

    /**
     * Establece el estado de la llamada
     *
     * @param estadoLlamada <code>true</code> si se esta llamando y <code>false</code> si no
     */
    private void setEstadoLlamado(boolean estadoLlamada) {
        this.llamando = estadoLlamada;
    }

    /**
     * Borra el texto introducido en el campo de texto
     *
     * @param textField El campo de texto el cual deseamos limpiar
     */
    private void borrarTexto(TextField textField) {
        textField.setText(null);
    }
}
