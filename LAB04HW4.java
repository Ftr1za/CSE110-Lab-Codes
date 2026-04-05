import java.util.Scanner;

public class LAB04HW4 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of Members: ");
    int memNum = sc.nextInt();
    
    for (int i=1 ; i<=memNum ;i++){
      double avgCal = 0;
      double totalCal = 0;
      int calTracker = 0;
      System.out.printf("Exercises for Member-%d:\n",i);
      int exNum = sc.nextInt();
      
      if (exNum > 3){
        exNum =3;
        System.out.printf("(Can’t do more than 3 exercise)\n\n");
      }
      
      for (int k=1 ; k <= exNum ; k++){
        System.out.printf("Exercise-%d:\n",k);
        double cal = sc.nextInt();
        
        if (cal > 350){
          cal = cal + (cal * (50.0/100));
        }
        totalCal+= cal;
        
        if (cal <200){
          calTracker++;
        }
      }
      avgCal = totalCal/exNum;
      
      if (avgCal > 400){
        avgCal *= exNum;
        avgCal +=150;
        avgCal = avgCal/exNum;
      }
      
      if (calTracker == exNum){
        avgCal = avgCal - (avgCal * (10.0/100));
      }
      System.out.printf("Average calories earned per day for Member-%d: %.3f\n",i,avgCal);
    }
  }
}