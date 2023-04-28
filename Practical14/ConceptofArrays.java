import java.util.*;

class ConceptofArrays{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int opt;
		
		System.out.print("Enter length: ");
		opt = sc.nextInt();
		int array[] = new int[opt];
		for (int i=0; i< opt; i++){
			System.out.print("Enter element["+(i+1)+"]: ");
			array[i]=sc.nextInt();
		}		
		Arrays.sort(array);
		System.out.println("Sorted list: "+Arrays.toString(array));

	}
}