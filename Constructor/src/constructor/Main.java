package constructor;

/*
 * A constructor is a block of code similar to the method.
 * It called when the an instance(object) of class is created.
 * At the time of calling constructor, memory for the object is allocated in the memory.
 * It is special type of method which is used to initialize the object.
 ********* Rules for constructor creation********
 * 1.Constructor name must be the same as the class name.
 * 2.A Constructor must have no explicit return type.
 * 3.A java constructor cannot be abstract,static,final and synchronized.
 * *******Types*****
 * 1.Default Constructor(no-arg constructor) 
 * 2.Parameterized Constructor
 */
public class Main {
//Creating the variables to store the values
	int id;
	String name, address;

	public Main() {
		System.out.println("Default constructor.");
	}

//creating the parameterized constructor
	public Main(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

//Override toString to display the message
	@Override
	public String toString() {
		return "Main [id=" + id + ", name=" + name + ", Address=" + address + "]";
	}

//void method to display the message
	void display() {
		System.out.println("Id:" + id + " " + "Name:" + name);
	}

	public static void main(String[] args) {
		// Calling the default Constructor
		Main m3 = new Main();
		//Calling the Parameterized Constructor
		System.out.println("Paramterized Constructor");
		Main m1 = new Main(1, "Apple", "USA");
		Main m2 = new Main(2, "Ball", "Cannada");
		// Calling the void methods
		m1.display();
		m2.display();
		// calling the method by using the object of the class.
		System.out.println(m1);
		System.out.println(m2);

	}
}
