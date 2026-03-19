//Write a Java program that will take a positive integer n as input and print all the numbers from 0 to n which are divisible by 5 but not divisible by 3.

import java.util.Scanner;

public class LAB3HW1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i= 0; i <= num; i++){
      if (i % 5 == 0 && i % 3 != 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}
