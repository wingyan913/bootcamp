public class Conditionals {
  public static void main (String[] args) {
    //if, else if, else
    int i = 10;
    if (i > 9) { // asking if i > 9. if yes, execute the block of the code
      System.out.println("i=" + i); // i = 10
    }
    // flow control: if-else
    if (i < 8) { // not fulfill
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than or equals to 8");
    }
    //else-if
    if (i > 12) {
      System.out.println("i > 12"); // not execute
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >= 0"); // execute
    } else {
      System.out.println("i is negative"); // not execute
    }
    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    } // box = 19

    int number = 11;
    if (number % 2 == 1) { //checking if number is an odd number; 11/2, remainder 1?
      // do something here
      System.out.println("number is an odd number");
    }
    if (number % 2 == 0) {
      System.out.println("number is an even number");
    }

    // String
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday"); 
    }
    if (str.charAt(4) == 'd') {
      System.out.println("yes");
    }
    if (str.length() > 10) {
      System.out.println("length > 10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("What is the result now?");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F'; // if no "else", print: ' ' (space only)
    }


    // Switch
    int a1 = 10;
    int b1 = 3 * a1 % 3;
    System.out.println(a1);
  




    int year1 = 2009;
    // Program a condition to check if it is a leap year.
    // But should NOT print anything.
    if ((year1 % 4 == 0 && !(year1 %100 == 0)) || year1 %400 == 0) {
      System.out.println("2009 is a leap year.");
    }
    int year2 = 2020;
    // same as the above, but it will print out.
    if ((year2 % 4 == 0 && !(year2 %100 == 0)) || year2 %400 == 0) {
      System.out.println("2020 is a leap year.");
    }
    int year3 = 2400;
    // same as the above, but it will print out.
    if ((year3 % 4 == 0 && !(year3 %100 == 0)) || year3 %400 == 0) {
      System.out.println("2400 is a leap year.");
    }
    int year5 = 2100;
    // same as the above, but it will NOT print out.
    if (year5 % 4 == 0 && !(year5 %100 == 0)) {
      System.out.println("2100 is a leap year.");
    }


}
}
