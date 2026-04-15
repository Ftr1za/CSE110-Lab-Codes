import java.util.Scanner;

public class LAB5HW2{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i= 1 ; i <= n; i++){
      
      for (int s= n-i; s >= 1; s--){
        System.out.print(" ");
      }
      for (int d = (n+1)-i; d <= n; d++){
        if (i == 1 || i == 2 || i == n){
          System.out.print(d);
        }
        if (i > 2 && i < n) {
          if (d == (n+1)- i || d ==n ){
            System.out.print(d);
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
