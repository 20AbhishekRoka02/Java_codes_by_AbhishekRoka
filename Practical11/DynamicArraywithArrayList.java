
import java.util.ArrayList;
import java.util.Scanner;



public class DynamicArraywithArrayList {



    public static void main(String args[]) {
        
        ArrayList<Integer> dyanamicArray = new ArrayList<Integer>();
    
        int opt=0; //, element=0;
        Scanner sc = new Scanner(System.in);
        
        boolean value = true;
        while(value){
            System.out.println("Press\n1 for adding elements\n2 for popping out the elements\n3 for displaying the array\n4 for exit");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter element: ");                    
                    dyanamicArray.add(sc.nextInt());
                    System.out.println("Element added!");
                    break;
                
                case 2:
                    dyanamicArray.remove(dyanamicArray.size() - 1);
                    System.out.println("Element popped!");
                    break;
                
                case 3:
                    System.out.println("Displaying all elements of the dynamic Array.");
                    for (int i=0; i<dyanamicArray.size(); i++){
                        System.out.println("Element "+(i+1)+" : "+dyanamicArray.get(i));
                    }
                    break;

                case 4:
                    value=false;
                    System.out.println("Terminating the Program........"); 
                    break;
            
                default:
                    System.out.println("Please enter valid options!");
                    break;
            }
    
    
    
    
        }
    }
    
    
}
