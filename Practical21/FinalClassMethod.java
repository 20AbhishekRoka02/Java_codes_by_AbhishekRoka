final class ClassA{}

class ClassB{
	final void methodB() {
		System.out.println("I am Class B.");
	}
}

class ClassC{
	final int value=90;
	
}

class FinalClassMethod{
	public static void main(String [] args){
		ClassC objc= new ClassC();
		System.out.println(objc.value);
	}
}