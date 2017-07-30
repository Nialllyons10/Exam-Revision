interface Order<T>{
	boolean lte(Object obj);
}

class Triangle implements Order<Triangle>{
	private double a, b, c;

	Triangle(double a0, double b0, double c0){
		a = a0; b = b0; c = c0;
	}

	double area(){
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public boolean lte(Object obj){
		Triangle t = (Triangle) obj;
		return area() >= t.area();
	}
}

class OrderTest{
	public static void main(String[] args) {
		Triangle a = new Triangle(2.3, 4.3, 3.3);
		Triangle b = new Triangle(1.3, 2.1, 1.7);
		System.out.println(a.lte(b));
		System.out.println(b.lte(a));
	}
}
