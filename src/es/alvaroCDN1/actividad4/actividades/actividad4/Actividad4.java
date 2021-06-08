package es.alvaroCDN1.actividad4.actividades.actividad4;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import es.alvaroCDN1.actividad4.acciones.CerrarVentana;

/**
 * Crea una ventana que permite calcular el máximo de dos números introducidos por el usuario al pulsar un botón.
 */
public class Actividad4 {

    private Frame ventana;

    /**
     * Costructor de la clase Actividad4
     */
    public Actividad4() {
        this.ventana = new Frame("Actividad 4");
        this.ventana.setSize(380, 120);
        this.ventana.setLocation(320, 50);

        this.ventana.addWindowListener(new CerrarVentana().cerrar(this.ventana));

        this.ventana.setVisible(true);
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void iniciarActividad() {
        Panel panelPrincipal = new Panel(new GridLayout(3, 1));

        Panel panelNumeros = new Panel(new FlowLayout(FlowLayout.CENTER));
        Panel panelBoton = new Panel(new FlowLayout(FlowLayout.CENTER));
        Panel panelNumMax = new Panel(new FlowLayout(FlowLayout.CENTER));

        panelPrincipal.add(panelNumeros);
        panelPrincipal.add(panelNumMax);
        panelPrincipal.add(panelBoton);

        panelNumeros.add(new Label("Primer numero: "));
        TextField textFieldnum1 = new TextField();
        textFieldnum1.setSize(50, 15);
        panelNumeros.add(textFieldnum1);

        panelNumeros.add(new Label("Segundo numero: "));
        TextField textFieldnum2 = new TextField();
        panelNumeros.add(textFieldnum2);

        panelNumMax.add(new Label("Maximo: "));
        TextField textFieldMax = new TextField();
        textFieldMax.setEditable(false);
        panelNumMax.add(textFieldMax);

        Button botonCalcularMaximo = new Button("Calcula maximo");
        botonCalcularMaximo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x, y;

                try {

                    x = Integer.parseInt(textFieldnum1.getText());
                    y = Integer.parseInt(textFieldnum2.getText());

                    textFieldMax.setText("" + calcularMaximo(x, y));
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        });

        panelBoton.add(botonCalcularMaximo);

        this.ventana.add(panelPrincipal);
    }

    /**
     * Calcula el maximo de dos numeros
     *
     * @param x El primero numero
     * @param y El segundo numero
     * @return El maximo de los dos numeros
     */
    private int calcularMaximo(int x, int y) {
        return Math.max(y, x);
    }
}
