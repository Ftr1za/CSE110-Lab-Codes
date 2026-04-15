import java.util.Scanner;

public class LAB5HW4{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i = 1; i <= n; i++){
      
      for (int s = n-i; s >= 1; s--){
        System.out.print(" ");
      }
      
      for (int d = 1; d <= 2*i-1; d++){
        if (i == 1){
          System.out.print(d);
        }
        else {
          if (d == 1 || d == 2*i-1){
            System.out.print(d);
          }
          else {System.out.print(" ");}
        }
      }
      System.out.println();
    }
    
    for ( int j = n-1 ; j >= 1; j--){
     
      for (int s2 = 1; s2 <= n-j ; s2++){
        System.out.print(" ");
      }
      
      for (int d2 = 1 ; d2 <= 2*j-1 ; d2++){
        if (d2 == 1 || d2 == 2*j-1){
            System.out.print(d2);
          }
          else {System.out.print(" ");}
      }
      System.out.println();
    }
    sc.close();
  }
}