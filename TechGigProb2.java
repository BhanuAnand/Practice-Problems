
/* Read input from STDIN. Print your output to STDOUT*/
 
import java.io.*;
import java.util.*;
public class TechGigProb2 {
  public static void main(String args[] ) throws Exception {
     Scanner sc = new Scanner(System.in);
      String testCases = sc.nextLine();
      int T = Integer.parseInt(testCases);
      
      for(int i=1; i<=T; i++){
         //System.out.print(T);
         int result = 0; int a=0,b=0;
         String teamSize = sc.nextLine();
         int N = Integer.parseInt(teamSize);
         String team1 = sc.nextLine();
         String team2 = sc.nextLine();
         String[] t1 = team1.split(" ");
         String[] t2 = team2.split(" ");
         
         long[] t1Arr = new long[N];
         long[] t2Arr = new long[N];
         HashSet<Integer> set = new HashSet<>();
         
         for(String s : t1){
            t1Arr[a] = Long.parseLong(s);
            a++;
         }
      
         for(String s : t2){
            t2Arr[b] = Long.parseLong(s);
            b++;
         }
   
         for(int j=0; j<N; j++){        
            long curr = t1Arr[j];
            long base = t2Arr[j];
            int idx = -1;
            for(int k=0; k<N; k++){
               long next = t1Arr[k];
               if((curr<base || (curr>base && next<curr)) && next>base && !set.contains(k)){
                  idx = k;
               }
            }
            if(idx!=-1){
               long temp = t1Arr[idx];
               t1Arr[idx] = t1Arr[j];
               t1Arr[j] = temp;
               set.add(j); 
            }
         }     
   
         for(int k=0;k<N;k++){       
            if(t1Arr[k]>t2Arr[k]){
               result++;
            }
         }
            
         System.out.println(result);
      }
    
  }
}
 

