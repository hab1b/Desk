package stack;

public class Stack <T>{
	private int top,size;
	private T[] stack;
	
	public Stack() {
		top=size=0;
		stack = (T[]) new Object[5];
	}
	public Stack(int size) {
		top=size=0;
		stack = (T[]) new Object[size];
	}
	public void push(T data) {
		if(top>=stack.length) {
			T[] temp = (T[]) new Object[stack.length*2];
			for(int i=0;i<stack.length;i++)
				temp[i]=stack[i];
			stack=temp;
//			throw new StackOverflowException();
		}
		stack[top]=data;
		top++;
	}
	
	public T pop() {
		if(top<=0) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		T data = stack[top-1];
		top--;
		return data;
	}
	
	public T peek() {
		if(top<=0) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return stack[top-1];
	}
	public boolean isEmpty() {
		if(top==0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top>=stack.length)
			return true;
		else
			return false;
	}
	public void print() {
		for(int i=0;i<top;i++) {
			System.out.print(stack[i]+", ");
		}
	}
	
}
