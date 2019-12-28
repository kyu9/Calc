import java.util.Scanner;

class People{
	private String name;
	private int a, b, c;

	public People(String name) {
		this.name=name;
	}
	public boolean game() {
		a = (int)((Math.random()*3)+1);
		b = (int)((Math.random()*3)+1);
		c = (int)((Math.random()*3)+1);
	
		System.out.print("\t"+a+" "+" "+b+" "+c);
		if(a==b && b==c)
			return true;
		else
			return false;
		
	}
	
}
public class ch6num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>> ");
		String tmp=sc.next();
		People person1 = new People(tmp);
		System.out.print("2번쨰 선수 이름>> ");
		String tmp2 = sc.next();
		People person2 = new People(tmp2);
		String buffer = sc.nextLine();
		while(true) {
			System.out.println("["+tmp+"]:");
			buffer = sc.nextLine();
			if(person1.game()==true) {
				System.out.print("\t"+tmp+"님이 이겼습니다!");
				break;
			}
			System.out.println("\t 아쉽군요!");
			
			System.out.println("["+tmp2+"]:");
			buffer = sc.nextLine();
			if(person2.game()==true) {
				System.out.print("\t"+tmp2+"님이 이겼습니다!");
				break;
			}
			System.out.println("\t 아쉽군요!");
		}
		sc.close();
	}

}
