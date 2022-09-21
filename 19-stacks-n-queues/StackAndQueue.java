//Stacks and Queues: for storing answer so far,traversals,bfs,dfs,recursion->iteration
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class StackAndQueue{
	public static void main(String[] args) {
		/*
		Stack<Integer> stack = new Stack<>();
		stack.push(44);
		stack.push(44);
		stack.push(44);
		stack.push(44);
		stack.pop();// returns the object removed
		System.out.println(stack);

		Queue<Integer> queue = new LinkedList<>();// interface
		// implementing linkedlist
		// ctrl click for more functions info
		queue.add(4);
		queue.add(45);
		System.out.println(queue.remove());
		System.out.println(queue.peek());// 45 to remove next

		//insert remove both side-> Deque(interface)
		//add(throws exp) or offer(capacity restricted) 
		//remove or poll
		//peek for first ele of deque
		Deque<Integer> deque = new ArrayDeque<>();
		//ArrayDeque has no capacity restriction faster LL and Stack
		//Not thread safe
		//uses in trees
		//null ele not allowed
		deque.add(45);
		deque.addLast(88);
		deque.removeFirst();
		deque.removeLast();
		*/
		CustomStack stack = new CustomStack();
		System.out.println(stack.push(78));
		System.out.println(Arrays.toString(stack.data));
		//Scope
		stack = stack.returnsCS();
		System.out.println(Arrays.toString(stack.data));

		stack.push(0);

	}
}
class CustomStack{
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;// not dynamic throws exp->Array is Full
	int ptr = -1;
	
    public CustomStack() {
    	this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
    	this.data = new int[size];
    }

    public boolean push(int num){
    	if(isFull()){
    		System.out.print("Array is Full");
    		return false;
    	}
    	data[++ptr] = num;
    	return true;
    }
    public int pop(){
    	if(isEmpty()){
			System.out.println("can't remove from empty array");
			return -1;
    	}
    	int removed = data[ptr--];
    	return removed;
    }
    public boolean isEmpty(){
    	return ptr == -1;
    }
    public boolean isFull(){
    	return ptr == data.length-1;
    }
    public CustomStack returnsCS(){
    	CustomStack node = new CustomStack();
    	return node;
    }
}

