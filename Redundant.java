import java.util.*;
class RedundantParenthesis
{
    public void doCheck()
    {
        String s="(a+((a+b)))";
        Stack st=new Stack();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);
          if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/')
          {
              st.push(ch);
              
          }
          else
          {
              if(ch==')')//we ignore operands
              {
                flag=0; 
                while((char)st.peek()!='(')
                {
                  char top=(char)st.peek();
                  if(top=='+'||top=='-'||top=='*'||top=='/')
                  {
                      flag=1;
                  }
                  st.pop();
                }st.pop();
              }
              
          }
        }//end of the loop
        System.out.println(st);
        if(flag==1)
        {
            System.out.println("NOT REDUNDANT");
        }
        else
        {
         System.out.println(" REDUNDANT");
        }
        
    }
}

public class Redundant
{
	public static void main(String[] args) {
		RedundantParenthesis p=new RedundantParenthesis();
		p.doCheck();
	}
}