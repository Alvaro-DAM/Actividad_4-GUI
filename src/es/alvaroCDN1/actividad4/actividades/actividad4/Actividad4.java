package es.alvaroCDN1.actividad4.actividades.actividad4;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import es.alvaroCDN1.actividad4.Ventana;
import es.alvaroCDN1.actividad4.acciones.CerrarVentana;

/**
 * Crea una ventana que permite calcular el máximo de dos números introducidos por el usuario al pulsar un botón.
 */
public class Actividad4 {

    private Ventana ventana;

    /**
     * Constructor de la clase Actividad4
     */
    public Actividad4() {
        this.ventana = new Ventana("Actividad 4");
        this.ventana.setSize(480, 210);
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

        Dimension tamanoTextField = new Dimension(75, 25);

        panelNumeros.add(new Label("Primer numero: "));
        TextField textFieldnum1 = new TextField();
        textFieldnum1.setPreferredSize(tamanoTextField);
        panelNumeros.add(textFieldnum1);

        panelNumeros.add(new Label("Segundo numero: "));
        TextField textFieldnum2 = new TextField();
        textFieldnum2.setPreferredSize(tamanoTextField);
        panelNumeros.add(textFieldnum2);

        panelNumMax.add(new Label("Maximo: "));
        TextField textFieldMax = new TextField();
        textFieldMax.setPreferredSize(tamanoTextField);
        textFieldMax.setEditable(false);
        panelNumMax.add(textFieldMax);

        Dialog dialog = new Dialog(this.ventana, "Error", false);
        dialog.setSize(250, 100);
        Panel panelDialogError = new Panel(new GridLayout(2, 1));
        Panel panelEtiquetaError = new Panel(new FlowLayout(FlowLayout.CENTER));
        Panel panelBotonError = new Panel(new FlowLayout(FlowLayout.CENTER));
        panelEtiquetaError.add(new Label("Error, introduzca solo numeros"));
        panelDialogError.add(panelEtiquetaError);

        Button botonCerrar = new Button("Cerrar");
        botonCerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dialog.dispose();
            }
        });

        panelBotonError.add(botonCerrar);
        panelDialogError.add(panelBotonError);
        dialog.add(panelDialogError);

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
                    dialog.setVisible(true);
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
