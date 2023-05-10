package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que lea una serie de números ingresados por el usuario mientras que el promedio
 * entre todos sea menor a 20. Informar la cantidad de valores leídos.
 *
 */

public class Ej5 {
  final static int MAXIMUM_AVERAGE_VALUE = 20;
  final static String REQUEST_MESSAGE = "Por favor, ingrese un número para calcular el promedio: ";
  final static String RESPONSE_MESSAGE = "Valores ingresados: ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int valuesCounter = 0;
    double valuesSum = 0;
    double averageValue = 0;

    do {
      System.out.println(REQUEST_MESSAGE);
      valuesSum+= input.nextDouble();
      valuesCounter++;

      averageValue = (double) valuesSum / valuesCounter;
    } while (averageValue < MAXIMUM_AVERAGE_VALUE);

    System.out.println(RESPONSE_MESSAGE + valuesCounter);
    System.out.println("Promedio: " + averageValue);

    input.close();
  }
}
