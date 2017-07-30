class BigWords 
{
	public static void main(String[] args) 
	{
		ArrayList<String> words = new ArrayList<>(); 					
		int total = 0; 
		
		while (!Console.endOfFile()) 
		{
			String s = Console.readToken(); 
			total = total+s.length();
			words.add(s);
		}
		
		if (words.size()!=0) 
		{
			int meanLength = total/words.size(); 
			
			for (String s: words) 
			{ // for-each loops apply to lists
				if (s.length()>meanLength) 
					System.out.println(s);
			}
		}
	}
}
