import java.util.*;

class MultiThreading extends Thread{
	public int num;
	public Scanner sc = new Scanner(System.in);

	public void run(){

	}

	public void multiplication(int num){		
		for(int i=1;i<11;i++){
			System.out.println(num+" x "+i+ " = "+i*num);
		}
	}
		
	public void squares(int num){		
		System.out.println("Square of " + num + " is: " + num*num);
	}
	
	
	public static void main(String [] args){
		MultiThreading obj1 =new MultiThreading();
		obj1.start();
		System.out.println(obj1.getName());
		MultiThreading obj2 =new MultiThreading();	
		obj2.start();
		System.out.println(obj2.getName());

		//int num;
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		this.num = this.sc.nextInt();

		obj1.multiplication(num);
		obj2.squares(num);
	}

}