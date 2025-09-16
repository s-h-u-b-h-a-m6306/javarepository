import java.util.*;
class Gretest{
    public void doFind() {
       Stack st=new Stack();
       st.push(10);
       st.push(20);
       st.push(3);
       st.push(43);
       st.push(50);
       System.out.println(st);
       int max=(int)st.get(0);
       for(int i=1;i<st.size();i++) {
           if((int)st.get(i)>max) {
               max=(int)st.get(i);
           }
           
       }
       System.out.println(max);
    }
}






public class GreatestElementStack
{
	public static void main(String[] args) {
		Gretest g=new Gretest();
		g.doFind();
	
    
	}
}