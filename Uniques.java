class Uniques 
{ 
	public static void main(String[] args) 
	{
		HashSet<String> ws = new HashSet<>(); 
		
		while (!Console.endOfFile()) 
		{
			String w = Console.readToken();
			ws.add(w);
		}
		
		System.out.println("There were " + ws.size() + " unique words, as follows:");
		
		for (String s: ws) 
				System.out.println(s);
	}
}

// In the program HashSet may be replaced with TreeSet, in which case the words will appear in ascending order


//A method to find the smallest positive missing from a set of integers, 
//whether the set  is a HashSet or a TreeSet (note parameter type below).

static int absent(Set<Integer> s) 
{
		
	int i = 1;
	
	while (s.contains(i)) 
		i++;
	
	return i;
}
