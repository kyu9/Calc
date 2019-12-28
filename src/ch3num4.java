import java.util.Scanner;
public class ch3num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		String s = sc.next();
		char c = s.charAt(0);//s의 첫번째 문자를 c에 입력
		
		for(int i=0;i<c-'a';i++) {
			for(char j='a';j<c-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
