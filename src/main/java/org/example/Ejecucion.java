package org.example;

import java.util.Scanner;

import static org.example.Validaciones.*;

public class Ejecucion {

    public static void comenzar() {
        try{
        var sc = new Scanner(System.in);

        System.out.print("Ingrese el número de días que desea consultar desde el día 1 al 365: ");
        validarNumero(sc);
        int numDias = sc.nextInt();

        numDias = validarRangoDias(numDias);

        System.out.print("Ingrese la temperatura inicial en número entero:  ");
        validarNumero(sc);
        int tempIni = sc.nextInt();

        System.out.print("Ingrese el porcentaje de lluvias inicial: ");
        validarNumero(sc);
        int porcentajeInicial = sc.nextInt();

        validarPorcentajeDeLluvias(porcentajeInicial);
        Clima.calcularClima(tempIni, porcentajeInicial, numDias);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
