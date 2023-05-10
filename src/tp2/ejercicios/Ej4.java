package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizar un programa en el cual se pida al usuario el ingreso de dos números enteros num1 y num2, 
 * cuya relación de valores es que el primero es menor o igual al segundo y mostrar por pantalla 
 * la secuencia de números que existe entre ambos: 
    * a) Incluyéndolos; 
    * b) Excluyéndolos. 
 * Observación: Validar que el primer número sea menor o igual al segundo. 
 * Pedir el ingreso de ambos números las veces que sea necesario hasta que se cumpla dicha condición. 
 * ¿Qué pasaría si esta validación no la realizáramos y el ingreso es incorrecto? 
 * 
 */

public class Ej4 {
  final static String CONDITION = "mayor o igual al anterior";
  final static String REQUEST_MESSAGE = "Por favor, ingrese un valor para ";
  final static String ERROR_MESSAGE = "ERROR: Num2 debe ser " +  CONDITION + ".";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int num1;
    int num2;

    System.out.println(REQUEST_MESSAGE + "num1: ");
    num1 = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "num2 (" + CONDITION + "): ");
    num2 = input.nextInt();
 
    if (num1 > num2) System.out.println(ERROR_MESSAGE);
    else {
      System.out.println("** INTERVALO CERRADO ENTRE NUM1 Y NUM2 **");
      for (int i = num1; i < num2 + 1; i++) {
        System.out.println(i);
      }

      System.out.println("** INTERVALO ABIERTO ENTRE NUM1 Y NUM2 **");
      for (int i = num1 + 1; i < num2; i++) {
        System.out.println(i);
      }
    }

    input.close();
  }
}
