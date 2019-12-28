import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

class Nation{
	private String country, capital;
	public Nation(String country, String captial) {
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


public class ch7num11_alpha {

	private Scanner sc = new Scanner(System.in);
	private HashMap<String, String> h = new HashMap<String, String>();
	
	public ch7num11_alpha() {
		h.put("맥시코", "맥시코시티");
		h.put("스페인", "리스본");
		h.put("프랑스", "파리");
		h.put("영국", "런던");
		h.put("그리스", "아테네");
		h.put("독일", "베를린");
		h.put("일본", "도쿄");
		h.put("중국", "베이징");
		h.put("러시아", "모스크바");
	}
	
	
	public void insert() {
		int count = h.size();
		System.out.println("현재 "+count+"개 나라와 수도가 입력되어 있습니다.");
		while(true) {
			count++;
			System.out.print("나라와 수도 입력"+count+">>");
			String con = sc.next();
			if(con.equals("그만"))
				break;
			String cap = sc.next();
			
			if(h.containsKey(con)!=true){
				h.put(con, cap);
			}
			else {
				System.out.println(con+"는 이미 있습니다!");
				count--;
			}
		}
	}
	
	public void quiz() {
		Set key = h.keySet();
		Object[] array = key.toArray();
		
		while(true) {
			int qnum = (int)
					(Math.random()*array.length);
			String question = (String)array[qnum];
			String answer = h.get(question);
			
			System.out.print(question +"의 수도는?");
			String tmp = sc.next();
			if(tmp.equals("그만"))
				break;
			if(tmp.equals(answer))
				System.out.println("정답입니다!");
			else
				System.out.println("아닙니다!");
			
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

		ch7num11_alpha game = new ch7num11_alpha();
		game.run();
		
	}

}
