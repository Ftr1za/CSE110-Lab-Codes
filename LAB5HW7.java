import java.util.Scanner;

public class LAB5HW7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h_row = (n/2)+1;
    
    for (int j = h_row ; j > 1 ; j--){
      
      for (int sp = 1 ; sp <= h_row-j ; sp++){
        System.out.print(" ");
      }
      for (int d = 1; d <= (2*j)-1 ; d++){
        System.out.print(d);
      }
      System.out.println();
    }
    
    for (int i = 1; i <= h_row ; i++){
      
      for (int sp2= h_row-i ; sp2 >= 1 ; sp2--){
        System.out.print(" ");
      }
      for (int d2 = 1 ; d2 <= (2*i)-1 ; d2++){
        System.out.print(d2);
      }
      System.out.println();
    }
    sc.close();
  }
}
