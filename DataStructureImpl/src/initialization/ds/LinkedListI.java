package initialization.ds;

public class LinkedListI {
	//modified
	Node root;
	int size;
	
	LinkedListI(){
		root=new Node();
		size=0;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public Node add(int data) {
		Node newNode=new Node(data,root);
		this.root=newNode;
		this.size++;
		return newNode;
		
	}

	public static void main(String[] args) {
		
		LinkedListI l1=new LinkedListI();
		System.out.println(l1.getSize());
		l1.add(20);
		l1.add(17);
		l1.add(18);
		l1.add(19);
		System.out.println(l1.getSize());
		
	}

}
