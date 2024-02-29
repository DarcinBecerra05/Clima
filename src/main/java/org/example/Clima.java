package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Clima {

    public static void calcularClima(int temperatura, int porcentajeDiasLLuvia, int numDias) {

        int countDiasLLovidos = 0;


        List<Integer> listTemperaturas = new ArrayList<>();
        listTemperaturas.add(temperatura);
        System.out.println("La temperatura del día [1] es " + temperatura + "° y la " +
                "probabilidad de lluvia es de " + porcentajeDiasLLuvia + "%");

        for (int i = 1; i < numDias; i++) {

            Random probabilidad = new Random();
            if(probabilidad.nextInt(10) == 0){
                temperatura  += probabilidad.nextInt(2)==0? 2 : -2;
            }


            if (temperatura < 5) {
                porcentajeDiasLLuvia -= 20;
            }

            if (porcentajeDiasLLuvia < 0) {
                porcentajeDiasLLuvia = 0;
            }


            if (temperatura > 25) {
                porcentajeDiasLLuvia += 20;
            }
            if (porcentajeDiasLLuvia > 100) {
                porcentajeDiasLLuvia = 100;
            }


            if (porcentajeDiasLLuvia == 100) {
                temperatura -= 1;
                countDiasLLovidos++;
            }



            System.out.println("La temperatura del día [" + (i + 1) + "] es " + temperatura + "° y la " +
                    "probabilidad de lluvia es de " + porcentajeDiasLLuvia + "%");

            listTemperaturas.add(temperatura);


        }

        if (countDiasLLovidos == numDias) {
            System.out.println("Llovió todos los días");
        }
        System.out.println("LLovió [" + countDiasLLovidos + "] dias");

        int tempMax = listTemperaturas.get(0);
        int tempMin = listTemperaturas.get(0);

        for (int i = 0; i < listTemperaturas.size(); i++) {
            if (listTemperaturas.get(i) > tempMax) {
                tempMax = listTemperaturas.get(i);
            }
            if (listTemperaturas.get(i) < tempMin) {
                tempMin = listTemperaturas.get(i);
            }
        }
        System.out.println("La temperatura máxima durante los " + numDias + " dias fue de " + tempMax + "°");
        System.out.println("La temperatura mínima durante los " + numDias + " dias fue de " + tempMin + "°");


    }

}
