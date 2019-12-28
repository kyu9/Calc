import java.util.Scanner;
public class ch3num14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		
		String input = "";
		int i=0;
		while(true) {
			System.out.print("과목이름>>");
			input=sc.next();
			if(input.equals("그만"))
				break;
			for(i=0;i<course.length;i++) {
				if(course[i].equals(input))
					System.out.println(course[i]+"의 수는"+score[i]);
				break;
			}
			if(i==course.length) {
				System.out.println("없는 과목입니다");
				break;
		
			}

	}
		sc.close();

	}
}