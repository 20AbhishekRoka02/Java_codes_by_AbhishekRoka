//code to compile package: javac -classpath %cd% -d . UserFile.java
//To run packaged file: java -classpath %cd% p1.UserFile
package p1;

public class UserFile{
	public void show(){
		System.out.println("I am an User.");
	}
	public static void main(String [] args){
		UserFile obj = new UserFile();
		obj.show();
	}
}