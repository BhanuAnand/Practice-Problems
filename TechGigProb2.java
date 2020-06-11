/* Read input from STDIN. Print your output to STDOUT*/

 
import java.io.*;
import java.util.*;
public class CandidateCode {
  public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String testCases = sc.nextLine();
      int T = Integer.parseInt(testCases);
      
      for(int i=1; i<=T; i++){

         int result=0,a=0,b=0;
         String teamSize = sc.nextLine();
         int N = Integer.parseInt(teamSize);
         String team1 = sc.nextLine();
         String team2 = sc.nextLine();
         String[] t1 = team1.split(" ");
         String[] t2 = team2.split(" ");
         
         long[] t1Arr = new long[N];
         long[] t2Arr = new long[N];
         
         for(String s : t1){
            t1Arr[a] = Long.parseLong(s);
            a++;
         }
      
         for(String s : t2){
            t2Arr[b] = Long.parseLong(s);
            b++;
         }
   
         boolean[] isVisited = new boolean[N];
         for(int j=0; j<N; j++){
            int idx = bestMatchIndex(t2Arr[j], t1Arr, isVisited);
            
            if(idx != -1){
                long temp = t1Arr[idx];
                t1Arr[idx] = t1Arr[j];
                t1Arr[j] = temp;
            }
         }

         for(int k=0; k<N; k++){
            if(t1Arr[k]>t2Arr[k]){
               result++;
            }
         }        
         System.out.println(result);             
      }   
  }

  static int bestMatchIndex(long base, long[] arr, boolean[] isVisited){
         long minVal = Long.MAX_VALUE; int minIdx = -1;
         for(int k=0; k<arr.length; k++){
            if(arr[k]>base && arr[k]<minVal && !isVisited[k]){
               minVal = arr[k];
               minIdx = k;
            }
         }
         if(minVal != Long.MAX_VALUE){
            isVisited[minIdx] = true;
         }
         return minIdx;
    }

}
 

