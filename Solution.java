public class Solution{
  
  public static void main(String[] args){
    String test = "a1234b";
    
    char[] chars = test.toCharArray();
    int i = 0;
    int j = test.length-1;
    
    while(i>j){
      boolean isINumber = isNumber(i,chars);
      boolean isJNumber = isNumber(j,chars);
      if(!isINumber){
        i++;
      }
      if(!isJNumber){
        j++;
      }
      if(isINumber && isJNumber){
      
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
        
      }
    
    }
    
    
    
  }
  
  public static boolean isNumber(int location, char[] chars){
  
    if(chars[location]>='1' && chars[location]<='9'){
      return true;
    }
  }
  
  
}
