package interfaces;

public interface IStack<S> {
	
	public void push(S newElement);
	
	public S pop() throws Exception;
	
	public S top() throws Exception;
	
	public boolean isEmptyS();
	
	public int sizeS();

}
