import java.util.*;

public class LongestSubstring{
    
    public static void main(String[] args){
    	String input = "";
    	String output = findLongestSubstring(input);
    	System.out.print(output.length());
    }
    
    public static String findLongestSubstring(String input) {
        HashSet<Character> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String result = ""; String temp = "";
        
        for(int i=0; i<input.length(); i++)
        {
        	if(set.contains(input.charAt(i))){
        		list.add(sb.toString());
        		set.clear();
        		sb = new StringBuilder();
        	}
        	char val = input.charAt(i);
        	set.add(val);
        	sb.append(String.valueOf(val));
        }
        
        if(list.size() == 0){
        	return input;
        
        }else{
            for(String str : list){
            	if(result.length()<str.length()){
            		temp = str;
                    result = str;
            	}
            }
        }
    
    	return result;
    }

}
