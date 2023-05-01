package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que pida al usuario ingresar dos números enteros num1 y num2. 
 * Luego, mostrar el resultado de la suma entre ambos, utilizando el siguiente formato: 
 * “La suma entre “ + num1 + “ y “ + num2 + “ da como resultado “ + num1 + num2 
 */

public class Ej4 {
  final static String REQUEST_MESSAGE = "Please, enter number ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int num1;
    int num2;
    int sum = 0;

    System.out.println(REQUEST_MESSAGE + "one: ");
    num1 = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "two: ");
    num2 = input.nextInt();

    sum = num1 + num2;

    System.out.println("La suma entre " + num1 + " y " + num2 + " da como resultado " + sum);

    input.close();
  }
}
