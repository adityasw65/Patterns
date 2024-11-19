import java.util.*;
public class StarPattern13 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row (even number) : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         for(int j = 0; j <= row; j++) {
            if(i == 0 && (j <= (row / 2) || j == row)) {
               System.out.print("*");
            }
            else if((i > 0 && i < (row / 2)) && (j == (row / 2) || j == row)) {
               System.out.print("*");
            }
            else if(i == (row / 2))
               System.out.print("*");
            else if((i >= (row / 2) + 1 && i < row) && (j == 0 || j == (row / 2)))
               System.out.print("*");
            else if(i == row && (j == 0 || j >= (row / 2)))
               System.out.print("*");
            else
               System.out.print(" ");
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
