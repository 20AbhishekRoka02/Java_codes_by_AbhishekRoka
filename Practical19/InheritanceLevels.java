class A{
	void methodA(){
		System.out.println("I am methodA in class A, super class of class B and C.");
	}
}

//Here, it is hierarichal inheritance
class B extends A{
	void methodB(){
		System.out.println("I am methodB in class B, extending class A.");		
	}
}

class C extends A{
	void methodC(){
		System.out.println("I am methodC in class C, extending class A.");				
	}
}

//Here, it is multilevel
class D extends C{
	void methodD(){
		System.out.println("I am methodD in class D, extending C, which is extending class A. - this is multilevel inherited class");
	}
}


//main class
class InheritanceLevels extends D{
	public static void main(String [] args){
		InheritanceLevels var = new InheritanceLevels();
		var.methodD();
		var.methodC();
		
		B varB = new B();
		varB.methodB();
		var.methodA();

	}
	
	
}