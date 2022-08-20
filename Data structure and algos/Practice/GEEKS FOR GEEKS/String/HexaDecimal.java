import java.util.HashMap;

public class HexaDecimal {
// you cant reverse the hex characters this is the test case
    public static void main(String[] args) {
        String str = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        String ans = "";
        Character current=str.charAt(0);
        
        HashMap<Character,Integer> hm = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            System.out.println(hm);
            
            if(hm.get(ch)==null && ch!=current){
                StringBuilder s1 = new StringBuilder(Integer.toHexString(hm.get(current)));
        s1.reverse();
        ans=ans+current+s1.toString();
                // ans=ans+current+Integer.toHexString(hm.get(current));
                hm.clear();
                hm.put(ch, 1);
                current = ch;
            }
            else if (hm.get(ch)==null && ch == current ) {
                hm.put(ch,1);
            }
            else {
                hm.put(ch,hm.get(ch)+1);
            }
        }
        StringBuilder s1 = new StringBuilder(Integer.toHexString(hm.get(current)));
        s1.reverse();
        ans=ans+current+s1.toString();
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        System.out.println(sb);

    }
}
