package constact;

public class Tcs {
   String employee_name;
   int employee_no;
 
   
   static 
   {
	   System.out.println("inside the  static parent block");	   
   }
   {
	   System.out.println("inside the  instance parent block");
   }
      Tcs (String employee_name,int employee_no)
    {
    	super();
    	this.employee_name=employee_name;
    	this.employee_no= employee_no;
    	System.out.println("inside the parent constuctor of Tcs");
    }
     void m1(){
    	System.out.println("method m1"); 
    }
    
    
   public static void main(String[] argv)
    {
	   System.out.println("inside main parent methode ");
    	Tcs t1=new Tcs("Rohan",410);
    	Tcs t2=new Tcs("om",450);
    	
    }
}
