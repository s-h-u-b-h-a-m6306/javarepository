import java.util.*;
class BottomElement
{
    public void doBottomElement()
    {
     Stack st=new Stack();
        st.push(56);
        st.push(57);
        st.push(58);
        st.push(59);
        st.push(60);
        st.push(61);
        st.push(62);
        System.out.println(st);
        int si=st.size();
        int j=0;
        int [] ar=new int[si];
        for(int i=1;i<=si;i++)
        {
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
        }//System.out.println("enter the element for push");
        st.push(10);
        for(int i=j-1;i>=0;i--)
        {
            st.push(ar[i]);
        }
        System.out.println("the new stack is     "+st);
    }
}
public class InsertBottomElement {
    public static void main(String[] args) {
        BottomElement e=new BottomElement();
        e.doBottomElement();
        
    }
    
}
