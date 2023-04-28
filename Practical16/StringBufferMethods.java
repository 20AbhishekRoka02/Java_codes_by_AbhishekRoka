import java.lang.*;

class StringBufferMethods{
	public static void main(String args[]){
		
		StringBuffer str = new StringBuffer("Hello, World!");


		//length()
		System.out.println("str.length() -> " + str.length());

		//capacity()
		System.out.println("str.capacity() -> "+ str.capacity() + " characters");
		//public void ensureCapacity(int mincapacity);
		str.ensureCapacity(30);
		System.out.println("After str.ensureCapacity(30) -> " + str.capacity() + " characters");
		
		//setLength();
		System.out.println("Current Length of string str.length() -> " + str.length());
		str.setLength(30);
		System.out.println("After str.setLength(30), str.length() -> " + str.length());

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
		
		//insert();
//exception: The position argument must be greater than or equal to 0, and less than or equal to the length of this string.
		System.out.println("str: " + str);
		str.insert(5,"BasketBall");
		System.out.println("After str.insert(5,\"BasketBall\"), str: " + str);


		//reverse()
		System.out.println("str: " + str);
		str.reverse();
		System.out.println("After str.reverse(), str: " + str);
		str.reverse();
		System.out.println("Again, after str.reverse(), str: " + str);
		

		//replace()
		System.out.println("str: " + str);
		str.replace(5,11,"kARATE");
		System.out.println("After str.replace(5,11,\"kARATE\"), str: " + str);

		//substring(int index)
		System.out.println("str.substring(5) -> " +str.substring(5));
		//substring(int from, int to)
		System.out.println("str.substring(5) -> " +str.substring(5, 20));
		//indexOf();
		System.out.println("Index of \"World\" in str is: " + str.indexOf("World"));
		//lastIndexOf();
		System.out.println("Last Index of \"e\" in str is: " + str.lastIndexOf("e"));
		
	}
}