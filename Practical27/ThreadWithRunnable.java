class ThreadWithRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String [] args){
		ThreadWithRunnable obj = new ThreadWithRunnable();
		Thread thread = new Thread(obj);
		thread.start();

	}
}