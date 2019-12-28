import java.util.Scanner;
import java.util.Vector;

public class ch7num10 {


abstract static class Shape{
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

static class Line extends Shape{

	public void draw() {
		System.out.println("Line");
	}
}

static class Rect extends Shape{

	public void draw() {
		System.out.println("Rect");
	}
}

static class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Shape> v = new Vector<Shape>();
		Shape shape = null;
		System.out.println("그래픽 에디터 beauty를 시작합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4) >>");
			int num = sc.nextInt();
			switch(num) {
			case 1:{
				System.out.print("Line(1), Rect(2), Circle(3)");
				num = sc.nextInt();
				switch(num) {
				case 1:
					shape = new Line();
					break;
				case 2:
					shape = new Rect();
					break;
				case 3:
					shape = new Circle();
					break;
				default:
					System.out.println("다시 입력해 주세요");
					return;
						
				}
				v.add(shape);
				break;
			}
			case 2:{
				System.out.print("삭제할 도형의 위치>>");
				num = sc.nextInt();
				v.remove(num-1);
				break;
			}
			case 3:{
				for(int i=0;i<v.size();i++) {
					v.get(i).draw();
				}break;
			}
			case 4:{
				System.out.println("beauty를 종료합니다.");
				sc.close();
				return;
			}
			}
		}
		
	}

}
