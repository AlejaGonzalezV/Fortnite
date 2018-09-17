package structures;
import interfaces.*;

public class Structures<S> implements IStack <S>, Queque<S>{
	
	private NodeList<S> top;
	private int size;
	private NodeList<S> front;
	private NodeList<S> last;
	private int sizeQ;
	
	
	public Structures() {
		
		this.top = null;
		this.front = null;
		this.last = null;
		
	}
	
	public void push(S newElement) {
		
		NodeList<S> element = new NodeList<S>(newElement);
		element.setNext(top);
		setTop(element);
		size++;
		
	}

	public S getTop() {
		return top.getInfo();
	}

	public void setTop(NodeList<S> top) {
		this.top = top;
	}


	public S pop() throws Exception {
		
		if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}
		
		if(top != null) {
			
			NodeList<S> delete = top;
			top = top.getNext();
			size--;
			
			return (S) delete.getInfo();
			
		}
		
		return null;
	}


	public S top() throws Exception {
		
		if(top == null) {
			
			return null;
			
		}
		
		else if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}else {
			
			return (S) top.getInfo();
			
		}

	}


	public int sizeS() {
		
		return size;
	}


	public boolean isEmptyS() {
		if(size == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	//Queue
	
	public boolean isEmptyQ() {
		// TODO Auto-generated method stub
		return last == null;
	}

	public void enqueque(S a) {
		
		NodeList<S> New = new NodeList<S>(a);
		
		if(isEmptyQ()) {
			
			front = New;
		}else {
			last.setNext(New);
		}
		last = New;
		sizeQ++;
		
	}

	public S front() throws Exception {
		
	if(!isEmptyQ()) {
			
			return front.getInfo();
		}else {
			
			throw new Exception("La cola esta vacia");
		}
		
	}

	public S dequeque() throws Exception {
		if(!isEmptyQ()) {
			NodeList<S> first = front;
			if(front == last) {
				last = null;
			}else {
				front = front.getNext();
			}
			sizeQ--;
			return first.getInfo();
			
		}else {
			throw new Exception("La cola esta vacia");
		}
	}

	public int sizeQ() {
		// TODO Auto-generated method stub
		return sizeQ;
	}

	public void removeAll() {
		
		front = null;
		last = null;
	}

	
	

}
