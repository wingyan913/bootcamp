public class Tryyyyyy {
  public static void main(String[] args) {

    int year = 0; 
    int status01 = year % 4;
    int status02 = year % 100;
    int status03 = year % 400;
    if (status01 == 0 && status02 != 0 || status03 == 0) {
      System.out.println(year + "is lean year.");
    }

    int year1 = 2009;
    int status1 = year1 % 4;
    int status2 = year1 % 100;
    int status3 = year1 % 400;
    boolean isLeapYr1 = (status1 == 0 && status2 != 0) || status3 == 0;
    if (isLeapYr1) {
      System.out.println("2009 is a leap year.");
    } 

    int year2 = 2020;
    int status2_1 = year2 % 4;
    int status2_2 = year2 % 100;
    int status2_3 = year2 % 400;
    boolean isLeapYr2 = (status2_1 == 0 && status2_2 != 0) || status2_3 == 0;
    if (isLeapYr2) {
      System.out.println("2020 is a leap year.");
    } 

    int year3 = 2400;
    int status3_1 = year3 % 4;
    int status3_2 = year3 % 100;
    int status3_3 = year3 % 400;
    boolean isLeapYr3 = (status3_1 == 0 && status3_2 != 0) || status3_3 == 0;
    if (isLeapYr3) {
      System.out.println("2400 is a leap year.");
    } 

    int year5 = 2100;
    int status5_1 = year5 % 4;
    int status5_2 = year5 % 100;
    int status5_3 = year5 % 400;
    boolean isLeapYr5 = (status5_1 == 0 && status5_2 != 0) || status5_3 == 0;
    if (isLeapYr5) {
      System.out.println("2100 is a leap year.");
    } 
}
}
