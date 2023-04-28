import java.util.*;

class StringTokenizerUsage{
	void TokenizeString(String str, String delim, boolean flag){
		StringTokenizer token = new StringTokenizer(str,delim, flag);
		System.out.println("There are total of " + token.countTokens() + " tokens");
		while (token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
		
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.nextLine();
	

		System.out.print("Enter delim: ");		
		String delim = sc.nextLine();

//		System.out.print("Enter flag: ");
		boolean flag = false;


		StringTokenizerUsage usage = new StringTokenizerUsage();
		usage.TokenizeString(str, delim, flag);


			
	}
}