class TV{
	private String brand;
	private int year;
	private int inch;
	TV(String brand, int year, int inch){
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		System.out.println(brand+"에서 만든"+year+"년형"+inch+"인치 TV");
	}
}
public class ch4num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV("LG",2017,27);
		tv.show();
	}

}
