import java.util.Scanner;
public class ch2num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int cx,cy;
		double r, distance;
		
		System.out.print("원의 중심과 반지름 입력>>");
	    cx=sc.nextInt();
	    cy=sc.nextInt();
	    r=sc.nextDouble();
	
	    System.out.print("점 입력>>");
	    x=sc.nextInt();
	    y=sc.nextInt();
	    
	    distance = Math.sqrt(((x-cx)*(x-cx))+((y-cy)*(y-cy)));
	    if(distance<r) {
	    	System.out.print("점 ("+x+","+y+")은 원 안에 있다.");
	    }
	    else {
	    	System.out.print("점 ("+x+","+y+")은 원 안에 없다");;
	    }
	    
	    sc.close();

	}

}
