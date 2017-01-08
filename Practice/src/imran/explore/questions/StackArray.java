package imran.explore.questions;

public class StackArray {

	int size;
	int arr[];
	int top;
	public StackArray(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int num) {
		if(!isFull()){
			top++;
			arr[top]=num;
			System.out.println("Pushed Element is "+num);
		}else{
			System.out.println("Stack is Full!!");
		}
	}
	public void pop() {
		if(!isEmpty()){
			int popped= top;
			top--;
			System.out.println("Popped Element is "+arr[popped]);
		}else{
			System.out.println("Stack is Empty!!");
		}
	}
	public void peek() {
		System.out.println("Top Element is "+arr[top]);
	}
	public boolean isFull() {
		return ((size-1)== top);
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public static void main(String[] args) {
		StackArray s=new StackArray(5);
		s.pop();
		s.push(25);
		s.push(24);
		s.push(23);
		s.push(22);
		s.peek();
		s.push(21);
		s.push(20);
		s.pop();
		s.pop();
		s.pop();
		s.peek();
		s.push(89);
	}

}
