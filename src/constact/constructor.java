package constact;

public class constructor {
      static  int collage_ur=200;
       int student_roll;
       String Student_name;
       
       public constructor(int i, String j)    
       {
    	   super();
    	   this.student_roll=i;
    	   this.Student_name=j;
       }     
       
      public static void main (String[]argv)
      {
    	  System.out.println("inside main method");  
    	  constructor c1=new constructor(10,"Rahul");
    	  constructor c2=new constructor(11,"Rohan");
    	  constructor c3=new constructor(12,"Aditya");
    	  constructor c4=new constructor(13,"om");
    	     	  
    	  System.out.println("student roll no ; " + c1.student_roll+ " Student name: " + c1.Student_name);
    	  System.out.println("student roll no ; " + c2.student_roll+ " Student name: " + c2.Student_name);
    	  System.out.println("student roll no ; " + c3.student_roll+ " Student name: " + c3.Student_name);
    	  System.out.println("student roll no ; " + c4.student_roll+ " Student name: " + c4.Student_name);
      }
       
}
