public class String1 {
  public static void main (String[]args) {
    String str = "You're ugly, but I'm pretty";
    str = str + ".";
    System.out.println(str); // print: You're ugly, but I'm pretty.

    // Method
    // .length()
    int i = str.length();// length(), tool to return the length of str
    System.out.println("i=" +i);// print: "i = 28"; 28 character in that sentence.
    
    System.out.println("hello".length());// print: 5
    System.out.println(str.length());
    

    // .equals()
    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2); // false
    boolean areTheyEqual2 = str1.equals(str3); // true
    boolean b4 = str2.equals(str1 + "d"); // true
    
    // .charAt(2), find the char at index 2 of the string
    String str4 = "helloword";// print: l
    System.out.println(str4.charAt(2));
    System.out.println(str4.charAt(1));
    


    System.out.println(b4);







  }


}