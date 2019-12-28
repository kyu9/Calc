
public class ch3num10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[4][4];
		
		int rand=0,x,y;
		
		while(rand<10) {
			x=(int)(Math.random()*4);
			y=(int)(Math.random()*4);
			arr[x][y]=(int)(Math.random()*10+1);
			rand++;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
