package constact;

public class Wipro extends Tcs{	 
	String emp_name;
	int emp_id;
	
	static 
	{
		System.out.println("inside the child static block");
	}
	
	{
		System.out.println("inside the child instance block");
	}
	
	Wipro(String emp_name,int emp_id)
	{ 
		 
		super("emp_name",emp_id);
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		System.out.println("inside the child constructor");
	}

	public static void main(String[] args) {
       System.out.println("inside the child main method");
		Wipro w1=new Wipro("RAHUL",120);
		//Wipro w2=new Wipro("VAIBHAV",350);		
		System.out.println();
		Tcs t1 = new Tcs("R",10);
		t1.m1();
		
	}

}
