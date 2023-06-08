package constact;

public class Demo3 {
         Demo3()
         {
        	 this(10);
        	 System.out.println("no-argument");
         }
         Demo3(int i)
         {
        	 this(10.5);
        	 System.out.println("int -argument");

         }
         Demo3(double d)
         {
        	 System.out.println("double argument");

         }
	public static void main(String[] args) {
	
          Demo3 d1=new Demo3(11.5);
          Demo3 d2=new Demo3(10);
          Demo3 d3=new Demo3();


	}

}
