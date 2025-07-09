import java.util.*;
public class SortStackUsingRecursion {
	public static void sortStack(Stack<Integer> st) {
		if(!st.isEmpty()) {
			int top=st.pop();
			sortStack(st);
			insertInSorted(st,top);
		}
	}
	public static void insertInSorted(Stack<Integer>st,int element) {
		if(st.isEmpty()|| element>st.peek()) {
			st.push(element);
		}
		else {
			int top=st.pop();
			insertInSorted(st,element);
			st.push(top);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements: ");
		for(int i =0;i<n;i++) {
			int val=sc.nextInt();
			st.push(val);
		}
		System.out.println("Original Stack: "+st);
		sortStack(st);
		System.out.println("Sorted Stack: "+st);
		

	}

}
