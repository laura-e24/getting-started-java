package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Escribí la función booleana esMultiplo (int num1, int num2) que recibirá dos enteros y devolverá 
 * verdadero cuando el primero sea múltiplo de segundo (de lo contrario, devolverá falso). 
 * Para saber si un número es múltiplo de otro utilizá el operador % (módulo), que devuelve el 
 * resto de la división. Probá la función desde el main con los lotes de datos (5, 3) y (15, 3). 
 * 
 */

public class Ej8 {
  final static String REQUEST_MESSAGE = "Ingrese un valor para ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int num1;
    int num2;
    boolean isMultiple;

    System.out.println(REQUEST_MESSAGE + "num1: ");
    num1 = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "num2: ");
    num2 = input.nextInt();

    isMultiple = FnIsMultiple(num1, num2);

    System.out.println(isMultiple);
    input.close();
  }

  static boolean FnIsMultiple (int num1, int num2) {
    boolean varIsMultiple;
    varIsMultiple = num1 % num2 == 0;
    
    return varIsMultiple;
  }
}
