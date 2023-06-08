package constact;

public class Mahindra1 {

		String company_name = "MAHINDRA";
		String car_name;
		int car_number;

		public Mahindra1(String car_name, int car_number) {
			super();
			this.car_name = car_name;
			this.car_number = car_number;
			System.out.println("company car_name ----and car_number " + car_name + " " + car_number);
		}

	public static void main(String[] args) {
		
		Mahindra1 m1 = new Mahindra1("THAR", 100);
		Mahindra1 m2 = new Mahindra1("XUV700", 200);
	}

}
