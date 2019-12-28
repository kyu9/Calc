import java.util.Scanner;
public class ch3num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개?>>");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i])
					arr[i]=(int)(Math.random()*100+1);
			}
			System.out.print(arr[i]+" ");
		}
		

	}

}
