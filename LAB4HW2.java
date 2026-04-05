// Your task is to help the university identify which students have Lucky IDs.
// You will first take an user input of the number of test cases (N) representing how many students’ IDs need to be checked. 
// For each student, take input of their ID number and determine whether it is a power of two. Display "Lucky ID" if the student’s ID is a power of two, otherwise display "Not Lucky".


import java.util.Scanner;

public class LAB4HW2 {
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
