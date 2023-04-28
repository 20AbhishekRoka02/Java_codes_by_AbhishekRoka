// The Program is not complete yet!
import java.util.*;

class Staff{
	String Code;
	String name;
}

class Teacher extends Staff{
	String Subject;
	String Publication;
}

class Officer extends Staff{
	String grade;
}

class Typist extends Staff{
	float speed;
}

class Regular extends Typist{

}

class Casual extends Typist{
	float Daily_wages;
}

class MyDB{
	Scanner sc = new Scanner(System.in);
	ArrayList<Staff> staff = new ArrayList<Staff>();
	ArrayList<Teacher> teacher = new ArrayList<Teacher>();
	ArrayList<Typist> typist = new ArrayList<Typist>();
	ArrayList<Officer> officer = new ArrayList<Officer>();
	ArrayList<Regular> regular = new ArrayList<Regular>();
	ArrayList<Casual> casuals = new ArrayList<Casual>();


	void insert(int option){
		MyDB scan = new MyDB();
		String code = new String();
		String name = new String();
		String grade = new String();
		float speed;
		float Daily_wages;



		

		switch (option) {
			case 1:
				Staff obj = new Staff();
				System.out.println("Enter Staff Code: ");
				obj.Code = scan.sc.next();
				System.out.println("Enter Staff Name: ");
				obj.name = scan.sc.nextLine();
				staff.add(obj);
				break;
			
			case 2:
				Teacher obj = new Teacher();
				System.out.println("Enter Staff Code: ");

			
			
		
			default:
				break;
		}
	}

	void delete(int option){

	}

	void update(int option){

	}
	void display(int option){

	}

	

	void chooseOperation(int option){
		
		MyDB myClassObj = new MyDB();
		boolean bool = true;
		while (bool){

			System.out.print("Choose an option from the list below:-\nPress + to Add Data\nPress - to Delete Data\nPress u to Update Data\nPress d to display records\nPress x to exit\nEnter: ");

			String input = myClassObj.sc.next();

			switch(input){
				case "x":
					bool = false;
					break;
				case "+":
				case "-":
				case "u":
				case "d":
					myClassObj.insert(option);
					break;
				default:
					System.out.println("invalid option!");	
			}


		}



	}

	public static void main(String [] args){
		boolean bool = true;
		
		MyDB classObj = new MyDB();

		while (bool) {
			
			System.out.print("Choose table from the following:-\n1. Staff\n2. Teacher\n3. Typist\n4. Officer\n5. Regular\n6. Casual\n7. Exit\nEnter: ");
			int option = classObj.sc.nextInt();
	
			switch (option) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					classObj.chooseOperation(option);				
					break;
				
				case 7:
					System.out.println("Terminating the Program......");
					bool = false;
					break;
				
			
				default:
					System.out.println("invalid option.");
					break;
			}
		}
				
				
	}
}