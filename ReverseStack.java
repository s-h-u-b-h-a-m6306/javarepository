import java.util.*;
class ReverseStack1{
    public void doReverse() {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        int [] ar=new int[st.size()];
        int j=0;
        while(!st.isEmpty()){
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
        }
        for(int i=0;i<j;i++) {
            st.push(ar[i]);
        }
        System.out.println(st);
    }
}

public class ReverseStack
{
	public static void main(String[] args) {
	    ReverseStack1 p=new ReverseStack1();
	    p.doReverse();
		
	}
}
