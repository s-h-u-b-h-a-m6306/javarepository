import java.util.*;
class Copy {
    public void doCopy() {
        Stack st=new Stack();
        Stack st1=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        for( int i=0;i<st.size();i++) {
            int element=(int)st.get(i);
            st1.push(element);
        }
        System.out.println("after copy"+st1);
    
    }
}

public class CopyStack1
{
	public static void main(String[] args) {
		Copy c=new Copy();
		c.doCopy();
	
    
	}
}