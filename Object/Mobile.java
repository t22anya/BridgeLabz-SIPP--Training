import java.util.*;
public class Mobile {
	String brand;
	String model ;
	double price;
	Mobile(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void display() {
		System.out.println("\n ----Mobile Phone Details----");
		System.out.println("the brand of mobile: "+brand);
		System.out.println("the model of mobile: "+model);
		System.out.println("the price of mobile: "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand of mobile: ");
		String brand = sc.nextLine();
		System.out.println("Enter the  model of mobile: ");
		String model = sc.nextLine();
		System.out.println("Enter the price of mobile: ");
		double price = sc.nextDouble();
		Mobile phone = new Mobile(brand,model,price);
		phone.display();

	}

}
