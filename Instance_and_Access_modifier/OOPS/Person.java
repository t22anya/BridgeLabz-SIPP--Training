package OOPS;
import java.util.*;
public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person(Person other){
		this.name=other.name;
		this.age=other.age;
	}
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();

	        Person p1 = new Person(name, age); // created by user input
	        Person p2 = new Person(p1);        // cloned using copy constructor

	        System.out.println("\n---Original Person---");
	        p1.display();

	        System.out.println("\n---Cloned Person---");
	        p2.display();

	}

}
