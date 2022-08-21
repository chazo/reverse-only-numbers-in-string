public class Solution{
  
  public static void main(String[] args){
    String test = "a01asdfasdfasdf234b";
    
    char[] chars = test.toCharArray();
    int i = 0;
    int j = test.length()-1;
    
    while(i<j){
        System.out.printf("values are %s %s \n" , chars[i], chars[j]);
      boolean isINumber = isNumber(i,chars);
      boolean isJNumber = isNumber(j,chars);
      if(!isINumber){
        i++;
      }
      if(!isJNumber){
        j--;
      }
      if(isINumber && isJNumber){
      
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
        i++;
        j--;
        
      }
    
    }
    
    System.out.printf("output is %s\n",new String(chars));
    
  }
  
  public static boolean isNumber(int location, char[] chars){
  
    if(chars[location]>='0' && chars[location]<='9'){
      return true;
    }
    return false;
  }
  
  
}
