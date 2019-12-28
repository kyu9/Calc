import java.util.Scanner;

class Person{
	private int num1, num2, num3;
	public String name;
	public Person(String name) {
		this.name=name;
	}
	public boolean game() {
		num1 = (int)((Math.random()*3)+1);
		num2 = (int)((Math.random()*3)+1);
		num3 = (int)((Math.random()*3)+1);
		System.out.print("\t"+num1+" "+num2+" "+num3+" ");
		if(num1==num2 && num2==num3) 
			return true;
		else
			return false;
	}
}
public class ch6num12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		int num = sc.nextInt();
		Person [] persons = new Person[num];
		for(int i=0;i<num;i++) {
			System.out.print((i+1)+"번째 선수 이름>>");
			String name = sc.next();
			persons[i] = new Person(name);
		}
		String buffer = sc.nextLine();
		while(true) {
			for(int i=0;i<num;i++) {
				System.out.print("["+persons[i].name+"]:<Enter>");
				buffer = sc.nextLine();
				if(persons[i].game()) {
					System.out.println(persons[i].name+"님이 이겼습니다!");
					sc.close();
					return;
				}
				System.out.println("아쉽군요!");
			}
		}
	}

}
