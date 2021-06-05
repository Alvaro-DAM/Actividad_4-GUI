package es.alvaroCDN1.actividad4;

import es.alvaroCDN1.actividad4.actividades.Actividad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad4Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean finalMenu = false;

        int opcion = 0;

        do {
            System.out.println("Seleccione una actividad");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero.\n");
                sc.next();
            }

            switch (opcion) {
                case 1:
                    new Actividad1().iniciarActividad();
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (!finalMenu);
    }
}
