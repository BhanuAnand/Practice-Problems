import java.util.*;

public class SpiralMatrix {
    public static void main(String args[]) {
      int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
      List<Integer> res = new ArrayList<>();
      
      int r1=0, r2=arr.length-1;
      int c1=0, c2=arr[0].length-1;
      
      while(r1<=r2 && c1<=c2){
        for(int c=c1; c<=c2; c++) res.add(arr[r1][c]);
        for(int r=r1+1; r<=r2; r++) res.add(arr[r][c2]);
        
        if(r1<r2 && c1<c2){
            for(int c=c2-1; c>c1; c--) res.add(arr[r2][c]);
            for(int r=r2; r>r1; r--) res.add(arr[r][c1]);
        }
        
        r1++;
        r2--;
        c1++;
        c2--;
      }
      
      // print resultant list
      for(int i=0; i<res.size(); i++){
          System.out.println(res.get(i));
      }
    }
}
