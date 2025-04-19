import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String start;
        String end;
        if(s.length()%2 == 0){
            start = s.substring(0,s.length()/2);
            end = s.substring(s.length()/2,s.length());
        }else{
            start = s.substring(0,s.length()/2);
            end = s.substring((s.length()/2)+1,s.length());
        }
        
        char[] c1 = start.toCharArray();
        char[] c2 = end.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        StringBuilder res = new StringBuilder();
        if(s.length()%2 == 0){
            res.append(new String(c1));
            StringBuilder st = new StringBuilder(new String(c2));
            st.reverse();
            res.append(st.toString());
        }else{
            res.append(new String(c1));
            res.append(s.charAt(s.length()/2));
            StringBuilder st = new StringBuilder(new String(c2));
            st.reverse();
            res.append(st.toString());
        }
        System.out.println(res.toString());
    }
}