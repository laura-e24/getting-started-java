package src.tp2.ejercicios;

/*
 * Realizar un programa que muestre los números del 1 al 100 utilizando la instrucción for 
*/

public class Ej1 {
  final static int MAXIMUM_NUMBER = 100;
  public static void main(String[] args) {
    for (int i = 0; i < MAXIMUM_NUMBER; i++) {
      System.out.println(i + 1);
    }
  }
}
