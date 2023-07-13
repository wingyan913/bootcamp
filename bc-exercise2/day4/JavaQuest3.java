import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output of Examples:
   * 
   * Input a month number: 2 Input a year: 2016 February 2016 has 29 days
   * 
   * Input a month number: 12 Input a year: 2014 December 2014 has 31 days
   */
  // Program toExercise3Ansumber of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();
    input.close();

    // Complete the switch statement
    switch (month) {
      case 1:
        MonthOfName = "January";
        number_Of_DaysInMonth = 31;
        break;
      case 2:
        MonthOfName = "February";
        // Leap Year -> 29 days in February, otherwise 28.
        // Definition: If a year is divisible by 4, and Not divisible by 100, OR
        // divisible by 400.
        int remainderBy4 = year % 4;
        int remainderBy100 = year % 100;
        int remainderBy400 = year % 400;
        boolean isLeapYr =
            (remainderBy4 == 0 && remainderBy100 != 0) || remainderBy400 == 0;
        if (isLeapYr) {
          number_Of_DaysInMonth = 29;
        } else {
          number_Of_DaysInMonth = 28;
        }
        break;
      // Complete the other months
      case 3:
        MonthOfName = "March";
        number_Of_DaysInMonth = 31;
        break;
      case 4:
        MonthOfName = "April";
        number_Of_DaysInMonth = 30;
        break;
      case 5:
        MonthOfName = "May";
        number_Of_DaysInMonth = 31;
        break;
      case 6:
        MonthOfName = "June";
        number_Of_DaysInMonth = 30;
        break;
      case 7:
        MonthOfName = "July";
        number_Of_DaysInMonth = 31;
        break;
      case 8:
        MonthOfName = "August";
        number_Of_DaysInMonth = 31;
        break;
      case 9:
        MonthOfName = "September";
        number_Of_DaysInMonth = 30;
        break;
      case 10:
        MonthOfName = "October";
        number_Of_DaysInMonth = 31;
        break;
      case 11:
        MonthOfName = "November";
        number_Of_DaysInMonth = 30;
        break;
      case 12:
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;
        break;
    }
    System.out.println(
        MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");

  }
}
