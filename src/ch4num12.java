import java.util.Scanner;
class Concert{
	private String S[];
	private String A[];
	private String B[];
	private Scanner sc;
	
	Concert(){
		S = new String[10];
		A = new String[10];
		B = new String[10];
		
		for(int i=0;i<10;i++) {
			S[i]="---";
			A[i]="---";
			B[i]="---";
		}
	}
	
	public void preserve() {
		sc = new Scanner(System.in);
		System.out.print("좌석구분 S(1),A(2),B(3)>>");
		int seat = sc.nextInt();
		String name ="";
		int num=0;
		if(seat==1) {
			System.out.print("S>>");
			for(int i=0;i<S.length;i++) {
				System.out.print(S[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			name=sc.next();
			System.out.print("번호>>");
			num=sc.nextInt();
			S[num-1]=name;
		}
		else if(seat==2) {
			System.out.print("A>>");
			for(int i=0;i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			name=sc.next();
			System.out.print("번호>>");
			num=sc.nextInt();
			A[num-1]=name;
		}
		else if(seat==3) {
			System.out.print("B>>");
			for(int i=0;i<B.length;i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
			System.out.print("이름>>");
			name=sc.next();
			System.out.print("번호>>");
			num=sc.nextInt();
			B[num-1]=name;
		}
	}
	
	public void checkSeat() {
		System.out.print("S>> ");
		for(int i=0;i<S.length;i++) {
			System.out.print(S[i]+" ");
		}
		System.out.println();
		System.out.print("A>> ");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.print("B>> ");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
		System.out.println();
		System.out.println("<<<조회를 완료했습니다.>>>");
	}
	
	public void cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		int count = sc.nextInt();
		if(count==1) {
			System.out.print("S>> ");
			for(int i=0;i<S.length;i++) {
				System.out.print(S[i]+" ");
			}
			System.out.println();
			System.out.print("이름>> ");
			String name = sc.next();
			for(int i=0;i<S.length;i++) {
				if(S[i].equals(name))
					S[i]="---";
			}
		}
		else if(count==2) {
			System.out.print("A>> ");
			for(int i=0;i<A.length;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
			System.out.print("이름>> ");
			String name = sc.next();
			for(int i=0;i<A.length;i++) {
				if(A[i].equals(name))
					A[i]="---";
			}
		}
		else if(count==3) {
			System.out.print("B>> ");
			for(int i=0;i<B.length;i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
			System.out.print("이름>> ");
			String name = sc.next();
			for(int i=0;i<B.length;i++) {
				if(B[i].equals(name))
					B[i]="---";
			}
		}
	}
	
	public boolean exit() {
		return false;
	}
	
}
public class ch4num12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Concert con = new Concert();
		while(true) {
			System.out.print("예약:1, 조회:2. 취소:3, 끝내기:4 >> ");
			int num=0;
			num=sc.nextInt();
			switch(num){
			case 1:
				con.preserve();
				break;
			case 2:
				con.checkSeat();
				break;
			case 3:
				con.cancel();
				break;
			case 4:
				sc.close();
				return;
			}
		}

	}

}
 