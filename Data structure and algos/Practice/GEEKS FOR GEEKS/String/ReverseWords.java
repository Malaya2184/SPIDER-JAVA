class Method{
  public String reverseWordInString(String str){
    String [] arr = str.split(" ");
    String newstr= "";
    for (String s : arr) {
        newstr = " "+s+newstr;
    }
    return newstr;
  }

  public String reverseString(String str){

    char[] arr = str.toCharArray();
    String newStr = "";
    for (int i = arr.length-1; i >-1; i--) {
        newStr = newStr + arr[i];
    }
    return newStr;
  }
}


public class ReverseWords {

    public static void main(String[] args) {
        Method m = new Method();
        System.out.println(m.reverseWordInString("Malaya kumar swain"));
        System.out.println(m.reverseString("Malaya kumar swain"));
        
    }
}