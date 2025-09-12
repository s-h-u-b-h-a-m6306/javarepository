import java.util.*;
class ValidateString {
    public void dovalidateString()
    {
        String s="[{]()}]";
        Stack st=new Stack();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
            {
                st.push(ch);

            }
            else
            {
                char top=(char)st.peek();
                if(ch==')')
                {
                    if(top!='(')
                    {
                        flag=1;
                        break;
                    }
                }
                 if(ch=='}')
                {
                    if(top!='{')
                    {
                        flag=1;
                        break;
                    }
                }
                 if(ch==']')
                {
                    if(top!='[')
                    {
                        flag=1;
                        break;
                    }
                }

            }
            st.pop();
            if(flag==0 && st.isEmpty())
            {
                System.out.println("VALID EXPRESSION");
            }
            else
            {
            System.out.println("INVALID Expression");
            }
        }
    }
   
}
 public class ValidateString1
{
    public static void main(String[] args) {
        ValidateString d=new ValidateString();
        d.dovalidateString();
    }
}
