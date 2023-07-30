/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after N shifts on s.
 * 
 * Definition of a shift: Moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * Assume the input need to be lowercase English letters.
 */
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    boolean rotateString = s.equals(goal);
    char[] chars = s.toCharArray();
    char temp = ' ';

    if (rotateString == false) {
      for (int i = 0; i < chars.length - 1; i++) {
        for (int j = 0; j < chars.length - 1; j++) {
          temp = chars[j];
          chars[j] = chars[j + 1];
          chars[j + 1] = temp;
        }
        if (String.valueOf(chars).equals(goal)) {
          rotateString = true;
        }
      }
    }
    return rotateString;
  }
}
