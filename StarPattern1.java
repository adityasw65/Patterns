import java.util.Scanner;
public class StarPattern1 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter your rows : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         for(int j = 0; j <= row; j++) {
            if(j <= i) {
               System.out.print("*");
            }
            else {
               System.out.print(" ");
            }
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
