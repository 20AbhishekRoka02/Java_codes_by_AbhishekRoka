class ClassA{
	void methodA(){
		System.out.println("I am methodA");
	}
}

class ClassB extends ClassA{
	void realMethodA(){
		super.methodA();
	}
	void methodA(){
		System.out.println("I am methodB");	
	}
}
class MethodOverridingSuper{
	public static void main(String [] args){
		ClassB obj = new ClassB();
		obj.methodA();
		obj.realMethodA();
	}
}