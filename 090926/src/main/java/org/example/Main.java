package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        IO.println("Cual es tu nombre?");
        String nombre = entrada.nextLine();
        IO.println("Cual es tu edad?");
        try {
            int edad = entrada.nextInt();
            IO.println("Hola " + nombre + ", tienes: " + edad + " años");
        } catch (InputMismatchException e) {
            IO.println("Error al ingresar la edad.");
        }finally {
            entrada.close();
        }

    }
}
