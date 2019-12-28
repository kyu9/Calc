import java.util.*;

public class ch7num3 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요,(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >>");
			String nation = sc.next();
			if(nation.equals("그만"))
				{
					break;
				}
			int population = sc.nextInt();
			nations.put(nation, population);
			
		}
		while(true) {
			System.out.print("인구 검색>> ");
			String tmp = sc.next();
			if(tmp.equals("그만"))
				break;
			if(nations.get(tmp)==null)
				System.out.println(tmp+"나라는 없습니다.");
			else
				System.out.println(tmp+"의 인구는 "+nations.get(tmp));
	}
		sc.close();

}
}