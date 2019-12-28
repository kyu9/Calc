import java.util.Scanner;
public class ch2num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달을 입력하세여(1-12)>>");
		int num = sc.nextInt();
		/*
		if(num>=3 && num<=5)
			System.out.print("봄");
		else if(num>=6 && num<=8)
			System.out.print("여름");
		else if(num>=9 && num<=11)
			System.out.print("가을");
		else if(num==12)
			System.out.print("겨울");
		else if(num==1)
			System.out.print("겨울");
		else if(num==2)
			System.out.print("겨울");
		else
			System.out.print("잘못입력");
			*/
		switch(num){
			case 1:
			case 12:
			case 2:	
				System.out.print("겨울");
			    break;
			case 3:
			case 4:
			case 5:	
				System.out.print("");
				break;
			case 6:
			case 7:
			case 8:	
				System.out.print("여");
				break;
			case 9:
			case 10:
			case 11:	
				System.out.print("가을");
		}
		sc.close();
	}
	

}
