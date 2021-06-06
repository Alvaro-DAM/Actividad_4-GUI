package es.alvaroCDN1.actividad4.actividades;

import es.alvaroCDN1.actividad4.actividades.acciones.CerrarVentana;

import java.awt.*;

/**
 * Clase en la que debemos replicar la ventana del enunciado usando bucles
 */
public class Actividad1 {

    private Frame ventana;

    /**
     * Constructor de la clase Actividad1
     */
    public Actividad1() {
        this.ventana = new Frame("Actividad 1");
        this.ventana.setSize(1024, 768);
        this.ventana.setLocation(300, 50);

        this.ventana.addWindowListener(new CerrarVentana().cerrar(this.ventana));

        this.ventana.setVisible(true);
    }

    /**
     * Metodo que anade a la ventana los elementos requeridos por la actividad
     */
    public void iniciarActividad() {

        String[] letras = {"A", "B", "C", "D"};

        Panel panelGeneral = new Panel();
        panelGeneral.setLayout(new GridLayout(4, 5));
        panelGeneral.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        Panel panelGridABCD = new Panel(new GridLayout(2, 2));
        for (int i = 0; i < 4; i++) {
            panelGridABCD.add(new Button(letras[i]));
        }

        Panel panelDobleAB = new Panel(new GridLayout(1, 2));
        Panel panelDoble2 = new Panel(new GridLayout(1, 2));
        Panel panelDoble3 = new Panel(new GridLayout(1, 2));
        Panel panelDoble4 = new Panel(new GridLayout(1, 2));
        for (int i = 0; i < 2; i++) {
            panelDobleAB.add(new Button(letras[i]));

            panelDoble2.add(new Button(letras[i]));

            panelDoble3.add(new Button(letras[i]));

            panelDoble4.add(new Button(letras[i]));
        }

        Panel panelHorizABC = new Panel(new GridLayout(3, 1));
        Panel panelHoriz2 = new Panel(new GridLayout(3, 1));
        for (int i = 0; i < 3; i++) {
            panelHorizABC.add(new Button(letras[i]));
            panelHoriz2.add(new Button(letras[i]));
        }

        Panel panelBorderABCDE = new Panel(new BorderLayout());
        panelBorderABCDE.add(new Button(letras[0]), BorderLayout.NORTH);
        panelBorderABCDE.add(new Button(letras[1]), BorderLayout.WEST);
        panelBorderABCDE.add(new Button(letras[2]), BorderLayout.CENTER);
        panelBorderABCDE.add(new Button(letras[3]), BorderLayout.EAST);
        panelBorderABCDE.add(new Button("E"), BorderLayout.SOUTH);

        for (int i = 1; i < 21; i++) {
            switch (i) {
                case 1:
                    panelGeneral.add(panelGridABCD);
                    break;

                case 5:
                    panelGeneral.add(panelDobleAB);
                    break;

                case 7:
                    panelGeneral.add(panelHorizABC);
                    break;

                case 10:
                    panelGeneral.add(panelDoble2);
                    break;

                case 13:
                    panelGeneral.add(panelHoriz2);
                    break;

                case 15:
                    panelGeneral.add(panelDoble3);
                    break;

                case 19:
                    panelGeneral.add(panelBorderABCDE);
                    break;

                case 20:
                    panelGeneral.add(panelDoble4);
                    break;

                default:
                    panelGeneral.add(new Button("" + i));
                    break;
            }
        }

        ventana.add(panelGeneral);
    }
}
