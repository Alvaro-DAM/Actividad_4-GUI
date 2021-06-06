package es.alvaroCDN1.actividad4.actividades;

import es.alvaroCDN1.actividad4.actividades.acciones.CerrarVentana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actividad3 {
    private Frame ventana;

    public Actividad3() {
        this.ventana = new Frame("Actividad 3");
        this.ventana.setSize(380, 120);
        this.ventana.setLocation(320, 50);

        this.ventana.addWindowListener(new CerrarVentana().cerrar(this.ventana));

        this.ventana.setVisible(true);
    }

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
