import java.util.Scanner;

public class LAB5HW1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int i = 1; i <= n ; i++){
      
      for (int hsp= n-i ; hsp >= 1 ; hsp--){
        System.out.print(" ");
      }
      for (int d = 1 ; d <= (2*i)-1 ; d++){
        System.out.print(d);
      }
      System.out.println();
    }
    for (int j = n-1 ; j >= 1 ; j--){
      
      for (int sp2 = n-j ; sp2 >= 1 ; sp2--){
        System.out.print(" ");
      }
      for (int d2 = 1; d2 <= (2*j)-1 ; d2++){
        System.out.print(d2);
      }
      System.out.println();
    }
    sc.close();
  }
}
