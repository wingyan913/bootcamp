/**
 * Expected Output: J e 3 9 10 ab c VenturenixLAB, Coding 19 ren VENTURENIXLAB, JAVA venturenixlab, java V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    System.out.print(str.charAt(15) + " ");
    System.out.print(str.charAt(1) + " ");

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    int index1 = str.indexOf('t');
    int index2 = str.indexOf('x');
    int index3 = str.indexOf('L');
    System.out.print(index1 + " ");
    System.out.print(index2 + " ");
    System.out.print(index3 + " ");

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.print(abc.trim() + " ");

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.print(str.replace("Java", "Coding") + " ");

    // int length()
    // prints 19
    // code here ...
    int length = str.length();
    System.out.print(length + " ");

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.print(str.substring(5, 8) + " ");

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.print(str.toUpperCase() + " ");
    System.out.print(str.toLowerCase() + " ");

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.print(str.toUpperCase().replaceAll("E", "*").concat("!!!"));
  }
}
