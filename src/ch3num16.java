import java.util.Scanner;
public class ch3num16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str[]= {"가위","바위","보"};
		String input="";
		int a=1;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(a==1) {
			System.out.print("가위 바위 보! >>");
			input=sc.next();
			int n = (int)(Math.random()*3);
			if(str[n].equals("바위")) {
				if(input.equals("가위")) {
					System.out.println("사용자 = 가위 , 컴퓨터 = 바위 컴퓨터가 이겼습니다.");
				
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 바위 비겼습니다.");
				
				}
				else if(input.equals("보")){
					System.out.println("사용자 = 보, 컴퓨터 = 바위 사용자가 이겼습니다.");
				
				}
				
			}
			else if(str[n].equals("가위")) {
				if(input.equals("가위")) {
					System.out.println("사용자 = 가위 , 컴퓨터 = 가위 비겼습니다.");
				
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 가위 사용자가 이겼습니다.");
					
				}
				else if(input.equals("보")){
					System.out.println("사용자 = 보, 컴퓨터 = 가위 사용자가 졌습니다.");
					
				}
			}
			else if(str[n].equals("보")) {
				if(input.equals("가위")) {
					System.out.println("사용자 = 가위 , 컴퓨터 = 보 사용자가 이겼습니다.");
				
				}
				else if(input.equals("바위")) {
					System.out.println("사용자 바위, 컴퓨터 = 보 사용자가 졌습니다.");
				
				}
				else if(input.equals("보")){
					System.out.println("사용자 = 보, 컴퓨터 = 보 비겼습니다.");
				
				}
			}
			else if(input.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				a=1;break;
			}
		}
	}

}
