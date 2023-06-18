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
 * A constructor is called "Default Constructor" when it doesn't have any parameter.

   Syntax of default constructor:
   <class_name>(){} 
   
   
 */
public class DefaultConstructor {

	public DefaultConstructor() {
		System.out.println("Default Constructor Example.");
	}
	public static void main(String[] args) {
		//It will be invoked at the time of object creation.
		DefaultConstructor m = new DefaultConstructor();
		
	}
	
}
