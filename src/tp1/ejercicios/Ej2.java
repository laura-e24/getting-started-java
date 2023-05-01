package src.tp1.ejercicios;

/*
 * Realizá un programa que, siendo num1 y num2 variables enteras con valores 4 y 5, respectivamente, 
 * realice la operación correspondiente y muestre el resultado en pantalla: Suma, Producto 
 */

public class Ej2 {
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 5;

    int sum = num1 + num2;
    int mult = num1 * num2;

    System.out.println("Num1 + num2 = " + sum);
    System.out.println("Num1 * num2 = " + mult);
  }
}
