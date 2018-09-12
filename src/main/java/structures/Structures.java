package structures;
import interfaces.*;

public class Structures<S> implements IStack <S>{
	
	private NodeList top;
	private int size;
	
	public Structures() {
		
		this.top = null;
		
	}
	
	public void push(S newElement) {
		
		NodeList element = new NodeList(newElement);
		element.setNext(top);
		setTop(element);
		size++;
		
	}

	public NodeList getTop() {
		return top;
	}

	public void setTop(NodeList top) {
		this.top = top;
	}


	public S pop() throws Exception {
		
		if(isEmptyS()) {
			
			throw new Exception("the stack is empty");
			
		}
		
		if(top != null) {
			
			NodeList delete = top;
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

	
	

}
