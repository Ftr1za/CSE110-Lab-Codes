import java.util.Scanner;

public class LAB5HW5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i = 1; i <= n ; i++){
      
      for (int sp= n-i ; sp >= 1 ; sp--){
        System.out.print(" ");
      }
      for (int d = 1 ; d <= (2*i)-i ; d++){
        System.out.print(d);
      }
      for (int di = (2*i)-(i+1) ; di >= 1 ; di--){
        System.out.print(di);
      }
      System.out.println();
    }
    sc.close();
  }
}
