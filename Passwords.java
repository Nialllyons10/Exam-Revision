import java.util.*;

class Passwords
{
	public static void main(String[] args) 
  {
		TreeMap<String, String> tm = new TreeMap<>();
		String url, pw;
		while(!Console.endOfFile())
    {
			url = Console.readToken();
			pw = Console.readToken();
			if(tm.containsKey(url))
      {
				if(pw.equals("?"))
        {
					System.out.println(tm.get(url));
				}
				else
					tm.put(url, pw);
			}
			else
				tm.put(url, pw);
		}
	}
}
