
public class SubtractNumbers implements Chain {

	public Chain nextInChain;
	
	// defines the next object to receive the data 
	// if this one cant use it
	public void setNextChain(Chain nextChain) {
		
		nextInChain=nextChain;
		
	}

	//Tries to calculate the data, or passes it to
	//the object defined in method SetNextChain()
	public void calculate(Numbers request) {
	
		if(request.getCalcWanted() == "sub"){
				             
			System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "+
					(request.getNumber1()- request.getNumber2()));
				             
		} 
		else 
		{      
			nextInChain.calculate(request);			            
		}    
	}

}
