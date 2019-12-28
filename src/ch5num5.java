class Point{
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x=x; this.y=y;}
}
/*
 * num5
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {super(x,y); this.color=color;}
	protected void setXY(int x, int y) {move(x,y);}
	protected void setColor(String color) {this.color=color;}
	public String toString() {
		String tmp = color+"색의 ("+getX()+","+getY()+")의 점";
		return tmp;
	}
}
*/

class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0,0);
		this.color="BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x,y);
	}
	protected void setXY(int x, int y) {move(x,y);}
	protected void setColor(String color) {this.color=color;}
	public String toString() {
		String tmp=color+"색의 ("+getX()+","+getY()+") 점";
		return tmp;
	}
}

public class ch5num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다.");
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
		
        /*
         * num5
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
		*/
		
	}

}
