
public interface Chain {

	//defines the next object to receive the data
	public void setNextChain( Chain nextChain);
	
	//either solves the problem or will pass it to the next object in chain
	public void calculate(Numbers Request);
	
}
