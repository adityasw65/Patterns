import java.util.*;
public class NumberPattern3 {

//   factorial number
   public static int fact(int a) {
      int val = 1;
      for(int i = 1; i <= a; i++) {
         val *= i;
      }
      return val;
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row : ");
      int row = sc.nextInt();
      int ans;
      for(int i = 0; i < row; i++) {
         for(int j = 0; j <= i; j++) {
            ans = (fact(i) / (fact(j) * fact(i - j)));
            System.out.print(ans + "\t");
         }
         System.out.println();
      }

   }
}
