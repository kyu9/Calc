import java.util.Scanner;
public class ch2num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x,y)의 좌표를입력하시오 >>");
		int x,y;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		y = s.nextInt();
		if((x>=100 && x<=200) &&(y>=100 && y<=200)) {
			System.out.print("사각형 안에 있습니다.");

	}
	s.close();

}
	}
