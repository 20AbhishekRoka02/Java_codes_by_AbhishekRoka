class GenerateExceptionWithThrow{
	public static void main(String [] args){
		try{
			throw new ArithmeticException("Division by 0 (zero)");
		}
		catch(Exception e){
			System.out.println("Caught Error: " + e.getMessage());
		}
	}
}