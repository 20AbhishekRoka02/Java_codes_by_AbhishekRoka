import java.util.Scanner;

interface Numbers{
	interface numCheck{
		void isNeg(int num);
	}
}
class NonNeg implements Numbers.numCheck{
	public void isNeg(int num){
		if (num<0){
			System.out.println("It is a Negative number.");
		}	
		else{
			System.out.println("It is a non Negative number.");
		}	
	}

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		NonNeg obj = new NonNeg();
		obj.isNeg(num);

		

	}
}