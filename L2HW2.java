import java.util.Scanner;

public class L2HW2 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Age: ");
    int age = sc.nextInt();
    System.out.println("Electricity Consumed: ");
    int eUsage = sc.nextInt();
    
    double discount = 0;
    double extra = 0;
    double bill = eUsage * 15.0 ;
    
    if (age > 0 && age < 18) {
      discount = 20.0/100;
    }
    else if (age > 60) {
      discount = 10.0/100;
    }
    
    if (eUsage > 100){
      extra = 5.0/100;
    }
    
    double Tbill = bill - (bill * discount);
    double Fbill = Tbill + (Tbill * extra);
    System.out.println("Final Bill: " + Fbill + " Taka");
    sc.close();
  }
}
