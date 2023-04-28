class StringMethods{
	public static void main(String args[]){
		String s0="Hello, Friend! I am anonymous";

		//length
		System.out.println("s0.length() -> "+s0.length());

		//charAt
		System.out.println("s0.charAt(3) -> "+s0.charAt(3));

		//substring(int i);
		System.out.println("s0.substring(4) -> "+s0.substring(4));
		
		//substring(int i, int j);
		System.out.println("s0.substring(4,11) -> "+s0.substring(4,11));

		//concat(String str);
		String s1 = " Take Care!";
		System.out.println("s0.concat(s1) -> "+s0.concat(s1));

		//int indexOf(String s);
		System.out.println("s0.indexOf(\"Friend\") -> " + s0.indexOf("Friend"));

		//int indexOf(String s, int i);
		System.out.println("s0.indexOf(\"e\",5) -> " + s0.indexOf("e",5));

		//int lastIndexOf(String str);
		System.out.println("s0.lastIndexOf(\"a\") -> "+ s0.lastIndexOf("a"));


		//boolean equals(Object otherObj);
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println("s2.equals(s3) -> " + s2.equals(s3));

		//boolean equalsIgnoreCase(String anotherString);
		System.out.println("s2.equalsIgnoreCase(s3) -> " + s2.equalsIgnoreCase(s3));
		
		//int CompareTo(String anotherString)
		String s4 = "He110";
		System.out.println("s2.compareTo(s4) -> " + s2.compareTo(s4));

		//int compareToIgnoreCase(String anotherString);
		System.out.println("s2.compareToIgnoreCase(s4) -> " + s2.compareToIgnoreCase(s4));

		//String toLowerCase()
		System.out.println("s2.toLowerCase() -> " + s2.toLowerCase());

		//String toUpperCase()
		System.out.println("s2.toUpperCase() -> " + s2.toUpperCase());

		//String trim()
		String s5 = " Hello.jpg exe ";
		System.out.println("s5.trim() -> " + s5.trim());
		
		//String replace (char oldChar, char newChar);
		String s6 = "Tyrell Wellick";
		System.out.println("s6 -> " + s6);
		s6.replace('l','a');
		System.out.println("s6.replace(\'l\',\'a\') -> " + s6);

		//getChars(int sourceIndex, int endIndex, char[] target, int targetIndex)
		String s7 = "Dark Army";
		char target[] = new char[100];
		System.out.println("s7 -> "+ s7);
		s7.getChars(2,7,target,2);
		System.out.print("after s7.getChars(2,7,target,2)\ntarget ->  ");
		for (int i=0; i<100; i++){
			System.out.print(""+target[i]);
		}
		System.out.println();
		
		//getBytes()
		byte example[] = s7.getBytes();
		System.out.print("s7.getBytes() ->  ");
		for (int i=0; i< s7.length(); i++) {
			System.out.print(""+example[i]);	
		}
		System.out.println();

		//toCharArray();
		System.out.print("s7.toCharArray() -> ");
		char[] array = s7.toCharArray();
		for (int i=0; i< array.length;  i++ ) {

		System.out.print("" + array[i]);
		}
		System.out.println();
		//join();
		String s8 = " China ";
		String afterJoin = String.join("->",s7,s8);
		System.out.println("String.join(\"->\",s7,s8) -> " + afterJoin);

		//split();
		String s9 = "E Corp -> Terry Colby -> Tyrell Wellick -> MR. ROBOT";
		String[] afterSplit = s9.split("->",3);
		System.out.println("s9 is: "+s9);
		System.out.print("s9.split(\"->\",3) -> ");
		for (int i=0; i<afterSplit.length; i++ ) {
			System.out.print(afterSplit[i]);
		}
		System.out.println();

		//==
		String s10 = "Hello";
		String s11 = new String(s10);
		System.out.println("s10 == s11 -> " + (s10 == s11));

		//intern
		String s12 = "World!";
		String s13 = s12.intern();
		System.out.println("when used intern(), s12 == s13 -> " + (s12 == s13));
		

		

	}

}