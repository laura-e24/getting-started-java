package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que resuelva el siguiente problema: Deberás solicitar el ingreso 
 * de una fecha de compra (String en el siguiente formato: YYYYMMDD), un nombre de comprador, 
 * un nombre de producto y una cantidad y precio del producto comprado. Mostrá a modo de ticket 
 * la información ingresada y el monto a pagar. Modelo de Ticket: 
 *  Fecha de Compra: YYYYMMDD 
 *  Nombre del Comprador: xxxxx xxxxx 
 *  Producto solicitado: xxxxx 
 *  Cantidad solicitada: xx 
 *  Precio Unitario: $xxx 
 *  Total a Pagar: $xxxxx 
 */

public class Ej11 {
  final static String REQUEST_MESSAGE = "Por favor, ingrese ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    String date;
    String buyerName;
    String productName;
    int quantity;
    double price;
    double total = 0;

    
    System.out.println(REQUEST_MESSAGE + "fecha de compra (YYYYMMDD): ");
    date = input.nextLine();

    System.out.println(REQUEST_MESSAGE + "nombre de comprador: ");
    buyerName = input.nextLine();

    System.out.println(REQUEST_MESSAGE + "nombre de producto: ");
    productName = input.nextLine();

    System.out.println(REQUEST_MESSAGE + "cantidad de producto: ");
    quantity = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "precio de producto: ");
    price = input.nextInt();

    total = quantity * price;

    System.out.println("* Fecha de compra: " + date);
    System.out.println("* Nombre del comprador: " + buyerName);
    System.out.println("* Producto solicitado: " + productName);
    System.out.println("* Cantidad solicitada: " + quantity);
    System.out.println("* Precio Unitario: " + total);
    input.close();
  }
}
