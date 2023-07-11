public class DataType {
  public static void main (String[] args) {
    //Number (int/ float); Text

    //Declaration
    int num; // int is a way to declare a variable (identify a "home class")
    //from now on, you can only put an integer to variable num.
    
    //Assignment = Initalization
    num = 3; // from right to left -> this action called: assignment 
    System.out.println("3");
    System.out.println(3);
    System.out.println(num);


    //Text
    String str = "hello ";
    System.out.println(str);

    //String str = 1; // error
    //int num2 = "hello"; 

    //Re-assignment
    num = 10;

    //floating point
    //int num = 1.1; // error, int can only store integer

    double f = 1.03;
    double f2 = 1; // "double" can put both integer and floating point; explain later

    // byte, short, long
    // byte
    byte a = 1;
    byte b = 2;
    System.out.println(a + b);

    // short 
    short c = 10000;
    short d = 5000;
    System.out.println(c - d);

    // long
    long x = 100000000;
    long x1 = 10L; // norm -> L, but not l
    System.out.println(x);

    // floating point -> double/ float
    float f3 = 1.000000003f; // norm -> f, but not F
    double d4 = 23.9;

    // char, value should be assigned by single quote''
    char gender = 'M';
    char s10 = ' ';

    // char empty = ''; // error  

    // boolean
    boolean isMale = true;
    boolean isValid = false;

    // initalization, means 1st time of assignment
    int a10 = 0;
    a10 = 10;
    System.out.println(a10);

    // String + operation
    String a1 = "Hello,";
    String a2 = " on9!";
    String result = a1 + a2;
    System.out.println(result);

    String result2 = "Dumb" + "-dumb!";
    System.out.println(result + " " + result2);

    //
    int a0 = 1 + 3; //4
    int b0 = 1 - 3; //-2
    int c0 = 2 * 100; //200
    int d0 = 10 / 3; // 3
    int e0 = 10 % 3; // 1 is reminder
    
    String i = "abc" + 13; // default behavour: convert 13 to String // 13
    String ch = "abc" + 'A'; // 'A' -> String "A", abcA
    String bl = "abc" + true;
    String str1 = "" + 13 + 14;
    String str2 = "_" + 13 + 14; 
    //String str3 = 13 + 14 // error
    System.out.println(i);
    

  }
}
