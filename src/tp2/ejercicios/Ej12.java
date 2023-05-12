package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizar un programa en el cual se pida el ingreso de dos números enteros num1 y num2 
 * y el signo de la operación (“+” para sumar, “-” para restar, “/” para dividir, “*” 
 * para multiplicar y “%” para obtener el resto o módulo). Mientras que la operación no sea “f” 
 * (de “fin”) aplicar la operación elegida a n1 y n2. Tener en cuenta que la división por 0 es 
 * imposible. Realizar una función para cada operación, que reciba por parámetros n1 y n2, 
 * y retorne el resultado de hacer la operación entre los dos números. 
 * 
 */

public class Ej12 {
  final static String END_OF_ENTRY = "f";
  final static String REQUEST_NUMBER = ">> Por favor ingrese un número para ";
  final static String REQUEST_OPERATION = ">> Por favor ingrese operación SUMA (+)  RESTA  (-)  MULTIPLICACIÓN  (*)  DIVISIÓN  (/) MÓDULO  (%)  o (f) para finalizar el programa: ";
  final static String RESPONSE_MESSAGE = ">> FIN <<";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    String operation;
    int n1;
    int n2;
    double result; 

    System.out.println(REQUEST_OPERATION);
    operation = input.nextLine();

    System.out.println(REQUEST_NUMBER + "n1: ");
    n1 = input.nextInt();

    System.out.println(REQUEST_NUMBER + "n2: ");
    n2 = input.nextInt();


    switch (operation) {
      case "+":
        result = add(n1, n2);
        break;

      case "-":
        result = substract(n1, n2);
        break;
    

      case "*":
        result = multiply(n1, n2);
        break;

      case "/":
        result = division(n1, n2);
        break;

      case "%":
        result = module(n1, n2);
        break;

      default: System.out.println(RESPONSE_MESSAGE);
        break;
    }

    //TO FINISH
    // System.out.println(n1 + " " + operation + " " + n2 + " = " + result);

    input.close();
  }

  static int add (int n1, int n2) {
    return n1 + n2;
  }

  static int substract (int n1, int n2) {
    return n1 - n2;
  }

  static int multiply (int n1, int n2) {
    return n1 * n2;
  }

  static int division (int n1, int n2) {
    return n1 / n2;
  }

  static int module (int n1, int n2) {
    return n1 % n2;
  }


}
