/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.nextLine());

      String l1 = sc.nextLine();
      String[] arr1 = l1.split(" ");
      long[] minQuant = new long[arr1.length];
      int i = 0;
      for(String s : arr1){
         minQuant[i] = Long.parseLong(s);
         i++;
      }
     
      String l2 = sc.nextLine();
      String[] arr2 = l2.split(" ");
      long[] maxQuant = new long[arr2.length];
      int j = 0;
      for(String s : arr2){
         maxQuant[j] = Long.parseLong(s);
         j++;
      }

      long minResult = Long.MAX_VALUE;
      for(int k = 0; k < maxQuant.length; k++){
         long temp = maxQuant[k]/minQuant[k];
         if(temp<minResult){
            minResult = temp;
         }
      }
      System.out.println(minResult);
   }
}
