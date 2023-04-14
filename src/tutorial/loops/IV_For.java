package src.tutorial.loops;

import java.util.Scanner;

/*
 *  Ingresar cinco números enteros. Al final, mostrar cuántos son menores de cincuenta.
 * 
 */

public class IV_For {
  final static Scanner input = new Scanner(System.in);
  final static String ENTER_MESSAGE = "Enter number ";
  final static int NUM_TO_EVAL = 50;
  final static int NUM_QUANTITY = 5;
  public static void main(String[] args) {
    // Variable que almacenará el número del scanner
    int number;
    // Variable que contará cuántos números cumplen la condición
    int counter = 0;

    // Por cada número ingresado se ejecuta toda esta instrucción:
    for (int i = 0; i < NUM_QUANTITY; i++) {
      System.out.println(ENTER_MESSAGE + (i + 1));
      // Guardamos el número del scanner en la variable
      number = input.nextInt();

      if (number < NUM_TO_EVAL) {
        // Si el número ingresado es menor a cincuenta, sumo uno al contador
        // de números a mostrar
        counter++;
      }
    }

    // Luego de ingresar todos los números pedidos, mostrar mensaje de cuántos de ellos
    // cumplen con la condición pedida (menores de cincuenta)
    System.out.println("<" + counter + ">" + " numbers are lower than " + NUM_TO_EVAL);
    input.close();
  }
}
