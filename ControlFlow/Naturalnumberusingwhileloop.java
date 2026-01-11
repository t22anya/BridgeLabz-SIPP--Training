import java.util.*;
public class Naturalnumberusingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
		if(number<0) {
			System.out.println(" Please enter a positive number ");
		}
		else {
		int sumformula = (number *(number + 1))/2;
		int sum=0;
		int i=1;
		while(i<=number) {
			sum+= i;
			i++;
		}
		System.out.println(" The sum of natural number using formula " + sumformula);
		System.out.println( " The sum of natural number using while loop "+ sum);
		  if (sum == sumformula) {
              System.out.println("Both computations are correct and equal.");
          } else {
              System.out.println("Mismatch found in computations.");
          }
		
      }
		 sc.close();
	}

}
