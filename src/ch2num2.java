import java.util.Scanner;
public class ch2num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10-99)>>");
		int val = scanner.nextInt();
		int firval = val/10;
		int secval = val-firval*10;
		if(firval==secval)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		

	}

}
