import java.util.Scanner;
public class ch3num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int [10];
		int num=0;
		
		
		System.out.print("랜덤한 정수들 :");
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
			num=num+arr[i];
		}
		System.out.println();
		System.out.print("평균은 "+(double)num/10);
		
		

	}

}
