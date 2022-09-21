public class BinaryNode {
	int data;
	BinaryNode left, right;

	private BinaryNode(int data) {
		this.data = data; 
	}
	private BinaryNode(int data, BinaryNode left, BinaryNode right) {
		this.data = data; 
		this.left = left;
		this.right = right;
	}
}