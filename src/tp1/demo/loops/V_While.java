package src.tp1.demo.loops;

import java.util.Scanner;

/*
 *  Se ingresan edades mientras que sean mayores de 18 años.
 *  Mostrar el promedio de edades.
 * 
 */

public class V_While {
  final static int LIMIT_AGE = 18;
  final static Scanner input = new Scanner(System.in);
  final static String ENTER_MESSAGE = "Enter an age higher than " + LIMIT_AGE;
  final static String ERROR_MESSAGE = "No age older than " + LIMIT_AGE + " years were entered.";
  public static void main(String[] args) {
    int age;
    int agesSum = 0; // Sumatoria de edades
    int agesCounter= 0; // Contador de edades
    // Esta es una variable double ya que puede ocurrir
    // que el promedio tenga decimales, por tanto no es un entero
    double averageAge;

    System.out.println(ENTER_MESSAGE); // Pido ingresar edad ("lectura anticipada")
    age = input.nextInt(); // Guardo la edad en la variable

    // Mientras que la edad ingresada sea mayor al límite
    while (age > LIMIT_AGE) {
      // Sumo el valor acumulado de edades con la edad ingresada
      agesSum += age;
      // Incremento la cantidad de edades
      agesCounter++;
      System.out.println(ENTER_MESSAGE); // Pido nuevamente una edad
      // Antes de salir del loop, redefino la edad con la recientemente ingresada
      age = input.nextInt();
    }

    if (agesCounter > 0) {
      // Saco el promedio. Especifico que quiero el resultado double (con decimales),
      // ya que al operar con dos int Java devolverá un int (esto se llama "castear/casteo")
      averageAge =  (double) agesSum / agesCounter; 
      System.out.println("Average age is " + averageAge);
    } else System.out.println(ERROR_MESSAGE);

    input.close();
  }
}
