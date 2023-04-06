public class SyntaxTypesVariables {

    public static void main(String[] args) {
//#1
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
//#2
        String myString = "What's up World!";
        System.out.println(myString);
//#3        Change your code to assign a character value to myString.
//        char cannot be converted to java.lang.String
//        myString ='c';
//        System.out.println();

//#4        Change your code to assign the value 3.14159 to myString.
//        double cannot be converted to java.lang.String
//            myString = 3.14159;
//            System.out.println(myString);

//#5       myNumber might not have been initialized
//            Long myNumber;
//            System.out.println(myNumber);

//#6        possible lossy conversion from double to long
//            long myNumber = 3.14;
//            System.out.println(myNumber);
//        ANSWER: When we try to assign a variable of large-sized type to a
//        smaller sized type, Java will generate an error, incompatible
//        types: possible lossy conversion, while compiling the code.

//#7        Change your code to assign the value 123L (Note the 'L' at the end) to                  myNumber.
//        123L can be converted to int
//              Long myNumber = 123L;
//            System.out.println(myNumber);

//#8        incompatible types: int cannot be converted to java.lang.Long
//        Long myNumber = 123;
//        System.out.println(myNumber);

        //incompatible types: double cannot be converted to java.lang.Float
//#9        pLace a "f" at the end of float myNumber = 3.14f to coorect issue;
        Float myNumber = 3.14f;
        System.out.println(myNumber);
//#10      int x = 5; prints 5 first then increments to 6
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//      increments directly to 6
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//#11     For class '{' expected
//        class x = 5;
//        System.out.println(x++);
//        System.out.println(x);


//#12a         Exception in thread "main" java.lang.ClassCastException:
//        class java.lang.String cannot be cast to class java.lang.Integer
//        (java.lang.String and java.lang.Integer are in module java.base of
//        loader 'bootstrap')
//	       at SyntaxLecture.main(SyntaxLecture.java:59)
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//#12b         incompatible types: java.lang.String cannot be converted to int
//        int three = (int) "three";
//        System.out.println(three);

//#13
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);

//#14
//       14a. The code will not work because it's too small or large teh variable
//          14b. Integer. MAX_VALUE represents the maximum positive integer value that
//          can be represented in 32 bits (i.e., 2147483647 ). This means that no number
//          of type Integer that is greater than 2147483647 can exist in Java.
//

    }
}
