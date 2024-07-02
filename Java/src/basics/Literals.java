package basics;

public class Literals {
    public static void main(String[] args){
        System.out.println("all you need to know about literals");
        //basics.Literals -> constant value that can given to a variable

        int x = 7;//example, here--> 7 is a literal/constant value

        /* FOR INTEGRAL DATA TYPE:(3 WAYS TO DEFINE LITERAL)
        1. DECIMAL
        -> base 10 (0 - 9)

        2. OCTAL
        -> base 8 (0 - 7) , should prefix with 0(TO TELL JVM IT IS OCTAL)

        3. HEXADECIMAL
        ->  base 16 (0 - 9, a - f), should be prefixed with 0x or 0X (TO TELL JVM IT IS HEXADEC.)
        here , java is case-insensitive eg: 0x8, 0Xab, 0x23 etc...
         */
        //!!! these 3 ways are finally converted into DECIMAL ONLY

        /*!!! By default, every integral value is considered int so if you want
         long explicitly suffix with l. eg: 30l, 15l etc.*/

        /* ERRORS:
        1. INTEGER VALUE TOO LONG:
        if int x = 0768; --> 8 is not in octal so it throws this error

        2. POSSIBLE LOSS OF PRECISION FOUND: INT REQUIRED: SHORT-->(cuz by default integral
        literal is considered int)
        if short x = 128;

        3. ';' EXPECTED
        if, 0xbeer --> cuz r is not a valid hexa decimal value
         */
        /*
        oxdeadbeef (VALID)
        OXdeepak (INVALID) BUT Oxdee(VALID)
        int x = 10l; (INVALID)--> POSSIBLE LOSS OF PRECISION FOUND: LONG REQUIRED: INT
        BUT,
        long x = 10; (VALID) THIS IS INSIDE LONG RANGE
         */

        // FOR FLOATING POINT
        //--------------
        /*!!! BY DEFAULT, every floating point value is double!!!
        if you want float, then suffix it with f; eg: 100.34f, 434.22f etc.
        -->note: we can suffix d or D to denote double but not required cuz by default
        floating point value is double
         */

        //!!! floating point literals should be defined only in DECIMAL FORM if point is present!!!
        /*
        ERRORS:
        1. MALFORMED FLOATING POINT LITERAL:
        (if we use double d = ox423.1333;)
         */

        /*but not 0242.334 --> this is treated as decimal only even though it has 0 in prefix
        (it still not considered as octal) in floating points!!
         */

        /* !!!we can assign integral literal to floating point varaible!!!
        CONSIDER THE BELOW EXAMPLE
        double d = 0138;(INVALID) // NOT A VALID OCTAL(INTEGER NUMBER TOO LARGE ERROR)
        double d = oxFACE(VALID)// VALID HEXADECIMAL SO CAN BE ASSIGNED TO A FLOATING POINT
         */

        /* !!!we can't assign floating point literal to integral varaible(we get PLP (POSSIBLE
        LOSE OF PRECISION FOUND: FLOAT REQUIRED: INT)
         */

        //double d = 1.2e3; (VALID) --> 1.2 X 10^3
        //float d = 1.2e3; (INVALID)--> BY DEFAULT 1.2e3 is double so PLP ERROR!
        //flaot d = 1.2e3f; (VALID)


        //FOR BOOLEAN
        /*
        ERRORS:
        1. INCOMPATIBLE TYPES error:
        (if you try to assign different literal other than true or false)

        2. CANNOT FIND SYMBOL:
        (if you try to assign any varible kind of name(other than valid literal)
        (if valid literal than INCOMPATIBLE TYPE ERROR)
         */

        // FOR CHAR
        /*
        ERRORS:
        1. CANNOT FIND SYMBOL symbol: variable a location: class class_name
        if, char ch = a; // here a is treated as a variable

        2. INCOMPATIBLE TYPES found: String required: java.lang.String
        if, char ch = "a";

        3. UNCLOSED CHAR LITERAL (this will shown twice with) NOT A STATEMENT ERROR
        if, char ch = 'ab'; we get UNCLOSED CHAR LITERAL UNCLOSED CHAR LITERAL NOT A
        STATEMENT
         */

        // unicode for 'a' --> 97 or unicode form('\u0061')
        //char ch = 97; (or) char ch = '\u0061'; --> sout(ch) --> will give a

        //char can specified in octal/ hexadecimal

        // escape sequence are char literal (eq: '\n')

        // if you want to use ' or any other symbol in sout then use it with \ eg(\')

        //------------------------------------------------------------------------------------

        // from java 1.7 version --> we can define literal values in binary form(using 0b or 0B)

        // eg: 0B1111--> for 15(cuz 1111 value is 15)

        //Also from 1.7 we can use _ for integral value for readability ONLY BETWEEN THE DIGITS!!!

        //!!! eg: for 100908 , we can use 10_09_08

        //assignment of values(like byte var can be assigned with short) see below!!!

        //byte --> short and short/char --> int --> long --> float --> double

        //short and byte cannot be assigned with each other(one signed and another is unsigned)

        // how long val can be assigned to float(4byte)?? --> cuz floating follow different
        // memory representation tha n integral

        // eg: float f = 10l; (VALID) --> sout will be 10.0
    }
}
