import java.util.ArrayList;

class MultiThreadedEnv extends Thread{
	public void run(){
		System.out.println("hello");
		try{
			System.out.println(Thread.currentThread().getName());
		}
		catch(Exception e){
			System.out.println("Caught error: " + e.getMessage());
		}
	}

	public static void main(String [] args){
		ArrayList<Thread> threads = new ArrayList<Thread>();		
		for (int i=0; i<8; i++){		

			MultiThreadedEnv obj = new MultiThreadedEnv();
			obj.start();
			threads.add(obj);
		}
	}
}