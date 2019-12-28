import java.util.Scanner;
public class ch2num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
	    int fx=sc.nextInt();
	    int fy=sc.nextInt();
	    double fr=sc.nextDouble();
	    
	    System.out.print("두번째 원의 중심과 반지름 입력>>");
	    int sx=sc.nextInt();
	    int sy=sc.nextInt();
	    double sr=sc.nextDouble();
	    
	    double sumr=fr+sr;
	    double distance = Math.sqrt(((sx-fx)*(sx-fx))+((sy-fy)*(sy-fy)));
	    if(distance>sumr) {
	    	System.out.print("두 원은 서로 안겹칩니다");
	    }
	    else
	    	System.out.print("두 원은 서로 겹친다");

	}

}
