package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que solicite al usuario el ingreso por teclado de un valor 
 * entero mayor que 0 en una variable llamada num1 y muestre un mensaje por 
 * pantalla indicando "el número es par" o "el número es impar". 
 * Deberá utilizar el operador “módulo” es el caracter %. 
 * 
 */

public class Ej6 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Ingrese un valor entero positivo: ";
  final static String RESPONSE_MESSAGE = "El número es ";
  public static void main(String[] args) {
    int num1;

    System.out.println(REQUEST_MESSAGE);
    num1 = input.nextInt();

    if (num1 % 2 == 0) System.out.println(RESPONSE_MESSAGE + "par.");
    else System.out.println(RESPONSE_MESSAGE + "impar.");

    input.close();
  }
}
