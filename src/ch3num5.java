import java.util.Scanner;
public class ch3num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오 >>");
		int arr[]= new int[10];
		int thre[]= new int[10];
		int a=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%3==0) {
				thre[a]=arr[i];
				a++;
			}
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0;i<a;i++) {
			System.out.print(thre[i]+" ");
		}
		sc.close();
		
		
	}

}
