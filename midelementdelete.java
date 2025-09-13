import java.util.*;
class MiddleElement {
    public void domidelementdelete()
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(56);
        st.push(57);
        st.push(58);
        st.push(59);
        st.push(60);
        st.push(61);
        st.push(62);
        System.out.println(st);
        int mid=st.size()/2;
        System.out.println(mid);
        int [] ar=new int[mid];
        int j=0;
        for(int i=1;i<=mid;i++)
        {
            int top=(int)st.peek();
            ar[j]=top;
            j++;
            st.pop();
        }
            st.pop();
            for(int i=j-1;i>=0;i--)
            {
                st.push(ar[i]);
            }
            System.out.println("after mid element delete"+st);


    }
 }
 public class midelementdelete
 {
    public static void main(String[] args) {
        MiddleElement p=new MiddleElement();
        p.domidelementdelete();
        
    }
 }
