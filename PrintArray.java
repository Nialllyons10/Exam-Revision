import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayListProg
{
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Please enter some numbers, and finish with 0!!!");
		int in = reader.nextInt();
		
		while(in != 0)
		{
			array.add(in);
			in = reader.nextInt();
		}
		
		PrintArray();
		
		System.out.println("What number would you like to delete?");
		int del = reader.nextInt();
		for(int i = 0; i < array.size(); i++)
		{
			if(array.get(i) == del)
			{
				array.remove(i);
				break;
			}
		}
		
		PrintArray();
	}
	
	
	public static void PrintArray()
	{
		System.out.println("------------------------------------");
		System.out.println();
			
		for(int i : array)
		{	
			System.out.println(i);
		}
	}
}

