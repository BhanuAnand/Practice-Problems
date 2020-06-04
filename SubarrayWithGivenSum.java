public class SubarrayWithGivenSum {
    public static void main(String args[]) {
      
        int[] inp = {1,9,3,4,2};
        int curr_sum = 0, sum = 6, j = 0, l = 0, h = 0, size = inp.length;
        curr_sum = inp[0];
        for(int i=1; i<size; i++){
            if(curr_sum == sum){
                System.out.println("indices are " + l + " and " + h);
            }
            while(curr_sum > sum){
                curr_sum=curr_sum-inp[j];
                j++;l=h=j;
            }
            if(curr_sum < sum){
                curr_sum = curr_sum + inp[i];
                h++;
            }
        }
        if(curr_sum == sum){
            System.out.println("indices are " + l + " and " + h);
        }else{
            System.out.println("cannot find a subarray with the given sum");
        }
      
    }
}
