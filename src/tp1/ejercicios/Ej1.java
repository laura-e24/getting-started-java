package src.tp1.ejercicios;

/*
 * Realizá un programa donde se cree una variable entera llamada num1, que inicialmente valdrá 0. 
 * Luego incrementá su valor en 2 y mostralo por pantalla. 
 * Después mostrá el resultado de multiplicarlo por sí mismo. 
 */

public class Ej1 {
  public static void main(String[] args) {
    int num1 = 0;
    num1 += 2;

    double num2 = Math.pow(num1, 2);

    System.out.println("Num1 + 2 = " + num1);
    System.out.println("Num1 * Num1 = " + num2);
  }
}
