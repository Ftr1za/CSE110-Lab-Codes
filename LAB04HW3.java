import java.util.Scanner;

public class LAB04HW3 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of days: ");
    int d_count = sc.nextInt();
    
    for (int i= 1; i <= d_count; i++){
      System.out.printf("Enter sales for Day %d:\n",i);
      double sum=0;
      double tax =0;
      for (int j=1 ; j<=3; j++){
        int sales = sc.nextInt();
        sum+=sales;
      }
      if (sum >= 100 && sum <200){
        tax = 2.0/100;
      }
      else if (sum >= 200 && sum <500){
        tax = 5.0/100;
      }
      else if (sum >= 500){
        tax = 10.0/100;
      }
      double t_sales = sum + (sum * tax);
      System.out.printf("Day %d: Total Sales with Tax: %.1f\n",i,t_sales);
    }
  }
}