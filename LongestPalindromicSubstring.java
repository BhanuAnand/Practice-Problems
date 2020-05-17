public class LongestPalindromicSubstring{ 

	public static void main(String[] args){

		String str = "uutatyy";
		System.out.print(getLongestPalindrome(str));

	}

	public static String getLongestPalindrome(String str){
		String result = ""; int len = 0; int size = str.length();
		int left = 0, right = 0;
		for(int i = 0; i<size-1; i++){
			int[] newData1 = new int[3];
			int[] newData2 = new int[3];
                newData1 = expandRange(str, i, i);
				newData2 = expandRange(str, i, i+1);
			
			if(newData1[2] > newData2[2] && newData1[2]>len) {
			    len = newData1[2];
                left = newData1[0];
                right = newData1[1];
			}else if(newData2[2] > newData1[2] && newData2[2]>len){
			    len = newData2[2];
                left = newData2[0];
                right = newData2[1];
			}
		}
		if(left==right && size!=1){
		    result = "";
		}else if(size>0){
		    result = str.substring(left,right+1);
		}
		return result;
	}

	public static int[] expandRange(String str, int l, int r){
	    int out[] = new int[3]; int len = 0;
		while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
		    len = r-l+1;
		    out[0] = l;
		    out[1] = r;
		    out[2] = len;
		    l--;
			r++;
		}
		return out;
	}

}
