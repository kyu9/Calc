//ch6num2
public class Circle {
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+") 반지름"+radius;
	}
	
	public boolean equal(Object obj) {
		Circle c = (Circle)obj;
		if(x==c.x && y==c.y) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a: "+a);
		System.out.println("원 b: "+b);
		if(a.equal(b)) {
			System.out.println("같은 원");
		}
		else
			System.out.println("다른 원");
	}

}
