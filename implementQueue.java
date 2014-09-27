Implement a queue:
public interface Queue1(){
Object item;
int size;(should be delete)
 void enqueue(Object intem){
}
 Object dequeue(){

}
 int size(){
}
boolean isEmpty(){
}
Object peek(){
}
///public is not nessessary!!!!
}

public ListNodeQ implement Queue1(){
	private class Node(){
		int data;
		Node head;
		Node next;
		Node(int m ){
			this.head = new Node(m);
			this.next = null;
		}
		Node (int m ,Node next){
			this.head = new Node(m);
			this.next = next;

}
}
private Node head l;
private Node tail l;
int size;
public ListNodeQ (){
	this.head = null;
	this.tail = null;
}
public int size(){
	return this.size;
}

public int peek(){
	return head == null ? null : head.data;
}
public boolean isEmpty(){
	return head == null;
}
public void enQueue(int m){
if (isEmpty()) {head = newNode;} else {tail.next = newNode;}
        	tail = newNode;

}
public int dequeue(){
	if(head == null){
		throw new noSuchElementException(“there is nothing in it”);
}
 if (tail == head) {
            tail = null;
        }

int data = head.val;
head = head.next;
return data;
}



}
