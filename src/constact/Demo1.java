package constact;

public class Demo1 {

	static int count=0;
	{
		count++;
	}
	 Demo1()
	{
		
	}
	Demo1(int a)
	{
		
	}
	Demo1(String b,int c)
	{
		
	}
	
	public static void main(String[] args) {
		
       Demo1 d1=new Demo1();
       Demo1 d2=new Demo1(1);
       Demo1 d3=new Demo1("name",10);
       
      System.out.println("the no of object "+count);
	}

}
