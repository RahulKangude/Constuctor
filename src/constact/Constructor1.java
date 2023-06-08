
package constact;

public class Constructor1 {

	String name;
	int roll_num;

	Constructor1(int roll_num) {
		System.out.println("inside a no argument block:" + roll_num);
	}

	{
		System.out.println("inside a instance block" + roll_num);
	}

	Constructor1(String name, int roll_num) {
		this.name = name;
		this.roll_num = roll_num;
		System.out.println("inside a argument block  " + name + " " + roll_num);
	}

	public static void main(String[] args) {

		Constructor1 c1 = new Constructor1("rahul", 10);
		Constructor1 c2 = new Constructor1(20);

	}

}
