import java.util.Scanner;
public class ch2num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		
		if(num!=0 && num>=1 && num<=99) {
			int a,b;
			a=num/10;
			b=num%10;
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("박수 짝짝");
			}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println("박수 짝!");
			}
		}
		else
			System.out.println("숫자 범위를 벗어났습니다");
		scanner.close();
	}

}
