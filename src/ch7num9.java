import java.util.Vector;

interface IStack<T>{
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
	Vector<T> v = null;
	public MyStack(){
		v = new Vector<T>();
	}
	public boolean push(T ob) {
		v.add(0,ob);//맨뒤에서부터!
		return true;
	}
	
	public T pop() {
		if(v.size()==0)
			return null;
		else {
			return v.remove(0);
		}
	}
}

public class ch7num9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0;i<10;i++)
			stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null)
				break;
			System.out.print(n+" ");
		}
	}

}
