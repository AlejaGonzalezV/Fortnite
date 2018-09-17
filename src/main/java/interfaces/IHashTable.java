package interfaces;

public interface IHashTable<A> {
	
	public int hashFunction(Number key);
	public boolean isEmpty();
	public int Size();
	public void insert(A element, Number key);
	public A remove(A element);
	public A Get(Number key);

}
