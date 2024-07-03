package arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println("Everything you need to know about arrays");

        /* q1: what is an array:
        In java, an array is INDEXED COLLECTION OF FIXED NUMNBER OF HOMOGENEOUS DATA ELEMENTS
         */

        /*
        ADV: 1. STORAGE OF HUGE NUMBER OF VALUES IN A SINGLE VARIABLE

        DIS ADV: 1. FIXED SIZE
                 2. ONLY STORES HOMOGENEOUS DATA ELEMENTS
         */

        /*
        DECLARATION:
        NO LIMITATION ON ARRAY DIMENSTION IN JAVA

        1 dimension array
        int[] arr; --> data_type[] name; (RECOMMENDED) also int[] arr1,arr2; (any no.of.vars)

        other ways:
        int arr[]; int []arr;

        2 dimension array (NOTHING BUT MATRIX!!!)
        int[][] arr; (RECOMMENDED) [also int[][] arr1,arr2; , int[][] arr1,arr2,arr3;] VALID

        other ways:
        int[] []arr; int arr[][]; int  []arr[]; BUT DO NOT USE IT

        3 dimension array
        int[][][] arr;

          NOTE: ONLY THING IS --DIMENSION BEFORE VARIABLE-- IS POSSIBLE FOR ONLY THE FIRST VARIABLE
          IF you do, int []a,[]b;(C.ERROR) but int []a,b[]; this is valid
         */

        /*
        int[] []arr1,arr2[]; here 2d--> arr1, 2d-->arr2
        int[] []arr1, arr2; here 2d--> arr1, 2d--> arr2 cuz space is ignored by JVM
        Int[] arr1[],arr2; here 2d--> arr1, 1d--> arr2
         */

        //!!! IN JAVA, EVERY ARRAY IS A OBJECT

        /*
        INITIALIZATION / CREATION
        --done using new keyword-- created the memory in heap and point the reference
        TWO WAYS:
        DIRECT--> int[] a = new int[1]; //In creation, must need to specify size otherwise CE

        THEN, a[0] = 56; //assignment / override default value
        -----------------------------
        IN DIRECT--> int[] a; // object ref
        and then,
        a = new int[4]; SIZE CAN BE SHORT , BYTE, SHORT , CHAR (REFER LITERALS) can be assigned
        a = new int['a']; (VALID) --> 97 will be the size

        THEN, a[0] = 15; a[1] = 22; etc... //assignment / override default value

         */

        // int[] arr = new int[-3]; (VALID) cuz it's a valid int but causes runtime exception

        /*
        FOR EACH TYPE, classed will available internally but not accessible to programmer level
        for eg: for int[] a; -->  a class will be [I
                for byte[] a; -->  a class will be [B
                for boolean[] a; -->  a class will be [Z
                for char[] a; -->  a class will be [C
                but NOT ACCESSIBLE
         */

        /*
        ERROR:
        1. ArrayOutOfBoundException --> Runtime error

        2. PLP --> if, int[] arr = new int[2.5]; or int[] arr = new int[3l]; etc...
         */

        /* MAX VALUE int[] arr = new int[2147483647]; is VALID(NO CE) BUT
        THROWS RUNTIME EXCEPTION(RE) because it takes 2,147,483,647 * 4 bytes which
        may not be available in the java virtual memory/ heap memory
         */
//--------------------------------------------------------------------------
        // !!!MATRIX WAY OF MULTI DIMENSIONAL ARRAY IS NOT MEMORY EFFICIENT
        // CUZ, CHANCES OF SOME arr[i][j] will be empty depending on user requirement
        // SO, JAVA INTRODUCED ARRAY OF ARRAYS (ONE ARRAY POINTING TO MANY ARRAYS)
        // TO UTILIZE MEMORY EFFICIENTLY

        //HOW TO CREATE ARRAY OF ARRAYS
        /*
        2d example:
        int[][] x = new int[4][]; // leave the col empty
        x[0] = new int[5];
        x[1] = new int[2]; etc...

        3d example: draw diagram to understand better!!!

        int[][][] arr = new int[2][][];--> line one
        arr[0] = new int[2][];
        arr[0][0] = new int[1];
        arr[0][1] = new int[1];
        similary for,
        arr[1] = new int[3][];
        arr[1][0] = new int[10];
        arr[1][1] = new int [12];
        arr[1][2] = new int[15];
         */

        /* IF you are trying to print object reference-->[int[] a = new int[3];
         sout(a)
         then, OP will be
        classname@hashcode_in_hexadecimal eg: [I@3e253a like that...
         */

        //if something is pointing to empty object, then default value is NULL

        //!!! ANY OPERATION ON NULL --> WILL THROW NULL POINTER EXCEPTION

    }
}
