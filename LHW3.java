public class LHW3{
  public static void main(String [] args){
   int s_id = 1000054943;
   int last2 = s_id % 100;
   int lastD1 = last2 % 10;
   int lastD2 = last2 / 10;
   System.out.println(lastD1);
   System.out.println(lastD2);
  }
}