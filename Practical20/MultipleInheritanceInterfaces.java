interface A {
	public void methA();
}

interface B {
	public void methB();
}

class MultipleInheritanceInterfaces implements A, B{
	public void methA(){
		System.out.println("This is A.");
	}
	public void methB(){
		System.out.println("This is B.");
	}

	public static void main(String [] args){
		MultipleInheritanceInterfaces var = new MultipleInheritanceInterfaces();
		var.methA();
		var.methB();
	}

}