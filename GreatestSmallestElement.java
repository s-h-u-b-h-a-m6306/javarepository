import java.util.*;
class FindGreatest {
    public void doFind() {
        String s="Ghaziabad";
        Stack st=new Stack();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            st.push(c);
            
        }
        char max=(char)st.get(0);
        char min =(char)st.get(0);
        for(int i=0;i<st.size();i++)
        {
            if((char)st.get(i)>max) {
                max=(char)st.get(i);
            }
            
             if((char)st.get(i)<min) {
                max=(char)st.get(i);
            }
           
        }
        System.out.println(max);
         System.out.println(min);
         System.out.println(max-min);
        
    }
}

public class GreatestSmallestElement
{
	public static void main(String[] args) {
	FindGreatest v =new FindGreatest();
	v.doFind();
	}
}