import java.lang.*;

class StringBuilderMethods{
	public static void main(String args[]){
		
		StringBuilder str = new StringBuilder("Hello, World!");


		//length()
		System.out.println("str.length() -> " + str.length());

		//capacity()
		System.out.println("str.capacity() -> "+ str.capacity() + " characters");

		//charAt(int index);
		System.out.println("str.charAt(5) -> " + str.charAt(5));				
		//setCharAt(int index, char ch);
		System.out.println("Initally, str.charAt(5) is: " + str.charAt(5) + " in string " + str);
		str.setCharAt(5,'M');
		System.out.println("But, after str.setCharAt(5,\'M\'), str is: " + str);
		//getChars(int src, int end, char[] dst, int dstBegin);
		char[] dst = new char[50];
		System.out.print("dst is: " );
		for (int i=0; i<50; i++){
			System.out.print("" + dst[i]);
		}
		System.out.println();
		
		str.getChars(5,11,dst,5);
		System.out.print("After, str.getChars(5,11,dst,5), dst is: " );
		for (int i=0; i<50; i++){
			System.out.print("" + dst[i]);
		}
		System.out.println();


		//append();
		System.out.println("str : " + str);
		
		str.append(" I am User.");
		System.out.println("str after, str.append(\" I am User.\"), str : " + str);
		
		
	}
}