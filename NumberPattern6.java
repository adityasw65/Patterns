import java.util.*;
public class NumberPattern6 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row : ");
      int row = sc.nextInt();
      for(int i = 0; i <= row; i++) {
         int val = 0;
         for(int j = 0; j <= (row * 2); j++) {
            if(j <= i || j >= (row * 2) - i) {
               if(j <= row) {
                  val++;
                  System.out.print(val + "\t");
               }
               else {
                  if(i == row) {
                     val --;
                     System.out.print(val + "\t");
                  }
                  else {
                     System.out.print(val + "\t");
                     val--;
                  }
               }

            }
            else {
               System.out.print("\t");
            }
            System.out.print("\t");
         }
//         val++;
         System.out.println();
      }

   }
}
