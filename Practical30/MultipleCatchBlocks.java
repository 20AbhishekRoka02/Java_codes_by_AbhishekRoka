//WARNING: This code is not completed yet!
class MultipleCatchBlocks{
	public static void main(String [] args){
		try{
			int num = 6/5;
			MultipleCatchBlocks obj = new MultipleCatchBlocks(45);
		}
		catch (ArithmeticException e){
			System.out.println("Caught error: " + e.getMessage());
		}
		catch (IOException cn){
			System.out.println("Caught error: " + cn.getMessage());
		}
	}
}