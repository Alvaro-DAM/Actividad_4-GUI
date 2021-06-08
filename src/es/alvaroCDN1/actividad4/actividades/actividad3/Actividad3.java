package es.alvaroCDN1.actividad4.actividades.actividad3;

import es.alvaroCDN1.actividad4.Ventana;

import javax.swing.*;
import java.awt.*;

/**
 * Crea una ventana con dos botones y una etiqueta que indica cual es el boton que se ha pulsado en ultimo lugar
 */
public class Actividad3 {

    private Ventana ventana;

    /**
     * Constructor de la clase Actividad3
     */
    public Actividad3() {
        this.ventana = new Ventana("Actividad 3");
        this.ventana.setSize(380, 120);
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void iniciarActividad() {
        Panel panelPrincipal = new Panel();

        BoxLayout layoutPrincipal = new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS);
        panelPrincipal.setLayout(layoutPrincipal);

        Panel panelEtiqueta = new Panel(new FlowLayout(FlowLayout.CENTER));
        Panel panelBotones = new Panel(new FlowLayout());

        Label etiqueta = new Label();
        etiqueta.setPreferredSize(new Dimension(panelEtiqueta.getSize().width + 80, 30));
        etiqueta.setFont(new Font("Arial", Font.BOLD, 12));

        panelEtiqueta.add(etiqueta);

        Button botonIzq = new Button("Izquierda");
        botonIzq.setSize(50, 35);
        botonIzq.addActionListener(e -> etiqueta.setText("Izquierda"));

        Button botonDcha = new Button("Derecha");
        botonDcha.setSize(50, 35);
        botonDcha.addActionListener(e -> etiqueta.setText("Derecha"));

        panelBotones.add(botonIzq);
        panelBotones.add(botonDcha);

        panelPrincipal.add(panelEtiqueta);
        panelPrincipal.add(panelBotones);

        this.ventana.add(panelPrincipal);
    }
}
