class ExceptHandleTryCatch{
	public static void main(String [] args){
		try{
			int num = 6/0;
		}
		catch(Exception e){
			System.out.println("Exception message: " + e.getMessage());
		}

	}
}