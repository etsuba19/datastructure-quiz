import java.util.Arrays;
public class linearQueue {
	private int front, rear;
	private int[] nums;
	
	public linearQueue(int size) {
		this.front = this.rear = -1;
		this.nums = new int[size];
	}
	private boolean isFull(){
		return rear == nums.length-1;
	}
	public boolean isEmpty() {
		return front == -1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("it is full.");
		}
		if(isEmpty())	{
			;
			nums[++rear] = data;
			
		} 

		
	}
	public int dequeue(){
		if(isEmpty())	{
			System.out.println("it is empty");
		} 
		int temp = nums[front];
		if (front==rear) {
			front = rear = -1;
		}
		else {
			front++;
		}
		return temp;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("no element in Queue");
		}
		return nums[front];
	}
	void display() {
		
		System.out.print(Arrays.toString(nums));
		}
	
	public static void main(String[] args) {
		linearQueue qu = new linearQueue(5);
		qu.enqueue(3);
		qu.enqueue(23);
		qu.enqueue(21);
		qu.enqueue(3);
		qu.enqueue(10);
		qu.display();
		}
	
		
}
