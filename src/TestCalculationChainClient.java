
public class TestCalculationChainClient {

	public static void main(String[] args) {
		//Here you define all of the object in the chain
		
		Chain chainObject1 = new AddNumbers();
		Chain chainObject2 = new SubtractNumbers();
		Chain chainObject3 = new MultiplyNumbers();
		Chain chainObject4 = new DivideNumbers();
		
		//Here we tell each object where to forward 
		//the data if it can't process the request
		chainObject1.setNextChain(chainObject2);
		chainObject2.setNextChain(chainObject3);
		chainObject3.setNextChain(chainObject4);

		//Define teh data in teh Numbers object;
		
		Numbers request = new Numbers (4,2,"fun");
		
		chainObject1.calculate(request);
		
	}

}
