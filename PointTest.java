class Point 
{
	private double x, y;
	
	Point(double x0, double y0)
	{
		x = x0;
		y = y0;
	}
	
	Point() {};
	
	void get()
	{
		x = Console.readDouble();
		y = Console.readDouble();
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	double distance(Point r)
	{
		//Distance from r
		double xdist = x-r.x;
		double ydist = y-r.y;
		return(Math.sqrt(xdist * xdist + ydist * ydist));
	}
}

class PointTest
{
	public static void main(String [] args)
	{
		Point p1 = new Point();
		Point p2 = new Point();
		
		System.out.println("Enter two points: ");
		
		p1.get();
		p2.get();
		
		System.out.println("Distance between is " + p1.distance(p2));
		
	}
}
