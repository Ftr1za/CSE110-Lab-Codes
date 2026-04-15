import java.util.Scanner;

public class LAB5HW3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i = 1 ; i <= n ; i++){
      
      for (int s = n-i; s >= 1; s--){
        System.out.print(" ");
      }
      
      for (int d = 1 ; d <= (2*i)-1 ; d++){
        if ( i == 1 || i == n){
          System.out.print(d);
        }
        else{
          if ( d == 1){
            System.out.print(d);
          }
          else if (d == (2*i)-1){
            System.out.print(d);
          }
          else {System.out.print(" ");}
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
