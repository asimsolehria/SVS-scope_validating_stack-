
package svs;

/**
 *
 * @author asim
 */
public class SVS {
    int size;
    int top=-1;
    char arr[];

    public SVS(int s) {
        size=s;
        arr=new char[size];
    }
    
    
    private void push(char paranthesis)
    {
        arr[++top]=paranthesis;
    }
    
    private char pop()
    {
        return arr[top--];
    }
    
    private boolean isFull()
    {
        return top==arr.length-1;
    }
    
    private boolean isEmpty()
    {
        return top==-1;
    }
    
    private int peek()
    {
        return arr[top];
    }
    
    
    
    public boolean areParenthisisBalanced(String str)
    {
        for (int i = 0; i < str.length(); i++) 
        {
            char c=str.charAt(i);
            
            if(c=='(' || c=='{' || c=='[')
                this.push(c);
            
            if (this.isEmpty())
                return false;
            char check;
            switch (c)
            {
                case ')':
                    check=this.pop();
                    if(check=='{' || check=='[')
                        return false;
                    break;
                case '}':
                    check=this.pop();
                    if(check=='(' || check=='[')
                        return false;
                    break;
                case ']':
                    check=this.pop();
                    if(check=='(' || check=='{')
                        return false;
                    break;
            }
                    
            
        }
        return this.isEmpty();
        
        }
    }
    

