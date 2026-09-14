import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

void main() {
    int edad = 0;
    String clasificacion = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese tu edad: ");
    try {
        edad = sc.nextInt();
        if (edad < 0 || edad >120) {
            throw new InputMismatchException();
        }
        if (edad < 13) {
            clasificacion = "Niño";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 65) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto Mayor";
        }
        System.out.println("Clasificación: " + clasificacion);
    } catch (InputMismatchException e) {
        System.out.println("Introduzca un edad valida(numero natural)");
    } finally {
        sc.close();
    }

}

