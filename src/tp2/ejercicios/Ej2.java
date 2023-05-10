package src.tp2.ejercicios;

/*
 * Realizar un programa que muestre los números del 1 al 100 utilizando la instrucción while 
*/

public class Ej2 {
  final static int MAXIMUM_NUMBER = 100;
  public static void main(String[] args) {
    int counter = 0;
    while (counter < MAXIMUM_NUMBER) {
      System.out.println(counter + 1);
      counter++;
    }
  }
}
