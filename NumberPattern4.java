import java.util.*;
public class NumberPattern4 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number : ");
      int table = sc.nextInt();
      for(int i = 1; i <= 10; i++) {
         System.out.println(table + " * " + i + " = " + (table * i));
      }

   }
}
