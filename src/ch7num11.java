import java.util.Scanner;
import java.util.Vector;

class Nation{
	private String country, capital;
	public Nation(String country, String capital) {
		this.country=country;
		this.capital=capital;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
	
}

public class ch7num11 {
	private Vector<Nation> v = new Vector<Nation>();
	private Scanner sc = new Scanner(System.in);
	
	public ch7num11() {
		v.add(new Nation("맥시코", "맥시코시티"));
		v.add(new Nation("스페인", "리스본"));
		v.add(new Nation("프랑스", "파리"));
		v.add(new Nation("영국", "런던"));
		v.add(new Nation("그리스", "아테네"));
		v.add(new Nation("독일", "베를린"));
		v.add(new Nation("일본", "도쿄"));
		v.add(new Nation("중국", "베이징"));
		v.add(new Nation("러시아", "모스크바"));
	}
	
	public boolean contains(String country) {
		for(int i=0;i<v.size();i++) {
			if(v.get(i).getCountry().equals(country))
				return true;
		}
		return false;
	}
	
	public void insert() {
		int count = v.size();
		System.out.println("현재 "+count+"개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			count++;
			System.out.print("나라와 수도 입력"+count+">>");
			String con = sc.next();
			if(con.equals("그만")) {
				break;
			}
			
			String cap = sc.next();
			
			if(contains(con)==false)
				v.add(new Nation(con,cap));
			else {
				System.out.println(con+"는 이미 있습니다!");
				count--;
			}
		}
	}
	
	public void quiz() {
		while(true) {
			int qnum = (int)((Math.random()*v.size())+1);
			Nation tmp = v.get(qnum);
			String tmp_con = tmp.getCountry();
			String tmp_cap = tmp.getCapital();
			System.out.print(tmp_con+"의 수도는? ");
			String ans = sc.next();
			if(ans.equals("그만")) 
				break;
			if(ans.equals(tmp_cap)) 
				System.out.println("정답!");
			else
				System.out.println("아닙니다!!");
		}
	}
	
	public void exit() {
		System.out.println("게임을 종료합니다....");
		sc.close();
		return;
	}
	
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
		System.out.print("입력:1, 퀴즈:2, 종료:3>>");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			insert();
			break;
		case 2:
			quiz();
			break;
		case 3:
			exit();
			return;
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ch7num11 game = new ch7num11();
		game.run();
	}

}
