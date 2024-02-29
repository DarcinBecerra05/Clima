package org.example;
import java.util.Scanner;

public class Validaciones {
    public static boolean validarNumero(Scanner scanner){
        try {
            if (!scanner.hasNextInt()) {
                System.out.println("No ha ingresado un número entero. Por favor, inténtelo de nuevo:");
                scanner.next();
                return validarNumero(scanner);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int validarRangoDias(int numDias){
        try {
            Scanner sc = new Scanner(System.in);
            while (numDias <= 0 || numDias > 365) {
                System.out.println("El número de días no puede ser 0 o inferior, o mayor a 365");
                System.out.print("Ingrese el número de días que desea consultar: ");
                validarNumero(sc);
                numDias = sc.nextInt();
                return validarRangoDias(numDias);
            }
            return numDias;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validarPorcentajeDeLluvias(int porcentaje) {
        try {
            Scanner sc = new Scanner(System.in);
            while (porcentaje>100 || porcentaje<0){
                System.out.println("El porcentaje no puede ser mayor a 100% o inferior a 0%");
                System.out.print("Ingrese nuevamente el porcentaje: ");
                validarNumero(sc);
                porcentaje = sc.nextInt();
                return validarPorcentajeDeLluvias(porcentaje);
            }
            return true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
