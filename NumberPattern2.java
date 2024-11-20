import java.util.*;
public class NumberPattern2 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your rows : ");
      int row = sc.nextInt();
      int a = 0, b = 1;
      for(int i = 0; i < row; i++) {
         for(int j = 0; j <= i; j++) {
            System.out.print(a + "\t");
            int c = a + b;
            a = b;
            b = c;
         }
         System.out.println();
      }

   }
}
