/**
 * Expected output: 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int before = 0;
    int after = 1;
    int ans = 1;
    System.out.print(ans + " ");
    for (int i = 1; i < 15; i++) {
      ans = before + after; // 0(before), 1(after), 0+1=1(ans)
      before = after;
      after = ans;
      System.out.print(ans + " ");
    }
  }
}


