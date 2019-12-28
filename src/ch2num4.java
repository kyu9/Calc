import java.util.Scanner;
public class ch2num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int val = 0;
		if(a>b) {
			if(b>c)
				val=b;
			else if(c>b)
				val=c;
		}
		else if(a<b){
			if(a>c)
				val=a;
			else if(c>a)
				val=c;
		}
		System.out.println("중간 값은 "+val);
	}

}
