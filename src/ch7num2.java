import java.util.*;

public class ch7num2 {

	public static void main(String[] args) {
		ArrayList<Character> stack = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for(int i=0;i<6;i++) {
			char tmp = sc.next().charAt(0);
			stack.add(tmp);
		}
		double sum=0;
		for(int i=0;i<stack.size();i++) {
			char c = stack.get(i);
			switch(c) {
			case 'A':
				sum+=4.0;
				break;
			case 'B':
				sum+=3.0;
				break;
			case 'C':
				sum+=2.0;
				break;
			case 'D':
				sum+=1.0;
				break;
			case 'E':
				sum+=0.0;
				break;
			}
		}
		
		System.out.println(sum/stack.size());

		sc.close();
	}

}
