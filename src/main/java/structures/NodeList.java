package structures;

public class NodeList<N> {
	
	private N info;
	private NodeList<N> next;
	
	public NodeList(N info) {
		
		this.info = info;
		
	}
	
	public N getInfo() {
		return info;
	}

	public void setInfo(N info) {
		this.info = info;
	}

	public NodeList<N> getNext() {
		return next;
	}
	public void setNext(NodeList<N> next) {
		this.next = next;
	}
	
	

}
