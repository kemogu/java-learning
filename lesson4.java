public class lesson4 {
    public static void main(String[] args) {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    }
}

/*
 * byte	1 byte	Stores whole numbers from -128 to 127
 * short	2 bytes	Stores whole numbers from -32,768 to 32,767
 * int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 * long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 * double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
 * boolean	1 bit	Stores true or false values
 * char	2 bytes	Stores a single character/letter or ASCII values
 * 1 byte = 8 bit
 */