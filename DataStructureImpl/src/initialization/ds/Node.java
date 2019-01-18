package initialization.ds;

class Node {
	
	private int data;
	private Node next;
	
	public int getData() {
		return data;
	}
	public void setData(int val) {
		this.data = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	//default constructor
	public Node(){
			
		}
	public Node(int val){
		data=val;
	}
	public Node(int val,Node nextNode) {
		data=val;
		next=nextNode;
	}

}
