package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        double distancia;
        double consumo100km;
        double precioLitro;
        double totalLitros;
        double costoTotalGasolina;


        System.out.print("Ingrese la distancia total del viaje (en kilómetros): ");
        distancia = leerTeclado.nextDouble();

        System.out.print("Ingrese el consumo de combustible del automóvil (litros por cada 100 km): ");
        consumo100km = leerTeclado.nextDouble();

        System.out.print("Ingrese el precio por litro de combustible: ");
        precioLitro = leerTeclado.nextDouble();

        totalLitros = (distancia / 100.0) * consumo100km;

        costoTotalGasolina = totalLitros * precioLitro;

        System.out.println("Resumen del viaje:");
        System.out.println("Distancia del viaje: " + distancia + " km");
        System.out.println("Consumo de combustible del automóvil: " + consumo100km + " litros por cada 100 km");
        System.out.println("Precio por litro de combustible: $" + precioLitro);
        System.out.println("//////////////////////////////");
        System.out.println("Consumo total de combustible: " + totalLitros + " litros");
        System.out.println("Costo total de combustible: $" + costoTotalGasolina);
    }
}