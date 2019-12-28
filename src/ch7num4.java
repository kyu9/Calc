import java.util.Scanner;
import java.util.Vector;

public class ch7num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int count=0;
		
		while(true) {
			int sum=0;
			System.out.print("강수량 입력 (0 입력시 종료) >>");
			int value = sc.nextInt();
			if(value==0) {
				break;
			}
			v.add(value);
			for(int i=0;i<v.size();i++) {
				System.out.print(v.get(i)+" ");
			}System.out.println("");
			
			for(int i=0;i<v.size();i++) {
				sum = sum+v.get(i);
			}
			System.out.println("현재 평균 "+sum/v.size());
			
			
		}
		sc.close();

	}

}
