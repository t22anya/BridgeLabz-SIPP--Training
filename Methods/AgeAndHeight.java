import java.util.*;
public class AgeAndHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = {"Amar","Akbar","Anthony"};
		int [] age = new int[3];
		int []height = new int[3];
		System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
		for(int i = 0 ;i<age.length;i++) {
			age[i]=sc.nextInt();
		}
		 System.out.println("Enter the heights (in cm) of Amar, Akbar, and Anthony:");
		for(int i =0;i<height.length;i++) {
			height[i]=sc.nextInt();
		}
		int youngestIndex = youngest(age);
		int tallestIndex = tallest(height);
		System.out.println("Youngest friend :"+name[youngestIndex]+"(Age:"+age[youngestIndex]+")");
		System.out.println("Tallest friend :"+name[tallestIndex]+"(Age:"+height[tallestIndex]+"cm)");
		

	}
	public static int  youngest(int [] age) {
		int index =0;
		for(int i =1;i<age.length;i++) {
			if(age[i]<age[index]) {
				index=i;
			}
		}
		return index;
		
	}
	public static int tallest(int[] height) {
		int maxIndex =0;
		for(int i =1;i<height.length;i++) {
			if(height[i]>height[maxIndex]) {
				maxIndex=i;
			}
		}
		return maxIndex;
	}

}
