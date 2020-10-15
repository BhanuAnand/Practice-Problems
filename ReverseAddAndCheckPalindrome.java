public class ReverseAddAndCheckPalindrome {
    public static void main(String args[]) {
      int x = 196;
      int r = x;
      while(!isPal(r)){
        r = revAndSum(r);
        if (r > 2147483647){ 
            System.out.println("No palindrome exist"); 
            break;
        }
      }
      
      System.out.println("Output " + r);
    }
    
    public static int revAndSum(int x){
        int rev = -1;
        int n = x;
        while(n>0){
            int rem = n%10;
            if(rev<0){
                rev = rem;
            }else{
                rev = rev * 10 + rem;
            }
            n=n/10;
        }
        int sum = x+rev;
        return sum;
    }
    
    public static boolean isPal(int a){
        String str1 = String.valueOf(a);
        char[] chArr1 = str1.toCharArray();
        int j = chArr1.length-1;
        for(int i=0;i<j;i++){
            if(chArr1[i]!=chArr1[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
