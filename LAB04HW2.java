import java.util.Scanner;

public class LAB04HW2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students to check: ");
    int s_num = sc.nextInt();
    
    for (int i=1 ; i<=s_num; i++){
      System.out.println("Enter student ID: ");
      int s_id = sc.nextInt();
      int tracker =0;
      
      for (int j = 0; j<=s_id ;j++){
        int ref = (int) Math.pow(2,j);
        if (s_id == ref){
          tracker++;
        }
      }
      if (tracker > 0){System.out.println("Lucky ID");}
      else {System.out.println("Not Lucky");};
    }
    sc.close();
  }
}