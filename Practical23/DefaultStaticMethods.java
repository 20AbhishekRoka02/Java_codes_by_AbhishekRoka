import java.util.Scanner;
interface Vehicle {
	default void horn(){
		System.out.println("Po Po...");
	}
	static void speed(float dist, float time){
		System.out.println("Your Speed is: " + (dist/time) + " m/s");
	}
}

class DefaultStaticMethods implements Vehicle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		DefaultStaticMethods car = new DefaultStaticMethods();
		car.horn();
		System.out.print("Enter distance travelled (in metres): ");
		float d = sc.nextFloat();
		System.out.print("Enter time (in seconds): ");
				float s = sc.nextFloat();
		Vehicle.speed(d,s);
		

	}
	

}