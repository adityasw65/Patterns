import java.util.*;
public class PascalTriangle {

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
      int len = (row - 1) * 2;
      int ans;

      for(int i = 0; i < row; i++) {
         int val = 0;
         int flag = 0;
         for(int j = 0; j <= len; j++) {
            if(flag == 0 && j >= (len / 2) - i && j <= (len / 2) + i && val <= i) {
               ans = fact(i) / ((fact(val) * fact(i - val)));
               System.out.print(ans);
               flag = 1;
               val++;
            }
            else {
               System.out.print(" ");
               flag = 0;
            }
            System.out.print(" ");
         }
         System.out.println();
      }

   }
}
