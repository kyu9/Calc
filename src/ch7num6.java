import java.util.*;

class Location{
	private String city, longitude, latitude;
	public Location(String city, String longitude, String latitude) {
		this.city=city;
		this.longitude=longitude;
		this.latitude=latitude;
	}
	public String getCity() {return city;}
	public String getLongitude() {return longitude;}
	public String getLatitude() {return latitude;}
	
}

public class ch7num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> citys = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">>");
			String tmp = sc.nextLine();
			StringTokenizer st = new StringTokenizer(tmp, ",");
			String tmp_city = st.nextToken();
			String tmp_long = st.nextToken();
			String tmp_lat = st.nextToken();
			Location loc = new Location(tmp_city, tmp_long, tmp_lat);
			citys.put(tmp_city, loc);
		}
		
		Set<String> keys = citys.keySet();
		Iterator<String> it = keys.iterator();
		System.out.println("----------------------------------");
		while(it.hasNext()) {
			String key = it.next();
			Location tmp_loc = citys.get(key);
			System.out.println(key+" "+tmp_loc.getLongitude()+" "+tmp_loc.getLatitude());
		}System.out.println("----------------------------------");
		while(true) {
			System.out.print("도시 이름 >>");
			String tmp2 = sc.next();
			if(tmp2.equals("그만"))
				break;
			if(citys.get(tmp2)==null)
				System.out.println(tmp2+"는 없습니다.");
			else
				System.out.println(citys.get(tmp2).getCity()+" "+citys.get(tmp2).getLongitude()+" "+citys.get(tmp2).getLatitude());
		}
		
		sc.close();
	}

}
