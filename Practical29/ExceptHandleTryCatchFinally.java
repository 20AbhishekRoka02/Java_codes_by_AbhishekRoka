class ExceptHandleTryCatchFinally{
	public static void main(String [] args){
		try{
			int num = 6/0;
		}
		catch(Exception e){
			System.out.println("We got an error: " + e.getMessage());
		}
		finally{
			System.out.println("This message is from Finally Block .....");
		}
	}
}