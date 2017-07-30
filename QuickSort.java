public class QuickSort
{
   public static void print(int [] num)
   {
      for(int n : num)
         System.out.print(n + " ");
      System.out.println();
   }

   public static void swap(int [] a, int i, int j)
   {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
   }

   public static void quicksort(int [] num, int lo, int hi)
   {
      if(hi - lo > 1) // Outside loop for tail recursion elimunation
      {
         System.out.println("QS: lo = " + lo + ", hi = " + hi);

         // First Partition the array
         int x = num[lo];   // First element as pivot
         int less = lo;
         int xIndex = lo;
         int greater = hi;

         System.out.print(less + " " + xIndex + " " + greater + ":");
         print(num);

         while(xIndex < greater)
         {
            if(num[xIndex] == x)
               xIndex++;
            else if(num[xIndex] < x)
            {
               swap(num, xIndex, less);
               xIndex++;
               less++;
            }
            else
            {
               greater--;
               swap(num, xIndex, greater);
            }
            System.out.print(less + " " + xIndex + " " + greater + ":");
            print(num);
         }
         // All the x's are in the correct position; do left and right
         quicksort(num, lo, less); // lower half
         quicksort(num, xIndex, hi); // upper half
      }
   }

   public static void main(String [] args)
   {
      int [] num = {3, 7, 0, -1, 1, 0, -8, -6, -9};
      quicksort(num, 0, num.length);
      print(num);
   }
}
