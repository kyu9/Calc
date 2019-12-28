import java.util.*;


public class ch7num1 {

	public static void printBig(Vector<Integer> v) {
		int big = v.get(0);
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i))
				big=v.get(i);
		}
		
		System.out.println("가장 큰 수는 "+big);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될떄까지)");
		while(true) {
			int n = sc.nextInt();
			if(n==-1)
				break;
			v.add(n);
			
		
		}	printBig(v);
	}

}
