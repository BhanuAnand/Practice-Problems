import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      
      String input = "{[(])}";
      ArrayList<Character> inputList = new ArrayList<>();
      ArrayList<Character> listToCompare = new ArrayList<>();
      for(int i = 0; i < input.length(); i++){
          if(input.charAt(i)!='{' && input.charAt(i)!='[' && input.charAt(i)!='('){
              inputList.add(input.charAt(i));
          }
          if(input.charAt(i)=='{'){
              listToCompare.add('}');
          } else if(input.charAt(i)=='['){
              listToCompare.add(']');
          } else if(input.charAt(i)=='('){
              listToCompare.add(')');
          }
      }
      
      
      if(inputList.size() == listToCompare.size()){
          
          int i = listToCompare.size()-1;
          for(int j = 0; j<inputList.size(); j++){
              if(inputList.get(j) == listToCompare.get(i)){
                i--;
              } else{
                  System.out.println("No");
                  break;
              }
          }
           
          if(i == -1){
             System.out.println("Yes"); 
          }
      } else{
           System.out.println("No");
      }

     
    }
}
