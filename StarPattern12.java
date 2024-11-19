import java.util.*;
public class StarPattern12 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row (even number) : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         for(int j = 0; j <= row; j++) {
            if(i == 0)
               System.out.print("*");
            else if(i <= (row / 2) && j == i || j == row - i)
               System.out.print("*");
            else if(i > (row / 2) && j >= (row - i) && j <= i)
               System.out.print("*");
            else
               System.out.print(" ");
            System.out.print(" ");
         }
         System.out.println();
      }
   }
}
