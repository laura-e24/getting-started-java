package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Construir un programa que simule el funcionamiento de una calculadora que puede realizar 
 * las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores 
 * numéricos enteros. En un principio, el usuario debe especificar la operación que desea realizar 
 * (s para la suma, r para la resta, p para el producto y d para la división) y luego, 
 * deberá ingresar dos números enteros para así realizar la operación. 
 * Informar el resultado por pantalla. 
  * Nota: Se recomienda el empleo de una sentencia switch. 
 */

public class Ej14 {
  final static Scanner input = new Scanner(System.in);
  final static String ADDITION = "SUMA";
  final static char add = '\u0073';
  final static String SUBSTRACT = "RESTA";
  final static char sub = '\u0072';
  final static String MULTIPLY = "MULTIPLICACIÓN";
  final static char mul = '\u006D';
  final static String DIVISION = "DIVISIÓN";
  final static char div = '\u0064';
  final static String REQUEST_OPERATION = "¿Qué operación desea realizar? " + ADDITION + " (s) - " + SUBSTRACT + " (r) - " + MULTIPLY + " (m) - " + DIVISION + " (d)";
  final static String REQUEST_NUMBERS = "Por favor, ingrese un número entero para realizar el cálculo: ";
  final static String ERROR_MESSAGE = "ERROR: no ingresó operación.";
  public static void main(String[] args) {
    char operation;
    int num1;
    int num2;
    int result = 0;

    System.out.println(REQUEST_OPERATION);
    // Ya que no existe el método nextChar(), debemos hacer esto
    // para poder extraer un char del input
    operation = input
    .next() // returns the next token/word in the input as a string
    .toLowerCase() 
    .charAt(0); // returns the first character in that string.
    // the number 0 in the function in CharAt(NUMBER) represents the index of 
    // the single word of the string taken input

    System.out.println(REQUEST_NUMBERS);
    num1 = input.nextInt();

    
    System.out.println(REQUEST_NUMBERS);
    num2 = input.nextInt();

    
    switch (operation) {
      case add:
        result = num1 + num2;
        break;
    
      case sub:
        result = num1 - num2;
        break;

      case mul:
        result = num1 * num2;
        break;

      case div:
        result = num1 / num2;
        break;

      default: System.out.println(ERROR_MESSAGE);
        break;
    }
    System.out.println("RESULTADO: " + result);

    input.close();
  }
}
