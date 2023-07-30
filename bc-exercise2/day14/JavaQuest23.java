/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    char[] chars = s.toLowerCase().toCharArray();
    int count1 = 0;
    int count2 = 0;
    boolean sameNumberOfVowels = false;

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i'
          || chars[i] == 'o' || chars[i] == 'u') {
        if (i < chars.length / 2) {
          count1++;
        }
        else if (chars.length / 2 < chars.length) {
          count2++;
        }
      }
    }
      if (count1 == count2)
      sameNumberOfVowels = true;
      return sameNumberOfVowels;
  }
}
