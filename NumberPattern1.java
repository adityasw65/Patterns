import java.util.*;
public class NumberPattern1 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter your rows : ");
      int row = sc.nextInt();
      int val = 1;
      for(int i = 0; i < row; i++) {
         for(int j = 0; j <= i; j++) {
            System.out.print(val + " ");
            val++;
         }
         System.out.println();
      }

   }
}
