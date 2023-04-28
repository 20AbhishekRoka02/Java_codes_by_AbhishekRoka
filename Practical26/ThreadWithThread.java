//WAP to create a Thread using Thread class.

class ThreadWithThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());	
	}
	public static void main(String [] args){
	 	ThreadWithThread obj = new ThreadWithThread();
		obj.start();
		
	}
}