import java.util.Scanner;

public class L2HW5 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka)");
    int bill = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka)");
    int payment = sc.nextInt();
    
    if (bill == payment){
      System.out.println("The returned amount is 0 taka.");
    }
    else if (bill > payment) {
      int m_payment = bill - payment;
      System.out.println("Please pay " + m_payment + " taka more.");
    }
    else {
      int back_bill = payment - bill;
      System.out.println("The returned amount is " + back_bill + " taka.");
      
      int n100 = back_bill / 100;
      System.out.println("100 taka note: " + n100 );
      int rBB = back_bill % 100;
      
      int n50 = rBB / 50;
      System.out.println("50 taka note: " + n50 );
      rBB %= 50;
      
      int n20 = rBB / 20;
      System.out.println("20 taka note: " + n20 );
      rBB %=20;
      
      int n10 = rBB/10;
      System.out.println("10 taka note: " + n10 );
      rBB %=10;
      
      int c5 = rBB/5;
      System.out.println("5 taka coin: " + c5 );
      rBB %=5;
      
      int c2 = rBB/2;
      System.out.println("2 taka coin: " + c2 );
      rBB %= 2;
      
      int c1 = rBB/1;
      System.out.println("1 taka coin: " + c1 );
      rBB %= 1;
    }
    sc.close();
  }
}