import java.util.Scanner;

public class L2HW6 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the 1st number: ");
    int num1 = sc.nextInt();
    System.out.println("Input the 2nd number: ");
    int num2 = sc.nextInt();
    System.out.println("Input the 3rd number: ");
    int num3 = sc.nextInt();
    
    if (num1 == num2 && num2 == num3){
      System.out.println("All numbers are equal");
    }
    else if (num1 != num2 && num2 != num3 && num1 != num3){
      System.out.println("All numbers are different");
    }
    else {
      System.out.println("Neither all are equal or different");
    }
    sc.close();
  }
}