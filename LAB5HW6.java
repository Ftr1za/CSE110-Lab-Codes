import java.util.Scanner;

public class LAB5HW6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int j = n ; j >= 1 ; j--){
      
      for (int sp2 = n-j ; sp2 >= 1 ; sp2--){
        System.out.print(" ");
      }
      for (int d2 = 1; d2 <= (2*j)-j ; d2++){
        System.out.print(d2);
      }
      for (int di2 = (2*j)-(j+1) ; di2 >= 1 ; di2--){
        System.out.print(di2);
      }
      System.out.println();
    }
    sc.close();
  }
}
