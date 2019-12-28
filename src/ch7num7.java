import java.util.*;

public class ch7num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("미래장학금관리시스템입니다.");
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> grade = new HashMap<String, Double>();
		for(int i=0;i<5;i++) {
			System.out.print("이름과 학점 >>");
			String tmp = sc.next();
			double num = sc.nextDouble();
			grade.put(tmp, num);
		}
		System.out.print("장학생 선발 학점 기준 입력>>");
		double cut = sc.nextDouble();
		Set<String> keys = grade.keySet();
		Iterator<String> it = keys.iterator();
		System.out.print("장학생 명단 : ");
		while(it.hasNext()){
			String key = it.next();
			double value = grade.get(key);
			if(value>cut)
				System.out.print(key+" ");
		}

		sc.close();
	}

}
