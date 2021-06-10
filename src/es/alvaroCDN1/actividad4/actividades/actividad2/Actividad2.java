package es.alvaroCDN1.actividad4.actividades.actividad2;

import es.alvaroCDN1.actividad4.Ventana;

import java.awt.*;

/**
 * Clase que replica un formulario
 */
public class Actividad2 {

    private Ventana ventana;

    /**
     * Constructor de la clase Actividad2
     */
    public Actividad2() {
        this.ventana = new Ventana("Actividad 2");
        this.ventana.setSize(1225, 565);
    }

    /**
     * Anade todos los elementos de la actividad a la ventana
     */
    public void iniciarActividad() {
        GridLayout gridLayout = new GridLayout(2, 1);
        gridLayout.setHgap(10);

        Panel panelPrincipal = new Panel(gridLayout);

        Label titulo = new Label(("Registration Form"), Label.CENTER);
        titulo.setFont(new Font("Calibri", Font.PLAIN, 26));

        panelPrincipal.add(titulo);

        FlowLayout flowLayout2 = new FlowLayout();
        flowLayout2.setHgap(6);
        flowLayout2.setVgap(10);

        GridLayout gridLayout2 = new GridLayout(1, 2);
        gridLayout2.setVgap(20);
        gridLayout2.setHgap(8);

        Panel panelAbajo = new Panel(gridLayout2);
        Panel panelIzq = new Panel(new GridLayout(7, 1));
        Panel panelDcha = new Panel(new FlowLayout());

        panelAbajo.add(panelIzq);
        panelAbajo.add(panelDcha);

        panelPrincipal.add(panelAbajo);

        TextArea textArea = new TextArea();

        panelDcha.add(textArea);

        Panel panelNombre = new Panel(flowLayout2);
        panelIzq.add(panelNombre);

        panelNombre.add(new Label("Name"));

        TextField textFieldNombre = new TextField();
        textFieldNombre.setPreferredSize(new Dimension(95, 25));
        panelNombre.add(textFieldNombre);

        Panel panelMobile = new Panel(flowLayout2);
        panelIzq.add(panelMobile);

        panelMobile.add(new Label("Mobile"));

        TextField textFieldMobile = new TextField();
        textFieldMobile.setPreferredSize(new Dimension(95, 25));
        panelMobile.add(textFieldMobile);

        Panel panelGender = new Panel(flowLayout2);
        panelGender.add(new Label("Gender"));

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox male = new Checkbox("Male", genderGroup, true);
        Checkbox female = new Checkbox("Female", genderGroup, true);

        panelGender.add(male);
        panelGender.add(female);

        panelIzq.add(panelGender);

        Panel panelBirth = new Panel(flowLayout2);
        panelBirth.add(new Label("DOB"));

        Choice dia = new Choice();

        for (int i = 1; i <= 31; i++) {
            dia.add("" + i);
        }

        Choice mes = new Choice();

        mes.add("Enero");
        mes.add("Febrero");
        mes.add("Marzo");
        mes.add("Abril");
        mes.add("Mayo");
        mes.add("Junio");
        mes.add("Julio");
        mes.add("Agosto");
        mes.add("Septiembre");
        mes.add("Octubre");
        mes.add("Noviembre");
        mes.add("Diciembre");

        Choice ano = new Choice();

        for (int i = 1990; i <= 2021; i++) {
            ano.add("" + i);
        }

        panelBirth.add(dia);
        panelBirth.add(mes);
        panelBirth.add(ano);

        panelIzq.add(panelBirth);

        Panel panelAdress = new Panel(flowLayout2);
        panelAdress.add(new Label("Adress"), Label.TOP_ALIGNMENT);

        TextArea adressArea = new TextArea();
        adressArea.setPreferredSize(new Dimension(145, 85));
        panelAdress.add(adressArea);

        panelIzq.add(panelAdress);

        Panel panelTerms = new Panel();
        panelTerms.add(new Checkbox());
        panelTerms.add(new Label("Accept Terms and Conditions"));

        panelIzq.add(panelTerms);

        Panel panelBotones = new Panel();
        panelBotones.add(new Button("Submit"));
        panelBotones.add(new Button("Reset"));

        panelIzq.add(panelBotones);

        this.ventana.add(panelPrincipal);
    }
}
