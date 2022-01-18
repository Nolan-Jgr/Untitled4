package lab14;

public class BlueRayCollection {
	private node head = null;
	public void add(String t, String d, int y, double c) {
		BlueRayDisk brd = new BlueRayDisk(t,d,y,c);
		node new_node = new node(brd);
		if(head == null) {
			head = new node(brd);
			return;
		}
		new_node.next = null;
		node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new_node;
		return;
		
	}
	public void show_all() {
		node temp = head;
		while(temp != null) {
			System.out.println(temp.data.toString());
			temp = temp.next;
		}
	}
	public void search(String t) {
		node temp = head;
		while(temp!=null) {
			if(temp.data.title.equals(t)) {
				System.out.println(temp.data.toString());
				return;
			}
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Not Found");
		}
	}
	public void remove(String t) {
		node temp = head;
		node prev = null;
		if(temp != null && temp.data.title.equals(t)) {
			head = temp.next;
			return;
		}
		while(temp != null && !temp.data.title.equals(t)) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null) {
			return;
		}
		prev.next = temp.next;
	}

}
