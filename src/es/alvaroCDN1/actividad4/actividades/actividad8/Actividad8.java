package es.alvaroCDN1.actividad4.actividades.actividad8;

import es.alvaroCDN1.actividad4.Ventana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Simula un bloc de notas con un area de texto y permite guardar el archivo
 */
public class Actividad8 {

    private Ventana ventana;

    /**
     * Constructor de la clase Actividad8
     */
    public Actividad8() {
        this.ventana = new Ventana("Actividad 8");
        this.ventana.setSize(680, 410);
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void iniciarActividad() {
        Panel panelPrincipal = new Panel(new GridLayout(0, 1));

        TextArea textArea = new TextArea();
        panelPrincipal.add(textArea);

        MenuBar menu = new MenuBar();
        this.ventana.setMenuBar(menu);

        Menu archivo = new Menu("Archivo");
        menu.add(archivo);

        MenuItem menuItemGuardar = new MenuItem("Guardar...");
        archivo.add(menuItemGuardar);

        archivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarArchivo(textArea);
            }
        });

        ventana.add(panelPrincipal);
    }

    /**
     * Guardar el archivo cuando seleccionamos la opcion del menu "Guardar..."
     *
     * @param textArea El area de texto del cual obtendremos el texto para escribirlos en el archivo
     */
    private void guardarArchivo(TextArea textArea) {
        FileDialog guardar = new FileDialog(this.ventana, "Guardar archivo", FileDialog.SAVE);
        guardar.setFile("Sin_titulo.txt");
        guardar.setDirectory(System.getProperty("user.dir"));
        guardar.setVisible(true);

        if (guardar.getFile() != null) {
            String path = guardar.getDirectory();
            String nombreArchivo = guardar.getFile();

            try {
                FileWriter fw = new FileWriter(path + nombreArchivo);
                fw.write(textArea.getText());
                fw.close();

            } catch (IOException e) {
                Dialog dialog = new Dialog(this.ventana, "Error", false);
                dialog.setSize(250, 100);
                Panel panelDialogError = new Panel(new GridLayout(2, 1));
                Panel panelEtiquetaError = new Panel(new FlowLayout(FlowLayout.CENTER));
                Panel panelBotonError = new Panel(new FlowLayout(FlowLayout.CENTER));
                panelEtiquetaError.add(new Label("No se pudo guardar el archivo."));
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
            }
        }
    }
}
