import java.util.StringTokenizer;
import java.util.Scanner;

public class ch6num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String tmp = sc.nextLine();
			if(tmp.equals("그만")) {
				System.out.println("종료합니다....");
				break;
			}
			else {
				StringTokenizer st = new StringTokenizer(tmp," ");
				int num = st.countTokens();
				System.out.println("어절의 수는 "+num);
			}
			
			
		}
		sc.close();
	}

}
