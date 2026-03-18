// Write a Java code of a program that takes an integer number as user input and then determines if that number is divisible by either 5 or 7 but not both; 
// otherwise display “No”. For example, numbers like 35, 70, 105, 140, 175, 210, 245, 280 etc. can be divisible by both 5 and 7. These numbers are invalid.

import java.util.Scanner;

public class LAB2HW1 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num % 5 == 0 && num % 7 != 0){
      System.out.println("Divisible by 5 Only");
    }
    else if (num % 5 != 0 && num % 7 == 0){
      System.out.println("Divisible by 7 Only");
    }
    else if (num % 5 == 0 && num % 7 == 0){
      System.out.println("Invalid: Divisible by both");
    }
    else {
      System.out.println("No");
    }
    sc.close();
  }
}
