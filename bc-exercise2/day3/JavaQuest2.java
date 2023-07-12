/**
 * Expected Output:
 * 
 * a > 9 str length < 27 2020 is a leap year. 2400 is a leap year.
 */
// Primitive types and operators
public class JavaQuest2 {
  public static void main(String[] args) {
    int a = 10;
    int b = 3 * a % 3;
    if (a == 9) {
      System.out.print("a is equals to 9");
    } else if (a < 9 && a >= 0) {
      System.out.print("a is between 0 and 8");
      // code here
    } else if (a > 9) {
      System.out.print("a > 9");
    } else {
      System.out.print("a < 0");
    }

    String str = "I love Java. I love coding";
    if (str.length() == 27) { // code here. Fix the bug.
      System.out.print(" str length=27");
    } else if (str.length() < 27) { // add the condition
      System.out.print(" str length < 27");
    } else if (str.length() > 27) { // complete the code
      System.out.print(" str length > 27");
    }

    // Question : Determine whether year n is a leap year.
    /*
     * Definiton of a leap year: If a year is divisible by 4 and not divisible by 100 or divisible by 400,
     * 
     * then, it is a leap year.
     */

    // > Clearify: Is 2009 a leap year? <
    int year1 = 2009;
    // Program a condition to check if it is a leap year.
    // But should NOT print anything.
    // > Definition of leap year <
    int remainderBy4 = year1 % 4;
    int remainderBy100 = year1 % 100;
    int remainderBy400 = year1 % 400;
    boolean isLeapYr1 =
        (remainderBy4 == 0 && remainderBy100 != 0) || remainderBy400 == 0;
    // > Generate result <
    if (isLeapYr1) {
      System.out.print(" 2009 is a leap year.");
    }

    // > Clearify: Is 2020 a leap year? <
    int year2 = 2020;
    // same as the above, but it will print out.
    // > Definition of leap year <
    int remainderBy4_2 = year2 % 4;
    int remainderBy100_2 = year2 % 100;
    int remainderBy400_2 = year2 % 400;
    boolean isLeapYr2 =
        (remainderBy4_2 == 0 && remainderBy100_2 != 0) || remainderBy400_2 == 0;
    // > Generate result <
    if (isLeapYr2) {
      System.out.print(" 2020 is a leap year.");
    }

    // > Clearify: Is 2400 a leap year? <
    int year3 = 2400;
    // same as the above, but it will print out.
    // > Definition of leap year <
    int remainderBy4_3 = year3 % 4;
    int remainderBy100_3 = year3 % 100;
    int remainderBy400_3 = year3 % 400;
    boolean isLeapYr3 =
        (remainderBy4_3 == 0 && remainderBy100_3 != 0) || remainderBy400_3 == 0;
    // > Generate result <
    if (isLeapYr3) {
      System.out.print(" 2400 is a leap year.");
    }

    // > Clearify: Is 2100 a leap year? <
    int year5 = 2100;
    // same as the above, but it will NOT print out.
    // > Definition of leap year <
    int remainderBy4_5 = year5 % 4;
    int remainderBy100_5 = year5 % 100;
    int remainderBy400_5 = year5 % 400;
    boolean isLeapYr5 =
        (remainderBy4_5 == 0 && remainderBy100_5 != 0) || remainderBy400_5 == 0;
    // > Generate result <
    if (isLeapYr5) {
      System.out.print(" 2100 is a leap year.");
    }
  }
}
