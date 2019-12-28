
public class ch3num13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		while(count<100) {
			int a = count/10;
			int b = count%10;
			if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
				System.out.println(count+"박수 짝짝");
			}
			else if((a==3||a==6||a==9)&&(b!=3||b!=6||b!=9)) {
				System.out.println(count+"박수 짝");
			}
			else if((a!=3||a!=6||a!=9)&&(b==3||b==6||b==9)) {
				System.out.println(count+"박수 짝");
			}
			count++;
		
		}

	}

}
