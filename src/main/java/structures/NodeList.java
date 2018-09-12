package structures;

public class NodeList<N> {
	
	private N info;
	private NodeList next;
	
	public NodeList(N info) {
		
		this.info = info;
		
	}
	
	public N getInfo() {
		return info;
	}

	public void setInfo(N info) {
		this.info = info;
	}

	public NodeList getNext() {
		return next;
	}
	public void setNext(NodeList next) {
		this.next = next;
	}
	
	

}
