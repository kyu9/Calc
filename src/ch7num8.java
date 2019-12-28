import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class ch7num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**포인트 관리 프로그램입니다 **");
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> pro = new HashMap<String, Integer>();
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = sc.next();
			int point = sc.nextInt();
			if(name.equals("그만"))
				break;
			if(pro.get(name) == null)
				pro.put(name, point);
			else
				pro.put(name, pro.get(name)+point);
			
			Set<String> keys = pro.keySet();
			Iterator<String> it = keys.iterator();
			int value=0;
			while(it.hasNext()) {
				String key = it.next();
				value = pro.get(key);
				System.out.print("("+key+","+value+")");
			}
			System.out.println();
		
		}
		sc.close();
		
	}

}
