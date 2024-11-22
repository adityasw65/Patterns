import java.util.*;
public class NumberPattern5 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter row (even number) : ");
      int row = sc.nextInt();
      int a = 2;

      for(int i = 0; i <= row; i++) {
         int val = 0;
         if(i <= (row / 2)) {
            val = val + i;
         }
         else {
            val = i - a;
            a += 2;
         }

         for(int j = 0; j <= row; j++) {
            if(i <= (row / 2) && j >= (row / 2) - i && j <= (row / 2) + i) {
               if(j <= (row / 2))
                  val++;
               else
                  val--;
               System.out.print(val+"\t");
            }
            else if(i > (row / 2) && j >= (i - (row / 2)) && j <= (row - i) + (row / 2)) {
               if(j <= (row / 2))
                  val++;
               else
                  val--;
               System.out.print(val + "\t");
            }
            else {
               System.out.print("\t");
            }
         }
//         System.out.println();
         System.out.println();
      }

   }
}


//output : -

//n = no. of rows = 4
//         1
//      2  3  2
//   3  4  5  4  3
//      2  3  2
//         1

