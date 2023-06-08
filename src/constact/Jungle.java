package constact;

public class Jungle {
	static String jungle_name = "Rehakuri";
	String animal_name;
	int animal_id;

	public Jungle(String animal_name, int animal_id) {
		super();
		this.animal_name = animal_name;
		this.animal_id = animal_id;
		System.out.println("inside jungle " + animal_name + " " + animal_id);
		
		
	}
	 class Mahindra {

		String company_name = "MAHINDRA";
		String car_name;
		int car_number;

		public Mahindra(String car_name, int car_number) {
			super();
			this.car_name = car_name;
			this.car_number = car_number;
			System.out.println("company car_name and car_number " + car_name + " " + car_number);
		}
        
        
	}
     static
     {
    	 System.out.println("inside a static block");
    	 
     }
     {
    	 System.out.println("inside a instance block");
     }
	public  Jungle() {
		super();
	}

	public static void main(String[] args) {
		System.out.println("inside main ");
		Jungle E1 = new Jungle("ELEPHANT", 10);
     	Jungle E2 = new Jungle("TIGER", 20);
    	Jungle E3 = new Jungle("LION", 30);
	

		Mahindra1 m1 = new Mahindra1("THAR", 100);
	    Mahindra1 m2 = new Mahindra1("XUV700", 200);
	}
	}
	
	
	

