class MultipleCatchBlocks{
	public static void main(String [] args){
		try{
			int num = 6/0;
			MultipleCatchBlocks obj = new MultipleCatchBlocks();
		}
		catch (ArithmeticException e){
			System.out.println("Caught error: " + e.getMessage());
		}
		catch (IllegalThreadStateException cn){
			System.out.println("Caught error: " + cn.getMessage());
		}
	}
}