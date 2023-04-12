package Hii;

public class Main {
	//Creating the variables to store the values
int id;
String name;
//creating the parameterized constructor
Main(int i,String n){
	id=i;
	name=n;
}
//method to display the message
void display() {
	System.out.println("Id:"+id+" "+"Name:"+name);
}
public static void main(String[] args) {
	System.out.println("Paramterized Constructor");
	Main m1= new Main(1,"Apple");
	Main m2= new Main(2,"Ball");
	//Calling the methods
	m1.display();
	m2.display();
}
}
