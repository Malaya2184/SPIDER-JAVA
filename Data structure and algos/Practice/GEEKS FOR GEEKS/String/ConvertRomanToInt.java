import java.util.HashMap;

class Method{
    private static final HashMap<Character,
                         Integer> hm = new HashMap<Character,
                                                      Integer>()
{{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};

public int findNumber(String str){

    int num = 0;
    int data;
    int i =0;
    while (i < str.length()) {
        if (i == str.length()-1) {
            // System.out.println("entered");
            data = hm.get(str.charAt(i));
            num = num+data;
            break;
        }
        else if (hm.get(str.charAt(i)) !=null && hm.get(str.charAt(i+1))<=hm.get(str.charAt(i))) {
            data = hm.get(str.charAt(i));
            num = num+data;
            // System.out.println(num);
            i++;

        }
        else if(hm.get(str.charAt(i)) !=null && hm.get(str.charAt(i+1))>hm.get(str.charAt(i))){
            data = hm.get(str.charAt(i+1))-hm.get(str.charAt(i));
            num = num+data;
            // System.out.println(num);
            i+=2;
        }
    }

    return num;
}
}


public class ConvertRomanToInt {
    public static void main(String[] args) {
        Method m = new Method();
        System.out.println(m.findNumber("XIV"));
    }
}
