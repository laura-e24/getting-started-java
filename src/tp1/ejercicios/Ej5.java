package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que, dados dos números enteros num1 y num2 cargados desde 
 * teclado por el usuario, muestre el resultado de la división del primero por 
 * el segundo siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado. 
 * En el caso de que el segundo valor num2 sea cero, mostrar 
 * el siguiente mensaje de error: “No se puede dividir por cero”. 
 * 
 */

public class Ej5 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Ingrese un valor para ";
  final static String ERROR_MESSAGE = "¡¡¡NO SE PUEDE DIVIDIR POR 0, SE ROMPE LA MATRIX!!!";
  public static void main(String[] args) {
    int num1;
    int num2;
    double division = 0;

    System.out.println(REQUEST_MESSAGE + "num1: ");
    num1 = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "num2: ");
    num2 = input.nextInt();

    if (num2 == 0) System.out.println(ERROR_MESSAGE);
    else {
      division+= (double) num1 / num2;
      System.out.println(num1 + " / " + num2 + " = " + division);
    }

   input.close();
  }
}
