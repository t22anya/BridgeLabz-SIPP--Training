package OOPS;
import java.util.*;
public class AnimatlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the animal type (Dog/Cat/Birds) among : ");
		String type= sc.next();
		System.out.println("Enter the name of the animal: ");
		String name = sc.next();
		System.out.println("Enter the age of the animal: ");
		int age = sc.nextInt();
		Animal animal;
		switch(type.toLowerCase()) {
		case "dog":
			animal = new Dog(name,age);
			break;
		case "bird":
			animal = new Birds(name,age);
			break;
		case "cat" :
			animal = new Cat(name,age);
			break;
	    default :
	    	System.out.println("use generic animal.");
	    	animal = new Animal(name,age);
		}
		animal.makeSound();
	}

}
class Animal{
	protected String name;
	protected int age;
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void makeSound() {
		System.out.println(name +" make a animla sound");
	}
}
class Dog extends Animal{
	public Dog(String name,int age) {
		super(name,age);
	}
	public void makeSound() {
		System.out.println(name+ " says: Woof Woof!");
	}
}
class Cat extends Animal{
	public Cat(String name,int age) {
		super(name,age);
	}
	public void makeSound() {
		System.out.println(name+" says : Meow Meow! ");
	}
}
class Birds extends Animal{
	public Birds(String name,int age) {
		super(name,age);
	}
	public void makeSound() {
		System.out.println(name +" says : Tweet Tweet!");
	}
}

