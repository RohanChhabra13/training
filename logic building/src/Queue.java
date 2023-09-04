
public class Queue {
	private class Node{
		private int data;
		private Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
	}
	private Node first, last,prev;
	
	public void peek(int d) {
		Node n = new Node(d);
		if(first==null)first=null;
		if(last != null) {
			last.setNext(n);
		last=n;
		}
	}
	public int pop() {
		if(first!=null) {
		int data = first.getData();
		first = first.getNext();
		return data;}
		else System.out.println("Stack is empty");
		return 0;
	}
	public void print() {
	Node t = first;
	while(t!=last) {
		System.out.println(t.getData());
		t=t.getNext();
	}
	}
}
