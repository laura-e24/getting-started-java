package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que al ingresar dos números enteros positivos llamados A y B se calcule el 
 * producto de éstos a través de sumas sucesivas. Por ejemplo, si los números son 4 y 2, 
 * hacer 4 + 4; si son 5 y 3, hacer 5 + 5 + 5. 
 * ¿Qué pasa si la diferencia entre los dos números es muy grande? 
 * ¿Influye cuál se usa para sumar y cuál para contar la cantidad de sumas hechas? 
 * 
 */

public class Ej11 {
  final static String REQUEST_MESSAGE = ">>> Ingrese un valor entero positivo ";
  final static String RESPONSE_MESSAGE = ">>> El producto de sumas sucesivas de los números ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int a;
    int b;
    int result = 0;

    System.out.println(REQUEST_MESSAGE + " A: ");
    a = input.nextInt();

    System.out.println(REQUEST_MESSAGE + " B: ");
    b = input.nextInt();

    for (int i = 0; i < b; i++) {
      result += a;
    }

    System.out.println(RESPONSE_MESSAGE + a + " y " + b + " es " + result);

    input.close();
  }
}
