
import java.util.*;
class InsertElement {
    public void doInsert() {
        int i;
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        System.out.println(st);
        int [] ar=new int[4];
        for(i=1;i<4;i++){
            int top=(int)st.peek();
            ar[i]=top;
            st.pop();
        }
        st.push(100);
        for(int j=ar.length-1;j>=0;j--){
        st.push(ar[j]);
        }
        System.out.println(st);

    }
}





public class PushElementFourthPosition {
    public static void main(String[] args) {
        InsertElement p=new InsertElement();
        p.doInsert();
    }
}
