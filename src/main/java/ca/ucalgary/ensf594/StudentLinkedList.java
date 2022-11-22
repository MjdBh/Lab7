package ca.ucalgary.ensf594;
/*

* */
public class StudentLinkedList {
	
	private Student head;
	
	public StudentLinkedList (){
		head = null;
	}
	public void insertToEndOfList (Student s){
		Student cursor = head; //need temp Student object reference to ensure head is NOT
		                       //moving!!
		
		if (head == null){
			head = s;
			return;
		}
		while (cursor.getNext() != null)
			cursor = cursor.getNext();
		
		cursor.setNext(s);
	}
	public void insertToFrontOfList (Student s){
		if (head == null)
			head = s;
		else{
			s.setNext(head);
			head = s;
		}
	}
	public void insertInOrder (Student s){
		
		
		
	}
	public void printLinkedList (){
		
		Student cursor = head;
		
		while (cursor != null){
			System.out.println (cursor.toString());
			cursor = cursor.getNext();
		}
	}
	
	
	public static void main (String [] args){
		
		StudentLinkedList myHead = new StudentLinkedList ();
		
		
		
		myHead.insertInOrder(new Student("Sam", 1));
		myHead.insertInOrder(new Student("Joe", 5));
		myHead.insertInOrder(new Student("Sarah", 3));
		
		myHead.printLinkedList();

		
	}

}
