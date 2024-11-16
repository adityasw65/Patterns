import java.util.Scanner;

public class StarPattern9 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row (even number) : ");
      int row = sc.nextInt();
      for(int i = 0; i < row + 1; i++) {
         for(int j = 0; j < row + 1; j++) {
            if(j == i || j == row - i)
               System.out.print("*");
            else
               System.out.print(" ");
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
