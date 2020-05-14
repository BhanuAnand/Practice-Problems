
/* Read input from STDIN. Print your output to STDOUT*/
 
import java.io.*;
import java.util.*;
public class CandidateCode {
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
       
        for(String s : t1){
           t1Arr[a] = Long.parseLong(s);
           a++;
        }
    
        for(String s : t2){
           t2Arr[b] = Long.parseLong(s);
           b++;
        }
 
        for(int j=0; j<N-1; j++){
           int cnt = j+1;
           long curr = t1Arr[j];
           long base = t2Arr[j];
           while(cnt<N){
              long next = t1Arr[cnt];
              if((curr<base && next>=base) || (curr>base && next>base && next<=curr)){
                 long temp = t1Arr[cnt];
                 t1Arr[cnt] = t1Arr[j];
                 t1Arr[j] = temp;
              }
              cnt++;
           }
        }     
 
        for(int k=0;k<N;k++){
           //System.out.print(t1Arr[k]);
           if(t1Arr[k]>t2Arr[k]){
              result++;
           }
        }
       
        System.out.println(result);
     }
    
  }
}
 

