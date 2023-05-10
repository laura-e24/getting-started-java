package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * El ingreso a un sitio web se valida por nombre de usuario y contraseña. Realizar un programa 
 * que impida que el usuario ingrese hasta poner los datos correctos. Si intenta más de 3 veces 
 * erróneamente, se debe mostrar el mensaje “Se ha bloqueado su cuenta”, de lo contrario, 
 * mostrar “Ha ingresado correctamente”. 
 * 
 */

public class Ej7 {
  final static Scanner input = new Scanner(System.in);
  final static String USER = "usuario";
  final static String PASSWORD = "contrasena";
  final static String REQUEST_MESSAGE = "Por favor, ingrese ";
  final static String RESPONSE_MESSAGE = "¡¡Ha ingresado correctamente!!";
  final static String WARNING_MESSAGE = "Los datos ingresados son incorrectos";
  final static String ERROR_MESSAGE = "Ha intentando demasiadas veces con datos incorrectos. Se ha bloqueado su cuenta.";
  public static void main(String[] args) {
    String user;
    String password;
    int errorCounter = 0;
    boolean isLogged = false;


    do {
      System.out.println(REQUEST_MESSAGE + " usuario: ");
      user = input.nextLine();
  
      System.out.println(REQUEST_MESSAGE + " contraseña: ");
      password = input.nextLine();

      if (user.equals(USER) && password.equals(PASSWORD)) {
        isLogged = true;
        System.out.println(RESPONSE_MESSAGE);
      } else {
        errorCounter++;
        if (errorCounter< 3)  
          System.out.println(WARNING_MESSAGE + ", le quedan " + (3 - errorCounter) + " intentos.");
      }
    }
    while (!isLogged && errorCounter < 3);

    if (errorCounter == 3) System.out.println(ERROR_MESSAGE);

    input.close();
  }
}
