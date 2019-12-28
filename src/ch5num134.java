interface Shape{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	public double getArea() {
		return radius*radius*PI;
	}
}

class Oval implements Shape{
	private int Lradius;
	private int Sradius;
	public Oval(int Lradius, int Sradius) {
		this.Lradius=Lradius;
		this.Sradius=Sradius;
	}
	public void draw() {
		System.out.println(Sradius+"x"+Lradius+"에 내접하는 타원입니다.");
	}
	public double getArea() {
		return Lradius*Sradius*PI;
	}
}

class Rect implements Shape{
	private int width;
	private int height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	public double getArea() {
		return width*height;
	}
}

public class ch5num134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Shape dount = new Circle(10);
		dount.redraw();
		System.out.println("면적은 "+dount.getArea());
		*/
		Shape[] list = new Shape[3];
		list[0]=new Circle(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect(10,40);
		for(int i=0;i<list.length;i++)
			list[i].redraw();
		for(int i=0;i<list.length;i++)
			System.out.println("면적은 "+list[i].getArea());
	}

}
