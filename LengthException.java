package Game;

class LengthException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;

	LengthException(){//exception created to check if and when the length of the snake becomes 0
		super("Length of snake zero");
	}
}
