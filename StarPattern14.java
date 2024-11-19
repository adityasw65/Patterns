import java.util.*;
public class StarPattern14 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row (even number) : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         for(int j = 0; j <= row; j++) {
            if(i < (row / 2) && (j == 0 || j == row))
               System.out.print("*");
            else if(i >= (row / 2) && (j == 0 || j == row - i || j == i || j == row))
               System.out.print("*");
            else
               System.out.print(" ");
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
