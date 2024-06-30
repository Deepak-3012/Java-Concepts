public class DataTypes {
    public static void main(String[] args){
        System.out.println("Everything you need to know about data types");
        // java is strongly typed(strong type checking is done)
        //--> Is a java a purely oop language??? -- NO
        // because it supports primitive data types which is non-object
        // also it does not support some oop concepts like operator overloading and multiple inher..
        // __________________________________
        // Total 8 data types

        //6 are numerical data type or signed types (positive and negative is valid here)
        byte a; short b; int c; long d;// integral
        float e; double f; //floating point
        /* byte(default val:0)--> SIZE: 1 BYTE(8 BITS) -128 to 127 AND (-2^7 TO 2^7 + 1) ONE BIT IS ALLOCATED FOR SIGNING

           short (default val:0)-->SIZE: 2 BYTES(16 BITS) RARELY USED DATA TYPE!!-> RANGE -2^15 TO 2^15 - 1

           int (default val:0)-->SIZE: 4 BYTES(32 BITS) -2^31 TO 2^31 - 1

           long (default val:0)-->8 BYTES(64 BITS) -2^63 TO 2^63 - 1 -->holds very large value

           float (default val:0.0)-->4 BYTES(32 BITS) LESS ACCURACY, [-3.4e38 to 3.4e38]

           double (default val:0.0)-->8 BYTES(64 BITS) MORE ACCURACY, [-1.7e38 to 1.7e38],e? 1.7 x 10^38(exponential)

           char (default val:0(whitespace)--> SIZE: 2 BYTES(16 BITS) cuz java is unicode based unlike c++(ASCII based)

           boolean (default val:false)-->SIZE: JVM DEPENDANT
         */

        //NOTE: null is NOT applicable for primitives(fundamental types) and only for objects!!!

        // non numerical data type
        char g; boolean h;
           /*
        ERRORS:
        1. POSSIBLE LOSS OF PRECISION (If exceeded range what error we will get??
        for example if u mention byte a = 128; u will get:
        possible loss of precision
        found: int required byte)

        2. INCOMPATIBLE TYPES
        (if you write byte b = true; u will get:
        incompatible types found:boolean required byte

        3. INTEGER NUMBER TOO LONG
        (NOTE FOR INT ALONE!!!!
        WE WON'T GET POSSIBLE LOSS OF PRECISION error INSTEAD WE GET:
        IF YOU WANT TO AVOID, PUT l EG: int x = 2709798707800880l
        then YOU WILL GET POSSIBLE LOSS OF PRECISION found long required int)

        4. CANNOT FIND SYMBOL
        (  eg: boolean b = True --> cuz True is treated as variable cuz it's not of
        any type(int,short,byte,char etc...) even string[if string, it had to be mentioned inside "True"], then we will
        get INCOMPATIBLE TYPE ERROR)
         */
        // file supported form or network supported form is BYTE DATA TYPE!!![remember byte stream?]

        /*IMPORTANT!!!
        IN JAVA: boolean is true or false (NOT 1 OR 0)
        if you use while(1){
        System.out.print("hi");
        }
        You will get---> INCOMPATIBLE TYPES FOUND: INT REQUIRED: BOOLEAN
         */

    }
}
    
