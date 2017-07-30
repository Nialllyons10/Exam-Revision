class Bag<T> {// generic class with T standing for a class

    private T[] bag = (T[])(new Object[100]);                 
    private int numElements = 0; // junk in bag[numElements..] 
    
    void add(T x) 
	{ // put x in bag
			bag[numElements] = x; 
			numElements++;
    }
    
    int freq(T x) 
	{ // how many x’s in bag?
			int count = 0;
			for (int i=0; i<numElements; i++)
				if (bag[i].equals(x)) // .equals because T a class 
					count++;
			return count;
    }
}

class GenericExample 
{
	public static void main(String[] args) 
	{		
		Bag<String> b = new Bag<String>();
		b.add("cat"); b.add("dog"); b.add("cat"); 
		System.out.println(b.freq("cat")); // see output 2
	}
}
