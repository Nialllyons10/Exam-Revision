import java.util.*;
public class BracketsMethod
{
    public static boolean checkBrackets(String s)
    {
        if (s.isEmpty())
            return true;

        Stack <Character> stackOne = new Stack <Character> ();
        for (int i = 0; i < s.length(); i++)
        {
            char symbol = s.charAt(i);
            
            if (symbol == '{' || symbol == '(' || symbol == '[')
            {
                stackOne.push(symbol);
            }

            if (symbol == '}' || symbol == ')' || symbol == ']')
            {
                if (stackOne.isEmpty())
                    return false;

                char last = stackOne.peek();
                
                if (symbol == '}' && last == '{' || symbol == ')' && last == '(' || symbol == ']' && last == '[')
                {   
                    stackOne.pop();
                }
                else 
                    return false;
            }

        }

        return stackOne.isEmpty(); 
    }
}
