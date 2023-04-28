package src.tp1.demo.loops;

/*
 *  Mostrar todos los años desde el 0 hasta el año actual (2023).
 * 
 */

public class IV_For_Intro {
  final static int CEILING_YEAR = 2023;
  public static void main(String[] args) {
    // Uso de for-loop:
    // 1) Declaro variable iteradora, 
    // 2) Defino condición de freno para el bucle,
    // 3) Indico cuánto aumentará el valor del iterador.
    // Igual que en JavaScript.
    for (int i = 0; i <= CEILING_YEAR; i++) {
      System.out.println(i);
    }
  }
}
