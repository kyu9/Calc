import java.util.*;

class Student{
	private String name,subject;
	private String code;
	private String grade;
	public Student(String name, String subject, String code, String grade){
		this.name=name;
		this.subject=subject;
		this.code=code;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public String getCode() {
		return code;
	}
	public String getGrade() {
		return grade;
	}
}

public class ch7num5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String tmp = sc.nextLine();
			StringTokenizer st = new StringTokenizer(tmp,",");
			String name = st.nextToken();
			String sub = st.nextToken();
			String num = st.nextToken();
			String grade = st.nextToken();
			Student student= new Student(name, sub, num, grade);
			a.add(student);
		}
		for(int i=0;i<a.size();i++) {
			System.out.println("-------------------------------");
			System.out.println("이름: "+a.get(i).getName());
			System.out.println("학과: "+a.get(i).getSubject());
			System.out.println("학번: "+a.get(i).getCode());
			System.out.println("학점: "+a.get(i).getGrade());
		}
		
		while(true) {
			System.out.print("학생이름 >>");
			String tmp = sc.next();
			if(tmp.equals("그만"))
				break;
			for(int i=0;i<a.size();i++) {
				if(a.get(i).getName().equals(tmp)) {
					System.out.print(a.get(i).getName()+", "+a.get(i).getSubject()+", "+a.get(i).getCode()+", "+a.get(i).getGrade());
					System.out.println("");
				}
			}
		}
		sc.close();
	}

}
