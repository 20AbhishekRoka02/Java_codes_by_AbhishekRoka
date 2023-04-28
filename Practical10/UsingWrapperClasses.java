// Progam to implement the concept of Wrapper Class

class UsingWrapperClasses{
    public static void main(String args[]) {
        //Creating Wrapper Class objects of all types
        Integer intNum = 10;
        Character letter = 'a';
        Short shortNum = 11;
        Byte byteNum = 9;
        Boolean aBool = false;
        Long aLong = 8900L;
        Float aFloat = 89.65f;
        Double aDouble = 89.654;

        //Printing Wrapper Class Objects
        System.out.println(intNum);
        System.out.println(letter);
        System.out.println(shortNum);
        System.out.println(byteNum);
        System.out.println(aBool);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);


        // Autoboxing in JAVA
        

        // Method 1:
        Integer i = 10;
        //Method 2:
        // Integer newintNum = new Integer(intNum); //- Constructor Integer(int) has been deprecated since version 9 and marked for removal.

        //Unboxing
        // Method 1:
        double n = aDouble;

        // Method 2:
        System.out.println("Printing Wrapper class Integer as int here: "+i.intValue());

        //Methods to Convert a data type to String.
        //Converting numbers to String
        String str = Double.toString(n);
        System.out.println("Printing string value of double data type: "+str);

        //Converting String object to the numberic object using the static method valueOf().
        String numricStr = "11";
        Integer strToNum = Integer.valueOf(numricStr);
        System.out.println("String converted to number: "+strToNum);

        //Convert Numeric String to Primitive Number using parsing method.
        String newNumericStr="90";
        int x = Integer.parseInt(newNumericStr);
        System.out.println("Numeric String converted to Primitve Number: "+x);
        

        


        

        




        
    }
}