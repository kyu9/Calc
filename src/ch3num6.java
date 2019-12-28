import java.util.Scanner;
public class ch3num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >>");
		int price = sc.nextInt();
		int tip=0;
		
		int[]Unit = {50000,10000,1000,500,100,50,10,1};
		
		for(int i=0;i<Unit.length;i++) {
			System.out.println(Unit[i]+"원 짜리 "+price/Unit[i]+"개 ");
			price = price-Unit[i]*(price/Unit[i]);
		}
		
		sc.close();

	}

}
