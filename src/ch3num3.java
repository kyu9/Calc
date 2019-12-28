import java.util.Scanner;
public class ch3num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >>");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int t=0;t<num-i;t++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
