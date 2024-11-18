import java.util.*;
public class StarPattern10 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter your row (even number) : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         for(int j = 0; j <= row; j++) {
            if(i <= (row / 2) && j == (row / 2) - i || j == (row / 2) + i)
               System.out.print("*");
            else if(i > (row / 2) && j == (i - (row / 2)) || j == (row - i) + (row / 2))
               System.out.print("*");
            else
               System.out.print(" ");
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
