package src.tutorial;

import java.util.Scanner;

public class Class2 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Please, enter the number ";
  final static String RESPONSE_MESSAGE = "Highest number is... ";
  final static String RESPONSE_MESSAGE_EQUALS = "Numbers are equal.";
  public static void main(String[] args) {
    int num1;
    int num2;

    System.out.println(REQUEST_MESSAGE + "one:");
    num1 = input.nextInt();

    System.out.println(REQUEST_MESSAGE + "two:");
    num2 = input.nextInt();

    if (num1 > num2) System.out.println(RESPONSE_MESSAGE + num1);
    else if (num2 > num1) System.out.println(RESPONSE_MESSAGE + num2);
    else System.out.println(RESPONSE_MESSAGE_EQUALS);

    input.close();
  }
}
