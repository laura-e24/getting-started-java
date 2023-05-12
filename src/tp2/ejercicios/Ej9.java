package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores enteros cada vez. 
 * Emití el promedio de cada grupo.
 * 
 */

public class Ej9 {
  final static int MAXIMUM_TIMES = 5;
  final static int REQUESTED_NUMBERS = 3;
  final static String REQUEST_MESSAGE = ">> Ingrese " + REQUESTED_NUMBERS + " valores enteros";
  final static String REQUEST_MESSAGE_TWO = "     >>> Ingrese un valor entero para ";
  final static String RESPONSE_MESSAGE = "- El promedio entre los " + REQUESTED_NUMBERS + " es ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int num1;
    int num2;
    int num3;
    int sum = 0;

    for (int i = 0; i < MAXIMUM_TIMES; i++) {
      System.out.println("(" + (i + 1) + ") " + REQUEST_MESSAGE);

      System.out.println(REQUEST_MESSAGE_TWO + "num1: ");
      num1 = input.nextInt();
  
      System.out.println(REQUEST_MESSAGE_TWO + "num2: ");
      num2 = input.nextInt();
  
      System.out.println(REQUEST_MESSAGE_TWO + "num3: ");
      num3 = input.nextInt();
  
      sum = num1 + num2 + num3;
      System.out.println(RESPONSE_MESSAGE + (sum / REQUESTED_NUMBERS) + ".");
    }

    input.close();
  }
}
