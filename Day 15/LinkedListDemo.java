public class LinkedListDemo {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	void insertAtBegin(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	void insertAtEnd(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	void insertAtPos(int pos, int data) {
		Node newnode = new Node(data);
		if (pos == 0) {
			insertAtBegin(data);
			return;
		} else {
			Node temp = head;
			for (int i = 0; i < pos - 1; i++) {
				if (temp == null || temp.next == null) {
					System.out.println("invalid pos");
					return;
				}
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}

	void deleteAtBegin() {
		if(head==null)
		{
			System.out.println("List is empty");
		}else {
			head=head.next;
		}
	}
	void deleteAtEnd() {
		if(head==null)
		{
			System.out.println("List is empty");
		}else {

			Node temp=head;
			Node prev=null;
			while(temp.next!=null)
			{
				prev=temp;
				temp=temp.next;
			}
			if(prev==null||prev.next==null)
			{
				deleteAtBegin();
				return;
			}
			prev.next=temp.next;
		}
	}
	void deleteAtPos(int pos)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else if(pos==0)
		{
			deleteAtBegin();
			return;
		}
		else {
			Node temp=head;
			Node prev=null;
			for(int i=0;i<pos;i++)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp==null||prev.next==null)
			{
				System.out.println("invalid position");
				return;
			}
			prev.next=temp.next;
		}
	}

	void display() {
		if(head==null)
		{
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListDemo l = new LinkedListDemo();
		l.insertAtBegin(4);
		l.insertAtBegin(3);
		l.insertAtBegin(2);
		l.insertAtBegin(1);
		l.insertAtEnd(5);
//		l.deleteAtBegin();
//		l.deleteAtEnd();
		l.display();
		System.out.println();
		l.deleteAtPos(4);
		l.display();

	}

}
