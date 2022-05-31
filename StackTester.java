package stack;

public class StackTester {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(5);
		s.push(7);
		s.push(9);
		s.push(11);
		s.push(14);
		s.push(20);
		
		System.out.println(s.pop()+ " is removed");
		s.print();
		
		System.out.println("\n top of the stack value is "+ s.peek());
		s.print();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());

	}

}
