package es.alvaroCDN1.actividad4.actividades.actividad7;

import es.alvaroCDN1.actividad4.Ventana;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Crea una ventana que muestra cuantas veces se han pulsado dos botones
 */

public class Actividad7 {

    private Ventana ventana;
    private int counter;

    /**
     * Constructor de la clase Actividad7
     */
    public Actividad7() {
        this.ventana = new Ventana("Actividad 7");
        this.ventana.setSize(380, 100);

        this.counter = 0;
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void iniciarActividad() {
        Panel panelPrincipal = new Panel();

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        flowLayout.setVgap(15);

        panelPrincipal.setLayout(flowLayout);

        panelPrincipal.add(new Label("Counter "));

        Dimension tamanoTextField = new Dimension(75, 25);
        Dimension tamanoBotones = new Dimension(70, 35);

        TextField textFieldCounter = new TextField();
        textFieldCounter.setPreferredSize(tamanoTextField);
        textFieldCounter.setEditable(false);
        textFieldCounter.setText("" + this.counter);
        panelPrincipal.add(textFieldCounter);

        Button counterButton = new Button("Count");
        counterButton.setPreferredSize(tamanoBotones);
        counterButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                incrementarContador(textFieldCounter);
            }
        });

        Button counterButton2 = new Button("Count");
        counterButton2.setPreferredSize(tamanoBotones);
        counterButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                incrementarContador(textFieldCounter);
            }
        });

        panelPrincipal.add(counterButton);
        panelPrincipal.add(counterButton2);

        this.ventana.add(panelPrincipal);
    }

    /**
     * Incrementa el contador en +1 cada vez que se pulsa el boton asociado a la accion
     *
     * @param textField El campo de texto donde se muestra el contador
     */
    private void incrementarContador(TextField textField) {
        this.counter++;
        textField.setText("" + this.counter);
    }
}
