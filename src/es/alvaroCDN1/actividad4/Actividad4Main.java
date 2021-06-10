package es.alvaroCDN1.actividad4;

import es.alvaroCDN1.actividad4.actividades.actividad1.Actividad1;
//import es.alvaroCDN1.actividad4.actividades.actividad2.Actividad2;
import es.alvaroCDN1.actividad4.actividades.actividad2.Actividad2;
import es.alvaroCDN1.actividad4.actividades.actividad3.Actividad3;
import es.alvaroCDN1.actividad4.actividades.actividad4.Actividad4;
import es.alvaroCDN1.actividad4.actividades.actividad5.Actividad5;
import es.alvaroCDN1.actividad4.actividades.actividad6.Actividad6;
import es.alvaroCDN1.actividad4.actividades.actividad7.Actividad7;
import es.alvaroCDN1.actividad4.actividades.actividad8.Actividad8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad4Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean finalMenu = false;

        int opcion = -1;

        do {
            System.out.println("Seleccione una actividad\n");
            System.out.println("(Introduzca un numero del 1 al 8, o 0 para salir)");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero valido.\n");
                sc.next();
            }

            switch (opcion) {
                case 0:
                    break;

                case 1:
                    new Actividad1().iniciarActividad();
                    break;

                case 2:
                    new Actividad2().iniciarActividad();
                    break;

                case 3:
                    new Actividad3().iniciarActividad();
                    break;

                case 4:
                    new Actividad4().iniciarActividad();
                    break;

                case 5:
                    new Actividad5().iniciarActividad();
                    break;

                case 6:
                    new Actividad6().inciarActividad();
                    break;

                case 7:
                    new Actividad7().iniciarActividad();
                    break;

                case 8:
                    new Actividad8().iniciarActividad();
                    break;

                default:
                    System.out.println("Actividad no valida.\n");
                    break;
            }

        } while (opcion != 0);
    }
}
